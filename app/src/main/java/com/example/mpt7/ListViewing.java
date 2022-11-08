package com.example.mpt7;

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
    TextView model_1,model_2,model_3,model_4,model_5,model_6,model_7,model_8;
    ImageView cell_1,cell_2,cell_3,cell_4,cell_5,cell_6,cell_7,cell_8;
    List<ImageView> list_img = new ArrayList<>();
    List<TextView> list_text = new ArrayList<>();
    Dialog dialog;
    List<String> name = new ArrayList<>();
    String[] name_mas_one,name_mas_two;
    String mDrawableName;
    int resDrawableID;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
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

        name_mas_one = new String[]{null,"Volkswagen Corrado","Volkswagen Eos","Volkswagen Scirocco I",
        "Volkswagen Scirocco II","Volkswagen Arteon","Volkswagen Passat CC","Volkswagen Passat СС, I поколение, рестайлинг","Volkswagen Beetle"};
        name_mas_two = new String[]{null,"Volkswagen Passat B1","Volkswagen Passat B2","Volkswagen Passat B3","Volkswagen Passat B4",
        "Volkswagen Passat B5", "Volkswagen Passat B6","Volkswagen Passat B7"};

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

        for(int i = 1; i< list_text.size()-1; i++){
            list_text.get(i).setText(name_mas_one[i]);
        }
        for (int i = 1; i<= list_img.size()-1 ; i++){
            mDrawableName = "_1_"+i;
            resDrawableID = getResources().getIdentifier(mDrawableName, "drawable", getPackageName());
            list_img.get(i).setImageResource(resDrawableID);
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