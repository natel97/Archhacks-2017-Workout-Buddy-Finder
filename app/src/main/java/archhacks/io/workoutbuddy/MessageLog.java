package archhacks.io.workoutbuddy;

import android.database.Cursor;
import android.os.Bundle;
import android.os.Messenger;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.List;

/**
 * Created by natel on 10/28/2017.
 */

public class MessageLog extends AppCompatActivity {

    MessengerMessageAdapter messageAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.messenger);

        final RecyclerView rec = (RecyclerView)findViewById(R.id.rec);

        final EditText message = (EditText) findViewById(R.id.messageToSend);

        final DatabaseHelper db = new DatabaseHelper(getApplicationContext());
        List<Message> messages =  db.getConversation(String.valueOf(getIntent().getIntExtra("From",0)), String.valueOf(getIntent().getIntExtra("To",0)));

        final int otherUser = getIntent().getIntExtra("From",0) == 0 ? getIntent().getIntExtra("To", 0) : getIntent().getIntExtra("From",0);
        messageAdapter = new MessengerMessageAdapter(getApplicationContext(),messages);
        rec.setLayoutManager(new LinearLayoutManager(this));
        rec.setAdapter(messageAdapter);

        Button sender = (Button) findViewById(R.id.sendMessage);

        sender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                db.sendMessage(0,otherUser,message.getText().toString());

                List<Message> mess =  db.getConversation(String.valueOf(getIntent().getIntExtra("From",0)), String.valueOf(getIntent().getIntExtra("To",0)));
                MessengerMessageAdapter mesMesAd = new MessengerMessageAdapter(getApplicationContext(),mess);
                rec.setAdapter(mesMesAd);
                rec.scrollTo(rec.getBottom(), rec.getLeft());
            }
        });




    }

}
