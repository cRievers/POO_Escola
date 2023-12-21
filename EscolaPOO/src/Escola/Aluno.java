/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Escola;

/**
 *
 * @author Caio Rievers
 */
public class Aluno extends Pessoa {
    
    private int nAdvertencias;
    private boolean expulso;
    
    public Aluno(String nome, String matricula) {
        super(nome, matricula);
        this.nAdvertencias = 0;
    }
    
    public int getAdvertencias() {
        return nAdvertencias;
    }

    public void darAdvertencia() {
        this.nAdvertencias++;
    }

    public boolean isExpulso() {
        return expulso;
    }

    public void setExpulso(boolean expulso) {
        this.expulso = expulso;
    }
    
}
