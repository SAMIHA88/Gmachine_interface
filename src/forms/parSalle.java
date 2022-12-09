/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import entities.Machine;
import entities.Salle;
import javax.swing.table.DefaultTableModel;
import services.MachineService;
import services.SalleService;

/**
 *
 * @author samih
 */
public class parSalle extends javax.swing.JInternalFrame {

    /**
     * Creates new form parSalle
     */
     private SalleService ss;
         private MachineService ms;
    private DefaultTableModel model;
    private static int id;

    public parSalle() {
        initComponents();
         ss = new SalleService();
         ms=new MachineService();
       model = (DefaultTableModel) listeMachinesParSalle.getModel();
        loadSalle();
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
     private void loadSalle() {
        for (Salle s : ss.findAll()) {
            salleList.addItem(s);
        }
    }
      private void loadMachine() {
        model.setRowCount(0);
        for (Machine m : ms.findAll()) {
            model.addRow(new Object[]{
                m.getId(),
                m.getReference(),
                m.getMarque(),
                m.getPrix(),
                m.getDateAchat(),
                m.getSalle()
            });
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnRechercheSalle = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        salleList = new javax.swing.JComboBox();
        listeMachineParSalle = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listeMachinesParSalle = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Recherche par salle");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btnRechercheSalle.setForeground(new java.awt.Color(102, 153, 255));
        btnRechercheSalle.setText("Rechercher");
        btnRechercheSalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRechercheSalleActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        jLabel1.setText("Donner la salle de la machine à rechercher:");

        salleList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salleListActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(salleList, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(btnRechercheSalle)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(salleList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRechercheSalle)
                .addGap(18, 18, 18))
        );

        listeMachineParSalle.setBackground(new java.awt.Color(255, 255, 255));
        listeMachineParSalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Liste des machines dans cette salle:"));

        listeMachinesParSalle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Référence", "Marque", "Prix", "Date Achat", "Salle"
            }
        ));
        jScrollPane1.setViewportView(listeMachinesParSalle);

        javax.swing.GroupLayout listeMachineParSalleLayout = new javax.swing.GroupLayout(listeMachineParSalle);
        listeMachineParSalle.setLayout(listeMachineParSalleLayout);
        listeMachineParSalleLayout.setHorizontalGroup(
            listeMachineParSalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, listeMachineParSalleLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        listeMachineParSalleLayout.setVerticalGroup(
            listeMachineParSalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, listeMachineParSalleLayout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(listeMachineParSalle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(listeMachineParSalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRechercheSalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRechercheSalleActionPerformed
        // TODO add your handling code here:
         Salle salle = (Salle) salleList.getSelectedItem();
       model.setRowCount(0);
          for (Machine m :ms.findMachinesBySalle(salle)) {
            model.addRow(new Object[]{
                m.getId(),
                m.getReference(),
                m.getMarque(),
                m.getPrix(),
                m.getDateAchat(),
                m.getSalle()
            });
        }
      
    }//GEN-LAST:event_btnRechercheSalleActionPerformed

    private void salleListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salleListActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_salleListActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRechercheSalle;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel listeMachineParSalle;
    private javax.swing.JTable listeMachinesParSalle;
    private javax.swing.JComboBox salleList;
    // End of variables declaration//GEN-END:variables
}
