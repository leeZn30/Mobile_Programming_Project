package com.example.myproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class PurchaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_purchase);
        setTitle("구매 페이지");

        GridLayout products_layout = findViewById(R.id.products_layout);

        Intent intent = getIntent();
        String first_product = intent.getStringExtra("first_product");
        String second_product = intent.getStringExtra("second_product");
        String third_product = intent.getStringExtra("third_product");
        String fourth_product = intent.getStringExtra("fourth_product");
        String fifth_product = intent.getStringExtra("fifth_product");
        String sixth_product = intent.getStringExtra("sixth_product");

        int sum = 0;

        if (first_product != null) {
            TextView tv = new TextView(this);
            int first_price = intent.getIntExtra("first_price", 12000);
            sum = first_price;
            tv.setText(first_product + "    " + first_price + "원");
            products_layout.addView(tv);
        }

        if (second_product != null) {
            TextView tv = new TextView(this);
            int second_price = intent.getIntExtra("second_price", 15000);
            sum += second_price;
            tv.setText(second_product + "\t" + second_price + "원");
            products_layout.addView(tv);
        }

        if (third_product != null) {
            TextView tv = new TextView(this);
            int third_price = intent.getIntExtra("third_price", 9800);
            sum += third_price;
            tv.setText(third_product + "\t" + third_price + "원");
            products_layout.addView(tv);
        }

        if (fourth_product != null) {
            TextView tv = new TextView(this);
            int fourth_price = intent.getIntExtra("fourth_price", 13500);
            sum += fourth_price;
            tv.setText(fourth_product + "    " + fourth_price + "원");
            products_layout.addView(tv);
        }

        if (fifth_product != null) {
            TextView tv = new TextView(this);
            int fifth_price = intent.getIntExtra("fifth_price", 11000);
            sum += fifth_price;
            tv.setText(fifth_product + "    " + fifth_price + "원");
            products_layout.addView(tv);
        }

        if (sixth_product != null) {
            TextView tv = new TextView(this);
            int sixth_price = intent.getIntExtra("sixth_price", 4700);
            sum += sixth_price;
            tv.setText(sixth_product + "    " + sixth_price + "원");
            products_layout.addView(tv);
        }

        TextView total = new TextView(this);
        total.setText("총 " + sum + "원");
        products_layout.addView(total);

        Button p_returnbtn = (Button) findViewById(R.id.pur_returnbtn);
        p_returnbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        Button finishbtn = (Button) findViewById(R.id.pur_finishbtn);
        finishbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText address = findViewById(R.id.address);
                EditText phone = findViewById(R.id.phone);

                if (address.length() != 0 && phone.length() != 0){
                    Intent mintent = new Intent(getApplicationContext(), MainActivity.class);
                    mintent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    startActivity(mintent);
                }
            }
        });

    }
}
