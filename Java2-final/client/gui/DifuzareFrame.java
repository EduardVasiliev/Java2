package gui;

import controller.ClientController;
import entities.Difuzare;
import entities.Film;
import entities.Sala;
import entities.Tip;
import java.sql.Date;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class DifuzareFrame extends javax.swing.JFrame {

    private DefaultListModel<Difuzare> model;
    
    public DifuzareFrame() {
        initComponents();
        
        setLocationRelativeTo(null);
        setVisible(true);
        setTitle("Difuzari Control Panel");
        
        model = new DefaultListModel<>();
        jList1.setModel(model);
        afiseazaDifuzare();
        jButton1.addActionListener(ev -> afiseazaDifuzare());
        jButton2.addActionListener(ev -> adaugaDifuzare());
        jButton3.addActionListener(ec -> stergeDifuzare());
        
    }
    
    public void afiseazaDifuzare() {
        model.clear();
        List<Difuzare> difuzari = ClientController.getInstance().afiseazaDifuzare();
        difuzari.forEach(model::addElement);
    }
    
    public void adaugaDifuzare() {
        AdaugaDifuzarePanel adaugaDifuzarePanel = new AdaugaDifuzarePanel();
        
        String film = "";
        Date date = Date.valueOf(LocalDate.now());
        Sala sala = new Sala();
        
        int result = JOptionPane.showConfirmDialog(null, adaugaDifuzarePanel, "Adauga Difuzare", JOptionPane.OK_CANCEL_OPTION);
        if(result == JOptionPane.OK_OPTION) {
            
            film = adaugaDifuzarePanel.getJComboBox1();
            int zi = Integer.parseInt(adaugaDifuzarePanel.getJComboBox2());
            int luna = Integer.parseInt(adaugaDifuzarePanel.getJComboBox3());
            date = Date.valueOf(LocalDate.of(2019, luna, zi));
            String salaString = adaugaDifuzarePanel.getJComboBox4();
            switch(salaString) {
                case "Sala 1 [150 locuri]":
                    sala = new Sala();
                    sala.setNume("Sala 1");
                    sala.setNrLocuri(150);
                    break;
                case "Sala 2 [120 locuri]":
                    sala = new Sala();
                    sala.setNume("Sala 2");
                    sala.setNrLocuri(120);
                    break;
                case "Sala 3 [80 locuri]":
                    sala = new Sala();
                    sala.setNume("Sala 3");
                    sala.setNrLocuri(80);
                    break;
            }
                    
            Difuzare difuzare = new Difuzare();
            difuzare.setFilm(film);
            difuzare.setData(date);
            difuzare.setSala(sala);

            ClientController.getInstance().adaugaDifuzare(difuzare);

            JOptionPane.showMessageDialog(this, "Difuzare adaugata cu succes!");
            afiseazaDifuzare();
        }
    }
    
    public void stergeDifuzare() {
        String id = JOptionPane.showInputDialog("Select ID: ");
        ClientController.getInstance().stergeDifuzare(Integer.parseInt(id));
        JOptionPane.showMessageDialog(this, "Difuzare stearsa cu succes!");
        afiseazaDifuzare();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportView(jList1);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Difuzari");

        jButton1.setText("Refresh");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Adauga");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Sterge");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 419, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)
                        .addGap(18, 171, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<Difuzare> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
