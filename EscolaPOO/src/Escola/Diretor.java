/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Escola;

import java.util.ArrayList;

/**
 *
 * @author Caio Rievers
 */
public class Diretor extends Funcionario implements Sistema, Punir{
    
    private ArrayList<Professor> profs;
    
    public Diretor(String nome, String matricula, double salario) {
        super(nome, matricula, salario);
    }
    
    public ArrayList<Professor> getProfs(){
        return profs;
    }
    
    public void admitirProf(String nome, String matricula, double salario){
        Professor prof = new Professor(nome, matricula, salario);
        profs.add(prof);
    }
    
    public boolean demiteProf(int indexProf){
        return (profs.remove(profs.get(indexProf)));
    }
    
    public void atribuirMateria(String nomeMateria, int nAulas, int indexProf){
        Materia materia = new Materia(nomeMateria, nAulas);
        profs.get(indexProf).insereMateria(materia);
    }

    public void somarNota(int indexMateria, int indexProf, int indexAluno, float nota) {
        profs.get(indexProf).somarNota(indexMateria, indexAluno, nota);
    }

    @Override
    public void alterarNota(int indexMateria, int indexAluno, float nota) {
        profs.
    }

    @Override
    public void atribuirFalta(int indexMateria, int indexAluno) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void removerFalta(int indexMateria, int indexAluno) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public float verNota(int indexMateria, int indexAluno) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int verFalta(int indexMateria, int indexAluno) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void darAdvertencia(Aluno aluno) {
        aluno.darAdvertencia();
    }

    @Override
    public void somarNota(int indexMateria, int indexAluno, float nota) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void expulsar(Aluno aluno) {
        aluno.setExpulso(true);
    }
    
}
