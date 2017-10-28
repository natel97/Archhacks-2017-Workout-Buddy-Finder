package archhacks.io.workoutbuddy;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by natel on 10/27/2017.
 */

public class DatabaseHelper extends SQLiteOpenHelper {

    //People Table Declarations

    private String PEOPLE_TABLE = "People";
    private String PERSON_ID = "Person_ID";
    private String PERSON_NAME = "Person_Name";
    private String PERSON_LOCATION = "Person_Location";
    private String PERSON_AGE = "Person_Age";
    private String PERSON_EMAIL = "Person_Email";
    private String PERSON_PASSWORD = "Person_Password";
    private String PERSON_PREFERED_ACTIVITIES = "Person_Activities";
    private String SCHEDULE = "Person_Schedule";
    private String ACCOUNT_CREATION_DATE = "Person_Created";
    private String ACCOUNT_LAST_LOGGED_IN = "Person_Last_Login";
    private String ACCOUNT_FLAGGED = "Account Flagged";

    //Message Table Declarations

    private String MESSAGE_TABLE = "Messages";
    private String MESSAGE_ID = "Message_ID";
    private String MESSAGE_FROM_ID = "Message_From";
    private String MESSAGE_TO_ID = "Message_To";
    private String MESSAGE_BODY = "Message_Body";
    private String MESSAGE_SENT = "Message_Date";
    private String MESSSAGE_FLAGGED = "Message_Flag";



    public DatabaseHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        //TODO : Implement the method that creates a SQLite database

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

        //TODO : Implement the method so that it destroys the database and calls the onCreate method

    }

    //TODO: Create and implement more methods!
}
