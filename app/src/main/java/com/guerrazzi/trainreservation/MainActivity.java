package com.guerrazzi.trainreservation;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.navigation.NavigationView;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.guerrazzi.trainreservation.databinding.ActivityMain2Binding;
import com.guerrazzi.trainreservation.databinding.NavHeaderMainBinding;
import com.guerrazzi.trainreservation.view.ReservationActivity;
import com.guerrazzi.trainreservation.view.SettingsAccountActivity;
import com.guerrazzi.trainreservation.view.fragment.CurrentReservationFragment;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.databinding.DataBindingUtil;
import androidx.drawerlayout.widget.DrawerLayout;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {


    private ActivityMain2Binding main2Binding;
    NavHeaderMainBinding navHeaderMainBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        main2Binding = DataBindingUtil.setContentView(this, R.layout.activity_main2);

        setSupportActionBar(main2Binding.appBarMainInclude.toolbar);
        FirebaseUser fb = FirebaseAuth.getInstance().getCurrentUser();
        FloatingActionButton fab = findViewById(R.id.fab);
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, main2Binding.appBarMainInclude.toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(view.getContext(), ReservationActivity.class));
            }
        });

        getSupportFragmentManager().beginTransaction().add(main2Binding.appBarMainInclude.frameCurrentReservation.getId(), new CurrentReservationFragment()).commit();
    }

    @Override
    public void onBackPressed() {
        if (main2Binding.drawerLayout.isDrawerOpen(GravityCompat.START)) {
            main2Binding.drawerLayout.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_settings) {
            startActivity(new Intent(this, SettingsAccountActivity.class));
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        main2Binding.drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }
}
