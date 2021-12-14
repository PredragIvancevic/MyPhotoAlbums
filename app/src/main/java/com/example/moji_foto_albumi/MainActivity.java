package com.example.moji_foto_albumi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.LinkedList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LinkedList<Element> list=ElementAPI.vratiListu();
        GridLayout resetka=(GridLayout)findViewById(R.id.resetka);
        LayoutInflater inflater=(LayoutInflater)getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        for(Element element:list){
            RelativeLayout item=(RelativeLayout) inflater.inflate(R.layout.lejaut,null);
            ((TextView)item.findViewById(R.id.tekst)).setText(element.getIme());
            ImageView slika=(ImageView)item.findViewById(R.id.slika);
            switch(element.getIme()) {
                case "aerodrom":
                    slika.setImageResource(R.drawable.aerodrom);
                    break;
                case "baku1":
                slika.setImageResource(R.drawable.baku1);
                break;
                case "hrana":
                    slika.setImageResource(R.drawable.hrana);
                    break;
                case "izgradnja" :
                    slika.setImageResource(R.drawable.izgradnja);
                    break;
                case "lada, ostatak SSSR-a":
                    slika.setImageResource(R.drawable.lada);
                    break;
                case "plaza":
                    slika.setImageResource(R.drawable.plaza);
                    break;
                case "stadion":
                    slika.setImageResource(R.drawable.stadion);
                    break;
                case "stari_grad":
                    slika.setImageResource(R.drawable.stari_grad);
                    break;
                case "tocak":
                    slika.setImageResource(R.drawable.tocak);
                    break;
                case "voznja":
                        slika.setImageResource(R.drawable.voznja);
                        break;

            }
            resetka.addView(item);
        }
        Button dodajOpis=(Button)findViewById(R.id.dodajOpis);
        dodajOpis.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent intent=new Intent(MainActivity.this,Main2Activity.class);
        startActivity(intent);
    }
}
