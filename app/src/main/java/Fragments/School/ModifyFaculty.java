package Fragments.School;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;

import com.nougatstudio.terayahipyarhai.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ModifyFaculty extends Fragment {

    View root;
    CardView cardView1, cardView2;
    ScrollView scrollView1;

    public ModifyFaculty() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        root = inflater.inflate(R.layout.fragment_modify_faculty, container, false);
        cardView1 = (CardView) root.findViewById(R.id.cardView1);
        cardView2 = (CardView) root.findViewById(R.id.cardView2);

        //DisableProgressBar();
        EnableProgressBar();

        return root;
    }

    private void EnableProgressBar() {
        cardView1.setAlpha(0.5f);
        cardView2.setAlpha(0.5f);
    }

    private void DisableProgressBar() {
        cardView1.setAlpha(0);
        cardView2.setAlpha(0);
    }

}
