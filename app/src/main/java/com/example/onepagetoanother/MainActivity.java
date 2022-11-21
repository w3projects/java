package com.example.onepagetoanother;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView Manzill = findViewById(R.id.tvManzill);

        Manzill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String data = Manzill.getText().toString();
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                intent.putExtra("dataname",data);
                startActivity(intent);
            }
        });

    }
}