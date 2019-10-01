package com.example.filmoteca;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private String LOG = "DebugApp";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(LOG, "onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(LOG, "onStop");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(LOG, "onRestart");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(LOG, "onPause");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(LOG, "onDestroy");

    }
}
