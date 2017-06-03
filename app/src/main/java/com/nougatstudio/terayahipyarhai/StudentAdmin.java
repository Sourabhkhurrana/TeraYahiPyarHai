package com.nougatstudio.terayahipyarhai;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

import Fragments.School.AddFaculty;
import Fragments.School.Notices;
import Fragments.School.StudentRequest;

public class StudentAdmin extends AppCompatActivity {


    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            final FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            switch (item.getItemId()) {

                case R.id.navigationStudentLibrary:

                    fragmentTransaction.replace(R.id.fragmentContainerLayout, new StudentRequest());
                    fragmentTransaction.commit();
                    return true;

                case R.id.navigationStudentAttendance:

                    fragmentTransaction.replace(R.id.fragmentContainerLayout, new AddFaculty());
                    fragmentTransaction.commit();
                    return true;

                case R.id.navigationStudentDashboard:

                    fragmentTransaction.replace(R.id.fragmentContainerLayout, new Notices());
                    fragmentTransaction.commit();
                    return true;

                case R.id.navigationStudentNotice:

                    fragmentTransaction.replace(R.id.fragmentContainerLayout, new StudentRequest());
                    fragmentTransaction.commit();
                    return true;

                case R.id.navigationStudentProfile:
                    fragmentTransaction.replace(R.id.fragmentContainerLayout, new StudentRequest());
                    fragmentTransaction.commit();
                    return true;


            }
            fragmentTransaction.replace(R.id.fragmentContainerLayout, new StudentRequest());
            fragmentTransaction.commit();
            return true;
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_admin);

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigationStudentAdmin);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        navigation.getMenu().getItem(2).setChecked(true);
        navigation.setItemIconTintList(null);
    }

}
