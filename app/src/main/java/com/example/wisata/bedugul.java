package com.example.wisata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;

public class bedugul extends AppCompatActivity {
    private Button buttonback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bedugul);

        buttonback = (Button)findViewById(R.id.buttonback);

        buttonback.setOnClickListener(v -> {
            Intent intent1 = new Intent(getApplicationContext(),MenuUtama.class);
            startActivity(intent1);
        });
    }

}