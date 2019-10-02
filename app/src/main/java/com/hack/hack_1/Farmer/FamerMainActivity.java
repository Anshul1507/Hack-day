package com.hack.hack_1.Farmer;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.hack.hack_1.Industry.IndustryMainActivity;
import com.hack.hack_1.R;

public class FamerMainActivity extends AppCompatActivity {

    EditText etStateFarmer,etCityFarmer;
    Button selectedBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_famer_main);

        etStateFarmer = findViewById(R.id.edittext_state_farmer);
        etCityFarmer = findViewById(R.id.edittext_city_farmer);
        selectedBtn = findViewById(R.id.continue_select_state_button_farmer);

        etStateFarmer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String[] text = {"Andra Pradesh",
                        "Arunachal Pradesh",
                        "Assam",
                        "Bihar",
                        "Chhattisgarh",
                        "Goa",
                        "Gujarat",
                        "Haryana",
                        "Himachal Pradesh",
                        "Jammu and Kashmir",
                        "Jharkhand",
                        "Karnataka",
                        "Kerala",
                        "Madya Pradesh",
                        "Maharashtra",
                        "Manipur",
                        "Meghalaya",
                        "Mizoram",
                        "Nagaland",
                        "Orissa",
                        "Punjab",
                        "Rajasthan",
                        "Sikkim",
                        "Tamil Nadu\n",
                        "Telagana",
                        "Tripura",
                        "Uttaranchal",
                        "Uttar Pradesh",
                        "West Bengal",
                        "Andaman and Nicobar Islands",
                        "Chandigarh",
                        "Dadar and Nagar Haveli",
                        "Daman and Diu",
                        "Delhi",
                        "Lakshadeep",
                        "Pondicherry",
                };
                AlertDialog.Builder builder = new AlertDialog.Builder(FamerMainActivity.this);
                builder.setTitle("Select");
                builder.setItems(text, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int pos) {
                        etStateFarmer.setText(text[pos]);
                    }
                });
                builder.show();

            }
        });

        selectedBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!etStateFarmer.getText().toString().trim().isEmpty()){
                    if(!etCityFarmer.getText().toString().trim().isEmpty()){
                        startActivity(new Intent(getApplicationContext(),FarmerDetailActivity.class));
                        finish();
                    }
                }else{
                    Toast.makeText(FamerMainActivity.this, "Please fill above info.", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }


}
