package archhacks.io.workoutbuddy;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

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
        EditText email = (EditText) findViewById(R.id.emailInput);
        EditText password = (EditText) findViewById(R.id.passwordInput);

        logIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO Implement login -- Temporarily (Plz undo later) auto moves to main
                Intent i = new Intent();
                i.setClass(getApplicationContext(),MainActivity.class);
                startActivity(i);
            }
        });

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO Implement creating an account
            }
        });


    }
}
