package com.example.mpt7;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ListViewing extends AppCompatActivity {
    TextView textView;
    ImageView cell_1,cell_2,cell_3,cell_4,cell_5,cell_6,cell_7,cell_8;
    List<ImageView> list = new ArrayList<>();
    Dialog dialog;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        textView = findViewById(R.id.textView1);
        cell_1 = findViewById(R.id.imageView1);
        cell_2 = findViewById(R.id.imageView2);
        cell_3 = findViewById(R.id.imageView3);
        cell_4 = findViewById(R.id.imageView4);
        cell_5 = findViewById(R.id.imageView5);
        cell_6 = findViewById(R.id.imageView6);
        cell_7 = findViewById(R.id.imageView7);
        cell_8 = findViewById(R.id.imageView8);

        list.add(cell_1);
        list.add(cell_1);
        list.add(cell_2);
        list.add(cell_3);
        list.add(cell_4);
        list.add(cell_5);
        list.add(cell_6);
        list.add(cell_7);
        list.add(cell_8);

        textView.setText(""+getIntent().getIntExtra("a",0));
        for (int i = 1; i<=list.size()-1 ;i++){
            list.get(i).setImageResource(R.drawable.passat_b3);
        }
    }

    public void setCell_1_OnClick(View view){
        dialog = new Dialog(ListViewing.this);
        dialog.setContentView(R.layout.info_viewing);
        ImageView imageView, imageView2, imageView3;
        imageView = dialog.findViewById(R.id._1);
        imageView2 = dialog.findViewById(R.id._2);
        imageView3 = dialog.findViewById(R.id._3);
        imageView.setImageResource(R.drawable.passat_b3);
        imageView2.setImageResource(R.drawable.passat_b3);
        imageView3.setImageResource(R.drawable.passat_b3);
        dialog.create();
        dialog.show();
    }
}