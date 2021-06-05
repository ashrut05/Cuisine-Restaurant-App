package com.example.ashrutsharma_aashisinha_comp304sec004_lab05_ex01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ItalianActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_italian);
    }
    public void switchShowRestaurant_onClick(View v) {
        Intent intent= new Intent(this, MapsActivity.class);

        switch (v.getId()) {
            case R.id.btnItalian1:
                intent.putExtra("map_restaurant", "Carisma");
                intent.putExtra("latitude", 43.650316);
                intent.putExtra("longitude", -79.375902);
                break;
            case R.id.btnItalian2:
                intent.putExtra("map_restaurant", "Donatello Restaurant");
                intent.putExtra("latitude", 43.6573519);
                intent.putExtra("longitude", -79.383471);
                break;
            case R.id.btnItalian3:
                intent.putExtra("map_restaurant", "Terroni");
                intent.putExtra("latitude", 43.6508932);
                intent.putExtra("longitude", -79.375693);
                break;
            case R.id.btnItalian4:
                intent.putExtra("map_restaurant", "Gusto 101");
                intent.putExtra("latitude", 43.6451789);
                intent.putExtra("longitude", -79.4001513);
                break;
        }
        startActivity(intent);
        finish();
    }
}