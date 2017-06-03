package Fragments.Student;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.nougatstudio.terayahipyarhai.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class StudentTimeTable extends Fragment {


    public StudentTimeTable() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_student_time_table, container, false);
    }

}
