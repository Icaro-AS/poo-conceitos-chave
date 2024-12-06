package com.conceitos.poo.polimorfismo;

import com.conceitos.poo.abstracao.Aluno;
import com.conceitos.poo.heranca.AlunoGraduacao;

public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Batman",40,"01");
        Aluno aluno2 = new AlunoGraduacao("Batman",38,"02","Ciência da Computação");

        System.out.println(aluno.toString());
        System.out.println(aluno2.toString());

    }
}

