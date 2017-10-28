package archhacks.io.workoutbuddy;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by natel on 10/28/2017.
 */

public class Prefs2Fragment extends Fragment implements View.OnClickListener{
    private View mview;


    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        mview = inflater.inflate(R.layout.prefs_2, container, false);



        return mview;
    }


    @Override
    public void onClick(View view) {

    }



}
