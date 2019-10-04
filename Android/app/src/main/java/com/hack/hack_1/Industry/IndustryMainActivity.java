package com.hack.hack_1.Industry;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.hack.hack_1.R;

public class IndustryMainActivity extends AppCompatActivity {

    EditText etStateIndustry,etCityIndustry;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_industry_main);

        etStateIndustry = findViewById(R.id.edittext_state_industry);
//        etCityIndustry = findViewById(R.id.text_input_city_industry);

        etStateIndustry.setOnClickListener(new View.OnClickListener() {
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
                AlertDialog.Builder builder = new AlertDialog.Builder(IndustryMainActivity.this);
                builder.setTitle("Select");
                builder.setItems(text, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int pos) {
                        etStateIndustry.setText(text[pos]);
                    }
                });
                builder.show();

            }
        });

    }




}
