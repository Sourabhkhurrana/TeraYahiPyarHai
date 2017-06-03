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
            switch (item.getItemId()) {

                case R.id.navigation_home:
                    FragmentTransaction fragmentTransaction1 = getSupportFragmentManager().beginTransaction();
                    fragmentTransaction1.replace(R.id.fragmentContainerLayout, new StudentRequest());
                    fragmentTransaction1.commit();
                    return true;

                case R.id.navigation_dashboard:
                    FragmentTransaction fragmentTransaction2 = getSupportFragmentManager().beginTransaction();
                    fragmentTransaction2.replace(R.id.fragmentContainerLayout, new AddFaculty());
                    fragmentTransaction2.commit();
                    return true;

                case R.id.navigation_notifications:
                    FragmentTransaction fragmentTransaction3 = getSupportFragmentManager().beginTransaction();
                    fragmentTransaction3.replace(R.id.fragmentContainerLayout, new Notices());
                    fragmentTransaction3.commit();
                    return true;

                case R.id.navigation_dashboard1:
                    FragmentTransaction fragmentTransaction4 = getSupportFragmentManager().beginTransaction();
                    fragmentTransaction4.replace(R.id.fragmentContainerLayout, new StudentRequest());
                    fragmentTransaction4.commit();
                    return true;

                case R.id.navigation_notifications2:
                    FragmentTransaction fragmentTransaction5 = getSupportFragmentManager().beginTransaction();
                    fragmentTransaction5.replace(R.id.fragmentContainerLayout, new StudentRequest());
                    fragmentTransaction5.commit();
                    return true;
            }
            return false;
        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_admin);

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        navigation.getMenu().getItem(2).setChecked(true);
    
    }

}
