package com.example.aakashverma.sayranxpress;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Login extends AppCompatActivity {
    EditText MobileEditText;
    EditText PassEditText;
    Button btn_Account;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        MobileEditText = (EditText) findViewById(R.id.Mobile_No);
        PassEditText = (EditText) findViewById(R.id.password);
        btn_Account=(Button)findViewById(R.id.btn_Account);

        btn_Account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String Mobile = MobileEditText.getText().toString();
                if (Mobile.length() == 0) {
                    MobileEditText.requestFocus();
                    MobileEditText.setError("Mobile No Must Be Required");
                }}

            {
                final String Pass = PassEditText.getText().toString();
                if (Pass.length() == 0) {
                    PassEditText.requestFocus();
                    PassEditText.setError("Password Must Be Filled");
                }

            }



        });

    }
}