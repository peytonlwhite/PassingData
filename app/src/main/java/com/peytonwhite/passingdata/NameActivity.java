package com.peytonwhite.passingdata;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class NameActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name);







    }


    @Override
    public void onBackPressed() {

        EditText et = findViewById(R.id.editTextEnterFirstName);
        EditText etl = findViewById(R.id.editTextEnterLastName);

        String fName = et.getText().toString();
        String lName = etl.getText().toString();

        Intent intent = new Intent();


        intent.putExtra("firstname_key",fName);
        intent.putExtra("lastname_key",lName);

        setResult(RESULT_OK,intent);

        super.onBackPressed();
    }
}
