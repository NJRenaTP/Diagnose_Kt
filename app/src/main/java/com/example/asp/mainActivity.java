package com.example.asp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ImageView;

public class mainActivity extends AppCompatActivity {

    EditText name, password;
    Button LoginBtn, SignUpBtn;
    TextView forgotpass;
    ImageView logo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loginpage);
        logo = (ImageView) findViewById(R.id.logo);
        name = (EditText) findViewById(R.id.usertxt);
        password = (EditText) findViewById(R.id.passtxt);
        SignUpBtn = (Button) findViewById(R.id.SignUpBtn);
        LoginBtn = (Button) findViewById(R.id.LoginBtn);
        forgotpass = (TextView) findViewById(R.id.forgotpass);

        LoginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View args0) {
                openhomeScreen();

            }
        });

        SignUpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opensignIn();
            }
        });

        forgotpass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openfPassword();
            }
        });
    }

    public void opensignIn() {
        Intent intent = new Intent(this, signIn.class);
        startActivity(intent);
    }

    public void openhomeScreen() {
        Intent intent = new Intent(this, homeScreen.class);
        startActivity(intent);
    }

    public void openfPassword() {
        Intent intent = new Intent(this, fPassword.class);
        startActivity(intent);
    }
}