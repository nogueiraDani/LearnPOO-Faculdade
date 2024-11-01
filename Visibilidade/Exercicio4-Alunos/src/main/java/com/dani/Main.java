package com.dani;

/**
 * Hello world!
 *
 */
public class Main 
{
    public static void main( String[] args )
    {
        Aluno aluno = new Aluno("Maria", 100, 0.99, new Curso("Engenharia", 500.00));
        System.out.println(aluno.infoMensalidade());  
        
        System.out.println(aluno.infoAluno());
    }
}
