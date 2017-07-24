package com.sayaan.localize.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sayaan.localize.R;

/**
 * Created by sayaan on 7/9/17.
 */

public class ResultFragment extends Fragment {
    public ResultFragment() {
    }

    public static ResultFragment newInstance() {
        return new ResultFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.result_fragmant, container, false);


        return root;
    }

}
