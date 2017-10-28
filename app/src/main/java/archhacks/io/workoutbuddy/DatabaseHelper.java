package archhacks.io.workoutbuddy;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by natel on 10/27/2017.
 */

public class DatabaseHelper extends SQLiteOpenHelper {

    private static String DATABASE_NAME = "SuperSecretData.db";
    private static int DATABASE_VERSION = 2;


    //People Table Declarations

    private String PEOPLE_TABLE = "People";
    private String PERSON_ID = "Person_ID";
    private String PERSON_NAME = "Person_Name";
    private String PERSON_LOCATION = "Person_Location";
    private String PERSON_AGE = "Person_Age";
    private String PERSON_EMAIL = "Person_Email";
    private String PERSON_PASSWORD = "Person_Password";
    private String PERSON_PREFERED_ACTIVITIES = "Person_Activities";
    private String PERSON_SCHEDULE = "Person_Schedule";
    private String ACCOUNT_CREATION_DATE = "Person_Created";
    private String ACCOUNT_LAST_LOGGED_IN = "Person_Last_Login";
    private String ACCOUNT_FLAGGED = "Account_Flagged";
    private String PERSON_IMAGE = "User_Image";

    //Message Table Declarations

    private String MESSAGE_TABLE = "Messages";
    private String MESSAGE_ID = "Message_ID";
    private String MESSAGE_FROM_ID = "Message_From";
    private String MESSAGE_TO_ID = "Message_To";
    private String MESSAGE_BODY = "Message_Body";
    private String MESSAGE_SENT = "Message_Date";
    private String MESSAGE_FLAGGED = "Message_Flag";



    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        //TODO : Implement the method that creates a SQLite database
        sqLiteDatabase.execSQL("CREATE TABLE " + PEOPLE_TABLE + "(" + PERSON_ID + " INTEGER PRIMARY KEY AUTOINCREMENT" + ", " +
                PERSON_NAME + " TEXT" + ", " +
                PERSON_LOCATION + " INTEGER" + ", " +
                PERSON_AGE + " INTEGER" + ", " +
                PERSON_EMAIL + " TEXT" + ", " +
                PERSON_PASSWORD + " TEXT" + ", " +
                PERSON_PREFERED_ACTIVITIES + " TEXT" + ", " +
                PERSON_SCHEDULE + " TEXT" + ", " +
                ACCOUNT_FLAGGED + " TEXT" + ", " +
                ACCOUNT_CREATION_DATE + " INTEGER" + ", " +
                ACCOUNT_LAST_LOGGED_IN + " TIMESTAMP"  +
                PERSON_IMAGE + " TEXT " + ");");


        sqLiteDatabase.execSQL("CREATE TABLE " + MESSAGE_TABLE + "(" + MESSAGE_ID + " INTEGER PRIMARY KEY AUTOINCREMENT" + ", " +
                MESSAGE_FROM_ID + " INTEGER" + ", " +
                MESSAGE_TO_ID + " TEXT" + ", " +
                MESSAGE_BODY + " TEXT" + ", " +
                MESSAGE_SENT + " TIMESTAMP" + ", " +
                MESSAGE_FLAGGED + " TEXT" + ", " + ");");


    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + PEOPLE_TABLE);
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + MESSAGE_TABLE);
        onCreate(sqLiteDatabase);

    }


}
