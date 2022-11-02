package com.example.mpt7;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView one, two, three, four;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        four = findViewById(R.id.four);
    }

    @SuppressLint("NonConstantResourceId")
    public void List_activity(View view) {
        switch (view.getId()) {
            case R.id.one:
                Trans(1);
                break;
            case R.id.two:
                Trans(2);
                break;
            case R.id.three:
                Trans(3);
                break;
            case R.id.four:
                Trans(4);
                break;
        }
    }

    public void Trans(int a) {
        Intent intent = new Intent(MainActivity.this, ListViewing.class);
        intent.putExtra("a", a);
        startActivity(intent);
    }
}