package com.example.myproject;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;

import androidx.appcompat.app.AppCompatActivity;

public class CartActivity extends AppCompatActivity {

    Button c_purchasebtn;
    Button c_home;
    ScrollView scroll;
    boolean first = false;
    boolean second = false;
    boolean third = false;
    boolean fourth = false;
    boolean fifth = false;
    boolean sixth = false;

    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);
        setTitle("장바구니 페이지");
        LinearLayout cart_layout = (LinearLayout) findViewById(R.id.cartLinearLayout);
        scroll = findViewById(R.id.c_scroll);
        scroll.fullScroll(ScrollView.FOCUS_DOWN);

        LinearLayout sublayout = findViewById(R.id.products_layout);

        Intent intent = getIntent();
        String first_product = intent.getStringExtra("first_name");
        String second_product = intent.getStringExtra("second_name");
        String third_product = intent.getStringExtra("third_name");
        String fourth_product = intent.getStringExtra("fourth_name");
        String fifth_product = intent.getStringExtra("fifth_name");
        String sixth_product = intent.getStringExtra("sixth_name");

        //  체크박스 만들기
        if (first_product != null){
            final CheckBox cb = new CheckBox(this);
            cb.setText(first_product);
            cb.setId(1);
            byte[] arr = getIntent().getByteArrayExtra("first_img");
            Bitmap image = BitmapFactory.decodeByteArray(arr, 0, arr.length);
            ImageView imv = new ImageView(this);
            imv.setImageBitmap(image);
            sublayout.addView(imv);
            sublayout.addView(cb);
            cb.setOnClickListener(new Button.OnClickListener(){
                @Override
                public void onClick(View view) {
                    checked(cb);
                }
            });
        }

        if (second_product != null){
            final CheckBox cb = new CheckBox(this);
            cb.setText(second_product);
            cb.setId(2);
            byte[] arr = getIntent().getByteArrayExtra("second_img");
            Bitmap image = BitmapFactory.decodeByteArray(arr, 0, arr.length);
            ImageView imv = new ImageView(this);
            imv.setImageBitmap(image);
            sublayout.addView(imv);
            sublayout.addView(cb);
            cb.setOnClickListener(new Button.OnClickListener(){
                @Override
                public void onClick(View view) {
                    checked(cb);
                }

            });
        }

        if (third_product != null){
            final CheckBox cb = new CheckBox(this);
            cb.setText(third_product);
            cb.setId(3);
            byte[] arr = getIntent().getByteArrayExtra("third_img");
            Bitmap image = BitmapFactory.decodeByteArray(arr, 0, arr.length);
            ImageView imv = new ImageView(this);
            imv.setImageBitmap(image);
            sublayout.addView(imv);
            sublayout.addView(cb);
            cb.setOnClickListener(new Button.OnClickListener(){
                @Override
                public void onClick(View view) {
                    checked(cb);
                }
            });
        }

        if (fourth_product != null){
            final CheckBox cb = new CheckBox(this);
            cb.setText(fourth_product);
            cb.setId(4);
            byte[] arr = getIntent().getByteArrayExtra("fourth_img");
            Bitmap image = BitmapFactory.decodeByteArray(arr, 0, arr.length);
            ImageView imv = new ImageView(this);
            imv.setImageBitmap(image);
            sublayout.addView(imv);
            sublayout.addView(cb);
            cb.setOnClickListener(new Button.OnClickListener(){
                @Override
                public void onClick(View view) {
                    checked(cb);
                }
            });
        }

        if (fifth_product != null){
            final CheckBox cb = new CheckBox(this);
            cb.setText(fifth_product);
            cb.setId(5);
            byte[] arr = getIntent().getByteArrayExtra("fifth_img");
            Bitmap image = BitmapFactory.decodeByteArray(arr, 0, arr.length);
            ImageView imv = new ImageView(this);
            imv.setImageBitmap(image);
            sublayout.addView(imv);
            sublayout.addView(cb);
            cb.setOnClickListener(new Button.OnClickListener(){
                @Override
                public void onClick(View view) {
                    checked(cb);
                }
            });
        }

        if (sixth_product != null){
            final CheckBox cb = new CheckBox(this);
            cb.setText(sixth_product);
            cb.setId(6);
            byte[] arr = getIntent().getByteArrayExtra("sixth_img");
            Bitmap image = BitmapFactory.decodeByteArray(arr, 0, arr.length);
            ImageView imv = new ImageView(this);
            imv.setImageBitmap(image);
            sublayout.addView(imv);
            sublayout.addView(cb);
            cb.setOnClickListener(new Button.OnClickListener(){
                @Override
                public void onClick(View view) {
                    checked(cb);
                }
            });
        }

        // Button
        c_home = (Button) findViewById(R.id.c_home);
        c_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    Intent mintent = new Intent(getApplicationContext(), MainActivity.class);
                    mintent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    startActivity(mintent);
            }
        });

        c_purchasebtn = findViewById(R.id.cart_purchasebtn);
        c_purchasebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (!(first == false && second == false && third == false &&
                        fourth == false && fifth == false && sixth == false)){
                    Intent pintent = new Intent(getApplicationContext(), PurchaseActivity.class);
                    if(first){
                        pintent.putExtra("first_product", "작은 아씨들");
                        pintent.putExtra("first_price", 12000);
                    }
                    if (second){
                        pintent.putExtra("second_product", "동물농장");
                        pintent.putExtra("second_price", 15000);
                    }
                    if (third){
                        pintent.putExtra("third_product", "데미안");
                        pintent.putExtra("third_price", 9800);
                    }
                    if(fourth){
                        pintent.putExtra("fourth_product", "프랑켄슈타인");
                        pintent.putExtra("fourth_price", 13500);
                    }
                    if(fifth){
                        pintent.putExtra("fifth_product", "위대한 개츠비");
                        pintent.putExtra("fifth_price", 11000);
                    }
                    if(sixth){
                        pintent.putExtra("sixth_product", "레 미제라블");
                        pintent.putExtra("sixth_price", 14700);
                    }

                    startActivity(pintent);
                }
            }
        });
    }

    @SuppressLint("ResourceType")
    public void checked(CheckBox v){
        if (v.getId() == 1) first = true;
        if (v.getId() == 2) second = true;
        if (v.getId() == 3) third = true;
        if (v.getId() == 4) fourth = true;
        if (v.getId() == 5) fifth = true;
        if (v.getId() == 6) sixth = true;
    }
}
