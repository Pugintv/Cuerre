package com.victorrosas.cuerre;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.TextView;

public class Edificios extends AppCompatActivity {

    String imagename;
    ImageView edificioimageView;
    TextView edificioname;
    TextView edificiodescription;
    TextView edificioano;
    TextView edificioarq;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edificios);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        imagename = getIntent().getExtras().getString("Imagename");
        edificioimageView = (ImageView) findViewById(R.id.imageView);
        edificioname = (TextView)findViewById(R.id.textView);
        edificioano= (TextView)findViewById(R.id.textView7);
        edificioarq =(TextView)findViewById(R.id.textView6);
        //edificiodescription = (TextView)findViewById(R.id.)


        if (edificioimageView!= null) {
            switch (imagename) {

                case "CIT":
                    edificioimageView.setImageResource(R.drawable.cit);
                    edificioname.setText("CIT(Centro de Innovacion y Tecnologia)");
                    edificioano.setText("1998");
                    edificioarq.setText("Federico Baur Aldtdofer");
                    break;

                case "Galileo":
                    edificioimageView.setImageResource(R.drawable.galileo);
                    edificioname.setText("Galileo");
                    edificioano.setText("");
                    edificioarq.setText("");
                    break;

                case "PIT3":
                    edificioimageView.setImageResource(R.drawable.pit3);
                    edificioname.setText("PIT 3 Parque de Innovación y Transferencia Técnica y Tecnológica");
                    edificioano.setText("2013");
                    edificioarq.setText("Grupo ARKHOS");
                    break;
            }
        }
    }

}
