/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

/**
 *
 * @author Lachgar
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        this.setTitle("Gestion des machines");
        this.setExtendedState(MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        salleMenuItem = new javax.swing.JMenuItem();
        employeMenuItem = new javax.swing.JMenuItem();
        machineMenuItem = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        deuxDates = new javax.swing.JMenu();
        parSalle = new javax.swing.JMenuItem();
        entreDeuxDates = new javax.swing.JMenuItem();
        pasteMenuItem = new javax.swing.JMenuItem();
        deleteMenuItem = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        contentMenuItem = new javax.swing.JMenuItem();
        aboutMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fileMenu.setMnemonic('f');
        fileMenu.setText("Gestion");

        salleMenuItem.setMnemonic('o');
        salleMenuItem.setText("Salle");
        salleMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salleMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(salleMenuItem);

        employeMenuItem.setMnemonic('s');
        employeMenuItem.setText("Employ??");
        employeMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(employeMenuItem);

        machineMenuItem.setMnemonic('s');
        machineMenuItem.setText("Machine");
        machineMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                machineMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(machineMenuItem);

        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        deuxDates.setMnemonic('e');
        deuxDates.setText("Recherche");

        parSalle.setMnemonic('t');
        parSalle.setText("Par Salle");
        parSalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parSalleActionPerformed(evt);
            }
        });
        deuxDates.add(parSalle);

        entreDeuxDates.setMnemonic('y');
        entreDeuxDates.setText("Entre 2 dates");
        entreDeuxDates.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entreDeuxDatesActionPerformed(evt);
            }
        });
        deuxDates.add(entreDeuxDates);

        pasteMenuItem.setMnemonic('p');
        pasteMenuItem.setText("Paste");
        deuxDates.add(pasteMenuItem);

        deleteMenuItem.setMnemonic('d');
        deleteMenuItem.setText("Delete");
        deuxDates.add(deleteMenuItem);

        menuBar.add(deuxDates);

        helpMenu.setMnemonic('h');
        helpMenu.setText("Help");

        contentMenuItem.setMnemonic('c');
        contentMenuItem.setText("Contents");
        helpMenu.add(contentMenuItem);

        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("About");
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void salleMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salleMenuItemActionPerformed
        // TODO add your handling code here:
        SalleForm sf = new SalleForm();
        desktopPane.add(sf);
        sf.setVisible(true);
    }//GEN-LAST:event_salleMenuItemActionPerformed

    private void employeMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeMenuItemActionPerformed
        // TODO add your handling code here:
        EmployeForm ef=new EmployeForm();
        desktopPane.add(ef);
        ef.setVisible(true);
        
    }//GEN-LAST:event_employeMenuItemActionPerformed

    private void machineMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_machineMenuItemActionPerformed
        // TODO add your handling code here:
                                                         
        // TODO add your handling code here:
        MachineForm ef=new MachineForm();
        desktopPane.add(ef);
        ef.setVisible(true);
    }//GEN-LAST:event_machineMenuItemActionPerformed

    private void parSalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parSalleActionPerformed
        // TODO add your handling code here:
         parSalle ps=new parSalle();
        desktopPane.add(ps);
        ps.setVisible(true);
    }//GEN-LAST:event_parSalleActionPerformed

    private void entreDeuxDatesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entreDeuxDatesActionPerformed
        // TODO add your handling code here:
        deuxDates dd=new deuxDates();
        desktopPane.add(dd);
        dd.setVisible(true);
    }//GEN-LAST:event_entreDeuxDatesActionPerformed

  
    
    
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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JMenuItem contentMenuItem;
    private javax.swing.JMenuItem deleteMenuItem;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu deuxDates;
    private javax.swing.JMenuItem employeMenuItem;
    private javax.swing.JMenuItem entreDeuxDates;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JMenuItem machineMenuItem;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem parSalle;
    private javax.swing.JMenuItem pasteMenuItem;
    private javax.swing.JMenuItem salleMenuItem;
    // End of variables declaration//GEN-END:variables

}
