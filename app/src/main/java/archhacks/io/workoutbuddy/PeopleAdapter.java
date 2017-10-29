package archhacks.io.workoutbuddy;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by natel on 10/29/2017.
 */

public class PeopleAdapter extends RecyclerView.Adapter<PeopleAdapter.PeopleViewHolder> {

    Context mContext;
    List<Person> people;
    public PeopleAdapter(Context context, List<Person> peo) {
        mContext = context;
        people = peo;
    }

    @Override
    public PeopleAdapter.PeopleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        View view = inflater.inflate(R.layout.person_frag, parent, false);
        return new PeopleAdapter.PeopleViewHolder(view);
    }

    @Override
    public void onBindViewHolder(PeopleAdapter.PeopleViewHolder holder, int position) {
        holder.name.setText(String.valueOf(people.get(position).getName()));
        holder.avatar.setImageResource(mContext.getResources().getIdentifier(people.get(position).getImage(), "drawable", "archhacks.io.workoutbuddy"));
    }

    @Override
    public int getItemCount() {
        return people.size();
    }


    class PeopleViewHolder extends RecyclerView.ViewHolder {
        protected TextView name;
        protected ImageView avatar;

        public PeopleViewHolder(View view) {
            super(view);
            this.avatar = view.findViewById(R.id.perImage);
            this.name= view.findViewById(R.id.perName);
        }
    }


}
