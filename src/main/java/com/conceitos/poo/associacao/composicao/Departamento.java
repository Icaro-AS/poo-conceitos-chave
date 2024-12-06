package com.conceitos.poo.associacao.composicao;

import com.conceitos.poo.associacao.agregacao.Curso;

import java.util.ArrayList;
import java.util.List;

public class Departamento {
    private String nomeDepartamento;
    private List<Curso> cursos;

    public Departamento(String nome){
        this.nomeDepartamento = nome;
        this.cursos = new ArrayList<>();
    }

    public String getNome(){
        return nomeDepartamento;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void adicionarCurso(Curso curso){
        cursos.add(curso);
    }

    public void removerCurso(Curso curso) {
        cursos.remove(curso);
    }
}
