package com.example.asp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class fPassword extends AppCompatActivity{
    EditText nameFP, passwordFP, repasswordFP;
    Button confirmBtnFP, loginPageBtnFP;
    ImageView logoFP;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fpasswordpage);
        logoFP = (ImageView) findViewById(R.id.logoFP);
        nameFP = (EditText) findViewById(R.id.usertxtFP);
        passwordFP = (EditText) findViewById(R.id.passtxtFP);
        repasswordFP = (EditText) findViewById(R.id.RePasstxtFP);
        confirmBtnFP = (Button) findViewById(R.id.confirmBtnFP);
        loginPageBtnFP = (Button) findViewById(R.id.loginPageBtnFP);

        //confirmBtn.setOnClickListener(new View.OnClickListener() {
        //     @Override
        //
        // });

        loginPageBtnFP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View args0) {
                backtoLogin();
            }
        });

    }
    public void backtoLogin() {
        Intent intent = new Intent(this, mainActivity.class);
        startActivity(intent);
    }
}
