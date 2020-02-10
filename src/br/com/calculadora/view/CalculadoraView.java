/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.calculadora.view;

import javax.swing.JButton;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JTextField;

/**
 *
 * @author Sophia
 */
public final class CalculadoraView extends javax.swing.JFrame {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    /**
     * Creates new form Gui
     */
    public CalculadoraView() {
        initComponents();
        hidePainelAvancado();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        display = new javax.swing.JTextField();
        btnLimpar = new javax.swing.JButton();
        btnVisualizar = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btnDividir = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btnMultiplicar = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btnMenos = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btnPonto = new javax.swing.JButton();
        btnMais = new javax.swing.JButton();
        btnIgual = new javax.swing.JButton();
        btnRaiz = new javax.swing.JButton();
        btnPot = new javax.swing.JButton();
        btnLog = new javax.swing.JButton();
        btnFat = new javax.swing.JButton();
        btnParE = new javax.swing.JButton();
        btnPorcentagem = new javax.swing.JButton();
        btnPi = new javax.swing.JButton();
        btnParD = new javax.swing.JButton();
        txtResultado = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmiHistorico = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jmiExcluirHistorico = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jmiPadrao = new javax.swing.JRadioButtonMenuItem();
        jmiAvancado = new javax.swing.JRadioButtonMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/br/com/calculadora/icons/ios7-calculator-outline.png")).getImage());
        setResizable(false);

        display.setEditable(false);
        display.setBackground(new java.awt.Color(204, 204, 204));
        display.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        display.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        display.setText("0");
        display.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 0));
        display.setMargin(new java.awt.Insets(2, 2, 2, 5));

        btnLimpar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnLimpar.setText("Limpar");
        btnLimpar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpar.setRequestFocusEnabled(false);

        btnVisualizar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnVisualizar.setText("Visualizar");
        btnVisualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVisualizar.setRequestFocusEnabled(false);

        btn8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn8.setText("8");
        btn8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn8.setRequestFocusEnabled(false);

        btn7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn7.setText("7");
        btn7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn7.setRequestFocusEnabled(false);

        btnDividir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnDividir.setText("/");
        btnDividir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDividir.setRequestFocusEnabled(false);

        btn9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn9.setText("9");
        btn9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn9.setRequestFocusEnabled(false);

        btn5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn5.setText("5");
        btn5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn5.setRequestFocusEnabled(false);

        btn4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn4.setText("4");
        btn4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn4.setRequestFocusEnabled(false);

        btnMultiplicar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnMultiplicar.setText("*");
        btnMultiplicar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMultiplicar.setRequestFocusEnabled(false);

        btn6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn6.setText("6");
        btn6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn6.setRequestFocusEnabled(false);

        btn2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn2.setText("2");
        btn2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn2.setRequestFocusEnabled(false);

        btn1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn1.setText("1");
        btn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn1.setRequestFocusEnabled(false);

        btnMenos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnMenos.setText("-");
        btnMenos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMenos.setRequestFocusEnabled(false);

        btn3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn3.setText("3");
        btn3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn3.setRequestFocusEnabled(false);

        btn0.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn0.setText("0");
        btn0.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn0.setRequestFocusEnabled(false);

        btnPonto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnPonto.setText(".");
        btnPonto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPonto.setRequestFocusEnabled(false);

        btnMais.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnMais.setText("+");
        btnMais.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMais.setRequestFocusEnabled(false);

        btnIgual.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnIgual.setText("=");
        btnIgual.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIgual.setRequestFocusEnabled(false);

        btnRaiz.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnRaiz.setText("sqrt");
        btnRaiz.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRaiz.setRequestFocusEnabled(false);

        btnPot.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnPot.setText("^");
        btnPot.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPot.setRequestFocusEnabled(false);

        btnLog.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnLog.setText("log");
        btnLog.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLog.setRequestFocusEnabled(false);

        btnFat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnFat.setText("!");
        btnFat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFat.setRequestFocusEnabled(false);

        btnParE.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnParE.setText("(");
        btnParE.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnParE.setRequestFocusEnabled(false);

        btnPorcentagem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnPorcentagem.setText("%");
        btnPorcentagem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPorcentagem.setRequestFocusEnabled(false);

        btnPi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnPi.setText("Pi");
        btnPi.setActionCommand(String.valueOf(Math.PI));
        btnPi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPi.setRequestFocusEnabled(false);

        btnParD.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnParD.setText(")");
        btnParD.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnParD.setRequestFocusEnabled(false);

        txtResultado.setEditable(false);
        txtResultado.setBackground(new java.awt.Color(204, 204, 204));
        txtResultado.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtResultado.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtResultado.setText("0");
        txtResultado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 0));
        txtResultado.setMargin(new java.awt.Insets(2, 5, 2, 5));

        jMenu1.setText("File");

        jmiHistorico.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        jmiHistorico.setText("Hist�rico");
        jMenu1.add(jmiHistorico);
        jMenu1.add(jSeparator1);

        jmiExcluirHistorico.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jmiExcluirHistorico.setText("Excluir Hist�trico");
        jMenu1.add(jmiExcluirHistorico);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Exibir");

        jmiPadrao.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        buttonGroup1.add(jmiPadrao);
        jmiPadrao.setSelected(true);
        jmiPadrao.setText("Padrão");
        jMenu2.add(jmiPadrao);

        jmiAvancado.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        buttonGroup1.add(jmiAvancado);
        jmiAvancado.setText("Avançada");
        jMenu2.add(jmiAvancado);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(display)
                    .addComponent(txtResultado)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(btnVisualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnPonto, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btnDividir, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btnMultiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btnMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btnMais, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(btnPot, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnRaiz, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnFat, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnLog, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(btnParE, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnParD, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnPi, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnPorcentagem, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(display, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVisualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDividir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMultiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPonto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMais, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRaiz, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPot, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLog, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFat, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnParD, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnParE, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPorcentagem, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPi, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    /**
     * 
     */
    public void hidePainelAvancado() {
        btnPot.setVisible(false);
        btnRaiz.setVisible(false);
        btnFat.setVisible(false);
        btnLog.setVisible(false);
        btnParE.setVisible(false);
        btnParD.setVisible(false);
        btnPi.setVisible(false);
        btnPorcentagem.setVisible(false);
        
        this.pack();
    }
    
    /**
     * 
     */
    public void showPainelAvancado() {
        btnPot.setVisible(true);
        btnRaiz.setVisible(true);
        btnFat.setVisible(true);
        btnLog.setVisible(true);
        btnParE.setVisible(true);
        btnParD.setVisible(true);
        btnPi.setVisible(true);
        btnPorcentagem.setVisible(true);
        
        this.pack();
    }
    
    public JButton getBtn0() {
        return btn0;
    }

    public JButton getBtn1() {
        return btn1;
    }

    public JButton getBtn2() {
        return btn2;
    }

    public JButton getBtn3() {
        return btn3;
    }

    public JButton getBtn4() {
        return btn4;
    }

    public JButton getBtn5() {
        return btn5;
    }

    public JButton getBtn6() {
        return btn6;
    }

    public JButton getBtn7() {
        return btn7;
    }

    public JButton getBtn8() {
        return btn8;
    }

    public JButton getBtn9() {
        return btn9;
    }

    public JButton getBtnDividir() {
        return btnDividir;
    }

    public JButton getBtnIgual() {
        return btnIgual;
    }

    public JButton getBtnMais() {
        return btnMais;
    }

    public JButton getBtnMenos() {
        return btnMenos;
    }

    public JButton getBtnMultiplicar() {
        return btnMultiplicar;
    }

    public JButton getBtnPonto() {
        return btnPonto;
    }

    public JButton getBtnLimpar() {
        return btnLimpar;
    }

    public JButton getBtnVisualizar() {
        return btnVisualizar;
    }

    public JTextField getDisplay() {
        return display;
    }

    public JButton getBtnFat() {
        return btnFat;
    }

    public JButton getBtnLog() {
        return btnLog;
    }

    public JButton getBtnPot() {
        return btnPot;
    }

    public JButton getBtnRaiz() {
        return btnRaiz;
    }

    public JButton getBtnParD() {
        return btnParD;
    }

    public JButton getBtnParE() {
        return btnParE;
    }

    public JButton getBtnPi() {
        return btnPi;
    }

    public JButton getBtnPorcentagem() {
        return btnPorcentagem;
    }

    public JRadioButtonMenuItem getJmiAvancado() {
        return jmiAvancado;
    }

    public JRadioButtonMenuItem getJmiPadrao() {
        return jmiPadrao;
    }

    public JMenuItem getJmiHistorico() {
        return jmiHistorico;
    }

    public JMenuItem getJmiExcluirHistorico() {
        return jmiExcluirHistorico;
    }

    public JTextField getTxtResultado() {
        return txtResultado;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnDividir;
    private javax.swing.JButton btnFat;
    private javax.swing.JButton btnIgual;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnLog;
    private javax.swing.JButton btnMais;
    private javax.swing.JButton btnMenos;
    private javax.swing.JButton btnMultiplicar;
    private javax.swing.JButton btnParD;
    private javax.swing.JButton btnParE;
    private javax.swing.JButton btnPi;
    private javax.swing.JButton btnPonto;
    private javax.swing.JButton btnPorcentagem;
    private javax.swing.JButton btnPot;
    private javax.swing.JButton btnRaiz;
    private javax.swing.JButton btnVisualizar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField display;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JRadioButtonMenuItem jmiAvancado;
    private javax.swing.JMenuItem jmiExcluirHistorico;
    private javax.swing.JMenuItem jmiHistorico;
    private javax.swing.JRadioButtonMenuItem jmiPadrao;
    private javax.swing.JTextField txtResultado;
    // End of variables declaration//GEN-END:variables
}