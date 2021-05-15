package com.example.psyche;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class SelectGoal extends AppCompatActivity {
    TableLayout tableLayout;
    TableLayout tableLayout2;
    TableLayout tableLayout3;
    TableLayout tableLayout4;
    TableLayout foo;
    Button continue_button;
    int selected_index=-1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_goal);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        tableLayout = findViewById(R.id.tableLayout);
        tableLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                change_color(v);
            }
        });
        tableLayout2 = findViewById(R.id.tableLayout2);
        tableLayout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                change_color(v);
            }
        });
        tableLayout3 = findViewById(R.id.tableLayout3);
        tableLayout3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                change_color(v);
            }
        });
        tableLayout4 = findViewById(R.id.tableLayout4);
        tableLayout4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                change_color(v);
            }
        });

        continue_button = findViewById(R.id.continue_button2);
        continue_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                next_screen();
            }
        });

    }

    public void change_color(View v){
        if(foo!=null) {
            TableRow row = (TableRow) foo.getChildAt(0);
            ((TextView) row.getChildAt(0)).setTextColor(Color.BLACK);
            ((TextView) row.getChildAt(1)).setTextColor(Color.BLACK);
        }
        selected_index = 1;
        TableLayout temp = (TableLayout) v;
        foo = temp;
        TableRow row = (TableRow)temp.getChildAt(0);
        ((TextView)row.getChildAt(0)).setTextColor(Color.parseColor("#FF4d4d"));
        ((TextView)row.getChildAt(1)).setTextColor(Color.parseColor("#FF4d4d"));
    }

    public void next_screen(){
        Intent intent = new Intent(this, Profile.class);
        startActivity(intent);
    }


}