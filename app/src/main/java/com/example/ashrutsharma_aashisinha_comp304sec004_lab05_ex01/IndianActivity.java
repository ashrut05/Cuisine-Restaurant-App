package com.example.ashrutsharma_aashisinha_comp304sec004_lab05_ex01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class IndianActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_indian);
    }

    public void switchShowRestaurant_onClick(View v) {
        Intent intent = new Intent(this, MapsActivity.class);

        switch (v.getId()) {
            case R.id.btnIndian1:
                intent.putExtra("map_restaurant", "Little India Restaurant");
                intent.putExtra("latitude", 43.6502358);
                intent.putExtra("longitude", -79.3889556);
                break;
            case R.id.btnIndian2:
                intent.putExtra("map_restaurant", "Bindia Indian Bistro");
                intent.putExtra("latitude", 43.6484487);
                intent.putExtra("longitude", -79.3720475);
                break;
            case R.id.btnIndian3:
                intent.putExtra("map_restaurant", "Aanch");
                intent.putExtra("latitude", 43.6447583);
                intent.putExtra("longitude", -79.3910665);
                break;
            case R.id.btnIndian4:
                intent.putExtra("map_restaurant", "Kothur Indian Cuisine");
                intent.putExtra("latitude", 43.6678895);
                intent.putExtra("longitude", -79.3856670);
                break;
        }
        startActivity(intent);
        finish();
    }
}