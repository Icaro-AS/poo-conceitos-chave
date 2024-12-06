package com.conceitos.poo.associacao;

import com.conceitos.poo.abstracao.Aluno;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nome;
    private List<Aluno> alunos;

    public Curso(String nome){
        this.nome = nome;
        this.alunos = new ArrayList<>();
    }

    public String getNome(){
        return nome;
    }

    public List<Aluno> getAlunos(){
        return alunos;
    }

    public void adicionarAluno(Aluno aluno){
        alunos.add(aluno);
    }
}
