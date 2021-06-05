package com.example.ashrutsharma_aashisinha_comp304sec004_lab05_ex01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class GreekActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_greek);
    }
    public void switchShowRestaurant_onClick(View v) {
        Intent intent= new Intent(this, MapsActivity.class);

        switch (v.getId()) {
            case R.id.btnGreek1:
                intent.putExtra("map_restaurant", "VOLOS");
                intent.putExtra("latitude", 43.6503178);
                intent.putExtra("longitude", -79.384717);
                break;
            case R.id.btnGreek2:
                intent.putExtra("map_restaurant", "Mykonos Mediterranean Grill");
                intent.putExtra("latitude", 43.6743959);
                intent.putExtra("longitude", -79.3880529);
                break;
            case R.id.btnGreek3:
                intent.putExtra("map_restaurant", "Greek in Downtown");
                intent.putExtra("latitude", 43.6495527);
                intent.putExtra("longitude", -79.3655070);
                break;
            case R.id.btnGreek4:
                intent.putExtra("map_restaurant", "Mr. Souvlaki");
                intent.putExtra("latitude", 43.6511751);
                intent.putExtra("longitude", -79.3842381);
                break;
        }
        startActivity(intent);
        finish();
    }
}