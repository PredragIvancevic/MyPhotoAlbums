package com.example.moji_foto_albumi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Bundle extras = getIntent().getExtras();
        String Kontinet=extras.getString("Continent");
        String Drzava=extras.getString("Country");
        String Mesto=extras.getString("Place");
        int Dan=extras.getInt("Day");
        int Mesec=extras.getInt("Month");
        int Godina=extras.getInt("Year");
        int Dan1=extras.getInt("Dan");
        int Mesec1=extras.getInt("Mesec");
        int Godina1=extras.getInt("Godina");
        String Tip=extras.getString("Type");
        String Drustvo=extras.getString("Friends");
        TextView labela1=(TextView)findViewById(R.id.labela1);
        labela1.setText(getString(R.string.tekst1)+" "+Mesto+", "+Drzava+", "+Kontinet+".");
        ImageButton home=(ImageButton)findViewById(R.id.home);
        home.setOnClickListener(this);
        TextView labela2=(TextView)findViewById(R.id.labela2);
        labela2.setText(getString(R.string.tekst2)+" "+Dan+"."+Mesec+"."+Godina+" "+getString(R.string.tekst3)+" "+Dan1+"."+Mesec1+"."+Godina1);
        TextView labela3=(TextView)findViewById(R.id.labela3);
        if(!Drustvo.isEmpty()){
        labela3.setText(getString(R.string.tekst4)+" "+Tip+" "+getString(R.string.tekst5)+" "+Drustvo);}
        else{
            labela3.setText(getString(R.string.tekst4)+" "+Tip+" "+getString(R.string.tekst6));
        }



    }

    @Override
    public void onClick(View v) {
        Intent intent=new Intent(Main3Activity.this,MainActivity.class);
        startActivity(intent);

    }
}
