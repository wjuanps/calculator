/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.calculadora.controller;

import br.com.calculadora.model.bo.CalculadoraBO;
import br.com.calculadora.model.dao.Arquivo;
import br.com.calculadora.model.vo.Operador;
import br.com.calculadora.model.vo.Teclas;
import br.com.calculadora.view.CalculadoraView;
import br.com.calculadora.view.HistoricoView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import javax.swing.AbstractAction;
import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;

/**
 *
 * @author Sophia
 */
public final class CalculadoraController extends CalculadoraBO implements
		ActionListener {

	/**
     *
     */
	private final CalculadoraView calculadoraView;
	/**
     * 
     */
	private final HistoricoView historicoView;

	/**
     *
     */
	private static final List<String> OPERANDOS = new ArrayList<>();
	static {
		for (Operador op : Operador.values()) {
			OPERANDOS.add(op.value);
		}
	}

	public CalculadoraController() {
		calculadoraView = new CalculadoraView();
		calculadoraView.setVisible(true);

		historicoView = new HistoricoView(calculadoraView, true);

		calculadoraView.getBtn0().addActionListener(this);
		calculadoraView.getBtn1().addActionListener(this);
		calculadoraView.getBtn2().addActionListener(this);
		calculadoraView.getBtn3().addActionListener(this);
		calculadoraView.getBtn4().addActionListener(this);
		calculadoraView.getBtn5().addActionListener(this);
		calculadoraView.getBtn6().addActionListener(this);
		calculadoraView.getBtn7().addActionListener(this);
		calculadoraView.getBtn8().addActionListener(this);
		calculadoraView.getBtn9().addActionListener(this);
		calculadoraView.getBtnMais().addActionListener(this);
		calculadoraView.getBtnMenos().addActionListener(this);
		calculadoraView.getBtnMultiplicar().addActionListener(this);
		calculadoraView.getBtnDividir().addActionListener(this);
		calculadoraView.getBtnIgual().addActionListener(this);
		calculadoraView.getBtnPonto().addActionListener(this);
		calculadoraView.getBtnLog().addActionListener(this);
		calculadoraView.getBtnFat().addActionListener(this);
		calculadoraView.getBtnPot().addActionListener(this);
		calculadoraView.getBtnRaiz().addActionListener(this);
		calculadoraView.getBtnParD().addActionListener(this);
		calculadoraView.getBtnParE().addActionListener(this);
		calculadoraView.getBtnLimpar().addActionListener(this);
		calculadoraView.getBtnPi().addActionListener(this);
		calculadoraView.getBtnPorcentagem().addActionListener(this);

		calculadoraView.getJmiAvancado().addActionListener(this);
		calculadoraView.getJmiPadrao().addActionListener(this);
		calculadoraView.getJmiHistorico().addActionListener(this);
		calculadoraView.getJmiExcluirHistorico().addActionListener(this);

		calculadoraView.getBtnVisualizar().addMouseListener(
				this.new AdaptadorMouse());
		eventoTeclado();
	}

	/**
     * 
     */
	public void eventoTeclado() {
		String valor = "Valor";
		InputMap inputMap = calculadoraView.getRootPane().getInputMap(
				JComponent.WHEN_IN_FOCUSED_WINDOW);
		for (Teclas teclas : Teclas.values()) {
			inputMap.put(KeyStroke.getKeyStroke(teclas.value, 0), valor);
		}

		for (Operador op : Operador.values()) {
			inputMap.put(KeyStroke.getKeyStroke(op.key, 0), valor);
		}

		ActionMap actionMap = calculadoraView.getRootPane().getActionMap();
		actionMap.put(valor, new AbstractAction() {
			/**
             * 
             */
			private static final long serialVersionUID = 1L;

			@Override
			public void actionPerformed(ActionEvent e) {
				final String tecla = e.getActionCommand();
				
				if (OPERANDOS.contains(tecla)) {
					operador(tecla, calculadoraView.getDisplay());
				} else {
					valor(tecla, calculadoraView.getDisplay());
				}
			}
		});

		calculadoraView.getDisplay().addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_SPACE) {
					calculadoraView.getDisplay().setText(visualizarHistorico());
				} else if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
					limparDisplay(calculadoraView.getDisplay());
				}
			}

			@Override
			public void keyReleased(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
					cortar(calculadoraView.getDisplay());
				} else if (e.getKeyCode() == KeyEvent.VK_SPACE) {
					calculadoraView.getDisplay().setText(getAtual());
				}
			}
		});
	}

	/**
     *
     */
	private final class AdaptadorMouse extends MouseAdapter {

		@Override
		public void mousePressed(MouseEvent e) {
			calculadoraView.getDisplay().setText(visualizarHistorico());
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			calculadoraView.getDisplay().setText(getAtual());
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String valor = e.getActionCommand();

		if (e.getSource() == calculadoraView.getJmiHistorico()) {
			try {
				String texto = new String(Files.readAllBytes(Paths
						.get(Arquivo.path)));
				historicoView.getTxtHistorico().setText(texto);

				historicoView.setVisible(true);
			} catch (IOException ex) {
				JOptionPane.showMessageDialog(calculadoraView,
						"O histórico está vazio.");
			}
		} else if (e.getSource() == calculadoraView.getJmiExcluirHistorico()) {
			try {
				Files.deleteIfExists(Paths.get(Arquivo.path));
			} catch (IOException ex) {
			}
		} else if (e.getSource() == calculadoraView.getJmiPadrao()) {
			calculadoraView.hidePainelAvancado();
		} else if (e.getSource() == calculadoraView.getJmiAvancado()) {
			calculadoraView.showPainelAvancado();
		} else if (e.getSource() == calculadoraView.getBtnLimpar()) {
			super.limparDisplay(calculadoraView.getDisplay());
		} else if (OPERANDOS.contains(valor)) {
			super.operador(valor, calculadoraView.getDisplay());
		} else {
			super.valor(valor, calculadoraView.getDisplay());
		}
	}
}
