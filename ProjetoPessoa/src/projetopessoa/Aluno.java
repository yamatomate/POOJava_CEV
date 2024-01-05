/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetopessoa;

import static java.lang.Math.random;

/**
 *
 * @author gusta
 */
public class Aluno extends Pessoa {
    private int matricula;
    private String curso;
    private boolean estudando;
    private boolean ativo;
    //cosntru

    public Aluno(String curso) {
        this.matricula = (int) (Math.random()*10000);
        this.curso = curso;
        this.estudando = true;
        this.ativo = true;
    }
    
    //metodos
    public void cancelarMat() {
        this.ativo = false;
    }
    @Override
    public void status() {
        String a = "||-----------------||";
        System.out.format("%s\n>Nome: %s\n>Idade: %d\n>Sexo: %s\n>Matricula: %d\n>Curso: %s\n%s\n",
                a,this.getNome(),this.getIdade()
                ,this.getSexo(), this.matricula,this.curso,a);
    }
    //get e set
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public boolean isEstudando() {
        return estudando;
    }

    public void setEstudando(boolean estudando) {
        this.estudando = estudando;
    }
    
}
