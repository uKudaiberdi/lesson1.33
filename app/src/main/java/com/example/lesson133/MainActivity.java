package com.example.lesson133;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button btnStart;
    private EditText editText;
    public final static String INTENT_KEY = "intent.key";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        btnStart = findViewById(R.id.btn_start);
        editText = findViewById(R.id.edit);
        btnStart.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intentForNextActivity = new Intent(MainActivity.this, SecondActivity.class);
                intentForNextActivity.putExtra(INTENT_KEY, editText.getText().toString());
                startActivity(intentForNextActivity);
                finish();

            }
        });
    }
}