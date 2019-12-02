package gui;

import controller.ClientController;
import entities.Film;
import entities.Tip;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class ClientFrame extends javax.swing.JFrame {

    private DefaultListModel<Film> model;
    
    public ClientFrame() {
        initComponents();
        
        setLocationRelativeTo(null);
        setVisible(true);
        setTitle("Filme Control Panel");
        
        model = new DefaultListModel<>();
        jList1.setModel(model);
        jButton1.addActionListener(ev -> afiseazaFilme());
        jButton2.addActionListener(ev -> adaugaFilm());
        jButton3.addActionListener(ec -> stergeFilm());
        jButton4.addActionListener(ev -> new DifuzareFrame().setDefaultCloseOperation(DifuzareFrame.DISPOSE_ON_CLOSE));
        jButton5.addActionListener(ev -> new BiletFrame().setDefaultCloseOperation(DifuzareFrame.DISPOSE_ON_CLOSE));
        
        afiseazaFilme();
    }
    
    public void afiseazaFilme() {
        model.clear();
        List<Film> filme = ClientController.getInstance().afiseazaFilme();
        filme.forEach(model::addElement);
    }
    
    public void adaugaFilm() {
        AdaugaFilmPanel adaugaFilmPanel = new AdaugaFilmPanel();
        String titlu = "";
        String durata = "";
        Tip tip = Tip.COMEDIE;
        String[] actori = {};
        
        int result = JOptionPane.showConfirmDialog(null, adaugaFilmPanel, "Adauga Film", JOptionPane.OK_CANCEL_OPTION);
        if(result == JOptionPane.OK_OPTION) {
            
            titlu = adaugaFilmPanel.getJTextFiled1();
            durata = adaugaFilmPanel.getJTextField2();
            
            String tipString = adaugaFilmPanel.getJTextField3();
            switch(tipString) {
                case "comedie":
                    tip = Tip.COMEDIE;
                    break;
                case "drama":
                    tip = Tip.DRAMA;
                    break;
                case "horror":
                    tip = Tip.HORROR;
                    break;
                case "tragic":
                    tip = Tip.TRAGIC;
                    break;
            }
            
            
            String actoriString = adaugaFilmPanel.getJTextField4();
            actori = actoriString.split(", ");
            
            List<String> listaActori = new ArrayList<>();
            for(int i=0; i<actori.length; i++) {
                listaActori.add(actori[i]);
            }
        
            Film f = new Film();
            f.setTitlu(titlu);
            f.setDurata(Integer.parseInt(durata));
            f.setTip(tip);
            f.setActori(listaActori);

            ClientController.getInstance().adaugaFilm(f);

            JOptionPane.showMessageDialog(this, "Film adaugat cu succes!");
            afiseazaFilme();
        }
    }
    
    public void stergeFilm() {
        String id = JOptionPane.showInputDialog("Select ID: ");
        ClientController.getInstance().stergeFilm(Integer.parseInt(id));
        JOptionPane.showMessageDialog(this, "Film sters cu succes!");
        afiseazaFilme();
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
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportView(jList1);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Filme");

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

        jButton4.setText("Difuzari");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Bilete");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(26, 26, 26))
                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE)
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton5)
                        .addGap(18, 18, 18))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<Film> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
