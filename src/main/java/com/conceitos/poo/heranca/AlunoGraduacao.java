package com.conceitos.poo.heranca;
import com.conceitos.poo.abstracao.Aluno;

public class AlunoGraduacao extends Aluno {
    private String curso;

    public AlunoGraduacao(String nome, int idade, String matricula, String curso) {
        super(nome, idade, matricula);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return super.toString() + ", curso=" + curso;
    }

}


