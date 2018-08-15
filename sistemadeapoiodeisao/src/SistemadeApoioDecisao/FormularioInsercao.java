package SistemadeApoioDecisao;

import java.sql.*;
import javax.swing.*;

public class FormularioInsercao extends javax.swing.JFrame {

    NewClass obj = new NewClass();

    private float enxofre;
    private float boro;
    private float cloro;
    private float molibdenio;
    private float k2o;
    private float manganes;
    private float magnesio;
    private float fosforo;
    private float calcio;
    private float ferro;
    private float nitrogenio;
    private float potassio;
    private float aluminio;
    private float cobre;
    private float zinco;
    private float pentoxidodefosforo;
    private String SQL;
    private int x;

    public FormularioInsercao() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        GrupoBotao = new javax.swing.ButtonGroup();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jTextField16 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jTextField18 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Formulário de Resultados");

        jButton1.setText("Confirmar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("P");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Ca");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Fe");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("N");

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("S");

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Mg");

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("B");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });

        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });

        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });

        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Mn");

        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Mo");

        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });

        jTextField12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField12ActionPerformed(evt);
            }
        });

        jTextField13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField13ActionPerformed(evt);
            }
        });

        jTextField14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField14ActionPerformed(evt);
            }
        });

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("K mg ");

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Al");

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Zn");

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Cu");

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("P2O5");

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("K2O");

        jTextField16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField16ActionPerformed(evt);
            }
        });

        jTextField17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField17ActionPerformed(evt);
            }
        });

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Cl");

        jTextField18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField18ActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("FORMULÁRIO DE RESULTADOS");

        GrupoBotao.add(jRadioButton1);
        jRadioButton1.setText("Soja");

        GrupoBotao.add(jRadioButton2);
        jRadioButton2.setText("Arroz");

        GrupoBotao.add(jRadioButton3);
        jRadioButton3.setText("Milho");

        GrupoBotao.add(jRadioButton4);
        jRadioButton4.setText("Batata");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField9, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                    .addComponent(jTextField8, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                    .addComponent(jTextField10, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                    .addComponent(jTextField16, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(170, 170, 170)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField6, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jTextField17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)))
                        .addGap(172, 172, 172))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                        .addComponent(jTextField14)
                        .addComponent(jTextField13)
                        .addComponent(jTextField12)
                        .addComponent(jTextField11))
                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(281, 281, 281)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jRadioButton1)
                        .addGap(98, 98, 98)
                        .addComponent(jRadioButton2)
                        .addGap(132, 132, 132)
                        .addComponent(jRadioButton3)
                        .addGap(108, 108, 108)
                        .addComponent(jRadioButton4)))
                .addGap(87, 87, 87))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel6))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(19, 19, 19)
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(31, 31, 31)
                                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(13, 13, 13)
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(12, 12, 12)
                                .addComponent(jLabel18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel16))
                        .addGap(15, 15, 15)
                        .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel17))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel9))
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton3)
                    .addComponent(jRadioButton4))
                .addGap(23, 23, 23)
                .addComponent(jButton1)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        enxofre = Float.parseFloat(jTextField5.getText());
        boro = Float.parseFloat(jTextField7.getText());
        cloro = Float.parseFloat(jTextField8.getText());
        molibdenio = Float.parseFloat(jTextField9.getText());
        k2o = Float.parseFloat(jTextField10.getText());
        manganes = Float.parseFloat(jTextField16.getText());
        magnesio = Float.parseFloat(jTextField1.getText());
        fosforo = Float.parseFloat(jTextField4.getText());
        calcio = Float.parseFloat(jTextField2.getText());
        ferro = Float.parseFloat(jTextField6.getText());
        nitrogenio = Float.parseFloat(jTextField17.getText());
        potassio = Float.parseFloat(jTextField11.getText());
        aluminio = Float.parseFloat(jTextField12.getText());
        cobre = Float.parseFloat(jTextField13.getText());
        zinco = Float.parseFloat(jTextField14.getText());
        pentoxidodefosforo = Float.parseFloat(jTextField18.getText());

        InsertMineral mineralUm = new InsertMineral();
        mineralUm.setFosforo(fosforo);
        mineralUm.setPotassio(potassio);
        mineralUm.setAluminio(aluminio);
        mineralUm.setBoro(boro);
        mineralUm.setCalcio(calcio);
        mineralUm.setCobre(cobre);
        mineralUm.setEnxofre(enxofre);
        mineralUm.setFerro(ferro);
        mineralUm.setK2O(k2o);
        mineralUm.setMagnesio(magnesio);
        mineralUm.setManganes(manganes);
        mineralUm.setMolibdenio(molibdenio);
        mineralUm.setNitrogenio(nitrogenio);
        mineralUm.setPentoxidodefosforo(pentoxidodefosforo);
        mineralUm.setZinco(zinco);
        mineralUm.setCloro(cloro);

        BD conexaoUm = new BD();

        Object[] options = {"Sim", "Não"};
        if (jRadioButton1.isSelected()) {
            SQL = "select Ferro, Magnesio, Nitrogenio, Enxofre, P2O5, "
                    + "K2O, Calcio, Boro, Cloro, Molibdenio, Cobre, Manganes, "
                    + "Zinco, Aluminio, Potassio,Fosforo from Mineral "
                    + "where Name_Plant = 'Soja'";
            try {
                conexaoUm.connect();
                try (ResultSet rset = conexaoUm.getStatement().executeQuery(SQL)) {

                    while (rset.next()) {

                        if ((rset.getFloat(1) <= (ferro)) && (rset.getFloat(2) <= (magnesio))
                                && (rset.getFloat(3) <= (nitrogenio)) && (rset.getFloat(4)
                                <= (enxofre)) && (rset.getFloat(5) <= (pentoxidodefosforo))
                                && (rset.getFloat(6) <= (k2o)) && (rset.getFloat(7) <= (calcio))
                                && (rset.getFloat(8) <= (boro)) && (rset.getFloat(9) <= (cloro))
                                && (rset.getFloat(10) <= (molibdenio)) && (rset.getFloat(11) <= (cobre))
                                && (rset.getFloat(12) <= (manganes)) && (rset.getFloat(13) <= (zinco))
                                && (rset.getFloat(14) <= (aluminio))
                                && (rset.getFloat(15) <= (potassio)) && (rset.getFloat(16) <= (fosforo))) {
                            JOptionPane.showMessageDialog(null, "\nQuantidade perfeita para cultura ");

                        } else {
                            x = JOptionPane.showOptionDialog(null, "Valor Abaixo\nDeseja mais informações sobre correção?",
                                    "RESULTADO", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);
                            if (x == 0) {

                                //Esse é meu teste do showOptionDialog
                                JOptionPane.showMessageDialog(null, "É necessario ter no minimo\n"
                                        + "Ferro: " + (rset.getFloat(1) - ferro)
                                        + "\nMagnesio: " + (rset.getFloat(2) - magnesio)
                                        + "\nNitrogenio: " + (rset.getFloat(3) - nitrogenio)
                                        + "\nEnxofre: " + (rset.getFloat(4) - enxofre)
                                        + "\nPentoxidodefosforo: " + (rset.getFloat(5) - pentoxidodefosforo)
                                        + "\nk2o: " + (rset.getFloat(6) - k2o)
                                        + "\nCalcio: " + (rset.getFloat(7) - calcio)
                                        + "\nBoro: " + (rset.getFloat(8) - boro)
                                        + "\nCloro: " + (rset.getFloat(9) - cloro)
                                        + "\nMolibdenio: " + (rset.getFloat(10) - molibdenio)
                                        + "\nCobre: " + (rset.getFloat(11) - cobre)
                                        + "\nManganes: " + (rset.getFloat(12) - manganes)
                                        + "\nZinco: " + (rset.getFloat(13) - zinco)
                                        + "\nAluminio: " + (rset.getFloat(14) - aluminio)
                                        + "\nPotassio: " + (rset.getFloat(15) - potassio)
                                        + "\nFosforo: " + (rset.getFloat(16) - fosforo));

                                if (potassio < rset.getFloat("Potassio")) {
                                    obj.TextoPotassio();
                                } else if () {

                                }
                            }
                        }
                    }
                    conexaoUm.closeconnect();
                } catch (SQLException e) {
                }
            } catch (Exception err) {
            }
        }

        if (jRadioButton2.isSelected()) {
            SQL = "select Ferro, Magnesio, Nitrogenio, Enxofre, P2O5, "
                    + "K2O, Calcio, Boro, Cloro, Molibdenio, Cobre, Manganes, "
                    + "Zinco, Aluminio, Potassio,Fosforo from Mineral "
                    + "where Name_Plant = 'Arroz'";
            try {
                conexaoUm.connect();
                try (ResultSet rset = conexaoUm.getStatement().executeQuery(SQL)) {
                    while (rset.next()) {

                        if ((rset.getFloat(1) <= (ferro)) && (rset.getFloat(2) <= (magnesio))
                                && (rset.getFloat(3) <= (nitrogenio)) && (rset.getFloat(4)
                                <= (enxofre)) && (rset.getFloat(5) <= (pentoxidodefosforo))
                                && (rset.getFloat(6) <= (k2o)) && (rset.getFloat(7) <= (calcio))
                                && (rset.getFloat(8) <= (boro)) && (rset.getFloat(9) <= (cloro))
                                && (rset.getFloat(10) <= (molibdenio)) && (rset.getFloat(11) <= (cobre))
                                && (rset.getFloat(12) <= (manganes)) && (rset.getFloat(13) <= (zinco))
                                && (rset.getFloat(14) <= (aluminio))
                                && (rset.getFloat(15) <= (potassio)) && (rset.getFloat(16) <= (fosforo))) {
                            JOptionPane.showMessageDialog(null, "\nQuantidade perfeita para cultura ");
                        } else {
                            x = JOptionPane.showOptionDialog(null, "Valor Abaixo\nDeseja mais informações sobre correção?", "RESULTADO", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);
                        }

                        if (x == 0) {

                            //Esse é meu teste do showOptionDialog
                            JOptionPane.showMessageDialog(null, "É necessario ter no minimo\n"
                                    + "Ferro: " + (rset.getFloat(1) - ferro)
                                    + "\nMagnesio: " + (rset.getFloat(2) - magnesio)
                                    + "\nNitrogenio: " + (rset.getFloat(3) - nitrogenio)
                                    + "\nEnxofre: " + (rset.getFloat(4) - enxofre)
                                    + "\nPentoxidodefosforo: " + (rset.getFloat(5) - pentoxidodefosforo)
                                    + "\nk2o: " + (rset.getFloat(6) - k2o)
                                    + "\nCalcio: " + (rset.getFloat(7) - calcio)
                                    + "\nBoro: " + (rset.getFloat(8) - boro)
                                    + "\nCloro: " + (rset.getFloat(9) - cloro)
                                    + "\nMolibdenio: " + (rset.getFloat(10) - molibdenio)
                                    + "\nCobre: " + (rset.getFloat(11) - cobre)
                                    + "\nManganes: " + (rset.getFloat(12) - manganes)
                                    + "\nZinco: " + (rset.getFloat(13) - zinco)
                                    + "\nAluminio: " + (rset.getFloat(14) - aluminio)
                                    + "\nPotassio: " + (rset.getFloat(15) - potassio)
                                    + "\nFosforo: " + (rset.getFloat(16) - fosforo));
                        }
                    }
                    conexaoUm.closeconnect();
                } catch (SQLException e) {
                }
            } catch (Exception err) {
            }
        }

        if (jRadioButton3.isSelected()) {
            SQL = "select Ferro, Magnesio, Nitrogenio, Enxofre, P2O5, "
                    + "K2O, Calcio, Boro, Cloro, Molibdenio, Cobre, Manganes, "
                    + "Zinco, Aluminio, Potassio,Fosforo from Mineral "
                    + "where Name_Plant = 'Milho'";
            try {
                conexaoUm.connect();
                try (ResultSet rset = conexaoUm.getStatement().executeQuery(SQL)) {
                    while (rset.next()) {

                        if ((rset.getFloat(1) <= (ferro)) && (rset.getFloat(2) <= (magnesio))
                                && (rset.getFloat(3) <= (nitrogenio)) && (rset.getFloat(4)
                                <= (enxofre)) && (rset.getFloat(5) <= (pentoxidodefosforo))
                                && (rset.getFloat(6) <= (k2o)) && (rset.getFloat(7) <= (calcio))
                                && (rset.getFloat(8) <= (boro)) && (rset.getFloat(9) <= (cloro))
                                && (rset.getFloat(10) <= (molibdenio)) && (rset.getFloat(11) <= (cobre))
                                && (rset.getFloat(12) <= (manganes)) && (rset.getFloat(13) <= (zinco))
                                && (rset.getFloat(14) <= (aluminio))
                                && (rset.getFloat(15) <= (potassio)) && (rset.getFloat(16) <= (fosforo))) {
                            JOptionPane.showMessageDialog(null, "\nQuantidade perfeita para cultura ");
                        } else {
                            x = JOptionPane.showOptionDialog(null, "Valor Abaixo\nDeseja mais informações sobre correção?", "RESULTADO", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);
                        }
                        if (x == 0) {

                            //Esse é meu teste do showOptionDialog
                            JOptionPane.showMessageDialog(null, "É necessario ter no minimo\n"
                                    + "Ferro: " + (rset.getFloat(1) - ferro)
                                    + "\nMagnesio: " + (rset.getFloat(2) - magnesio)
                                    + "\nNitrogenio: " + (rset.getFloat(3) - nitrogenio)
                                    + "\nEnxofre: " + (rset.getFloat(4) - enxofre)
                                    + "\nPentoxidodefosforo: " + (rset.getFloat(5) - pentoxidodefosforo)
                                    + "\nk2o: " + (rset.getFloat(6) - k2o)
                                    + "\nCalcio: " + (rset.getFloat(7) - calcio)
                                    + "\nBoro: " + (rset.getFloat(8) - boro)
                                    + "\nCloro: " + (rset.getFloat(9) - cloro)
                                    + "\nMolibdenio: " + (rset.getFloat(10) - molibdenio)
                                    + "\nCobre: " + (rset.getFloat(11) - cobre)
                                    + "\nManganes: " + (rset.getFloat(12) - manganes)
                                    + "\nZinco: " + (rset.getFloat(13) - zinco)
                                    + "\nAluminio: " + (rset.getFloat(14) - aluminio)
                                    + "\nPotassio: " + (rset.getFloat(15) - potassio)
                                    + "\nFosforo: " + (rset.getFloat(16) - fosforo));
                        }
                    }
                    conexaoUm.closeconnect();
                } catch (SQLException e) {
                }
            } catch (Exception err) {
            }
        }

        if (jRadioButton4.isSelected()) {
            SQL = "select Ferro, Magnesio, Nitrogenio, Enxofre, P2O5, "
                    + "K2O, Calcio, Boro, Cloro, Molibdenio, Cobre, Manganes, "
                    + "Zinco, Aluminio, Potassio,Fosforo from Mineral "
                    + "where Name_Plant = 'Batata'";
            try {
                conexaoUm.connect();
                try (ResultSet rset = conexaoUm.getStatement().executeQuery(SQL)) {
                    while (rset.next()) {
                        if ((rset.getFloat(1) <= (ferro)) && (rset.getFloat(2) <= (magnesio))
                                && (rset.getFloat(3) <= (nitrogenio)) && (rset.getFloat(4)
                                <= (enxofre)) && (rset.getFloat(5) <= (pentoxidodefosforo))
                                && (rset.getFloat(6) <= (k2o)) && (rset.getFloat(7) <= (calcio))
                                && (rset.getFloat(8) <= (boro)) && (rset.getFloat(9) <= (cloro))
                                && (rset.getFloat(10) <= (molibdenio)) && (rset.getFloat(11) <= (cobre))
                                && (rset.getFloat(12) <= (manganes)) && (rset.getFloat(13) <= (zinco))
                                && (rset.getFloat(14) <= (aluminio))
                                && (rset.getFloat(15) <= (potassio)) && (rset.getFloat(16) <= (fosforo))) {

                            JOptionPane.showMessageDialog(null, "\nQuantidade perfeita para cultura ");
                        } else {

                            x = JOptionPane.showOptionDialog(null, "Valor Abaixo\nDeseja mais informações sobre correção?", "RESULTADO", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);
                        }
                        if (x == 0) {

                            //Esse é meu teste do showOptionDialog
                            JOptionPane.showMessageDialog(null, "É necessario ter no minimo\n"
                                    + "Ferro: " + (rset.getFloat(1) - ferro)
                                    + "\nMagnesio: " + (rset.getFloat(2) - magnesio)
                                    + "\nNitrogenio: " + (rset.getFloat(3) - nitrogenio)
                                    + "\nEnxofre: " + (rset.getFloat(4) - enxofre)
                                    + "\nPentoxidodefosforo: " + (rset.getFloat(5) - pentoxidodefosforo)
                                    + "\nk2o: " + (rset.getFloat(6) - k2o)
                                    + "\nCalcio: " + (rset.getFloat(7) - calcio)
                                    + "\nBoro: " + (rset.getFloat(8) - boro)
                                    + "\nCloro: " + (rset.getFloat(9) - cloro)
                                    + "\nMolibdenio: " + (rset.getFloat(10) - molibdenio)
                                    + "\nCobre: " + (rset.getFloat(11) - cobre)
                                    + "\nManganes: " + (rset.getFloat(12) - manganes)
                                    + "\nZinco: " + (rset.getFloat(13) - zinco)
                                    + "\nAluminio: " + (rset.getFloat(14) - aluminio)
                                    + "\nPotassio: " + (rset.getFloat(15) - potassio)
                                    + "\nFosforo: " + (rset.getFloat(16) - fosforo));
                        }
                    }
                    conexaoUm.closeconnect();
                } catch (SQLException e) {
                }
            } catch (Exception err) {
            }

        }
    }//GEN-LAST:event_jButton1ActionPerformed
    void Compara() {

    }

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField10ActionPerformed

    private void jTextField16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField16ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jTextField17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField17ActionPerformed

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField11ActionPerformed

    private void jTextField12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField12ActionPerformed

    private void jTextField13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField13ActionPerformed

    private void jTextField14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField14ActionPerformed

    private void jTextField18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField18ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton4ActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormularioInsercao.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new FormularioInsercao().setVisible(true);

        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup GrupoBotao;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables

}
