package archhacks.io.workoutbuddy;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.amazonaws.services.s3.AmazonS3Client;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by natel on 10/27/2017.
 */

public class MessagesFragment extends Fragment implements View.OnClickListener {

    private View mview;
    private RecyclerView recyclerView;
    private MessageAdapter messageAdapter;
    private List<Message> messages;

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        mview = inflater.inflate(R.layout.fragment_messages, container, false);
        recyclerView = mview.findViewById(R.id.messages);
        recyclerView.setLayoutManager(new LinearLayoutManager(this.getContext()));
        DatabaseHelper db = new DatabaseHelper(getContext());
        db.sendMessage(1,0, "Hello!!!");
        db.sendMessage(2, 0, "Hey there! Hows it going?");

        messageAdapter = new MessageAdapter(getContext(), new DatabaseHelper(getContext()).getMessages(0));



        recyclerView.setAdapter(messageAdapter);

        return mview;
    }


    @Override
    public void onClick(View view) {
        //Log.i("VIEW",((Message)view.getTag()).getSender());
    }
}
