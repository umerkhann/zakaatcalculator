package com.example.zakaatcalculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText cash, savings,loan, gold;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button calBtn;
        calBtn = findViewById(R.id.calBtn);
        TextView payableZakaatText = findViewById(R.id.payableZakaatText);

        calBtn.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        cash = (EditText) findViewById(R.id.cash);
                        savings = (EditText) findViewById(R.id.savings);
                        loan = (EditText) findViewById(R.id.loan);
                        gold = (EditText) findViewById(R.id.gold);
                        double totalAmount = Double.parseDouble(cash.getText().toString()) + Double.parseDouble(savings.getText().toString()) + Double.parseDouble(gold.getText().toString()) - Double.parseDouble(loan.getText().toString());
                        
                    }
                }
        );

    }
}