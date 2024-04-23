package com.aluno.dadosAlunos.model;

public class Aluno {
    private int id;
    private String nome;
    private int idade;
    private String curso;
    private boolean matriculado;
    private float notaLógicaEProgramação;
    private float notaBancoDeDados;
    private float notaDesenvolvimentoWeb;
    private Endereco endereco;
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    public boolean isMatriculado() {
        return matriculado;
    }
    public void setMatriculado(boolean matriculado) {
        this.matriculado = matriculado;
    }
    public float getNotaLógicaEProgramação() {
        return notaLógicaEProgramação;
    }
    public void setNotaLógicaEProgramação(float notaLógicaEProgramação) {
        this.notaLógicaEProgramação = notaLógicaEProgramação;
    }
    public float getNotaBancoDeDados() {
        return notaBancoDeDados;
    }
    public void setNotaBancoDeDados(float notaBancoDeDados) {
        this.notaBancoDeDados = notaBancoDeDados;
    }
    public float getNotaDesenvolvimentoWeb() {
        return notaDesenvolvimentoWeb;
    }
    public void setNotaDesenvolvimentoWeb(float notaDesenvolvimentoWeb) {
        this.notaDesenvolvimentoWeb = notaDesenvolvimentoWeb;
    }
    public Endereco getEndereco() {
        return endereco;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    
}
