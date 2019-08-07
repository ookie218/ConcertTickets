package com.ookie.concerttickets;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    double ticketCost = 59.99;
    int numOfTickets;
    double totalCost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.mipmap.ic_launcher);
        getSupportActionBar().setDisplayUseLogoEnabled(true);

        final EditText numberbox = findViewById(R.id.number_box);
        Button calculate = findViewById(R.id.calculateBtn);
        final TextView showTotal = findViewById(R.id.total);

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //get number of tickets from edit text box
               numOfTickets = Integer.parseInt(numberbox.getText().toString());
               DecimalFormat hundreth = new DecimalFormat("##.##");
               totalCost = numOfTickets * ticketCost;
               showTotal.setText(hundreth.format(totalCost));
            }
        });

    }
}
