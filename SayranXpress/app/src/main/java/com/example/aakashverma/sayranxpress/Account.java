package com.example.aakashverma.sayranxpress;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import com.basgeekball.awesomevalidation.AwesomeValidation;
import com.basgeekball.awesomevalidation.ValidationStyle;



public class Account extends AppCompatActivity implements View.OnClickListener {

    //The view objects
    private EditText editTextFirst_Name,editTextLast_Name, editTextEmail, editTextMobile,
            editTextPassword, editTextCPassword,editTextAge;

    private Button buttonSignUP;
    String Cpassword;
    String Password;

    //defining AwesomeValidation object
    private AwesomeValidation awesomeValidation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.account);

        //initializing awesomevalidation object
        /*
        * The library provides 3 types of validation
        * BASIC
        * COLORATION
        * UNDERLABEL
        * */
        awesomeValidation = new AwesomeValidation(ValidationStyle.BASIC);

        //initializing view objects
        editTextFirst_Name = (EditText) findViewById(R.id.First_Name);
        editTextLast_Name = (EditText) findViewById(R.id.Last_Name);
        editTextEmail = (EditText) findViewById(R.id.Email_Address);
        editTextMobile = (EditText) findViewById(R.id.Mobile_No);
        editTextPassword = (EditText) findViewById(R.id.password);
        editTextCPassword=(EditText) findViewById(R.id.Confirm_pass);

        buttonSignUP = (Button) findViewById(R.id.btn_SignUP);


        //adding validation to edittexts
        awesomeValidation.addValidation(this, R.id.First_Name, "^[A-Za-z\\s]{1,}[\\.]{0,1}[A-Za-z\\s]{0,}$", R.string.first_name_error);
        awesomeValidation.addValidation(this, R.id.Last_Name, "^[A-Za-z\\s]{1,}[\\.]{0,1}[A-Za-z\\s]{0,}$", R.string.last_name_error);
        awesomeValidation.addValidation(this, R.id.Email_Address, Patterns.EMAIL_ADDRESS, R.string.email_error);
        awesomeValidation.addValidation(this, R.id.Mobile_No, "^[2-9]{2}[0-9]{8}$", R.string.mobile_error);
        Password=editTextPassword.getText().toString();
        Cpassword=editTextCPassword.getText().toString();
        if(Cpassword.length()==0||Cpassword.equals(Password))
        {editTextCPassword.requestFocus();
            editTextCPassword.setError("Password does not match");
            return;
        }

        buttonSignUP.setOnClickListener(this);
    }

    private void submitForm() {
        //first validate the form then move ahead
        //if this becomes true that means validation is successfull
        if (awesomeValidation.validate()) {
            Toast.makeText(this, "Validation Successfull", Toast.LENGTH_LONG).show();

            //process the data further
        }
    }

    @Override
    public void onClick(View view) {
        if (view == buttonSignUP) {
            submitForm();
        }
    }
}