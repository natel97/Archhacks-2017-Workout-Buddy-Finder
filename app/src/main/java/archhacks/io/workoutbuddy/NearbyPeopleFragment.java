package archhacks.io.workoutbuddy;

import android.os.Bundle;
import android.provider.Contacts;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by natel on 10/27/2017.
 */

public class NearbyPeopleFragment extends Fragment implements View.OnClickListener {

    private View mview;
    PeopleAdapter pAdapt;
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        mview = inflater.inflate(R.layout.fragment_nearby_people, container, false);

        DatabaseHelper db = new DatabaseHelper(getContext());

        List<Person> people =  db.getPeople();
        RecyclerView rec = (RecyclerView) mview.findViewById(R.id.onScreenRecView);

        pAdapt = new PeopleAdapter(getContext(),people);
        rec.setLayoutManager(new LinearLayoutManager(getContext()));
        rec.setAdapter(pAdapt);

        return mview;
    }


    @Override
    public void onClick(View view) {

    }
}
