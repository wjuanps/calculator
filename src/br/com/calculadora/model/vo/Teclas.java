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
public enum Teclas {
    
    /**
     *
     */
    ZERO(KeyEvent.VK_0),

    /**
     *
     */
    UM(KeyEvent.VK_1),

    /**
     *
     */
    DOIS(KeyEvent.VK_2),

    /**
     *
     */
    TRES(KeyEvent.VK_3),

    /**
     *
     */
    QUATRO(KeyEvent.VK_4),

    /**
     *
     */
    CINCO(KeyEvent.VK_5),

    /**
     *
     */
    SEIS(KeyEvent.VK_6),

    /**
     *
     */
    SETE(KeyEvent.VK_7),

    /**
     *
     */
    OITO(KeyEvent.VK_8),

    /**
     *
     */
    NOVE(KeyEvent.VK_9),

    /**
     *
     */
    PONTO(KeyEvent.VK_UNDEFINED),
    
    /**
     *
     */
    PONTO2(KeyEvent.VK_PERIOD),
    
    /**
     * 
     */
    NUMPAD0(KeyEvent.VK_NUMPAD0),
    
    /**
     * 
     */
    NUMPAD1(KeyEvent.VK_NUMPAD1),
    
    /**
     * 
     */
    NUMPAD2(KeyEvent.VK_NUMPAD2),
    
    /**
     * 
     */
    NUMPAD3(KeyEvent.VK_NUMPAD3),
    
    /**
     * 
     */
    NUMPAD4(KeyEvent.VK_NUMPAD4),
    
    /**
     * 
     */
    NUMPAD5(KeyEvent.VK_NUMPAD5),
    
    /**
     * 
     */
    NUMPAD6(KeyEvent.VK_NUMPAD6),
    
    /**
     * 
     */
    NUMPAD7(KeyEvent.VK_NUMPAD7),
    
    /**
     * 
     */
    NUMPAD8(KeyEvent.VK_NUMPAD8),
    
    /**
     * 
     */
    NUMPAD9(KeyEvent.VK_NUMPAD9);
    
    /**
     *
     */
    public int value;
    
    Teclas(int value) {
        this.value = value;
    }    
}
