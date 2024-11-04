package com.dani;

public class App
{
    public static void main( String[] args )
    {
        LivroDigital livroDigital = new LivroDigital("Ensaio sobre a cegueira",
                new Autor("José Saramago", "", "português"),
                "romance", 2020, 1500, 500);

        livroDigital.info();

        LivroFisico livroFisico = new LivroFisico("Cem anos de solidão",
                new Autor("Gabriel Garcia Marquez", "gabriel@email.com",
                        "colombiano"),
                "fantasia contemporânea", 1977, 2500, 300);

        livroFisico.info();
    }
}
