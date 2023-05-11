package com.yardra.jdtickets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class TicketActivity extends AppCompatActivity {

    private user user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ticket);

        TextView PlaceFrom = findViewById(R.id.placeFrom);
        TextView PlaceTo = findViewById(R.id.placeTo);
        TextView TimeFrom = findViewById(R.id.timeFrom);
        TextView TimeTo = findViewById(R.id.timeTo);
        TextView ID = findViewById(R.id.Id);
        TextView Cost = findViewById(R.id.textView11);



        Bundle bundle = getIntent().getExtras();
        if (bundle != null){
            user = (user) bundle.get("User");

            PlaceFrom.setText(user.getPlaceFrom());
            PlaceTo.setText(user.getPlaceTo());
            TimeFrom.setText(user.getTimeFrom());
            TimeTo.setText(user.getTimeTo());
            ID.setText(user.getID());
            Cost.setText(user.getCost());

        }
    }
}