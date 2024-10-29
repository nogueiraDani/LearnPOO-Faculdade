package com.dani;

import java.text.Format;

public class Nota {
    Float nota1;
    Float nota2;
    Float nota3;

    public Nota(Float nota1, Float nota2, Float nota3) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public Float mediaAritmetica(){
        return ((nota1 + nota2 + nota3) / 3);
    }

    public Float mediaPonderada(){
        return ((nota1 * 2 + nota2 *3 + nota3 * 4) / 9);
    }
}
