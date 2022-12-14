package com.example.asp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class mainActivity extends AppCompatActivity {

    EditText name, password;
    Button LoginBtn, SignUpBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loginpage);
        name = (EditText) findViewById(R.id.usertxt);
        password = (EditText) findViewById(R.id.passtxt);
        SignUpBtn = (Button) findViewById(R.id.SignUpBtn);
        LoginBtn = (Button) findViewById(R.id.LoginBtn);

        LoginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View args0) {
                setContentView(R.layout.recommendation);
            }
        });


    }
}