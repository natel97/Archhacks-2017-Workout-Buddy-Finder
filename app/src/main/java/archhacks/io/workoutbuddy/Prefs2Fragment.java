package archhacks.io.workoutbuddy;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;

/**
 * Created by natel on 10/28/2017.
 */

public class Prefs2Fragment extends Fragment implements View.OnClickListener{
    private View mview;
    Spinner spinner;


    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        mview = inflater.inflate(R.layout.prefs_2, container, false);
        SpinnerAdapter adap = ArrayAdapter.createFromResource(getContext(),R.array.workouts,android.R.layout.simple_dropdown_item_1line);
        ((Spinner) mview.findViewById(R.id.sunday)).setAdapter(adap);
        ((Spinner) mview.findViewById(R.id.monday)).setAdapter(adap);
        ((Spinner) mview.findViewById(R.id.tuesday)).setAdapter(adap);
        ((Spinner) mview.findViewById(R.id.wednesday)).setAdapter(adap);
        ((Spinner) mview.findViewById(R.id.thursday)).setAdapter(adap);
        ((Spinner) mview.findViewById(R.id.friday)).setAdapter(adap);
        ((Spinner) mview.findViewById(R.id.saturday)).setAdapter(adap);



        return mview;
    }


    @Override
    public void onClick(View view) {

    }



}
