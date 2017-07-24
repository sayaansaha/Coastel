package com.sayaan.localize;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.sayaan.localize.fragments.ResultFragment;

/**
 * Created by sayaan on 7/8/17.
 */

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstance) {
        super.onCreate(savedInstance);
        setContentView(R.layout.main_activity);

        Spinner spinner = (Spinner) findViewById(R.id.locations_list);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.coastal_location, android.R.layout.simple_spinner_item);

        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        // Apply the adapter to the spinner
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                int index;
                index = parent.getSelectedItemPosition();

                switch (index) {
                    case 0:
                        getFragmentManager().beginTransaction().replace(R.id.content_main, ResultFragment.newInstance()).commit();
                        break;
                    case 1:
                        getFragmentManager().beginTransaction().replace(R.id.content_main, ResultFragment.newInstance()).commit();
                        break;
                    default:
                        getFragmentManager().beginTransaction().replace(R.id.content_main, ResultFragment.newInstance()).commit();
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                }
            });
        }
    }






