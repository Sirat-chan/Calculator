package com.example.revisioncalculator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;

public class ActivityCalcul extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calcul);
    }
    public void calculsci(View view) {
        FragmentManager fm = getSupportFragmentManager();
        fm.beginTransaction()
                .replace(R.id.fragplace, ScientifiqueFragment.class, null)
                .setReorderingAllowed(true)
                .addToBackStack("name")
                .commit();
    }
    public void calcsimple(View view) {
        FragmentManager fm = getSupportFragmentManager();
        fm.beginTransaction()
                .replace(R.id.fragplace, com.example.calculateura2.FragmentSimple.class, null)
                .setReorderingAllowed(true)
                .addToBackStack("name")
                .commit();
    }
}