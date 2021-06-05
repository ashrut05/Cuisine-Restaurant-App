package com.example.ashrutsharma_aashisinha_comp304sec004_lab05_ex01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ChineseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chinese);
    }
    public void switchShowRestaurant_onClick(View v) {
        Intent intent= new Intent(this, MapsActivity.class);

        switch (v.getId()) {
            case R.id.btnChinese1:
                intent.putExtra("map_restaurant", "Hong Shing Chinese Restaurant");
                intent.putExtra("latitude", 43.6549379);
                intent.putExtra("longitude", -79.3869003);
                break;
            case R.id.btnChinese2:
                intent.putExtra("map_restaurant", "Asian Legend");
                intent.putExtra("latitude", 43.6536858);
                intent.putExtra("longitude", -79.3950882);
                break;
            case R.id.btnChinese3:
                intent.putExtra("map_restaurant", "Swatow Restaurant");
                intent.putExtra("latitude", 43.6538433);
                intent.putExtra("longitude", -79.3981061);
                break;
            case R.id.btnChinese4:
                intent.putExtra("map_restaurant", "Lee Chen Asian Bistro");
                intent.putExtra("latitude", 43.6473646);
                intent.putExtra("longitude", -79.3866380);
                break;
        }
        startActivity(intent);
        finish();
    }

}