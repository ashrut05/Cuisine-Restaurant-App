package com.example.ashrutsharma_aashisinha_comp304sec004_lab05_ex01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MexicanActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mexican);
    }
    public void switchShowRestaurant_onClick(View v) {
        Intent intent= new Intent(this, MapsActivity.class);

        switch (v.getId()) {
            case R.id.btnMexican1:
                intent.putExtra("map_restaurant", "Wilbur Mexicana");
                intent.putExtra("latitude", 43.644877);
                intent.putExtra("longitude", -79.398808);
                break;
            case R.id.btnMexican2:
                intent.putExtra("map_restaurant", "La Carnita");
                intent.putExtra("latitude", 43.647137);
                intent.putExtra("longitude", -79.390136);
                break;
            case R.id.btnMexican3:
                intent.putExtra("map_restaurant", "Milagro Cantina Mercer");
                intent.putExtra("latitude", 43.645795);
                intent.putExtra("longitude", -79.389756);
                break;
            case R.id.btnMexican4:
                intent.putExtra("map_restaurant", "Mi Taco Taqueria");
                intent.putExtra("latitude", 43.650279);
                intent.putExtra("longitude", -79.3887161);
                break;
        }
        startActivity(intent);
        finish();
    }
}