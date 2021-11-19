/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package higor.ui_senana8;

import javax.swing.UIManager;                         //
import javax.swing.UIManager.LookAndFeelInfo;         // Imports de Visual do programa
import javax.swing.UnsupportedLookAndFeelException;   //

/**
 *
 * @author Dsrty
 */
public class Calculadora extends javax.swing.JFrame {

    float in1, in2, in3;     //
    boolean PONTO = false;   // Variaveis

    Processador Calc = new Processador();  //Declaração de classe que faz o calculo

    /**
     * Creates new form Calculadora
     */
    public Calculadora() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        c = new javax.swing.JButton();
        sete = new javax.swing.JButton();
        dividir = new javax.swing.JButton();
        quatro = new javax.swing.JButton();
        cinco = new javax.swing.JButton();
        seis = new javax.swing.JButton();
        menos = new javax.swing.JButton();
        mais = new javax.swing.JButton();
        tres = new javax.swing.JButton();
        dois = new javax.swing.JButton();
        um = new javax.swing.JButton();
        zero = new javax.swing.JButton();
        ponto = new javax.swing.JButton();
        igual = new javax.swing.JButton();
        oito = new javax.swing.JButton();
        nove = new javax.swing.JButton();
        vezes = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        c.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        c.setText("C");
        c.setMaximumSize(new java.awt.Dimension(73, 23));
        c.setMinimumSize(new java.awt.Dimension(73, 23));
        c.setPreferredSize(new java.awt.Dimension(73, 23));
        c.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cMouseClicked(evt);
            }
        });

        sete.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        sete.setText("7");
        sete.setMaximumSize(new java.awt.Dimension(73, 23));
        sete.setMinimumSize(new java.awt.Dimension(73, 23));
        sete.setPreferredSize(new java.awt.Dimension(73, 23));
        sete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                seteMouseClicked(evt);
            }
        });

        dividir.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        dividir.setText("/");
        dividir.setMaximumSize(new java.awt.Dimension(73, 23));
        dividir.setMinimumSize(new java.awt.Dimension(73, 23));
        dividir.setPreferredSize(new java.awt.Dimension(73, 23));
        dividir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dividirMouseClicked(evt);
            }
        });

        quatro.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        quatro.setText("4");
        quatro.setMaximumSize(new java.awt.Dimension(73, 23));
        quatro.setMinimumSize(new java.awt.Dimension(73, 23));
        quatro.setPreferredSize(new java.awt.Dimension(73, 23));
        quatro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                quatroMouseClicked(evt);
            }
        });

        cinco.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        cinco.setText("5");
        cinco.setMaximumSize(new java.awt.Dimension(73, 23));
        cinco.setMinimumSize(new java.awt.Dimension(73, 23));
        cinco.setPreferredSize(new java.awt.Dimension(73, 23));
        cinco.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cincoMouseClicked(evt);
            }
        });

        seis.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        seis.setText("6");
        seis.setMaximumSize(new java.awt.Dimension(73, 23));
        seis.setMinimumSize(new java.awt.Dimension(73, 23));
        seis.setPreferredSize(new java.awt.Dimension(73, 23));
        seis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                seisMouseClicked(evt);
            }
        });

        menos.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        menos.setText("-");
        menos.setMaximumSize(new java.awt.Dimension(73, 23));
        menos.setMinimumSize(new java.awt.Dimension(73, 23));
        menos.setPreferredSize(new java.awt.Dimension(73, 23));
        menos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menosMouseClicked(evt);
            }
        });

        mais.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        mais.setText("+");
        mais.setMaximumSize(new java.awt.Dimension(73, 23));
        mais.setMinimumSize(new java.awt.Dimension(73, 23));
        mais.setPreferredSize(new java.awt.Dimension(73, 23));
        mais.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                maisMouseClicked(evt);
            }
        });

        tres.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        tres.setText("3");
        tres.setMaximumSize(new java.awt.Dimension(73, 23));
        tres.setMinimumSize(new java.awt.Dimension(73, 23));
        tres.setPreferredSize(new java.awt.Dimension(73, 23));
        tres.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tresMouseClicked(evt);
            }
        });

        dois.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        dois.setText("2");
        dois.setMaximumSize(new java.awt.Dimension(73, 23));
        dois.setMinimumSize(new java.awt.Dimension(73, 23));
        dois.setPreferredSize(new java.awt.Dimension(73, 23));
        dois.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                doisMouseClicked(evt);
            }
        });

        um.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        um.setText("1");
        um.setMaximumSize(new java.awt.Dimension(73, 23));
        um.setMinimumSize(new java.awt.Dimension(73, 23));
        um.setPreferredSize(new java.awt.Dimension(73, 23));
        um.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                umMouseClicked(evt);
            }
        });

        zero.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        zero.setText("0");
        zero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                zeroMouseClicked(evt);
            }
        });

        ponto.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        ponto.setText(".");
        ponto.setMaximumSize(new java.awt.Dimension(73, 23));
        ponto.setMinimumSize(new java.awt.Dimension(73, 23));
        ponto.setPreferredSize(new java.awt.Dimension(73, 23));
        ponto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pontoMouseClicked(evt);
            }
        });

        igual.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        igual.setText("=");
        igual.setMaximumSize(new java.awt.Dimension(73, 23));
        igual.setMinimumSize(new java.awt.Dimension(73, 23));
        igual.setPreferredSize(new java.awt.Dimension(73, 23));
        igual.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                igualMouseClicked(evt);
            }
        });

        oito.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        oito.setText("8");
        oito.setMaximumSize(new java.awt.Dimension(73, 23));
        oito.setMinimumSize(new java.awt.Dimension(73, 23));
        oito.setPreferredSize(new java.awt.Dimension(73, 23));
        oito.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                oitoMouseClicked(evt);
            }
        });

        nove.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        nove.setText("9");
        nove.setMaximumSize(new java.awt.Dimension(73, 23));
        nove.setMinimumSize(new java.awt.Dimension(73, 23));
        nove.setPreferredSize(new java.awt.Dimension(73, 23));
        nove.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                noveMouseClicked(evt);
            }
        });

        vezes.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        vezes.setText("X");
        vezes.setMaximumSize(new java.awt.Dimension(73, 23));
        vezes.setMinimumSize(new java.awt.Dimension(73, 23));
        vezes.setPreferredSize(new java.awt.Dimension(73, 23));
        vezes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vezesMouseClicked(evt);
            }
        });

        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(quatro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cinco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(seis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(menos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(sete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(oito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nove, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vezes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(zero, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ponto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(um, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dois, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(igual, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(c, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dividir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jTextField1)
            .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(c, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dividir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(vezes, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(sete, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(oito, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(nove, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(quatro, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cinco, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(seis, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(menos, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(um, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tres, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dois, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mais, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(zero, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ponto, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(igual, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void noveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_noveMouseClicked
        Calc.setSin(Calc.Stage, "9"); //Coloca string 9 no array de concatenação
        Calc.Stacker(); //Chama a função do concatenador
        jTextField3.setText(String.valueOf(Calc.Sin[0])); //mostra o string concatenado na tela de calculo
        System.out.println("9");               //
        System.out.println("OP:" + Calc.OP);   //imprime no console para fins de debug
    }//GEN-LAST:event_noveMouseClicked

    private void oitoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_oitoMouseClicked
        Calc.setSin(Calc.Stage, "8");  //Coloca string 9 no array de concatenação
        Calc.Stacker();   //Chama a função do concatenador
        jTextField3.setText(String.valueOf(Calc.Sin[0])); //mostra o string concatenado na tela de calculo
        System.out.println("8");               //
        System.out.println("OP:" + Calc.OP);   //imprime no console para fins de debug
    }//GEN-LAST:event_oitoMouseClicked

    private void igualMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_igualMouseClicked
        if (!Calc.IsNull()) { //checa se realmente há uma operação "engatilhada" , se sim:
            jTextField3.setText(String.valueOf(Calc.igual())); //chama função da calculadora na classe e ja mostra o resultado da operação na tela
            Calc.reset(); //função de resetar os numeros
            Calc.resetOP(); //reseta o estado de operação da calculadora
            Calc.PutNull(); //coloca null nas variaveis string
            jTextField1.setText(""); //limpa a tela de operações
            PONTO = false; //anula a flag do ponto decimal
            System.out.println("=");             //
            System.out.println("OP:" + Calc.OP); //printa no console para fins de debug
        }
    }//GEN-LAST:event_igualMouseClicked

    private void pontoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pontoMouseClicked
        // TODO add your handling code here:
        if (!PONTO) { //caso a flag de ponto seja falsa
            Calc.setSin(Calc.Stage, "."); //coloca ponto no array de concatenação
            Calc.Stacker(); //concatena
            jTextField3.setText(String.valueOf(Calc.Sin[0])); //mostra string concatenada na tela de operações
            PONTO = true; //seta flag do ponto decimal
            System.out.println("OP:" + Calc.OP); //printa no console para fins de debug
        }
    }//GEN-LAST:event_pontoMouseClicked

    private void zeroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_zeroMouseClicked
        Calc.setSin(Calc.Stage, "0");
        Calc.Stacker();
        jTextField3.setText(String.valueOf(Calc.Sin[0]));
        System.out.println("0");
        System.out.println("OP:" + Calc.OP);
    }//GEN-LAST:event_zeroMouseClicked

    private void umMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_umMouseClicked
        Calc.setSin(Calc.Stage, "1");
        Calc.Stacker();
        jTextField3.setText(String.valueOf(Calc.Sin[0]));
        System.out.println("1");
        System.out.println("OP:" + Calc.OP);
    }//GEN-LAST:event_umMouseClicked

    private void doisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_doisMouseClicked
        Calc.setSin(Calc.Stage, "2");
        Calc.Stacker();
        jTextField3.setText(String.valueOf(Calc.Sin[0]));
        System.out.println("2");
        System.out.println("OP:" + Calc.OP);
    }//GEN-LAST:event_doisMouseClicked

    private void tresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tresMouseClicked
        Calc.setSin(Calc.Stage, "3");
        Calc.Stacker();
        jTextField3.setText(String.valueOf(Calc.Sin[0]));
        System.out.println("3");
        System.out.println("OP:" + Calc.OP);
    }//GEN-LAST:event_tresMouseClicked

    private void maisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_maisMouseClicked
        if (!Calc.IsNull()) { //caso há uma operação em andamento...
            jTextField1.setText(String.valueOf(Calc.Sin[0] + "+")); //coloca + na tela
            jTextField3.setText(""); //zera tela de operações
            Calc.Adicao(); //chama funçaõ de adição da classe
            PONTO = false; //reseta flag do ponto decimal
            System.out.println("+");              //
            System.out.println("OP:" + Calc.OP);  //debug
        }
    }//GEN-LAST:event_maisMouseClicked

    private void seisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seisMouseClicked
        Calc.setSin(Calc.Stage, "6");
        Calc.Stacker();
        jTextField3.setText(String.valueOf(Calc.Sin[0]));
        System.out.println("6");
        System.out.println("OP:" + Calc.OP);
    }//GEN-LAST:event_seisMouseClicked

    private void cincoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cincoMouseClicked
        Calc.setSin(Calc.Stage, "5");
        Calc.Stacker();
        jTextField3.setText(String.valueOf(Calc.Sin[0]));
        System.out.println("5");
        System.out.println("OP:" + Calc.OP);
    }//GEN-LAST:event_cincoMouseClicked

    private void quatroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_quatroMouseClicked
        Calc.setSin(Calc.Stage, "4");
        Calc.Stacker();
        jTextField3.setText(String.valueOf(Calc.Sin[0]));
        System.out.println("4");
        System.out.println("OP:" + Calc.OP);
    }//GEN-LAST:event_quatroMouseClicked

    private void seteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seteMouseClicked
        Calc.setSin(Calc.Stage, "7");
        Calc.Stacker();
        jTextField3.setText(String.valueOf(Calc.Sin[0]));
        System.out.println("7");
        System.out.println("OP:" + Calc.OP);
    }//GEN-LAST:event_seteMouseClicked

    private void cMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cMouseClicked
        Calc.reset(); //reseta operações
        jTextField3.setText(""); //limpa as telas
        jTextField1.setText(""); //
        System.out.println("C");              //
        System.out.println("OP:" + Calc.OP);  //debug
    }//GEN-LAST:event_cMouseClicked

    private void menosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menosMouseClicked
        if (!Calc.IsNull()) { //caso haja uma operação em andamento...
            jTextField1.setText(String.valueOf(Calc.Sin[0] + "-")); //mostra - na tela
            jTextField3.setText(""); //zera tela de operações
            Calc.Subtracao(); //chama função de subtração da classe
            PONTO = false; //zera flag do ponto decimal
            System.out.println("-");             //
            System.out.println("OP:" + Calc.OP); //debug
        }
    }//GEN-LAST:event_menosMouseClicked

    private void vezesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vezesMouseClicked
        if (!Calc.IsNull()) { //caso haja uma operação em andamento...
            jTextField1.setText(String.valueOf(Calc.Sin[0] + "X")); //mostra x na tela
            jTextField3.setText(""); //zera tela de operações
            Calc.Multiplicacao(); //chama função de multiplicação da classe
            PONTO = false; //zera flag do ponto decimal
            System.out.println("x");              //
            System.out.println("OP:" + Calc.OP);  //debug
        }
    }//GEN-LAST:event_vezesMouseClicked

    private void dividirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dividirMouseClicked
        if (!Calc.IsNull()) { //caso haja uma operação em andamento...
            jTextField1.setText(String.valueOf(Calc.Sin[0] + "/")); //mostra / na tela
            jTextField3.setText(""); //zera tela de operações
            Calc.Divisao(); //chama função de multiplicação da classe
            PONTO = false; //zera flag do ponto decimal
            System.out.println("/");              //
            System.out.println("OP:" + Calc.OP);  //debug
        }
    }//GEN-LAST:event_dividirMouseClicked

    /**
     * @-am args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */

        try {                                                                                                       //
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {   //
                if ("Nimbus".equals(info.getName())) {                                                              //
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());                                      // Seta o import do look and feel para o swing
                    break;                                                                                          //
                }                                                                                                   //
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        try {                                                                                                      //
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");                        //
        } catch (UnsupportedLookAndFeelException e) {                                                              //
            // handle exception                                                                                    // Força o visual do windows 10 no GUI ao invez do visual feio padrão do Swing
        } catch (ClassNotFoundException e) {                                                                       //
            // handle exception                                                                                    //
        } catch (InstantiationException e) {                                                                       //
            // handle exception
        } catch (IllegalAccessException e) {
            // handle exception
        }//"com.sun.java.swing.plaf.windows.WindowsLookAndFeel"

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton c;
    private javax.swing.JButton cinco;
    private javax.swing.JButton dividir;
    private javax.swing.JButton dois;
    private javax.swing.JButton igual;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JButton mais;
    private javax.swing.JButton menos;
    private javax.swing.JButton nove;
    private javax.swing.JButton oito;
    private javax.swing.JButton ponto;
    private javax.swing.JButton quatro;
    private javax.swing.JButton seis;
    private javax.swing.JButton sete;
    private javax.swing.JButton tres;
    private javax.swing.JButton um;
    private javax.swing.JButton vezes;
    private javax.swing.JButton zero;
    // End of variables declaration//GEN-END:variables
}