package com.na.khapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentMain extends Fragment
{


    public FragmentMain() {
        // Required empty public constructor
    }

    // newInstance constructor for creating fragment with arguments
    public static FragmentMain newInstance(int page, String title) {
        FragmentMain fragmentFirst = new FragmentMain();
        //Bundle args = new Bundle();
        //args.putInt("someInt", page);
        //args.putString("someTitle", title);
        //fragmentFirst.arg(args);
        return fragmentFirst;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragment_main, container, false);
    }

}
