package com.example.mpt7;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView one, two, three, four, oApk;
    AlertDialog.Builder dialog;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        one = findViewById(R.id.one_img);
        two = findViewById(R.id.two_img);
        three = findViewById(R.id.three_img);
        four = findViewById(R.id.four_img);
        oApk = findViewById(R.id.background_oApk);
    }

    @SuppressLint("NonConstantResourceId")
    public void List_activity(View view) {
        switch (view.getId()) {
            case R.id.one_background:
                Trans(1);
                break;
            case R.id.two_background:
                Trans(2);
                break;
            case R.id.three_background:
                Trans(3);
                break;
            case R.id.four_background:
                Trans(4);
                break;
        }
    }

    public void oApk_OnClick(View view) {
        dialog = new AlertDialog.Builder(MainActivity.this);
        dialog.setTitle("О приложении");
        dialog.setMessage(R.string.oApk_string);
        dialog.setPositiveButton("Закрыть", (dialog, i) -> dialog.cancel());
        dialog.show();
    }

    public void Trans(int a) {
        Intent intent = new Intent(MainActivity.this, ListViewing.class);
        intent.putExtra("a", a);
        startActivity(intent);
    }
}