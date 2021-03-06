package com.nougatstudio.terayahipyarhai;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import Fragments.School.AddFaculty;
import Fragments.School.ModifyFaculty;
import Fragments.School.Notices;
import Fragments.School.SchoolAttendanceSummary;
import Fragments.School.SchoolEvents;
import Fragments.School.SchoolNotifications;
import Fragments.School.SchoolPaymentSummary;
import Fragments.School.SchoolStudentDetail;
import Fragments.School.StudentRequest;


public class SchoolAdmin extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_school_admin);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        navigationView.setItemIconTintList(null);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.school_admin, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        if (id == R.id.nav_home) {
            fragmentTransaction.replace(R.id.fragmentContainerLayout, new SchoolEvents());
        } else if (id == R.id.nav_schoolProfile) {
            startActivity(new Intent(this, SchoolProfile.class));
        } else if (id == R.id.nav_studentRequest) {
            fragmentTransaction.replace(R.id.fragmentContainerLayout, new StudentRequest());
        } else if (id == R.id.nav_studentDetails) {
            fragmentTransaction.replace(R.id.fragmentContainerLayout, new SchoolStudentDetail());
        } else if (id == R.id.nav_studentAttendanceDatabase) {
            fragmentTransaction.replace(R.id.fragmentContainerLayout, new SchoolAttendanceSummary());
        } else if (id == R.id.nav_addFaculty) {
            fragmentTransaction.replace(R.id.fragmentContainerLayout, new AddFaculty());
        } else if (id == R.id.nav_modifyFaculty) {
            fragmentTransaction.replace(R.id.fragmentContainerLayout, new ModifyFaculty());
        } else if (id == R.id.nav_notice) {
            fragmentTransaction.replace(R.id.fragmentContainerLayout, new Notices());
        } else if (id == R.id.nav_notification) {
            fragmentTransaction.replace(R.id.fragmentContainerLayout, new SchoolNotifications());
        } else if (id == R.id.nav_logout) {

        } else if (id == R.id.nav_payment) {
            fragmentTransaction.replace(R.id.fragmentContainerLayout, new SchoolPaymentSummary());
        } else if (id == R.id.nav_contactUs) {
        } else if (id == R.id.nav_aboutUs) {
        } else if (id == R.id.nav_share) {
        }

        fragmentTransaction.commit();

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
