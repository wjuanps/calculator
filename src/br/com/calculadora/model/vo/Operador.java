/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.calculadora.model.vo;

import java.awt.event.KeyEvent;

/**
 *
 * @author Sophia
 */
public enum Operador {
    
    /**
     *
     */
    SOMA("+", KeyEvent.VK_ADD),

    /**
     *
     */
    MULTIPLICACAO("*", KeyEvent.VK_MULTIPLY),

    /**
     *
     */
    DIVISAO("/", KeyEvent.VK_DIVIDE),

    /**
     *
     */
    SUBTRACAO("-", KeyEvent.VK_MINUS),
    
    /**
     *
     */
    POT("^", KeyEvent.VK_CIRCUMFLEX),
    
    /**
     *
     */
    SQRT("sqrt", -5),
    
    /**
     * 
     */
    LOG("log", -4),
    
    /**
     *
     */
    SUBTRACAO2("-", KeyEvent.VK_SUBTRACT),

    /**
     *
     */
    IGUAL("=", KeyEvent.VK_EQUALS),
    
    /**
     * 
     */
    ENTER("\n", KeyEvent.VK_ENTER),
    
    /**
     * 
     */
    FAT("!", -3),
    
    /**
     *
     */
    PAR_D(")", KeyEvent.VK_RIGHT_PARENTHESIS),
    
    /**
     *
     */
    PAR_E("(", KeyEvent.VK_LEFT_PARENTHESIS),
    
    /**
     * 
     */
    PERCENT("%", -4);
    
    /**
     *
     */
    public String value;
    
    /**
     * 
     */
    public int key;
    
    /**
     * 
     * @param value
     * @param key 
     */
    Operador(String value, int key) {
        this.value = value;
        this.key = key;
    }    
}
