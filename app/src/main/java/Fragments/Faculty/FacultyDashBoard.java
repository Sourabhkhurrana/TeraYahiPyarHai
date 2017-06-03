package Fragments.Faculty;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.nougatstudio.terayahipyarhai.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FacultyDashBoard extends Fragment {


    public FacultyDashBoard() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_faculty_dash_board, container, false);
    }

}
