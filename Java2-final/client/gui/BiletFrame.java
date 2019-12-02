package gui;

import controller.ClientController;
import entities.Contact;
import entities.Difuzare;
import entities.Film;
import entities.Sala;
import entities.Spectator;
import entities.Tip;
import java.sql.Date;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class BiletFrame extends javax.swing.JFrame {

    private DefaultListModel<Spectator> model;
    
    public BiletFrame() {
        initComponents();
        
        setLocationRelativeTo(null);
        setVisible(true);
        setTitle("Bilete Control Panel");
        
        model = new DefaultListModel<>();
        jList1.setModel(model);
        jButton1.addActionListener(ev -> afiseazaBilete());
        jButton2.addActionListener(ev -> vindeBilete());
        
        afiseazaBilete();
    }
    
    public void afiseazaBilete() {
        model.clear();
        List<Spectator> bilete = ClientController.getInstance().afiseazaBilete();
        bilete.forEach(model::addElement);
    }
    
    public void vindeBilete() {
        VindeBiletPanel vindeBiletPanel = new VindeBiletPanel();
        
        Difuzare difuzare = new Difuzare();
        String nume = "";
        String email = "";
        String telefon = "";
        
        int result = JOptionPane.showConfirmDialog(null, vindeBiletPanel, "Adauga Spectator", JOptionPane.OK_CANCEL_OPTION);
        if(result == JOptionPane.OK_OPTION) {
            List<Difuzare> difuzareList = ClientController.getInstance().afiseazaDifuzare();
            String difuzareSelectata = vindeBiletPanel.getJComboBox1();
            for(Difuzare x : difuzareList) {
                if(x.getFilm().equals(difuzareSelectata)) {
                    difuzare = x;
                }
            }
            
            nume = vindeBiletPanel.getJTexField1();
            email = vindeBiletPanel.getJTexField2();
            telefon = vindeBiletPanel.getJTexField3();
            
            Contact c = new Contact();
            c.setEmail(email);
            c.setTelefon(telefon);
              
            Spectator s = new Spectator();
            s.setNume(nume);
//            s.setContact(c);
            
            ClientController.getInstance().vindeBilet(s);
            
            JOptionPane.showMessageDialog(this, "Spectator adaugat cu succes!");
            afiseazaBilete();
           
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportView(jList1);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Bilete");

        jButton1.setText("Refresh");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Vinde");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
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
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 416, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<Spectator> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
