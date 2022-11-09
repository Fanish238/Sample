package com.example.mpt7;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class ListViewing extends AppCompatActivity {
    TextView model_1, model_2, model_3, model_4, model_5, model_6, model_7, model_8;
    ImageView cell_1, cell_2, cell_3, cell_4, cell_5, cell_6, cell_7, cell_8;
    List<ImageView> list_img = new ArrayList<>();
    List<TextView> list_text = new ArrayList<>();
    Dialog dialog;
    String[] name_mas_one, name_mas_two;
    String mDrawableName, mStringName, mName;
    int resDrawableID, resStringID, resDrawableID2;
    int id;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        setTitle(R.string.app_name);
        model_1 = findViewById(R.id.textView1);
        model_2 = findViewById(R.id.textView2);
        model_3 = findViewById(R.id.textView3);
        model_4 = findViewById(R.id.textView4);
        model_5 = findViewById(R.id.textView5);
        model_6 = findViewById(R.id.textView6);
        model_7 = findViewById(R.id.textView7);
        model_8 = findViewById(R.id.textView8);

        cell_1 = findViewById(R.id.imageView1);
        cell_2 = findViewById(R.id.imageView2);
        cell_3 = findViewById(R.id.imageView3);
        cell_4 = findViewById(R.id.imageView4);
        cell_5 = findViewById(R.id.imageView5);
        cell_6 = findViewById(R.id.imageView6);
        cell_7 = findViewById(R.id.imageView7);
        cell_8 = findViewById(R.id.imageView8);

        id = getIntent().getIntExtra("id", 0);

        name_mas_one = new String[]{null, "Volkswagen Corrado", "Volkswagen Eos", "Volkswagen Scirocco I",
                "Volkswagen Scirocco II", "Volkswagen Arteon", "Volkswagen Passat CC", "Volkswagen Passat СС, I поколение, рестайлинг", "Volkswagen Beetle"};
        name_mas_two = new String[]{null, "Volkswagen Passat B1", "Volkswagen Passat B2", "Volkswagen Passat B3", "Volkswagen Passat B4",
                "Volkswagen Passat B5", "Volkswagen Passat B6", "Volkswagen Passat B7", "Volkswagen Passat B8"};

        list_img.add(cell_1);
        list_img.add(cell_1);
        list_img.add(cell_2);
        list_img.add(cell_3);
        list_img.add(cell_4);
        list_img.add(cell_5);
        list_img.add(cell_6);
        list_img.add(cell_7);
        list_img.add(cell_8);

        list_text.add(model_1);
        list_text.add(model_1);
        list_text.add(model_2);
        list_text.add(model_3);
        list_text.add(model_4);
        list_text.add(model_5);
        list_text.add(model_6);
        list_text.add(model_7);
        list_text.add(model_8);

        FillingInInformation(id);

    }

    @SuppressLint("NonConstantResourceId")
    public void setOnClick(View view) {
        switch (view.getId()) {
            case R.id.cell_1:
                mName = "_" + id + "_" + 1;
                break;
            case R.id.cell_2:
                mName = "_" + id + "_" + 2;
                break;
            case R.id.cell_3:
                mName = "_" + id + "_" + 3;
                break;
            case R.id.cell_4:
                mName = "_" + id + "_" + 4;
                break;
            case R.id.cell_5:
                mName = "_" + id + "_" + 5;
                break;
            case R.id.cell_6:
                mName = "_" + id + "_" + 6;
                break;
            case R.id.cell_7:
                mName = "_" + id + "_" + 7;
                break;
            case R.id.cell_8:
                mName = "_" + id + "_" + 8;
                break;
            default:
                mName = "_" + id + "_" + 1;
                Toast.makeText(ListViewing.this, "Error", Toast.LENGTH_SHORT).show();
                break;
        }
        dialog = new Dialog(ListViewing.this);
        dialog.setContentView(R.layout.info_viewing);
        ImageView imageView, imageView2, imageView3;
        TextView textView = dialog.findViewById(R.id.textView);
        imageView = dialog.findViewById(R.id._1);
        imageView2 = dialog.findViewById(R.id._2);
        imageView3 = dialog.findViewById(R.id._3);
        resStringID = getResources().getIdentifier(mName, "string", getPackageName());
        resDrawableID2 = getResources().getIdentifier(mName, "drawable", getPackageName());
        textView.setText(resStringID);
        imageView.setImageResource(resDrawableID2);
        imageView2.setImageResource(resDrawableID2);
        imageView3.setImageResource(resDrawableID2);
        dialog.create();
        dialog.show();
    }

    public void FillingInInformation(int id) {
        String[] name_mas = new String[0];
        switch (id) {
            case 1:
                name_mas = name_mas_one.clone();
                break;
            case 2:
                name_mas = name_mas_two.clone();
                break;
            default:
                Toast.makeText(ListViewing.this, "Error", Toast.LENGTH_SHORT).show();
                break;
        }
        for (int i = 1; i < list_text.size(); i++) {
            list_text.get(i).setText(name_mas[i]);
        }
        for (int i = 1; i < list_img.size(); i++) {
            mDrawableName = "_" + id + "_" + i;
            resDrawableID = getResources().getIdentifier(mDrawableName, "drawable", getPackageName());
            list_img.get(i).setImageResource(resDrawableID);
        }
    }
}