package com.conceitos.poo.classes;

public class Universidade {
    private String nomeUniversidade;
    private String cnpj;

    public String imprimirDadosUniversidade() {
        return String.format("Nome: %s\nCNPJ: %s", this.nomeUniversidade, this.cnpj);
    }
}
