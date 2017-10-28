package archhacks.io.workoutbuddy;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by natel on 10/27/2017.
 */

public class NearbyPeopleFragment extends Fragment implements View.OnClickListener {

    private View mview;
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        mview = inflater.inflate(R.layout.fragment_nearby_people, container, false);

        return mview;
    }


    @Override
    public void onClick(View view) {

    }
}
