package com.example.johannes11833.sharedpref;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setValue();

        getValue();
    }
    /**
     *  sets value
     */

    void setValue(){
        SharedPreferences.Editor editor = getSharedPreferences("abc", MODE_PRIVATE).edit();
        editor.putString("name", "Elena");
        editor.putInt("idName", 12);
        editor.apply();

    }



    void getValue(){
        SharedPreferences prefs = getSharedPreferences("abc", MODE_PRIVATE);
        String restoredText = prefs.getString("name", null);
        if (restoredText != null) {


            Log.d("sharedPref_string",restoredText);
        }else{
            Log.d("sharedPref_string","not found");

        }

    }
}
