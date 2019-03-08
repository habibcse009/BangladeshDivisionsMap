package com.habibcse009.bangladeshmap;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.medialablk.easygifview.EasyGifView;

public class MainActivity extends AppCompatActivity {
TextView txtTitle;
Button btnDhaka,btnChittagong,btnBarisal,btnSylhet,btnRajshahi,btnRangpur,btnMymensingh,btnKhulna;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtTitle=findViewById(R.id.txt_menulist);
        btnDhaka=findViewById(R.id.btn_dhaka);
        btnChittagong=findViewById(R.id.btn_chittagong);
        btnRangpur=findViewById(R.id.btn_rangpur);
        btnBarisal=findViewById(R.id.btn_barisal);
        btnSylhet=findViewById(R.id.btn_sylhet);
        btnRajshahi=findViewById(R.id.btn_rajshahi);
        btnMymensingh=findViewById(R.id.btn_mymensingh);
        btnKhulna=findViewById(R.id.btn_khulna);

        //Initialize font
        Typeface tf = Typeface.createFromAsset(getAssets(), "Milkshake.ttf");
        Typeface tf1 = Typeface.createFromAsset(getAssets(), "Quicksand-Regular.otf");
        Typeface tf2 = Typeface.createFromAsset(getAssets(), "aqua.ttf");
        Typeface tf3 = Typeface.createFromAsset(getAssets(), "SolaimanLipi.ttf");
        btnDhaka.setTypeface(tf2);
        btnChittagong.setTypeface(tf2);
        btnBarisal.setTypeface(tf2);
        btnRajshahi.setTypeface(tf2);
        btnRangpur.setTypeface(tf2);
        btnSylhet.setTypeface(tf2);
        btnMymensingh.setTypeface(tf2);
        btnKhulna.setTypeface(tf2);
        txtTitle.setTypeface(tf);
        EasyGifView easyGifView = (EasyGifView) findViewById(R.id.easyGifView);
        easyGifView.setGifFromResource(R.drawable.goodloading); //Your own GIF file from Resources

        btnDhaka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MapsActivity.class);
                intent.putExtra("Place_no", "one");      //data passing
                startActivity(intent);
                Toast.makeText(MainActivity.this, "Dhaka", Toast.LENGTH_SHORT).show();
            }
        });
        btnChittagong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MapsActivity.class);
                intent.putExtra("Place_no", "two");      //data passing
                startActivity(intent);
                Toast.makeText(MainActivity.this, "Chittagong", Toast.LENGTH_SHORT).show();
            }
        });
        btnRajshahi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MapsActivity.class);
                intent.putExtra("Place_no", "three");      //data passing
                startActivity(intent);
                Toast.makeText(MainActivity.this, "Rajshahi", Toast.LENGTH_SHORT).show();
            }
        });
        btnKhulna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MapsActivity.class);
                intent.putExtra("Place_no", "four");      //data passing
                startActivity(intent);
                Toast.makeText(MainActivity.this, "Khulna", Toast.LENGTH_SHORT).show();
            }
        });
        btnBarisal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MapsActivity.class);
                intent.putExtra("Place_no", "five");      //data passing
                startActivity(intent);
                Toast.makeText(MainActivity.this, "Barisal", Toast.LENGTH_SHORT).show();
            }
        });
        btnSylhet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MapsActivity.class);
                intent.putExtra("Place_no", "six");      //data passing
                startActivity(intent);
                Toast.makeText(MainActivity.this, "Sylhet", Toast.LENGTH_SHORT).show();
            }
        });
        btnMymensingh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MapsActivity.class);
                intent.putExtra("Place_no", "seven");      //data passing
                startActivity(intent);
                Toast.makeText(MainActivity.this, "Mymensingh", Toast.LENGTH_SHORT).show();
            }
        });
        btnRangpur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MapsActivity.class);
                intent.putExtra("Place_no", "eight");      //data passing
                startActivity(intent);
                Toast.makeText(MainActivity.this, "Rangpur", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
