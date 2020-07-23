
package calculadoraapp;

import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author aavls
 */
public class CalculadoraApp extends javax.swing.JFrame {

    ScriptEngineManager sem = new ScriptEngineManager();
    ScriptEngine se = sem.getEngineByName("JavaScript");
    
    public CalculadoraApp() {
        initComponents();
        setLocationRelativeTo (null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        JPanelBG = new javax.swing.JPanel();
        txtOperacao = new javax.swing.JLabel();
        txtResultado = new javax.swing.JLabel();
        jButtonMultiplicar = new javax.swing.JButton();
        jButton0 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButtonDeletar = new javax.swing.JButton();
        jButtonPorcentagem = new javax.swing.JButton();
        jButtonDividir = new javax.swing.JButton();
        jButtonSomar = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButtonSubtrair = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButtonPonto = new javax.swing.JButton();
        jButtonTotalizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        JPanelBG.setBackground(new java.awt.Color(255, 255, 255));
        JPanelBG.setMinimumSize(new java.awt.Dimension(3, 596));
        JPanelBG.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtOperacao.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtOperacao.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtOperacao.setText(" ");
        JPanelBG.add(txtOperacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 76, 320, -1));

        txtResultado.setFont(new java.awt.Font("Roboto", 1, 40)); // NOI18N
        txtResultado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        JPanelBG.add(txtResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 104, 320, 57));

        jButtonMultiplicar.setBackground(new java.awt.Color(255, 255, 255));
        jButtonMultiplicar.setFont(new java.awt.Font("Roboto", 0, 36)); // NOI18N
        jButtonMultiplicar.setForeground(new java.awt.Color(146, 118, 240));
        jButtonMultiplicar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnDefault.png"))); // NOI18N
        jButtonMultiplicar.setText("x");
        jButtonMultiplicar.setBorder(null);
        jButtonMultiplicar.setBorderPainted(false);
        jButtonMultiplicar.setFocusPainted(false);
        jButtonMultiplicar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonMultiplicar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnHover.png"))); // NOI18N
        jButtonMultiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMultiplicarActionPerformed(evt);
            }
        });
        JPanelBG.add(jButtonMultiplicar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 275, 66, 66));

        jButton0.setBackground(new java.awt.Color(255, 255, 255));
        jButton0.setFont(new java.awt.Font("Roboto", 0, 36)); // NOI18N
        jButton0.setForeground(new java.awt.Color(27, 27, 29));
        jButton0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnDefault3.png"))); // NOI18N
        jButton0.setText("0");
        jButton0.setBorder(null);
        jButton0.setBorderPainted(false);
        jButton0.setFocusPainted(false);
        jButton0.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton0.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnHover3.png"))); // NOI18N
        jButton0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton0ActionPerformed(evt);
            }
        });
        JPanelBG.add(jButton0, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, 146, 66));

        jButton8.setBackground(new java.awt.Color(255, 255, 255));
        jButton8.setFont(new java.awt.Font("Roboto", 0, 36)); // NOI18N
        jButton8.setForeground(new java.awt.Color(27, 27, 29));
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnDefault2.png"))); // NOI18N
        jButton8.setText("8");
        jButton8.setBorder(null);
        jButton8.setBorderPainted(false);
        jButton8.setFocusPainted(false);
        jButton8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton8.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnHover2.png"))); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        JPanelBG.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 275, 66, 66));

        jButton9.setBackground(new java.awt.Color(255, 255, 255));
        jButton9.setFont(new java.awt.Font("Roboto", 0, 36)); // NOI18N
        jButton9.setForeground(new java.awt.Color(27, 27, 29));
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnDefault2.png"))); // NOI18N
        jButton9.setText("9");
        jButton9.setBorder(null);
        jButton9.setBorderPainted(false);
        jButton9.setFocusPainted(false);
        jButton9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton9.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnHover2.png"))); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        JPanelBG.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 275, 66, 66));

        jButton7.setBackground(new java.awt.Color(255, 255, 255));
        jButton7.setFont(new java.awt.Font("Roboto", 0, 36)); // NOI18N
        jButton7.setForeground(new java.awt.Color(27, 27, 29));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnDefault2.png"))); // NOI18N
        jButton7.setText("7");
        jButton7.setBorder(null);
        jButton7.setBorderPainted(false);
        jButton7.setFocusPainted(false);
        jButton7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnHover2.png"))); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        JPanelBG.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 275, 66, 66));

        jButtonCancelar.setBackground(new java.awt.Color(255, 255, 255));
        jButtonCancelar.setFont(new java.awt.Font("Roboto", 1, 26)); // NOI18N
        jButtonCancelar.setForeground(new java.awt.Color(146, 118, 240));
        jButtonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnDefault.png"))); // NOI18N
        jButtonCancelar.setText("C");
        jButtonCancelar.setBorder(null);
        jButtonCancelar.setBorderPainted(false);
        jButtonCancelar.setFocusPainted(false);
        jButtonCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonCancelar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnHover.png"))); // NOI18N
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });
        JPanelBG.add(jButtonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 66, 66));

        jButtonDeletar.setBackground(new java.awt.Color(255, 255, 255));
        jButtonDeletar.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jButtonDeletar.setForeground(new java.awt.Color(146, 118, 240));
        jButtonDeletar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnDefault.png"))); // NOI18N
        jButtonDeletar.setText("Del");
        jButtonDeletar.setBorder(null);
        jButtonDeletar.setBorderPainted(false);
        jButtonDeletar.setFocusPainted(false);
        jButtonDeletar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonDeletar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnHover.png"))); // NOI18N
        jButtonDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeletarActionPerformed(evt);
            }
        });
        JPanelBG.add(jButtonDeletar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 66, 66));

        jButtonPorcentagem.setBackground(new java.awt.Color(255, 255, 255));
        jButtonPorcentagem.setFont(new java.awt.Font("Roboto", 1, 28)); // NOI18N
        jButtonPorcentagem.setForeground(new java.awt.Color(146, 118, 240));
        jButtonPorcentagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnDefault.png"))); // NOI18N
        jButtonPorcentagem.setText("%");
        jButtonPorcentagem.setBorder(null);
        jButtonPorcentagem.setBorderPainted(false);
        jButtonPorcentagem.setFocusPainted(false);
        jButtonPorcentagem.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonPorcentagem.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnHover.png"))); // NOI18N
        jButtonPorcentagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPorcentagemActionPerformed(evt);
            }
        });
        JPanelBG.add(jButtonPorcentagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 66, 66));

        jButtonDividir.setBackground(new java.awt.Color(255, 255, 255));
        jButtonDividir.setFont(new java.awt.Font("Roboto", 0, 36)); // NOI18N
        jButtonDividir.setForeground(new java.awt.Color(146, 118, 240));
        jButtonDividir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnDefault.png"))); // NOI18N
        jButtonDividir.setText("÷");
        jButtonDividir.setBorder(null);
        jButtonDividir.setBorderPainted(false);
        jButtonDividir.setFocusPainted(false);
        jButtonDividir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonDividir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnHover.png"))); // NOI18N
        jButtonDividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDividirActionPerformed(evt);
            }
        });
        JPanelBG.add(jButtonDividir, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, 66, 66));

        jButtonSomar.setBackground(new java.awt.Color(255, 255, 255));
        jButtonSomar.setFont(new java.awt.Font("Roboto", 0, 36)); // NOI18N
        jButtonSomar.setForeground(new java.awt.Color(146, 118, 240));
        jButtonSomar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnDefault.png"))); // NOI18N
        jButtonSomar.setText("+");
        jButtonSomar.setBorder(null);
        jButtonSomar.setBorderPainted(false);
        jButtonSomar.setFocusPainted(false);
        jButtonSomar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonSomar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnHover.png"))); // NOI18N
        jButtonSomar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSomarActionPerformed(evt);
            }
        });
        JPanelBG.add(jButtonSomar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 360, 66, 66));

        jButton6.setBackground(new java.awt.Color(255, 255, 255));
        jButton6.setFont(new java.awt.Font("Roboto", 0, 36)); // NOI18N
        jButton6.setForeground(new java.awt.Color(27, 27, 29));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnDefault2.png"))); // NOI18N
        jButton6.setText("6");
        jButton6.setBorder(null);
        jButton6.setBorderPainted(false);
        jButton6.setFocusPainted(false);
        jButton6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnHover2.png"))); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        JPanelBG.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 360, 66, 66));

        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.setFont(new java.awt.Font("Roboto", 0, 36)); // NOI18N
        jButton5.setForeground(new java.awt.Color(27, 27, 29));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnDefault2.png"))); // NOI18N
        jButton5.setText("5");
        jButton5.setBorder(null);
        jButton5.setBorderPainted(false);
        jButton5.setFocusPainted(false);
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnHover2.png"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        JPanelBG.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 360, 66, 66));

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setFont(new java.awt.Font("Roboto", 0, 36)); // NOI18N
        jButton4.setForeground(new java.awt.Color(27, 27, 29));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnDefault2.png"))); // NOI18N
        jButton4.setText("4");
        jButton4.setBorder(null);
        jButton4.setBorderPainted(false);
        jButton4.setFocusPainted(false);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnHover2.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        JPanelBG.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 66, 66));

        jButtonSubtrair.setBackground(new java.awt.Color(255, 255, 255));
        jButtonSubtrair.setFont(new java.awt.Font("Roboto", 0, 48)); // NOI18N
        jButtonSubtrair.setForeground(new java.awt.Color(146, 118, 240));
        jButtonSubtrair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnDefault.png"))); // NOI18N
        jButtonSubtrair.setText("-");
        jButtonSubtrair.setBorder(null);
        jButtonSubtrair.setBorderPainted(false);
        jButtonSubtrair.setFocusPainted(false);
        jButtonSubtrair.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonSubtrair.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnHover.png"))); // NOI18N
        jButtonSubtrair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSubtrairActionPerformed(evt);
            }
        });
        JPanelBG.add(jButtonSubtrair, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 445, 66, 66));

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Roboto", 0, 36)); // NOI18N
        jButton3.setForeground(new java.awt.Color(27, 27, 29));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnDefault2.png"))); // NOI18N
        jButton3.setText("3");
        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.setFocusPainted(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnHover2.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        JPanelBG.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 445, 66, 66));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Roboto", 0, 36)); // NOI18N
        jButton2.setForeground(new java.awt.Color(27, 27, 29));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnDefault2.png"))); // NOI18N
        jButton2.setText("2");
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setFocusPainted(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnHover2.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        JPanelBG.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 445, 66, 66));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Roboto", 0, 36)); // NOI18N
        jButton1.setForeground(new java.awt.Color(27, 27, 29));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnDefault2.png"))); // NOI18N
        jButton1.setText("1");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setFocusPainted(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnHover2.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        JPanelBG.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 445, 66, 66));

        jButtonPonto.setBackground(new java.awt.Color(255, 255, 255));
        jButtonPonto.setFont(new java.awt.Font("Roboto", 0, 36)); // NOI18N
        jButtonPonto.setForeground(new java.awt.Color(27, 27, 29));
        jButtonPonto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnDefault2.png"))); // NOI18N
        jButtonPonto.setText(".");
        jButtonPonto.setBorder(null);
        jButtonPonto.setBorderPainted(false);
        jButtonPonto.setFocusPainted(false);
        jButtonPonto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonPonto.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnHover2.png"))); // NOI18N
        jButtonPonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPontoActionPerformed(evt);
            }
        });
        JPanelBG.add(jButtonPonto, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 530, 66, 66));

        jButtonTotalizar.setBackground(new java.awt.Color(255, 255, 255));
        jButtonTotalizar.setFont(new java.awt.Font("Roboto", 0, 36)); // NOI18N
        jButtonTotalizar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonTotalizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnBGRoxo.png"))); // NOI18N
        jButtonTotalizar.setText("=");
        jButtonTotalizar.setBorder(null);
        jButtonTotalizar.setBorderPainted(false);
        jButtonTotalizar.setFocusPainted(false);
        jButtonTotalizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonTotalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTotalizarActionPerformed(evt);
            }
        });
        JPanelBG.add(jButtonTotalizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 530, 66, 66));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(JPanelBG, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(JPanelBG, javax.swing.GroupLayout.DEFAULT_SIZE, 628, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonTotalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTotalizarActionPerformed
        try {
            String resultado = se.eval(txtOperacao.getText()).toString();
            txtResultado.setText(resultado);

        } catch (ScriptException ex) {
            //txtOperacao.setText("ERRO");
        }

    }//GEN-LAST:event_jButtonTotalizarActionPerformed

    private void jButtonPontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPontoActionPerformed
        addNumber(".");
    }//GEN-LAST:event_jButtonPontoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        addNumber("1");
        jButtonTotalizar.doClick();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        addNumber("2");
        jButtonTotalizar.doClick();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        addNumber("3");
        jButtonTotalizar.doClick();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButtonSubtrairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSubtrairActionPerformed
        addNumber("-");
    }//GEN-LAST:event_jButtonSubtrairActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        addNumber("4");
        jButtonTotalizar.doClick();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        addNumber("5");
        jButtonTotalizar.doClick();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        addNumber("6");
        jButtonTotalizar.doClick();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButtonSomarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSomarActionPerformed
        addNumber("+");
    }//GEN-LAST:event_jButtonSomarActionPerformed

    private void jButtonDividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDividirActionPerformed
        addNumber("/");
    }//GEN-LAST:event_jButtonDividirActionPerformed

    private void jButtonPorcentagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPorcentagemActionPerformed
        addNumber("%");
    }//GEN-LAST:event_jButtonPorcentagemActionPerformed

    private void jButtonDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeletarActionPerformed
        String texto = txtOperacao.getText() .substring(0,txtOperacao.getText().length()-1);
        txtOperacao.setText(texto);
        jButtonTotalizar.doClick();
    }//GEN-LAST:event_jButtonDeletarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        txtOperacao.setText("");
        txtResultado.setText("");
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        addNumber("7");
        jButtonTotalizar.doClick();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        addNumber("9");
        jButtonTotalizar.doClick();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        addNumber("8");
        jButtonTotalizar.doClick();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton0ActionPerformed
        addNumber("0");
        jButtonTotalizar.doClick();
    }//GEN-LAST:event_jButton0ActionPerformed

    private void jButtonMultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMultiplicarActionPerformed
        addNumber("*");
    }//GEN-LAST:event_jButtonMultiplicarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CalculadoraApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculadoraApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculadoraApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculadoraApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculadoraApp().setVisible(true);
            }
        });
    }
    
    
    public void hoverColor0 (JButton btn) {
        btn.setIcon(new ImageIcon(getClass().getResource("/img/btnDark3.png")));
        btn.setRolloverIcon(new ImageIcon(getClass().getResource("/img/btnDarkHover3.png")));
        btn.setForeground(Color.decode("#ffffff"));
        
    }
    
    public void hoverColor1 (JButton btn) {
        btn.setIcon(new ImageIcon(getClass().getResource("/img/btnDark1.png")));
        btn.setRolloverIcon(new ImageIcon(getClass().getResource("/img/btnDarkHover1.png")));
        
    }
    
    public void hoverColor2 (JButton btn) {
        btn.setIcon(new ImageIcon(getClass().getResource("/img/btnDark2.png")));
        btn.setRolloverIcon(new ImageIcon(getClass().getResource("/img/btnDarkHover2.png")));
        btn.setForeground(Color.decode("#ffffff"));
        
    }
    
    public void addNumber(String digito) {
        txtOperacao.setText(txtOperacao.getText()+digito);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPanelBG;
    private javax.swing.JButton jButton0;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonDeletar;
    private javax.swing.JButton jButtonDividir;
    private javax.swing.JButton jButtonMultiplicar;
    private javax.swing.JButton jButtonPonto;
    private javax.swing.JButton jButtonPorcentagem;
    private javax.swing.JButton jButtonSomar;
    private javax.swing.JButton jButtonSubtrair;
    private javax.swing.JButton jButtonTotalizar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel txtOperacao;
    private javax.swing.JLabel txtResultado;
    // End of variables declaration//GEN-END:variables

    private static class Excepion {

        public Excepion() {
        }
    }
}
