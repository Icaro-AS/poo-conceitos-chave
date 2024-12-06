package com.conceitos.poo.associacao.agregacao;

import com.conceitos.poo.abstracao.Aluno;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nomeCurso;
    private List<Aluno> alunos;

    public Curso(String nome){
        this.nomeCurso = nome;
        this.alunos = new ArrayList<>();
    }

    public String getNome(){
        return nomeCurso;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void adicionarAluno(Aluno aluno){
        alunos.add(aluno);
    }

    public void removerAluno(Aluno aluno) {
        alunos.remove(aluno);
    }
}
