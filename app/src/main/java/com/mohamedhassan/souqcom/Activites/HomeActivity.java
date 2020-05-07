package com.mohamedhassan.souqcom.Activites;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Menu;
import android.widget.TextView;

import com.google.android.material.navigation.NavigationView;
import com.mohamedhassan.souqcom.R;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import de.hdodenhof.circleimageview.CircleImageView;

public class HomeActivity extends AppCompatActivity {

    private AppBarConfiguration mAppBarConfiguration;
    CircleImageView imageViewProfileMenu;
    TextView Tv_WelcomeAppMenu, Tv_SignIn_SignUpMenu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_home, R.id.nav_deals, R.id.nav_super_market, R.id.nav_fashion, R.id.nav_home_and_kitchen,
                R.id.nav_mobiles_tablets, R.id.nav_electronics, R.id.nav_babies, R.id.nav_toys, R.id.nav_health_beauty,
                R.id.nav_track_orders, R.id.nav_my_account, R.id.nav_my_wishlist)
                .setDrawerLayout(drawer)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        View headerLayout = navigationView.getHeaderView(0);
        imageViewProfileMenu = headerLayout.findViewById(R.id.imageViewProfileMenu);
        Tv_WelcomeAppMenu = headerLayout.findViewById(R.id.Tv_WelcomeAppMenu);
        Tv_SignIn_SignUpMenu = headerLayout.findViewById(R.id.Tv_SignIn_SignUpMenu);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);

        Tv_SignIn_SignUpMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(HomeActivity.this,LoginActivity.class));
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.home, menu);
        return true;
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }
}
