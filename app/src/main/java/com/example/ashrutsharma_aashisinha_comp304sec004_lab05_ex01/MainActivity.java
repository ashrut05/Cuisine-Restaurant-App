package com.example.ashrutsharma_aashisinha_comp304sec004_lab05_ex01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void switchActivities_onClick(View v){
        Intent switchActivityIntent;
        switch (v.getId()){
            case R.id.openChineseActivity:
                switchActivityIntent = new Intent(this, ChineseActivity.class);
                startActivity(switchActivityIntent);
                break;
            case R.id.openIndianActivity:
                switchActivityIntent = new Intent(this, IndianActivity.class);
                startActivity(switchActivityIntent);
                break;
            case R.id.openGreekActivity:
                switchActivityIntent = new Intent(this, GreekActivity.class);
                startActivity(switchActivityIntent);
                break;
            case R.id.openItalianActivity:
                switchActivityIntent = new Intent(this, ItalianActivity.class);
                startActivity(switchActivityIntent);
                break;
            case R.id.openMexicanActivity:
                switchActivityIntent = new Intent(this, MexicanActivity.class);
                startActivity(switchActivityIntent);
                break;
        }
    }
}