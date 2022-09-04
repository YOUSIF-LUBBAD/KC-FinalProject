package com.example.petadoptioncenter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {

    ArrayList<pets> pets= new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        pets s1 = new pets("Zeus",2,R.drawable.germanshepherd);
        pets s2 = new pets("Akira",2, R.drawable.persian);
        pets s3 = new pets("Ruby",3,R.drawable.van);
        pets s4 = new pets("Gordon",4,R.drawable.dog);
        pets s5 = new pets("Leo",10,R.drawable.golden);

        pets.add(s1);
        pets.add(s2);
        pets.add(s3);
        pets.add(s4);
        pets.add(s5);

        ListView ListView = findViewById(R.id.Listview);

        petAdapter i = new petAdapter(this,0,pets);
ListView.setAdapter(i);
    }
}