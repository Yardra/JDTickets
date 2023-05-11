package com.yardra.jdtickets;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText textID;
    EditText textPlaceFrom;
    EditText textTimeFrom;
    EditText textPlaceTo;
    EditText textTimeTo;
    EditText textCostTicket;


    String ID;
    String PlaceFrom;
    String TimeFrom;
    String PlaceTo;
    String TimeTo;
    String Cost;

    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textID = findViewById(R.id.editTextText);
        textPlaceFrom = findViewById(R.id.editTextText3);
        textTimeFrom = findViewById(R.id.editTextText4);
        textPlaceTo = findViewById(R.id.editTextText5);
        textTimeTo = findViewById(R.id.editTextText6);
        textCostTicket = findViewById(R.id.editTextText7);

        button = findViewById(R.id.button);



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ID = textID.getText().toString();
                PlaceFrom = textPlaceFrom.getText().toString();
                TimeFrom = textTimeFrom.getText().toString();
                PlaceTo = textPlaceTo.getText().toString();
                TimeTo = textTimeTo.getText().toString();
                Cost = textCostTicket.getText().toString();

                user User = new user(ID, PlaceFrom, TimeFrom, PlaceTo, TimeTo, Cost);

                Intent intent = new Intent(getApplicationContext(), TicketActivity.class);
                intent.putExtra("User", User);
                startActivity(intent);
            }
        });

    }
}