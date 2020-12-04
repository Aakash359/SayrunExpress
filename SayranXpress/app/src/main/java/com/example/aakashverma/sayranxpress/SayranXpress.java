package com.example.aakashverma.sayranxpress;

import android.app.DatePickerDialog;
import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.Calendar;

public class SayranXpress extends AppCompatActivity {
    EditText FromEditText;
    EditText ToEditText;
    Button btn_Submit;
    Spinner Service;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sayranxpress);
        FromEditText = (EditText) findViewById(R.id.From);
        ToEditText = (EditText) findViewById(R.id.To);
        btn_Submit=(Button)findViewById(R.id.btn_Submit);
       final Spinner spinner = (Spinner)findViewById(R.id.spinner1);
        final Spinner spinner2 = (Spinner)findViewById(R.id.spinner2);
        final Spinner spinner3 = (Spinner)findViewById(R.id.spinner3);
        final Spinner spinner4 = (Spinner)findViewById(R.id.spinner4);

        String[] Material = new String[]{
                "Select",
                "Auto Parts",
        "Bardana jute Or Plastic",
        "Building And Material",
        "Cement",
        "Chemicals",
        "Coal and Ash",
        "Cotton Seeds",
        "Electronics Consumer Durable",
        "Fertilizers",
        "Fruits and Vegetables",
        "Furniture and Wood Products",
        "HouseHolds and Goods",
        "Industrial Equipments",
        "Iron Sheets Or Bats Or Scraps",
        "Liquid In Drums",
        "Liquid/Oil",
        "Machinery New Or Old",
        "Medicals",
        "Metals",
        "Mil Jute Oil",
        "Others",
        "Packed Food",
        "Plastic Pipes Or Others Products Powder Bags ",
        "Printed Books Or Papers Rolls",
        "Refrigerated Goods",
        "Rice Or Wheal Or Agriculture Products",
        "Scraps",
        "Spices",
        "Textile",
        "Tyres Rubbers Products",
        "Vehicle Or Car",
        };
        String[] Weight_Type = new String[]{
                "Select",
          "Upto 1",
         "Upto 2",
         "Upto 3",
         "Upto 4",
         "Upto 5",
         "Upto 6",
         "Upto 7",
         "Upto 8",
         "Upto 9",
         "Upto 10",
        };
        String[] Vehicle_type = new String[]{
                "Select",
        "Container 7.5 Ton/6 Wheel",
        "Container Close Body 20 Feet",
        "Container Close Body 24 Feet",
        "Flat Bod Trailer",
        "Refrigerated / A.C Container",
        "Semi Low Bad Trailer",
        "Tata 407.24 Ton/4 Wheel",
        "Truck 9 Ton/6 Wheel",
        };

        String[] No_Of_Vehicle = new String[]{
                "Select",
        "1",
        "2",
        "3",
        "4",
        "5",
        "6",
        "7",
        "8",
        };


        ArrayAdapter<String> spinnerArrayAdapter = new ArrayAdapter<String>(
                this,R.layout.sayranxpress,Material
        );
        ArrayAdapter<String> spinnerArrayAdapter2 = new ArrayAdapter<String>(
                this,R.layout.sayranxpress,Weight_Type
        );
        ArrayAdapter<String> spinnerArrayAdapter3 = new ArrayAdapter<String>(
                this,R.layout.sayranxpress,Vehicle_type
        );
        ArrayAdapter<String> spinnerArrayAdapter4 = new ArrayAdapter<String>(
                this,R.layout.sayranxpress,No_Of_Vehicle
        );
        ArrayAdapter<CharSequence> serviceAdapter = ArrayAdapter.createFromResource(this,R.array.material_arrays, android.R.layout.simple_spinner_item);
        serviceAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerArrayAdapter.setDropDownViewResource(R.layout.sayranxpress);
        spinner.setAdapter(spinnerArrayAdapter);


        btn_Submit.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View view) {
                final String From = FromEditText.getText().toString();
                Service = (Spinner) findViewById(R.id.spinner1);
                if (From.length() == 0) {
                    FromEditText.requestFocus();
                    FromEditText.setError("Location Must Be Required");
                }
                {
                    final String To = ToEditText.getText().toString();
                    if (To.length() == 0) {
                        ToEditText.requestFocus();
                        ToEditText.setError("Location Must Be Required");
                    }
                }
                if(Service.getSelectedItem().toString().equals(" Select Your Service  "))
                {
                    Toast.makeText(getApplicationContext(), "Please Select  One Service",
                            Toast.LENGTH_LONG).show();
                    return;
                }
                else
                if(Service.getSelectedItem().toString().equals(" Select Your Service  "))
                {
                    Toast.makeText(getApplicationContext(), "Please Select  One Service",
                            Toast.LENGTH_LONG).show();
                    return;
                }
                else

                if(Service.getSelectedItem().toString().equals(" Select Your Service  "))
                {
                    Toast.makeText(getApplicationContext(), "Please Select  One Service",
                            Toast.LENGTH_LONG).show();
                    return;
                }
                else
                if(Service.getSelectedItem().toString().equals(" Select Your Service  "))
                {
                    Toast.makeText(getApplicationContext(), "Please Select  One Service",
                            Toast.LENGTH_LONG).show();
                    return;
                }
                Intent i = new Intent(SayranXpress.this, Login.class);
                startActivity(i);

            }

        });
    }
}