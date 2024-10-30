/**
 * combine os tópicos abordados nesta aula e construa um HashMap
 * que irá mapear nomes (string) com seus respectivos aniversários representados
 * por um LocalDate. Registre ao menos três aniversários no mapa e depois,
 * utilizando um loop, imprima todos os aniversários.
 */

package com.dani;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> aniversarios = new HashMap<String,
                String>();
        DateTimeFormatter formatter = DateTimeFormatter
                .ofPattern("dd/MM/yyyy");

        aniversarios.put("Dani",
                LocalDate.of(1989, 11, 6)
                        .format(formatter));
        aniversarios.put("José",
                LocalDate.of(1994,3,15)
                        .format(formatter));
        aniversarios.put("Maria",
                LocalDate.of(1975, 6, 25)
                        .format(formatter));

        Iterator<Map.Entry<String, String>> iterator =
                aniversarios.entrySet().iterator();

        while(iterator.hasNext()){
            Map.Entry<String, String> entry = iterator.next();
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }

}