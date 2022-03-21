package com.example.thigk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailXe extends AppCompatActivity {
    private TextView txtten,txtgia,txtgiam;
    private ImageView imglogo;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_xe);

        Intent intent=getIntent();
        XE x=(XE)intent.getSerializableExtra("Xe");

        txtten=(TextView)findViewById(R.id.txtten2);
        txtgia=(TextView)findViewById(R.id.txtgia2);
        txtgiam=(TextView)findViewById(R.id.txtgiam2);
        imglogo=(ImageView)findViewById(R.id.imglogo2);


        txtten.setText(x.getTen());
        txtgia.setText(x.getGia());
        txtgiam.setText(x.getGiam());
        imglogo.setImageResource(x.getId());

    }
}