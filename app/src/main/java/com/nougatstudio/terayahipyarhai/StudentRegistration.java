package com.nougatstudio.terayahipyarhai;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ViewSwitcher;

public class StudentRegistration extends AppCompatActivity implements View.OnClickListener {
    Button proccedToNext, Cancel, Register;
    ViewSwitcher viewSwitcherStudentRegistration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_registration);
        proccedToNext = (Button) findViewById(R.id.proceedToNext);
        viewSwitcherStudentRegistration = (ViewSwitcher) findViewById(R.id.viewSwitcherStudentRegistration);

        proccedToNext.setOnClickListener(this);
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.floatingActionButton);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewSwitcherStudentRegistration.showPrevious();
            }
        });

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.proceedToNext: {
                viewSwitcherStudentRegistration.showNext();
            }
            break;
        }
    }
}
