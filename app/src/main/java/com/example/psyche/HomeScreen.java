package com.example.psyche;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Menu;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.navigation.NavigationView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.core.view.GravityCompat;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class HomeScreen extends AppCompatActivity{

    private AppBarConfiguration mAppBarConfiguration;
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);


        drawerLayout = findViewById(R.id.drawerLayout);
        navigationView = findViewById(R.id.nav_view_home_screen);
        toolbar = findViewById(R.id.toolbar2);

        navigationView.bringToFront();
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar,R.string.open_nav, R.string.close_nav);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        Context context = getApplicationContext();

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                if(item.getItemId() == (R.id.nav_challenges)) {
                    Intent intent = new Intent(context, Challenges.class);    //JUST CREATE THE NEW CLASSES NOW!!!!!
                    startActivity(intent);
                } else if(item.getItemId() == (R.id.nav_achievements)) {
                    Intent intent2 = new Intent(context, Achievements.class);    //JUST CREATE THE NEW CLASSES NOW!!!!!
                    startActivity(intent2);
                } else if(item.getItemId() == (R.id.nav_settings)) {
                    Intent intent3 = new Intent(context, Setting.class);    //JUST CREATE THE NEW CLASSES NOW!!!!!
                    startActivity(intent3);
                } else if(item.getItemId() == (R.id.nav_search)) {
                    Intent intent4 = new Intent(context, Search.class);    //JUST CREATE THE NEW CLASSES NOW!!!!!
                    startActivity(intent4);
                }
                drawerLayout.closeDrawer(GravityCompat.START);
                return true;
            }
        });

    }

    @Override
    public void onBackPressed() {
        if(drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START);
        }else {
            super.onBackPressed();
        }
    }

}