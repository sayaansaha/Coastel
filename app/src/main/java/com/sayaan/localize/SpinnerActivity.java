//package com.sayaan.localize;
//
//import android.app.Fragment;
//import android.support.v4.app.FragmentManager;
//import android.view.View;
//import android.widget.AdapterView;
//
//import com.sayaan.localize.fragments.ResultFragment;
//
///**
// * Created by sayaan on 7/9/17.
// */
//
//public class SpinnerActivity extends MainActivity implements AdapterView.OnItemSelectedListener {
//    @Override
//    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
//        android.support.v4.app.Fragment fragment;
//        String locale;
//        locale = parent.getSelectedItem().toString();
//
//        switch (locale){
//            case "Eureka":
//                fragment = ResultFragment.newInstance("Eureka");
//                break;
//            case "Los Angeles":
//                fragment = ResultFragment.newInstance("Los Angeles");
//                break;
//            default:
//                fragment = ResultFragment.newInstance("Los Angeles");
//                break;
//        }
//
//        // Insert the fragment by replacing any existing fragment
//        FragmentManager fragmentManager = getSupportFragmentManager();
//        fragmentManager.beginTransaction().replace(R.id.content_main, fragment).commit();
//    }
//
//
//    @Override
//    public void onNothingSelected(AdapterView<?> parent) {
//
//    }
//}
