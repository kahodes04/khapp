package com.na.khapp;

import android.app.FragmentTransaction;
import android.support.annotation.NonNull;
import android.app.FragmentManager;
import android.app.Fragment;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

public class mainmenu extends AppCompatActivity //implements BottomNavigationView.OnNavigationItemReselectedListener
{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainmenu);
        loadFragment(new FragmentHome());
        //View v = inflater.inflate(R.layout.fragment_teamfragmentthree,null);
        final BottomNavigationView bottomNavigationView = (BottomNavigationView)
                findViewById(R.id.bottom_navigation);

        //final FragmentManager fragmentManager = getSupportFragmentManager();

        //defining fragments
        //final Fragment fragment1 = new FragmentMain();

        bottomNavigationView.setOnNavigationItemSelectedListener(
                new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        Fragment fragment = null;
                        switch (item.getItemId()) {
                            case R.id.action_home:
                                loadFragment(new FragmentHome());
                                break;
                            case R.id.action_lore:
                                loadFragment(new FragmentLore());
                                break;
                            case R.id.action_puzzle:
                                loadFragment(new FragmentPuzzle());
                                break;
                            case R.id.action_soundboard:
                                loadFragment(new FragmentSoundboard());
                                break;
                        }
                        return true;
                    }
                });

    }
private boolean loadFragment(Fragment _fragment){
        if(_fragment != null){
            getFragmentManager().beginTransaction().replace(R.id.content_frame, _fragment).commit();
            return true;
        }
        return false;
}
//OLD CODE, COULD NOT OVERRIDE FUNCTION BUT COULD DO IT ON TOP OF THIS CODE
//    @Override
//    public void onNavigationItemReselected(@NonNull MenuItem item) {
//Fragment fragment = null;
//switch(item.getItemId()){
//    case R.id.action_home:
//        fragment = new FragmentHome();
//        break;
//    case R.id.action_lore:
//        fragment = new FragmentLore();
//        break;
//    case R.id.action_puzzle:
//        fragment = new FragmentPuzzle();
//        break;
//    case R.id.action_soundboard:
//        fragment = new FragmentSoundboard();
//        break;
//}
//loadFragment(fragment);
//    }
}
