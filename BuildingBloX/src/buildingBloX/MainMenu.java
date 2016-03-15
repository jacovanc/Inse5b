/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package buildingBloX;

import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author up723003,up665478
 */
public class MainMenu extends javax.swing.JFrame {

    /** Creates new form MainMenu */
    public MainMenu() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        createWBTButton = new javax.swing.JButton();
        createAllButton = new javax.swing.JButton();
        createPERTButton = new javax.swing.JButton();
        createGanttButton = new javax.swing.JButton();
        titleLabel = new javax.swing.JLabel();
        exitButton = new javax.swing.JButton();
        loadButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Building BloX");
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(153, 204, 255));
        setName("Building BloX"); // NOI18N
        setUndecorated(true);

        createWBTButton.setText("Create WBT");
        createWBTButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                createWBTButtonMouseClicked(evt);
            }
        });

        createAllButton.setText("Create all");

        createPERTButton.setText("Create PERT");
        createPERTButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createPERTButtonActionPerformed(evt);
            }
        });

        createGanttButton.setText("Create Gantt");

        titleLabel.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("Building BloX");

        exitButton.setText("Exit");
        exitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitButtonMouseClicked(evt);
            }
        });

        loadButton.setText("Load");
        loadButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loadButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(titleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(createPERTButton, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                            .addComponent(createAllButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(loadButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(exitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(createWBTButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(createGanttButton, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createAllButton)
                    .addComponent(createWBTButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createGanttButton)
                    .addComponent(createPERTButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exitButton)
                    .addComponent(loadButton))
                .addGap(33, 33, 33))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitButtonMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitButtonMouseClicked

    private void loadButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loadButtonMouseClicked
        this.setVisible(false);  //Hide main menu
        
        JFileChooser fileViewer = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Database files", "db", "fdb", "nsf", "fp7", "accdb", "mdb", "xml", "odb", "ACCDE");
        fileViewer.setFileFilter(filter);   //Restrict to only database files
        
        int status = fileViewer.showOpenDialog(null);
        
        //If file viewer open, wait til file selected, otherwise re-show main menu
        if (status == JFileChooser.APPROVE_OPTION) {
            File file = fileViewer.getSelectedFile();
            String fileName = fileViewer.getSelectedFile().getAbsolutePath();
            System.exit(0);
        }
        else{
            this.setVisible(true);
        }
    }//GEN-LAST:event_loadButtonMouseClicked

    private void createWBTButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createWBTButtonMouseClicked
        new WBTMenu().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_createWBTButtonMouseClicked

    private void createPERTButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createPERTButtonActionPerformed
        new PERTMenu().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_createPERTButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton createAllButton;
    private javax.swing.JButton createGanttButton;
    private javax.swing.JButton createPERTButton;
    private javax.swing.JButton createWBTButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JButton loadButton;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables

}