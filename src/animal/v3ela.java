/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package animal;

import javax.swing.JOptionPane;

/**
 *
 * @author mauri
 */
public class v3ela extends javax.swing.JFrame {
    String c;
    String v2;
    animalBR objbr = new animalBR();
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(v3ela.class.getName());

    public v3ela(String vv2) {
        v2 = vv2;
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        haba = new javax.swing.JCheckBox();
        velAs = new javax.swing.JCheckBox();
        patron = new javax.swing.JCheckBox();
        cabeza = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        verte = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        haba.setText("Hábitat acuático");

        velAs.setText("velocidad agresiva");

        patron.setText("Patrón de colores en las bandas alternas");

        cabeza.setText("Cabeza triangular ancha");

        jButton1.setText("Siguiente");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Encadenar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setText("Vertebrado 4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(haba)
                    .addComponent(velAs)
                    .addComponent(patron)
                    .addComponent(cabeza))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(verte))
                .addGap(68, 68, 68))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(45, 45, 45)
                .addComponent(jButton1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(haba)
                    .addComponent(jLabel1))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(velAs)
                    .addComponent(verte))
                .addGap(18, 18, 18)
                .addComponent(patron)
                .addGap(18, 18, 18)
                .addComponent(cabeza)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String ha = "", va = "", pcba = "", ca = "";
        ha = haba.isSelected()? "si":"no";
        va = velAs.isSelected()? "si":"no";
        pcba = patron.isSelected()? "si":"no";
        ca = cabeza.isSelected()?"si":"no";
        c = objbr.getV4Ela(va, ha, va, pcba, ca);
        verte.setText(c);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
            if (c.equals("MICRURUS")) {
                v4Micru ang = new v4Micru(c);
                ang.setVisible(true);
            }
        }
        catch (NullPointerException e) {
            JOptionPane.showMessageDialog(this,
                    "Verifica las entradas", "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox cabeza;
    private javax.swing.JCheckBox haba;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JCheckBox patron;
    private javax.swing.JCheckBox velAs;
    private javax.swing.JLabel verte;
    // End of variables declaration//GEN-END:variables
}
