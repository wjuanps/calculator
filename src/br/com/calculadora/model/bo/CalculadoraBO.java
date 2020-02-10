/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.calculadora.model.bo;

import br.com.calculadora.model.dao.Arquivo;
import br.com.calculadora.model.vo.Operador;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JTextField;

/**
 *
 * @author Sophia
 */
public abstract class CalculadoraBO {

	/**
     * 
     */
	protected String operacao = "";
	/**
     * 
     */
	private String operacoes = "";
	/**
     * 
     */
	private String atual = "";
	/**
     * 
     */
	protected boolean operando = false;
	/**
     *
     */
	private final List<Object> listValues = new ArrayList<>();
	/**
     *
     */
	private String value = "";

	/**
	 * 
	 * @param valores
	 * @param display
	 */
	private void negate(List<Object> valores, JTextField display) {
		try {
			if (valores.get(0).equals("-")) {
				if (!valores.get(1).equals("sqrt")
						&& !valores.get(1).equals("log")
						&& !valores.get(1).equals("(")) {
					final BigDecimal a = ((BigDecimal) valores.get(1)).negate();
					valores.set(0, a);
					valores.remove(1);
				}
			}

			int i = 0;
			for (Operador o : Operador.values()) {
				if (i == 7) {
					break;
				}
				for (int j = 0; j < valores.size(); j++) {
					if (valores.get(j).equals(o.value)) {
						if (!(valores.get(j + 1) instanceof BigDecimal)) {
							if (valores.get(j + 1).equals("-")) {
								if (!(valores.get(j + 2) instanceof BigDecimal)) {
									if (valores.get(j + 2).equals("(")) {
										BigDecimal a = ((BigDecimal) valores
												.get(j + 3)).negate();
										valores.set(j + 3, a);
										valores.remove(j + 1);
										continue;
									}
									continue;
								}
								// 5 * - 1
								BigDecimal a = ((BigDecimal) valores.get(j + 2))
										.negate();
								valores.set(j + 1, a);
								valores.remove(j + 2);

								continue;
							}

							if (valores.get(j + 1).equals("(")) {
								if (!(valores.get(j + 3) instanceof BigDecimal)) {
									if (valores.get(j + 4).equals("log")
											|| valores.get(j + 4)
													.equals("sqrt")) {
										BigDecimal a = (BigDecimal) valores
												.get(j + 2);
										BigDecimal b = (BigDecimal) valores
												.get(j + 3);

										valores.set(j + 3, a);
										valores.set(j + 2, b);
										continue;
									}
									continue;
								}

								BigDecimal a = ((BigDecimal) valores.get(j + 3))
										.negate();
								valores.set(j + 2, a);
								valores.remove(j + 3);
							}
						}
					}
				}
				i++;
			}
		} catch (Exception c) {
			c.printStackTrace();
			display.setText(String.valueOf(BigDecimal.ZERO));
		}
	}

	/**
	 * 
	 * @param valores
	 */
	private void logFatorial(List<Object> valores) {
		BigDecimal calc;
		int i = 0;

		try {
			while (true) {
				if (valores.get(i).equals("log")) {
					BigDecimal valor = (BigDecimal) valores.get(i + 1);
					if (i > 0 && valores.get(i - 1).equals("-")) {
						calc = new BigDecimal(Math.negateExact((long) Math
								.log10(valor.doubleValue())));

						valores.set(i - 1, calc);
						valores.remove(i);
						valores.remove(i);

						i = 0;
						continue;
					}

					calc = new BigDecimal(Math.log10(valor.doubleValue()));

					valores.set(i, calc);
					valores.remove(i + 1);

					i = 0;
					continue;
				}

				if (valores.get(i).equals("!")) {
					calc = new BigDecimal(
							fatorial((BigDecimal) valores.get(i - 1)));

					valores.set(i - 1, calc);
					valores.remove(i);
					i = 0;

					continue;
				}

				{
					i++;
				}

				if (i == valores.size()) {
					break;
				}
			}
		} catch (Exception o) {
			o.printStackTrace();
		}
	}

	/**
	 * 
	 * @param valores
	 */
	private void radiciacaoPotenciacao(List<Object> valores) {
		BigDecimal calc;
		int i = 0;

		try {
			while (true) {
				if (valores.get(i).equals("sqrt")) {
					if (i > 0 && valores.get(i - 1).equals("-")) {
						calc = ((BigDecimal) valores.get(i + 1)).negate();
						// - sqrt 25 * 3
						valores.set(i - 1, calc);
						valores.remove(i);
						valores.remove(i);

						i = 0;
						continue;
					}

					calc = new BigDecimal(Math.sqrt(((BigDecimal) valores
							.get(i + 1)).doubleValue()));

					valores.set(i, calc);
					valores.remove(i + 1);

					i = 0;
					continue;
				}

				if (valores.get(i).equals("^")) {
					calc = ((BigDecimal) valores.get(i - 1)).pow((int) valores
							.get(i + 1));

					valores.set(i - 1, calc);
					valores.remove(i);
					valores.remove(i);

					i = 0;
					continue;
				}

				i++;

				if (i == valores.size()) {
					break;
				}
			}
		} catch (Exception o) {
			o.printStackTrace();
		}
	}

	/**
	 * 
	 * @param valores
	 */
	private void multiplicacaoDivisao(List<Object> valores) {
		BigDecimal calc = BigDecimal.ZERO;
		int i = 0;

		try {
			while (true) {
				if (valores.get(i).equals("*")) {
					try {
						calc = multiplicar((BigDecimal) valores.get(i - 1),
								(BigDecimal) valores.get(i + 1));
					} catch (Exception c) {
						c.printStackTrace();
					}

					try {
						valores.set(i - 1, calc);
						valores.remove(i);
						valores.remove(i);
					} catch (Exception a) {
						a.printStackTrace();
					}

					i = 0;
					continue;
				}

				if (valores.get(i).equals("/")) {
					calc = dividir((BigDecimal) valores.get(i - 1),
							(BigDecimal) valores.get(i + 1));

					valores.set(i - 1, calc);
					valores.remove(i);
					valores.remove(i);

					i = 0;
					continue;
				}

				i++;

				if (i == valores.size()) {
					break;
				}
			}
		} catch (Exception o) {
			o.printStackTrace();
		}
	}

	/**
	 * 
	 * @param valores
	 */
	private void somaSubtracao(List<Object> valores) {
		BigDecimal calc;
		int i = 0;

		try {
			while (true) {
				if (valores.get(i).equals("+")) {
					calc = ((BigDecimal) valores.get(i - 1))
							.add((BigDecimal) valores.get(i + 1));//

					valores.set(i - 1, calc);
					valores.remove(i);
					valores.remove(i);

					i = 0;
					continue;
				}

				if (valores.get(i).equals("-")) {
					calc = subtrair((BigDecimal) valores.get(i - 1),
							(BigDecimal) valores.get(i + 1));

					valores.set(i - 1, calc);
					valores.remove(i);
					valores.remove(i);

					i = 0;
					continue;
				}

				i++;

				if (i == valores.size()) {
					break;
				}
			}
		} catch (Exception o) {
			o.printStackTrace();
		}
	}

	/**
	 * 
	 * @param valores
	 */
	private void eliminarParenteses(List<Object> valores, JTextField display) {

		List<Object> parenD = new ArrayList<>();
		List<Object> parenE = new ArrayList<>();

		for (Object o : valores) {
			if (o instanceof String) {
				if (o.toString().equals("(")) {
					parenE.add(o);
				} else if (o.toString().equals(")")) {
					parenD.add(o);
				}
			}
		}

		if (parenE.size() > parenD.size()) {
			int j = parenE.size() - parenD.size();
			for (int i = 0; i < j; i++) {
				valores.add(")");
				operacoes.concat("(");
			}
		}

		if (parenD.size() > parenE.size()) {
			int j = parenD.size() - parenE.size();
			for (int i = 0; i < j; i++) {
				valores.add(0, "(");
				operacoes = "(".concat(operacoes);
			}
		}

		int parE = -1;
		int parD = -1;

		List<Object> aux;

		while (true) {
			try {
				for (int i = 0; i < valores.size(); i++) {
					if (valores.get(i).equals("(")) {
						parE = i;
					}
					if (valores.get(i).equals(")")) {
						if ((i - 2) >= 0) {
							if (valores.get(i - 2).equals("sqrt")
									|| valores.get(i - 2).equals("log")) {
								if (i != valores.size() - 1) {
									valores.remove(i);
									continue;
								}
							}

							parD = i;
							break;
						}
					}
				}
			} catch (Exception a) {
				limparDisplay(display);
				a.printStackTrace();
				break;
			}

			if (parE == -1) {
				break;
			}

			if (parD != -1) {
				try {
					aux = valores.subList(parE + 1, parD);

					logFatorial(aux);
					radiciacaoPotenciacao(aux);
					multiplicacaoDivisao(aux);
					somaSubtracao(aux);

					valores.remove(parE);
					valores.remove(parE + 1);
				} catch (Exception i) {
					limparDisplay(display);
					i.printStackTrace();
					break;
				}
			} else {
				valores.add(")");
				break;
			}

			parE = -1;
		}
	}

	/**
	 *
	 * @param valores
	 * @param display
	 */
	public String calcular(JTextField display) {

		if (listValues.isEmpty()) {
			return "";
		}
		
		try {
			negate(listValues, display);
			porcentagem(listValues, display);
			eliminarParenteses(listValues, display);

			logFatorial(listValues);
			radiciacaoPotenciacao(listValues);
			multiplicacaoDivisao(listValues);
			somaSubtracao(listValues);

			BigDecimal a = (BigDecimal) listValues.get(0);
			int b = a.intValue();
			atual = (a.equals(new BigDecimal(b))) ? String.valueOf(b) : String
					.valueOf(a);

			display.setText(atual);

			Arquivo.salvarHistorico(operacoes.concat(" = ").concat(
					String.valueOf(listValues.get(0))));

			return atual;
		} catch (Exception o) {
			o.printStackTrace();
			limparDisplay(display);
		}
		return "";
	}

	/**
	 * 
	 * @param display
	 */
	public void porcentagem(List<Object> valores, JTextField display) {
		if (!value.isEmpty()) {
			listValues.add(new BigDecimal(value));
			value = "";
		}

		if (listValues.size() < 3) {
			return;
		}

		BigDecimal calc = BigDecimal.ZERO;

		for (int i = 0; i < valores.size(); i++) {
			try {
				if (valores.get(i) instanceof String) {
					if (valores.get(i).equals("%")) {
						if (!(valores.get(i - 2) instanceof String)) {
							break;
						}

						final String opendos = ",+,-,*,/,";
						if (opendos.contains((String) valores.get(i - 2))) {

							List<Object> aux = valores.subList(i - 3, i);

							final BigDecimal valor1 = (BigDecimal) aux.get(0);
							final BigDecimal valor2 = (BigDecimal) aux.get(2);

							calc = ((valor1.multiply(valor2))
									.divide(new BigDecimal(100)));

							valores.set(i, calc);
							valores.remove(i - 3);
							valores.remove(i - 3);
							valores.remove(i - 3);

							break;
						}
					}
				}
			} catch (Exception ai) {
				ai.printStackTrace();
				display.setText(String.valueOf(BigDecimal.ZERO));
			}
		}
	}

	/**
	 *
	 * @param valor
	 * @param display
	 */
	public void print(String valor, JTextField display) {
		operacoes = operacoes.concat(valor);
		display.setText(operacoes);
	}

	/**
	 *
	 * @param valor
	 * @param display
	 */
	public void operador(String valor, JTextField display) {
		final String string = ",sqrt,log,(,),-,%,";
		if (listValues.isEmpty() && value.isEmpty()) {
			if (!string.contains(valor)) {
				return;
			}
		}

		if (!value.isEmpty()) {
			try {
				listValues.add(new BigDecimal(value));
				value = "";
			} catch (Exception n) {
				n.printStackTrace();
				limparDisplay(display);
			}
		}

		if (!listValues.isEmpty()
				&& listValues.get(listValues.size() - 1).equals(valor)
				&& !valor.equals("(") && !valor.equals(")")) {
			return;
		}

		if (valor.equals("=") || valor.equals("\n")) {
			try {
				for (int i = 0; i < listValues.size(); i++) {
					final String per = ",log,sqrt,";
					if (listValues.get(i) instanceof String) {
						if (per.contains(listValues.get(i).toString())
								&& !operacoes.endsWith(")")
								&& (i + 2) == listValues.size()) {
							operacoes = operacoes.concat(")");
						}
					}
				}

				calcular(display);
			} catch (Exception o) {
				o.printStackTrace();
			}
			return;
		}
		
		listValues.add(valor);

		try {
			if (listValues.size() > 2) {
				if (listValues.get(listValues.size() - 3).equals("sqrt")
						|| listValues.get(listValues.size() - 3).equals("log")) {
					if (!valor.equals("sqrt") && !valor.equals("log")
							&& !valor.equals(")")) {
						valor = ")".concat(valor);
					}
				}
			}

			if (valor.equals("sqrt") || valor.equals("log")) {
				valor = valor.concat("(");
			}
		} catch (Exception a) {
			a.printStackTrace();
		}
		operando = true;
		print(valor, display);
	}

	/**
	 *
	 * @param valor
	 * @param display
	 */
	public void valor(String valor, JTextField display) {
		if (operando) {
			if (!value.isEmpty()) {
				listValues.add(new BigDecimal(value));
				value = "";
			}

			if (listValues.isEmpty()) {
				listValues.add(new BigDecimal(valor));
			} else {
				value = value.concat(valor);
			}
		} else {
			value = value.concat(valor);
		}
		operando = false;

		print(valor, display);
	}

	/**
	 *
	 * @param display
	 */
	public void limparDisplay(JTextField display) {
		operacao = "";
		operacoes = "";
		atual = "0";

		operando = false;

		value = "";

		listValues.removeAll(listValues);

		display.setText("0");
	}

	/**
	 * 
	 * @param display
	 */
	public void cortar(JTextField display) {
		if (!value.isEmpty()) {
			listValues.add(new BigDecimal(value));
			value = "";
		}

		try {
			if (listValues.size() == 1) {
				limparDisplay(display);
				return;
			} else {
				listValues.remove(listValues.size() - 1);
			}
		} catch (Exception a) {
			a.printStackTrace();
		}

		String aux = "";
		for (Object object : listValues) {
			aux = aux.concat(object.toString());
		}
		operacoes = (aux.isEmpty()) ? "0" : aux;
		display.setText(operacoes);
	}

	/**
	 *
	 * @param x
	 * @return
	 */
	public static int fatorial(BigDecimal x) {
		try {
			return (x.intValue() == 1) ? x.intValue() : x.intValue()
					* fatorial(x.subtract(new BigDecimal(1)));
		} catch (StackOverflowError s) {
			return 1;
		}
	}

	/**
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	private BigDecimal dividir(BigDecimal a, BigDecimal b) {
		BigDecimal divisao = BigDecimal.ZERO;
		try {
			divisao = a.divide(b);
		} catch (Exception ae) {
			try {
				divisao = new BigDecimal(new DecimalFormat(
						"0.00000000000000000").format(
						a.doubleValue() / b.doubleValue()).replace(',', '.'));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return divisao.stripTrailingZeros();
	}

	/**
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	private BigDecimal multiplicar(BigDecimal a, BigDecimal b) {
		return a.multiply(b);
	}

	/**
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	private BigDecimal subtrair(BigDecimal a, BigDecimal b) {
		return a.subtract(b);
	}

	/**
	 *
	 * @return
	 */
	public String visualizarHistorico() {
		return "(" + operacoes + ")";
	}

	/**
	 *
	 * @return
	 */
	public String getAtual() {
		return (this.atual.isEmpty()) ? "0" : this.atual;
	}
	
	public boolean isPossivelCalcular() {
		
		if (this.listValues.size() >= 3) {
			return true;
		}
		
		final String string = ",log,sqrt,!,%,";
		for (Object o : listValues) {
			if (string.contains(o.toString())) {
				return true;
			}
		}
		
		return false;
	}
	
	public void printResult(JTextField textField) {
		if (isPossivelCalcular()) {
			this.calcular(textField);
		}
	}
}
