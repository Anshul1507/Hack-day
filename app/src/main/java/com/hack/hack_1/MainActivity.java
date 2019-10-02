package com.hack.hack_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.hack.hack_1.Farmer.FamerMainActivity;
import com.hack.hack_1.Industry.IndustryMainActivity;

public class MainActivity extends AppCompatActivity {

    RelativeLayout layoutIndustry,layoutFarmer;
    CardView cardIndustry,cardFarmer;

    Button continueBtn;

    private int selectedID = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        layoutIndustry = findViewById(R.id.layout_card_industry);
        layoutFarmer = findViewById(R.id.layout_card_farmer);
        continueBtn = findViewById(R.id.continue_choose_button);

        layoutFarmer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layoutFarmer.setBackgroundResource(R.color.selected_card_farmer);
                layoutIndustry.setBackgroundResource(R.color.choose_card_industry);
                selectedID = 1;
            }
        });

        layoutIndustry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layoutFarmer.setBackgroundResource(R.color.choose_card_farmer);
                layoutIndustry.setBackgroundResource(R.color.selected_card_industry);
                selectedID = 2;
            }
        });


        continueBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(selectedID == 0){
                    Toast.makeText(MainActivity.this, "Please select one of above categories", Toast.LENGTH_SHORT).show();
                }else if(selectedID == 1){
                    click(1);
                }else if(selectedID == 2){
                    click(2);
                }
            }
        });



    }

    private void click(final int id){

                if(id==1){
                    startActivity(new Intent(getApplicationContext(), FamerMainActivity.class));
                }else{
                    // intent to industry activity
                    startActivity(new Intent(getApplicationContext(), IndustryMainActivity.class));
                }

                finish();
            }
}
