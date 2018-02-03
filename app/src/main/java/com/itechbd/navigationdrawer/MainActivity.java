package com.itechbd.navigationdrawer;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

import com.itechbd.navigationdrawer.fragments.ContactFragment;
import com.itechbd.navigationdrawer.fragments.FavoriteFragment;
import com.itechbd.navigationdrawer.fragments.HomeFragment;
import com.itechbd.navigationdrawer.fragments.HotsFragment;
import com.itechbd.navigationdrawer.fragments.SettingsFragment;

public class MainActivity extends AppCompatActivity {

    private Toolbar mToolbar;
    private ActionBar mActionBar;
    private NavigationView mNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initToolbar();

        initDrawer();

        displayFragment(R.id.nav_home, getString(R.string.nav_home));
    }

    public void initToolbar(){
        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);
        mActionBar = getSupportActionBar();
        mActionBar.setDisplayHomeAsUpEnabled(true);
        mActionBar.setHomeButtonEnabled(true);
    }

    public void initDrawer(){
       final DrawerLayout mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, mDrawerLayout, mToolbar, R.string.navigation_drawer_open,
                R.string.navigation_drawer_close){
            @Override
            public void onDrawerOpened(View drawerView) {
                //hide keybord
                hideKeyBoard();
                super.onDrawerOpened(drawerView);
            }
        };
        mDrawerLayout.setDrawerListener(toggle);
        toggle.syncState();

        mNavigationView = (NavigationView) findViewById(R.id.nav_layout);
        mNavigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                item.setCheckable(true);
                displayFragment(item.getItemId(), item.getTitle().toString());
                mDrawerLayout.closeDrawers();
                return true;
            }
        });
    }

    public void displayFragment(int id, String title){
        mActionBar.setDisplayShowCustomEnabled(false);
        mActionBar.setDisplayShowTitleEnabled(true);
        mActionBar.setTitle(title);

        Fragment fragment = null;
        Bundle bundle = new Bundle();
        switch (id){
            case R.id.nav_home:
                fragment = new HomeFragment();
                break;
            case R.id.nav_hots:
                Intent menu= new Intent(MainActivity.this , menu.class);
                MainActivity.this.startActivity(menu);
                break;
            case R.id.nav_favorite:
                fragment = new FavoriteFragment();
                break;
            case R.id.nav_setting:
                Intent feedback= new Intent(MainActivity.this , feedback.class);
                MainActivity.this.startActivity(feedback);

            case R.id.nav_contact:
                fragment = new ContactFragment();
                break;
        }
        //fragment.setArguments(bundle);
        if (fragment != null){
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.frame_content, fragment);
            ft.commit();
        }


    }

    public void hideKeyBoard(){
        View view = this.getCurrentFocus();
        if (view != null){
            InputMethodManager imm = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
            imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START);
        }else {
            doExitApp();
        }
    }

    public void doExitApp(){
        finish();
    }
}
