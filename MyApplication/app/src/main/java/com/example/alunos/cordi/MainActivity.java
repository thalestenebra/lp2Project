package com.example.alunos.cordi;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;


import com.example.alunos.cordi.adapter.DesenhosAdapter;
import com.example.alunos.cordi.model.model.MacroView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listview = (ListView) findViewById(R.id.list);
        nova_figura(listview);
        nova_figura(listview);}
    public void nova_figura(ListView listview){
        ArrayList<MacroView> lista = new ArrayList<MacroView>();
        lista.add(new MacroView());
        listview.setAdapter(new DesenhosAdapter(this, lista));
    }
}
