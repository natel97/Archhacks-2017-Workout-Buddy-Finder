package archhacks.io.workoutbuddy;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by natel on 10/28/2017.
 */

import android.content.res.Resources;


public class MessageAdapter extends RecyclerView.Adapter<MessageAdapter.MessageViewHolder> {

    Context mContext;
    List<Message> messages;
    public MessageAdapter(Context context, List<Message> Messages) {
        mContext = context;
        messages = Messages;
    }

    @Override
    public MessageViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        View view = inflater.inflate(R.layout.message, parent, false);
        return new MessageViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MessageViewHolder holder, int position) {
        holder.messageFrom.setText(String.valueOf(messages.get(position).getSender()));
        holder.shortDescription.setText(String.valueOf(messages.get(position).getBody()));
    }

    @Override
    public int getItemCount() {
        return messages.size();
    }


    class MessageViewHolder extends RecyclerView.ViewHolder {
        protected TextView messageFrom;
        protected ImageView avatar;
        protected TextView shortDescription;

        public MessageViewHolder(View view) {
            super(view);
            this.avatar = view.findViewById(R.id.avatar);
            this.messageFrom= view.findViewById(R.id.message_from_user);
            this.shortDescription = view.findViewById(R.id.message_short_description);


        }
    }
}

