/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.calculadora;

import br.com.calculadora.controller.CalculadoraController;

/**
 *
 * @author Sophia
 */
public class Calculadora {
	static {
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager
					.getInstalledLookAndFeels()) {
				if ("Windows".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException | InstantiationException
				| IllegalAccessException
				| javax.swing.UnsupportedLookAndFeelException ex) {
		}
	}

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		java.awt.EventQueue.invokeLater(() -> {	
			new CalculadoraController();
		});
	}
}
