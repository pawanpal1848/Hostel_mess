package com.itechbd.navigationdrawer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;


public class menu extends AppCompatActivity {

    private static final String TAG = "pawan";
    private TextView day1_head;
    private TextView day1_breakfast;
    private TextView day1_breakfast_menu;
    private TextView day1_lunch;
    private TextView day1_lunch_menu;
    private TextView day1_snacks;
    private TextView day1_snacks_menu;
    private TextView day1_dinner;
    private TextView day1_dinner_menu;

    private TextView day2_head;
    private TextView day2_breakfast;
    private TextView day2_breakfast_menu;
    private TextView day2_lunch;
    private TextView day2_lunch_menu;
    private TextView day2_snacks;
    private TextView day2_snacks_menu;
    private TextView day2_dinner;
    private TextView day2_dinner_menu;

    private TextView day3_head;
    private TextView day3_breakfast;
    private TextView day3_breakfast_menu;
    private TextView day3_lunch;
    private TextView day3_lunch_menu;
    private TextView day3_snacks;
    private TextView day3_snacks_menu;
    private TextView day3_dinner;
    private TextView day3_dinner_menu;

    private TextView day4_head;
    private TextView day4_breakfast;
    private TextView day4_breakfast_menu;
    private TextView day4_lunch;
    private TextView day4_lunch_menu;
    private TextView day4_snacks;
    private TextView day4_snacks_menu;
    private TextView day4_dinner;
    private TextView day4_dinner_menu;

    private TextView day5_head;
    private TextView day5_breakfast;
    private TextView day5_breakfast_menu;
    private TextView day5_lunch;
    private TextView day5_lunch_menu;
    private TextView day5_snacks;
    private TextView day5_snacks_menu;
    private TextView day5_dinner;
    private TextView day5_dinner_menu;

    private TextView day6_head;
    private TextView day6_breakfast;
    private TextView day6_breakfast_menu;
    private TextView day6_lunch;
    private TextView day6_lunch_menu;
    private TextView day6_snacks;
    private TextView day6_snacks_menu;
    private TextView day6_dinner;
    private TextView day6_dinner_menu;

    private TextView day7_head;
    private TextView day7_breakfast;
    private TextView day7_breakfast_menu;
    private TextView day7_lunch;
    private TextView day7_lunch_menu;
    private TextView day7_snacks;
    private TextView day7_snacks_menu;
    private TextView day7_dinner;
    private TextView day7_dinner_menu;

    private TextView daily_head;
    private TextView daily_breakfast;
    private TextView daily_breakfast_menu;
    private TextView daily_lunch;
    private TextView daily_lunch_menu;
    private TextView daily_snacks;
   private TextView daily_snackmenu;
    private TextView daily_dinner;
    private TextView daily_dinner_menu;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        day1_head = (TextView) findViewById(R.id.day1_head);
        day1_breakfast = (TextView) findViewById(R.id.day_1_breakfast);
        day1_breakfast_menu = (TextView) findViewById(R.id.day_1_breakfast_menu);
        day1_lunch = (TextView) findViewById(R.id.day_1_lunch);
        day1_lunch_menu = (TextView) findViewById(R.id.day_1_lunch_menu);
        day1_snacks = (TextView) findViewById(R.id.day_1_snacks);
        day1_snacks_menu = (TextView) findViewById(R.id.day_1_snacks_menu);
        day1_dinner = (TextView) findViewById(R.id.day_1_dinner);
        day1_dinner_menu = (TextView) findViewById(R.id.day_1_dinner_menu);
        DatabaseReference day1Ref = database.getReference("day1");

        day2_head = (TextView) findViewById(R.id.day2_head);
        day2_breakfast = (TextView) findViewById(R.id.day_2_breakfast);
        day2_breakfast_menu = (TextView) findViewById(R.id.day_2_breakfast_menu);
        day2_lunch = (TextView) findViewById(R.id.day_2_lunch);
        day2_lunch_menu = (TextView) findViewById(R.id.day_2_lunch_menu);
        day2_snacks = (TextView) findViewById(R.id.day_2_snacks);
        day2_snacks_menu = (TextView) findViewById(R.id.day_2_snacks_menu);
        day2_dinner = (TextView) findViewById(R.id.day_2_dinner);
        day2_dinner_menu = (TextView) findViewById(R.id.day_2_dinner_menu);
        DatabaseReference day2Ref = database.getReference("day2");

        day3_head = (TextView) findViewById(R.id.day3_head);
        day3_breakfast = (TextView) findViewById(R.id.day_3_breakfast);
        day3_breakfast_menu = (TextView) findViewById(R.id.day_3_breakfast_menu);
        day3_lunch = (TextView) findViewById(R.id.day_3_lunch);
        day3_lunch_menu = (TextView) findViewById(R.id.day_3_lunch_menu);
        day3_snacks = (TextView) findViewById(R.id.day_3_snacks);
        day3_snacks_menu = (TextView) findViewById(R.id.day_3_snacks_menu);
        day3_dinner = (TextView) findViewById(R.id.day_3_dinner);
        day3_dinner_menu = (TextView) findViewById(R.id.day_3_dinner_menu);
        DatabaseReference day3Ref = database.getReference("day3");

        day4_head = (TextView) findViewById(R.id.day4_head);
        day4_breakfast = (TextView) findViewById(R.id.day_4_breakfast);
        day4_breakfast_menu = (TextView) findViewById(R.id.day_4_breakfast_menu);
        day4_lunch = (TextView) findViewById(R.id.day_4_lunch);
        day4_lunch_menu = (TextView) findViewById(R.id.day_4_lunch_menu);
        day4_snacks = (TextView) findViewById(R.id.day_4_snacks);
        day4_snacks_menu = (TextView) findViewById(R.id.day_4_snacks_menu);
        day4_dinner = (TextView) findViewById(R.id.day_4_dinner);
        day4_dinner_menu = (TextView) findViewById(R.id.day_4_dinner_menu);
        DatabaseReference day4Ref = database.getReference("day4");

        day5_head = (TextView) findViewById(R.id.day5_head);
        day5_breakfast = (TextView) findViewById(R.id.day_5_breakfast);
        day5_breakfast_menu = (TextView) findViewById(R.id.day_5_breakfast_menu);
        day5_lunch = (TextView) findViewById(R.id.day_5_lunch);
        day5_lunch_menu = (TextView) findViewById(R.id.day_5_lunch_menu);
        day5_snacks = (TextView) findViewById(R.id.day_5_snacks);
        day5_snacks_menu = (TextView) findViewById(R.id.day_5_snacks_menu);
        day5_dinner = (TextView) findViewById(R.id.day_5_dinner);
        day5_dinner_menu = (TextView) findViewById(R.id.day_5_dinner_menu);
        DatabaseReference day5Ref = database.getReference("day5");

        day6_head = (TextView) findViewById(R.id.day6_head);
        day6_breakfast = (TextView) findViewById(R.id.day_6_breakfast);
        day6_breakfast_menu = (TextView) findViewById(R.id.day_6_breakfast_menu);
        day6_lunch = (TextView) findViewById(R.id.day_6_lunch);
        day6_lunch_menu = (TextView) findViewById(R.id.day_6_lunch_menu);
        day6_snacks = (TextView) findViewById(R.id.day_6_snacks);
        day6_snacks_menu = (TextView) findViewById(R.id.day_6_snacks_menu);
        day6_dinner = (TextView) findViewById(R.id.day_6_dinner);
        day6_dinner_menu = (TextView) findViewById(R.id.day_6_dinner_menu);
        DatabaseReference day6Ref = database.getReference("day6");

        day7_head = (TextView) findViewById(R.id.day7_head);
        day7_breakfast = (TextView) findViewById(R.id.day_7_breakfast);
        day7_breakfast_menu = (TextView) findViewById(R.id.day_7_breakfast_menu);
        day7_lunch = (TextView) findViewById(R.id.day_7_lunch);
        day7_lunch_menu = (TextView) findViewById(R.id.day_7_lunch_menu);
        day7_snacks = (TextView) findViewById(R.id.day_7_snacks);
        day7_snacks_menu = (TextView) findViewById(R.id.day_7_snacks_menu);
        day7_dinner = (TextView) findViewById(R.id.day_7_dinner);
        day7_dinner_menu = (TextView) findViewById(R.id.day_7_dinner_menu);
        DatabaseReference day7Ref = database.getReference("day7");

        daily_head = (TextView) findViewById(R.id.daily_head);
        daily_breakfast = (TextView) findViewById(R.id.daily_breakfast);
        daily_breakfast_menu = (TextView) findViewById(R.id.daily_breakfast_menu);
        daily_lunch = (TextView) findViewById(R.id.daily_lunch);
        daily_lunch_menu = (TextView) findViewById(R.id.daily_lunch_menu);
        daily_snacks = (TextView) findViewById(R.id.daily_snacks);
        daily_snackmenu = (TextView) findViewById(R.id.daily_snacks_menu);
        daily_dinner = (TextView) findViewById(R.id.daily_dinner);
        daily_dinner_menu = (TextView) findViewById(R.id.daily_dinner_menu);
        DatabaseReference daily = database.getReference("daily");
        // Read from the database
        day1Ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                String Monday = dataSnapshot.child("Monday").getValue(String.class);
                day1_head.setText(Monday);
                String Monday_bf_head = dataSnapshot.child("Breakfast_head").getValue(String.class);
                day1_breakfast.setText(Monday_bf_head);
                String Monday_lunch_head = dataSnapshot.child("Lunch_head").getValue(String.class);
                day1_lunch.setText(Monday_lunch_head);
                String Monday_bf = dataSnapshot.child("Breakfast").getValue(String.class);
                day1_breakfast_menu.setText(Monday_bf);
                String Monday_lunch = dataSnapshot.child("Lunch").getValue(String.class);
                day1_lunch_menu.setText(Monday_lunch);
                String Monday_snacks_head = dataSnapshot.child("Snacks_head").getValue(String.class);
                day1_snacks.setText(Monday_snacks_head);
                String Monday_snacks = dataSnapshot.child("Snacks").getValue(String.class);
                day1_snacks_menu.setText(Monday_snacks);
                String Monday_dinner_head = dataSnapshot.child("Dinner_head").getValue(String.class);
                day1_dinner.setText(Monday_dinner_head);
                String Monday_dinner = dataSnapshot.child("Dinner").getValue(String.class);
                day1_dinner_menu.setText(Monday_dinner);

            }

            @Override
            public void onCancelled(DatabaseError error) {
                // Failed to read value
                Log.w(TAG, "Failed to read value.", error.toException());
            }
        });


        // Read from the database
        day2Ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                String Tuesday= dataSnapshot.child("Tuesday").getValue(String.class);
                day2_head.setText(Tuesday);
                String Tuesday_bf_head = dataSnapshot.child("Breakfast_head").getValue(String.class);
                day2_breakfast.setText(Tuesday_bf_head);
                String Tuesday_lunch_head = dataSnapshot.child("Lunch_head").getValue(String.class);
                day2_lunch.setText(Tuesday_lunch_head);
                String Tuesday_bf = dataSnapshot.child("Breakfast").getValue(String.class);
                day2_breakfast_menu.setText(Tuesday_bf);
                String Tuesday_lunch = dataSnapshot.child("Lunch").getValue(String.class);
                day2_lunch_menu.setText(Tuesday_lunch);
                String Tuesday_snacks_head = dataSnapshot.child("Snacks_head").getValue(String.class);
                day2_snacks.setText(Tuesday_snacks_head);
                String Tuesday_snacks = dataSnapshot.child("Snacks").getValue(String.class);
                day2_snacks_menu.setText(Tuesday_snacks);
                String Tuesday_dinner_head = dataSnapshot.child("Dinner_head").getValue(String.class);
                day2_dinner.setText(Tuesday_dinner_head);
                String Tuesday_dinner = dataSnapshot.child("Dinner").getValue(String.class);
                day2_dinner_menu.setText(Tuesday_dinner);

            }

            @Override
            public void onCancelled(DatabaseError error) {
                // Failed to read value
                Log.w(TAG, "Failed to read value.", error.toException());
            }
        });

        // Read from the database
        day3Ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                String Wednesday= dataSnapshot.child("Wednesday").getValue(String.class);
                day3_head.setText(Wednesday);
                String Wednesday_bf_head = dataSnapshot.child("Breakfast_head").getValue(String.class);
                day3_breakfast.setText(Wednesday_bf_head);
                String Wednesday_lunch_head = dataSnapshot.child("Lunch_head").getValue(String.class);
                day3_lunch.setText(Wednesday_lunch_head);
                String Wednesday_bf = dataSnapshot.child("Breakfast").getValue(String.class);
                day3_breakfast_menu.setText(Wednesday_bf);
                String Wednesday_lunch = dataSnapshot.child("Lunch").getValue(String.class);
                day3_lunch_menu.setText(Wednesday_lunch);
                String Wednesday_snacks_head = dataSnapshot.child("Snacks_head").getValue(String.class);
                day3_snacks.setText(Wednesday_snacks_head);
                String Wednesday_snacks = dataSnapshot.child("Snacks").getValue(String.class);
                day3_snacks_menu.setText(Wednesday_snacks);
                String Wednesday_dinner_head = dataSnapshot.child("Dinner_head").getValue(String.class);
                day3_dinner.setText(Wednesday_dinner_head);
                String Wednesday_dinner = dataSnapshot.child("Dinner").getValue(String.class);
                day3_dinner_menu.setText(Wednesday_dinner);

            }

            @Override
            public void onCancelled(DatabaseError error) {
                // Failed to read value
                Log.w(TAG, "Failed to read value.", error.toException());
            }
        });
        // Read from the database
        day4Ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                String Thursday= dataSnapshot.child("Thursday").getValue(String.class);
                day4_head.setText(Thursday);
                String Thursday_bf_head = dataSnapshot.child("Breakfast_head").getValue(String.class);
                day4_breakfast.setText(Thursday_bf_head);
                String Thursday_lunch_head = dataSnapshot.child("Lunch_head").getValue(String.class);
                day4_lunch.setText(Thursday_lunch_head);
                String Thursday_bf = dataSnapshot.child("Breakfast").getValue(String.class);
                day4_breakfast_menu.setText(Thursday_bf);
                String Thursday_lunch = dataSnapshot.child("Lunch").getValue(String.class);
                day4_lunch_menu.setText(Thursday_lunch);
                String Thursday_snacks_head = dataSnapshot.child("Snacks_head").getValue(String.class);
                day4_snacks.setText(Thursday_snacks_head);
                String Thursday_snacks = dataSnapshot.child("Snacks").getValue(String.class);
                day4_snacks_menu.setText(Thursday_snacks);
                String Thursday_dinner_head = dataSnapshot.child("Dinner_head").getValue(String.class);
                day4_dinner.setText(Thursday_dinner_head);
                String Thursday_dinner = dataSnapshot.child("Dinner").getValue(String.class);
                day4_dinner_menu.setText(Thursday_dinner);

            }

            @Override
            public void onCancelled(DatabaseError error) {
                // Failed to read value
                Log.w(TAG, "Failed to read value.", error.toException());
            }
        });
        // Read from the database
        day5Ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                String Friday= dataSnapshot.child("Friday").getValue(String.class);
                day5_head.setText(Friday);
                String Friday_bf_head = dataSnapshot.child("Breakfast_head").getValue(String.class);
                day5_breakfast.setText(Friday_bf_head);
                String Friday_lunch_head = dataSnapshot.child("Lunch_head").getValue(String.class);
                day5_lunch.setText(Friday_lunch_head);
                String Friday_bf = dataSnapshot.child("Breakfast").getValue(String.class);
                day5_breakfast_menu.setText(Friday_bf);
                String Friday_lunch = dataSnapshot.child("Lunch").getValue(String.class);
                day5_lunch_menu.setText(Friday_lunch);
                String Friday_snacks_head = dataSnapshot.child("Snacks_head").getValue(String.class);
                day5_snacks.setText(Friday_snacks_head);
                String Friday_snacks = dataSnapshot.child("Snacks").getValue(String.class);
                day5_snacks_menu.setText(Friday_snacks);
                String Friday_dinner_head = dataSnapshot.child("Dinner_head").getValue(String.class);
                day5_dinner.setText(Friday_dinner_head);
                String Friday_dinner = dataSnapshot.child("Dinner").getValue(String.class);
                day5_dinner_menu.setText(Friday_dinner);

            }

            @Override
            public void onCancelled(DatabaseError error) {
                // Failed to read value
                Log.w(TAG, "Failed to read value.", error.toException());
            }
        });

        // Read from the database
        day6Ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                String Saturday= dataSnapshot.child("Saturday").getValue(String.class);
                day6_head.setText(Saturday);
                String Saturday_bf_head = dataSnapshot.child("Breakfast_head").getValue(String.class);
                day6_breakfast.setText(Saturday_bf_head);
                String Saturday_lunch_head = dataSnapshot.child("Lunch_head").getValue(String.class);
                day6_lunch.setText(Saturday_lunch_head);
                String Saturday_bf = dataSnapshot.child("Breakfast").getValue(String.class);
                day6_breakfast_menu.setText(Saturday_bf);
                String Saturday_lunch = dataSnapshot.child("Lunch").getValue(String.class);
                day6_lunch_menu.setText(Saturday_lunch);
                String Saturday_snacks_head = dataSnapshot.child("Snacks_head").getValue(String.class);
                day6_snacks.setText(Saturday_snacks_head);
                String Saturday_snacks = dataSnapshot.child("Snacks").getValue(String.class);
                day6_snacks_menu.setText(Saturday_snacks);
                String Saturday_dinner_head = dataSnapshot.child("Dinner_head").getValue(String.class);
                day6_dinner.setText(Saturday_dinner_head);
                String Saturday_dinner = dataSnapshot.child("Dinner").getValue(String.class);
                day6_dinner_menu.setText(Saturday_dinner);

            }

            @Override
            public void onCancelled(DatabaseError error) {
                // Failed to read value
                Log.w(TAG, "Failed to read value.", error.toException());
            }
        });

        // Read from the database
        day7Ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                String Sunday= dataSnapshot.child("Sunday").getValue(String.class);
                day7_head.setText(Sunday);
                String Sunday_bf_head = dataSnapshot.child("Breakfast_head").getValue(String.class);
                day7_breakfast.setText(Sunday_bf_head);
                String Sunday_lunch_head = dataSnapshot.child("Lunch_head").getValue(String.class);
                day7_lunch.setText(Sunday_lunch_head);
                String Sunday_bf = dataSnapshot.child("Breakfast").getValue(String.class);
                day7_breakfast_menu.setText(Sunday_bf);
                String Sunday_lunch = dataSnapshot.child("Lunch").getValue(String.class);
                day7_lunch_menu.setText(Sunday_lunch);
                String Sunday_snacks_head = dataSnapshot.child("Snacks_head").getValue(String.class);
                day7_snacks.setText(Sunday_snacks_head);
                String Sunday_snacks = dataSnapshot.child("Snacks").getValue(String.class);
                day7_snacks_menu.setText(Sunday_snacks);
                String Sunday_dinner_head = dataSnapshot.child("Dinner_head").getValue(String.class);
                day7_dinner.setText(Sunday_dinner_head);
                String Sunday_dinner = dataSnapshot.child("Dinner").getValue(String.class);
                day7_dinner_menu.setText(Sunday_dinner);

            }

            @Override
            public void onCancelled(DatabaseError error) {
                // Failed to read value
                Log.w(TAG, "Failed to read value.", error.toException());
            }
        });

        // Read from the database
        daily.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                String Daily= dataSnapshot.child("daily").getValue(String.class);
                daily_head.setText(Daily);
                String Daily_bf_head = dataSnapshot.child("Breakfast_head").getValue(String.class);
                daily_breakfast.setText(Daily_bf_head);
                String Daily_lunch_head = dataSnapshot.child("Lunch_head").getValue(String.class);
                daily_lunch.setText(Daily_lunch_head);
                String Daily_bf = dataSnapshot.child("Breakfast").getValue(String.class);
                daily_breakfast_menu.setText(Daily_bf);
                String Daily_lunch = dataSnapshot.child("Lunch").getValue(String.class);
                daily_lunch_menu.setText(Daily_lunch);
                String Daily_snacks_head = dataSnapshot.child("Snacks_head").getValue(String.class);
                daily_snacks.setText(Daily_snacks_head);
                String Daily_snacks = dataSnapshot.child("Snacks").getValue(String.class);
                daily_snackmenu.setText(Daily_snacks);
                String Daily_dinner_head = dataSnapshot.child("Dinner_head").getValue(String.class);
                daily_dinner.setText(Daily_dinner_head);
                String Daily_dinner = dataSnapshot.child("Dinner").getValue(String.class);
                daily_dinner_menu.setText(Daily_dinner);

            }

            @Override
            public void onCancelled(DatabaseError error) {
                // Failed to read value
                Log.w(TAG, "Failed to read value.", error.toException());
            }
        });

    }
}



