package com.example.asp;

import static com.example.asp.R.id.textView5;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;


public class homeScreen extends AppCompatActivity {
    TextView test;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recommendation);

        BottomNavigationView bottomNavigationView=findViewById(R.id.bottomNavigationView);

        // Set Home selected
        bottomNavigationView.setSelectedItemId(R.id.home);

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
        test = findViewById(R.id.textView5);
        float test1 = Float.parseFloat(test.getText().toString());

//        t1 = TextView.findViewById(R.id.textView5);
//        TextView textView5 = (TextView)findViewById(R.id.textView5);
//        int y = Integer.getInteger(String.valueOf(textView5));

        if (test1 >= 3.5 && test1 <= 5.2) {
            TextView textView6 = (TextView)findViewById(R.id.textView6);
            textView6.setText("Your Potassium level is at the normal range.");
        }

        else if (test1 < 3.5) {
            TextView textView6 = (TextView)findViewById(R.id.textView6);
            textView6.setText("Your Potassium level is below the normal range (3.5 to 5.2 mEq/L). You are at risk of getting Hypokalemia." +
                    "\nDo you want to see a doctor to get more accurate result?" +
                    "\nAdvices: " +
                    "\n- Consume more food or drinks that are high in potassium" +
                    "\n- Exercise more regularly");
        }
        else if (test1 > 5.2) {
            TextView textView6 = (TextView)findViewById(R.id.textView6);
            textView6.setText("Your Potassium level is above the normal range (3.5 to 5.2 mEq/L). You are at risk of getting Hyperkalemia." +
                    "\nDo you want to see a doctor to get more accurate result?" +
                    "\nAdvices: " +
                    "\n- Consume more food and drinks that are high in potassium" +
                    "\n- Exercise more regularly");
        }
    }
}