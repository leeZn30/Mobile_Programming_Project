package com.example.myproject;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ScrollView;

import androidx.appcompat.app.AppCompatActivity;

import java.io.ByteArrayOutputStream;

public class MainActivity extends AppCompatActivity {

    Button purchasebtn;
    Button cartbtn;
    CheckBox first_check;
    CheckBox second_check;
    CheckBox third_check;
    CheckBox fourth_check;
    CheckBox fifth_check;
    CheckBox sixth_check;
    ScrollView scroll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("우리 책방 서점");
        scroll = findViewById(R.id.scroll);
        scroll.fullScroll(ScrollView.FOCUS_DOWN);

        purchasebtn = (Button) findViewById(R.id.main_purchasebtn);
        cartbtn = (Button) findViewById(R.id.main_cartbtn);
        first_check = (CheckBox) findViewById(R.id.first_check);
        second_check = (CheckBox) findViewById(R.id.second_check);
        third_check = (CheckBox) findViewById(R.id.third_check);
        fourth_check = (CheckBox) findViewById(R.id.fourth_check);
        fifth_check = (CheckBox) findViewById(R.id.fifth_check);
        sixth_check = (CheckBox) findViewById(R.id.sixth_check);

        // Cart button
        cartbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!(!first_check.isChecked() && !second_check.isChecked() && !third_check.isChecked() &&
                 !fourth_check.isChecked() && !fifth_check.isChecked() && !sixth_check.isChecked())){
                    Intent intent = new Intent(getApplicationContext(), CartActivity.class);

                    if (first_check.isChecked()){
                        intent.putExtra("first_name", "작은 아씨들    12000원");
                        Bitmap sendBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.little);
                        ByteArrayOutputStream stream = new ByteArrayOutputStream();
                        sendBitmap.compress(Bitmap.CompressFormat.JPEG, 100, stream);
                        byte[] byteArray = stream.toByteArray();
                        intent.putExtra("first_img",byteArray);
                    }

                    if (second_check.isChecked()){
                        intent.putExtra("second_name", "동물농장    15000원");
                        Bitmap sendBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.animal);
                        ByteArrayOutputStream stream = new ByteArrayOutputStream();
                        sendBitmap.compress(Bitmap.CompressFormat.JPEG, 100, stream);
                        byte[] byteArray = stream.toByteArray();
                        intent.putExtra("second_img",byteArray);
                    }

                    if (third_check.isChecked()){
                        intent.putExtra("third_name", "데미안    9800원");
                        Bitmap sendBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.demian);
                        ByteArrayOutputStream stream = new ByteArrayOutputStream();
                        sendBitmap.compress(Bitmap.CompressFormat.JPEG, 100, stream);
                        byte[] byteArray = stream.toByteArray();
                        intent.putExtra("third_img",byteArray);
                    }
                    if (fourth_check.isChecked()){
                        intent.putExtra("fourth_name", "프랑켄슈타인    13500원");
                        Bitmap sendBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.franken);
                        ByteArrayOutputStream stream = new ByteArrayOutputStream();
                        sendBitmap.compress(Bitmap.CompressFormat.JPEG, 100, stream);
                        byte[] byteArray = stream.toByteArray();
                        intent.putExtra("fourth_img",byteArray);
                    }
                    if (fifth_check.isChecked()){
                        intent.putExtra("fifth_name", "위대한 개츠비    11000원");
                        Bitmap sendBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.great);
                        ByteArrayOutputStream stream = new ByteArrayOutputStream();
                        sendBitmap.compress(Bitmap.CompressFormat.JPEG, 100, stream);
                        byte[] byteArray = stream.toByteArray();
                        intent.putExtra("fifth_img",byteArray);
                    }
                    if (sixth_check.isChecked()){
                        intent.putExtra("sixth_name", "레 미제라블    14700원");
                        Bitmap sendBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.les);
                        ByteArrayOutputStream stream = new ByteArrayOutputStream();
                        sendBitmap.compress(Bitmap.CompressFormat.JPEG, 100, stream);
                        byte[] byteArray = stream.toByteArray();
                        intent.putExtra("sixth_img",byteArray);
                    }
                    startActivity(intent);
                }
                }
        });

        purchasebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!(!first_check.isChecked() && !second_check.isChecked() && !third_check.isChecked() &&
                        !fourth_check.isChecked() && !fifth_check.isChecked() && !sixth_check.isChecked())){
                    Intent intent = new Intent(getApplicationContext(), PurchaseActivity.class);
                    if (first_check.isChecked()){
                        intent.putExtra("first_product", "작은 아씨들");
                        intent.putExtra("first_price", 12000);
                    }

                    if (second_check.isChecked()){
                        intent.putExtra("second_product", "동물농장");
                        intent.putExtra("second_price", 15000);
                    }

                    if (third_check.isChecked()){
                        intent.putExtra("third_product", "데미안");
                        intent.putExtra("third_price", 9800);
                    }
                    if (fourth_check.isChecked()){
                        intent.putExtra("fourth_product", "프랑켄슈타인");
                        intent.putExtra("fourth_price", 13500);
                    }
                    if (fifth_check.isChecked()){
                        intent.putExtra("fifth_product", "위대한 개츠비");
                        intent.putExtra("fifth_price", 11000);
                    }
                    if (sixth_check.isChecked()){
                        intent.putExtra("sixth_product", "레 미제라블");
                        intent.putExtra("sixth_price", 14700);
                    }
                    startActivity(intent);
                }
            }
        });
    }

}