package archhacks.io.workoutbuddy;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by natel on 10/28/2017.
 */

public class SignupAndLogin extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup_login);

        Button logIn = (Button) findViewById(R.id.loginButton);
        Button signup = (Button) findViewById(R.id.signupButton);
        final EditText email = (EditText) findViewById(R.id.emailInput);
        final EditText password = (EditText) findViewById(R.id.passwordInput);

        final DatabaseHelper db = new DatabaseHelper(getApplicationContext());

        MessageAndPeopleGenerator p = new MessageAndPeopleGenerator(20,getApplicationContext());
        //Run this to create more people! ... p.run();







        logIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //This inserts dummy messages to the first 100 users
                for(int x = 0; x < 100; x++)
                    db.sendMessage(8,x,"Hello! ");

                int userID = db.checkPassword(email.getText().toString(), password.getText().toString());
                if(userID != -1) {
                    Intent i = new Intent();
                    i.setClass(getApplicationContext(), MainActivity.class);
                    startActivity(i);

                }
                else{
                    Toast.makeText(getApplicationContext(),"Invalid information", Toast.LENGTH_LONG).show();
                }



            }
        });

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(db.createBaseUser(email.getText().toString(), password.getText().toString()))
                {
                    Intent i = new Intent();
                    i.setClass(getApplicationContext(), MainActivity.class);
                    startActivity(i);
                }
                else{
                    Toast.makeText(getBaseContext(),"Could not sign up...", Toast.LENGTH_LONG).show();
                }
            }
        });


    }
}
