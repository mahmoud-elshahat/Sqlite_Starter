package com.example.mahmoudahmed.sqlite_starter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Add extends AppCompatActivity {
    EditText name;
    EditText price;
    Button add;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);


        name= (EditText) findViewById(R.id.name);
        price= (EditText) findViewById(R.id.price);
        add= (Button) findViewById(R.id.addButton);


        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
