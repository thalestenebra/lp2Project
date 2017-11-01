package com.example.alunos.cordi.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.example.alunos.cordi.R;
import com.example.alunos.cordi.model.model.MacroView;

import java.util.List;

/**
 * Created by alunos on 01/11/17.
 */

public class DesenhosAdapter extends BaseAdapter {
    private Context context;
    private List<MacroView> lista;

    public DesenhosAdapter(Context context, List<MacroView> lista) {
        this.context = context;
        this.lista = lista;
    }

    public int getCount() {
        return lista.size();
    }

    public Object getItem(int posicao) {
        MacroView obj = lista.get(posicao);
        return  obj;
    }

    public long getItemId(int posicao) {
        return  posicao;
    }

    public View getView(int posicao, View convertView, ViewGroup parent) {
        MacroView obj = lista.get(posicao);
        LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View v = inflater.inflate(R.layout.macro_view, null);
        return v;
    }
}
