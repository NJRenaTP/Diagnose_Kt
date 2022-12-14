package com.example.asp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class profile extends AppCompatActivity{
    EditText namePP, passwordPP, repasswordPP;
    Button logoutBtnPP;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profilepage);
        namePP = (EditText) findViewById(R.id.usertxtPP);
        passwordPP = (EditText) findViewById(R.id.passtxtPP);
        repasswordPP = (EditText) findViewById(R.id.repasstxtPP);
        logoutBtnPP = (Button) findViewById(R.id.logoutBtnPP);
        BottomNavigationView bottomNavigationView=findViewById(R.id.bottomNavigationViewPP);

        // Set Home selected
        bottomNavigationView.setSelectedItemId(R.id.profile);

        // Perform item selected listener
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected( MenuItem item) {

                switch (item.getItemId()) {
                    case R.id.home:
                        startActivity(new Intent(getApplicationContext(), homeScreen.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.datahistory:
                        startActivity(new Intent(getApplicationContext(), datahistory.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.profile:
                        startActivity(new Intent(getApplicationContext(), profile.class));
                        overridePendingTransition(0, 0);
                        return true;
                }
                return false;
            }
        });

        //confirmBtn.setOnClickListener(new View.OnClickListener() {
        //     @Override
        //
        // });

        logoutBtnPP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View args0) {
                leaveapp();
            }
        });

    }
    public void leaveapp() {
        Intent intent = new Intent(this, mainActivity.class);
        startActivity(intent);
    }
}