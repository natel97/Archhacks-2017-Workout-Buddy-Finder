package archhacks.io.workoutbuddy;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by natel on 10/28/2017.
 */

public class MessengerMessageAdapter extends RecyclerView.Adapter<MessengerMessageAdapter.MessageViewHolder> {

        Context mContext;
        List<Message> messages;
        public MessengerMessageAdapter(Context context, List<Message> Messages) {
            mContext = context;
            messages = Messages;
        }

        @Override
        public MessengerMessageAdapter.MessageViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            LayoutInflater inflater = LayoutInflater.from(mContext);
            View view = inflater.inflate(R.layout.internalmessage, parent, false);
            return new MessengerMessageAdapter.MessageViewHolder(view);
        }

        @Override
        public void onBindViewHolder(MessengerMessageAdapter.MessageViewHolder holder, int position) {
            holder.messageFrom.setText(String.valueOf(messages.get(position).getSender()));
            holder.shortDescription.setText(messages.get(position).getBody());
            holder.avatar.setImageResource(R.drawable.bike_riding);
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
                this.avatar = view.findViewById(R.id.ava);
                this.messageFrom= view.findViewById(R.id.from);
                this.shortDescription = view.findViewById(R.id.desc);
            }
        }
    }
