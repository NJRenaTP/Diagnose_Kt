package com.example.asp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class signIn extends AppCompatActivity {

    EditText nameSI, passwordSI, repasswordSI;
    Button confirmBtnSI, loginPageBtnSI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registrationpage);
        nameSI = (EditText) findViewById(R.id.usertxtSI);
        passwordSI = (EditText) findViewById(R.id.passtxtSI);
        repasswordSI = (EditText) findViewById(R.id.RePasstxtSI);
        confirmBtnSI = (Button) findViewById(R.id.confirmBtnSI);
        loginPageBtnSI = (Button) findViewById(R.id.loginPageBtnSI);

        //confirmBtnSI.setOnClickListener(new View.OnClickListener() {
        //     @Override
        //
        // });

        loginPageBtnSI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View args0) {
                backtologin();
            }
        });
    }
    public void backtologin() {
        Intent intent = new Intent(this, mainActivity.class);
        startActivity(intent);
    }
}