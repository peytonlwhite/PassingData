package com.peytonwhite.passingdata;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.jar.Attributes;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);






        findViewById(R.id.buttongetname).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), NameActivity.class);
               // startActivity(intent);

                startActivityForResult(intent,42);

            }
        });




    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if(requestCode == 42) {


            String firstName = data.getStringExtra("firstname_key");
            String lastName = data.getStringExtra("lastname_key");

            TextView tv = findViewById(R.id.textViewHello);
            tv.setText("Hello, " + firstName + " " + lastName);
        }
        else
        {
            super.onActivityResult(requestCode, resultCode, data);


        }
    }
}
