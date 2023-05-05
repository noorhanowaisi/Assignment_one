package com.example.assig1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    ImageView primimagee;
    TextView prim;
    Button energy;
    Button safe;
    Button build;
    TextView oiltext;
    TextView suger;
    EditText address;
    EditText textoil;
    TextView text2;
    ImageView imageoil;
    EditText textsuger;
    TextView text3;
    ImageView imagesuger;
    Spinner spinner;
    EditText textbuild;
    TextView text4;
    ImageView imagegrow;
    EditText address2;
    EditText textsafe;
    TextView text5;
    ImageView imagesafe;
    EditText address3;
    Button back;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        primimagee=findViewById(R.id.primimagee);
        prim=findViewById(R.id.prim);
        energy=findViewById(R.id.energy);
        safe=findViewById(R.id.safe);
        build=findViewById(R.id.build);
        oiltext=findViewById(R.id.oiltext);
        suger=findViewById(R.id.suger);

        address=findViewById(R.id.address);
        textoil=findViewById(R.id.textoil);
        text2=findViewById(R.id.text2);
        imageoil=findViewById(R.id.imageoil);
        textsuger=findViewById(R.id.textsuger);
        text3=findViewById(R.id.text3);
        imagesuger=findViewById(R.id.imagesuger);
        spinner=findViewById(R.id.spinner);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if(i==1){
               textoil.setVisibility(View.VISIBLE);
               text2.setVisibility(View.VISIBLE);
               imageoil.setVisibility(View.VISIBLE);
               textsuger.setVisibility(View.INVISIBLE);
               text3.setVisibility(View.INVISIBLE);
               imagesuger.setVisibility(View.INVISIBLE);
           }else if(i==2) {
               textoil.setVisibility(View.INVISIBLE);
               text2.setVisibility(View.INVISIBLE);
               imageoil.setVisibility(View.INVISIBLE);
               textsuger.setVisibility(View.VISIBLE);
               text3.setVisibility(View.VISIBLE);
               imagesuger.setVisibility(View.VISIBLE);
           }else{
                    textoil.setVisibility(View.INVISIBLE);
                    text2.setVisibility(View.INVISIBLE);
                    imageoil.setVisibility(View.INVISIBLE);
                    textsuger.setVisibility(View.INVISIBLE);
                    text3.setVisibility(View.INVISIBLE);
                    imagesuger.setVisibility(View.INVISIBLE);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        textbuild=findViewById(R.id.textbuild);
        text4=findViewById(R.id.text4);
        imagegrow=findViewById(R.id.imagegrow);
        address2=findViewById(R.id.address2);

        textsafe=findViewById(R.id.textsafe);
        text5=findViewById(R.id.text5);
        imagesafe=findViewById(R.id.imagesafe);
        address3=findViewById(R.id.address3);
        back=findViewById(R.id.back);
    }

    public void btnenergyclick(View view) {
        primimagee.setVisibility(View.INVISIBLE);
        prim.setVisibility(View.INVISIBLE);
        energy.setVisibility(View.INVISIBLE);
        safe.setVisibility(View.INVISIBLE);
        build.setVisibility(View.INVISIBLE);
        oiltext.setVisibility(View.INVISIBLE);
        suger.setVisibility(View.INVISIBLE);

        address.setVisibility(View.VISIBLE);
        spinner.setVisibility(View.VISIBLE);
        back.setVisibility(View.VISIBLE);
    }
    public void btnbuildclick(View view) {
        primimagee.setVisibility(View.INVISIBLE);
        prim.setVisibility(View.INVISIBLE);
        energy.setVisibility(View.INVISIBLE);
        safe.setVisibility(View.INVISIBLE);
        build.setVisibility(View.INVISIBLE);
        oiltext.setVisibility(View.INVISIBLE);
        suger.setVisibility(View.INVISIBLE);

        address2.setVisibility(View.VISIBLE);
        textbuild.setVisibility(View.VISIBLE);
        text4.setVisibility(View.VISIBLE);
        imagegrow.setVisibility(View.VISIBLE);
        back.setVisibility(View.VISIBLE);
    }
    public void btnsafeclick(View view) {
        primimagee.setVisibility(View.INVISIBLE);
        prim.setVisibility(View.INVISIBLE);
        energy.setVisibility(View.INVISIBLE);
        safe.setVisibility(View.INVISIBLE);
        build.setVisibility(View.INVISIBLE);
        oiltext.setVisibility(View.INVISIBLE);
        suger.setVisibility(View.INVISIBLE);

        address3.setVisibility(View.VISIBLE);
        textsafe.setVisibility(View.VISIBLE);
        text5.setVisibility(View.VISIBLE);
        imagesafe.setVisibility(View.VISIBLE);
        back.setVisibility(View.VISIBLE);
    }
    public void btnbackclick(View view) {
        primimagee.setVisibility(View.VISIBLE);
        prim.setVisibility(View.VISIBLE);
        energy.setVisibility(View.VISIBLE);
        safe.setVisibility(View.VISIBLE);
        build.setVisibility(View.VISIBLE);
        oiltext.setVisibility(View.VISIBLE);
        suger.setVisibility(View.VISIBLE);

        address.setVisibility(View.INVISIBLE);
        spinner.setVisibility(View.INVISIBLE);
        textoil.setVisibility(View.INVISIBLE);
        text2.setVisibility(View.INVISIBLE);
        imageoil.setVisibility(View.INVISIBLE);
        textsuger.setVisibility(View.INVISIBLE);
        text3.setVisibility(View.INVISIBLE);
        imagesuger.setVisibility(View.INVISIBLE);
        address2.setVisibility(View.INVISIBLE);
        textbuild.setVisibility(View.INVISIBLE);
        text4.setVisibility(View.INVISIBLE);
        imagegrow.setVisibility(View.INVISIBLE);
        address3.setVisibility(View.INVISIBLE);
        textsafe.setVisibility(View.INVISIBLE);
        text5.setVisibility(View.INVISIBLE);
        imagesafe.setVisibility(View.INVISIBLE);
        back.setVisibility(View.INVISIBLE);
    }
}