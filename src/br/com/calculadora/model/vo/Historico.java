/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.calculadora.model.vo;

/**
 *
 * @author Sophia
 */
public class Historico {
    
    private String operacao;

    public Historico(String operacao) {
        this.operacao = operacao;
    }

    public String getOperacao() {
        return operacao;
    }
    
    public void setOperacao(String operacao) {
        this.operacao = operacao;
    }
}
