package com.example.alunos.cordi.model.model;

import android.widget.Spinner;

/**
 * Created by alunos on 18/10/17.
 */

public class MacroView {
    private String nome;
    private String x;
    private String y;

    public MacroView(){
        this.nome = "";
        this.x = "";
        this.y = "";
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getX() {
        return x;
    }

    public void setX(String x) {
        this.x = x;
    }

    public String getY() {
        return y;
    }

    public void setY(String y) {
        this.y = y;
    }
}
