package com.example.alunos.cordi.model.model;

import android.widget.Spinner;

/**
 * Created by alunos on 18/10/17.
 */

public class MacroView {
    private String nome;
    private Float x;
    private Float y;

    public MacroView(String nome, Float x, Float Y){
        this.nome = nome;
        this.x = x;
        this.y = y;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Float getX() {
        return x;
    }

    public void setX(Float x) {
        this.x = x;
    }

    public Float getY() {
        return y;
    }

    public void setY(Float y) {
        this.y = y;
    }
}
