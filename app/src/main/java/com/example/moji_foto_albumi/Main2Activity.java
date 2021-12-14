package com.example.moji_foto_albumi;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.Date;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        (findViewById(R.id.strelica)).setOnClickListener(this);
        (findViewById(R.id.SacuvajDetalje)).setOnClickListener(this);
        inicijalizacija();

    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.strelica:
                Intent intent=new Intent(Main2Activity.this,MainActivity.class);
                startActivity(intent);
                break;
            case R.id.SacuvajDetalje:
                Intent i= new Intent(Main2Activity.this,Main3Activity.class);
                String Kontinent=(String)((Spinner)findViewById(R.id.spiner1)).getSelectedItem();
                String Drzava=((EditText)findViewById(R.id.inputDrzava)).getText().toString();
                String Mesto=((EditText)findViewById(R.id.inputMesto)).getText().toString();
                DatePicker Pocetak=(DatePicker)findViewById(R.id.piker1);
                int danPolaska=Pocetak.getDayOfMonth();
                int mesecPolaska=Pocetak.getMonth();
                int godinaPolaska=Pocetak.getYear();
                DatePicker Kraj=(DatePicker)findViewById(R.id.piker2);
                int danOdlaska=Kraj.getDayOfMonth();
                int mesecOdlaska=Kraj.getMonth();
                int godinaOdlaska=Kraj.getYear();

                String VrstaPutovanja=(String)((Spinner)findViewById(R.id.spiner2)).getSelectedItem();
                String Drustvo=((EditText)findViewById(R.id.inputDrustvo)).getText().toString();
                Bundle extra=new Bundle();
                extra.putString("Continent",Kontinent);
                extra.putString("Country",Drzava);
                extra.putString("Place",Mesto);
                extra.putInt("Day",danPolaska);
                extra.putInt("Month",mesecPolaska);
                extra.putInt("Year",godinaPolaska);
                extra.putInt("Dan",danOdlaska);
                extra.putInt("Mesec",mesecOdlaska);
                extra.putInt("Godina",godinaOdlaska);
                extra.putString("Type",VrstaPutovanja);
                extra.putString("Friends",Drustvo);
                i.putExtras(extra);
                startActivity(i);

        }
    }
    public void inicijalizacija(){
        Spinner spiner1=(Spinner)findViewById(R.id.spiner1);
        ArrayList<String> listaKontinenata=new ArrayList<String>();
        listaKontinenata.add("Evropa");
        listaKontinenata.add("Australija");
        listaKontinenata.add("Azija i Okeanija");
        listaKontinenata.add("Afrika");
        listaKontinenata.add("Severna Amerika");
        listaKontinenata.add("Juzna Amerika");
        listaKontinenata.add("Antarktik");
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,listaKontinenata);
        spiner1.setAdapter(adapter);

        Spinner spiner2=(Spinner)findViewById(R.id.spiner2);
        ArrayList<String> vrstaPutovanja=new ArrayList<String>();
        vrstaPutovanja.add("Porodicno putovanje");
        vrstaPutovanja.add("Poslovno putovanje");
        vrstaPutovanja.add("Putovanje s prijateljima");
        vrstaPutovanja.add("Samostalno putovanje/Avantura");
        ArrayAdapter<String> adapter1=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,vrstaPutovanja);
        spiner2.setAdapter(adapter1);


    }
}
