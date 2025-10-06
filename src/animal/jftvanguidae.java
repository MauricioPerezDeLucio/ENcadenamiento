package animal;

import javax.swing.JOptionPane;

public class jftvanguidae extends javax.swing.JFrame {
    String c;
    String v3;
    animalBR objbr = new animalBR();
    public jftvanguidae(String vv3) {
        v3 = vv3;
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        arbo = new javax.swing.JCheckBox();
        col = new javax.swing.JCheckBox();
        diu = new javax.swing.JCheckBox();
        escaGran = new javax.swing.JCheckBox();
        encadenar = new javax.swing.JButton();
        siga = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        verte = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        arbo.setText("Arborícolas");
        arbo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arboActionPerformed(evt);
            }
        });

        col.setText("Coloración llamativa");

        diu.setText("Diurnos");

        escaGran.setText("Escamas grandes acorazadas");

        encadenar.setText("Encadenar");
        encadenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                encadenarActionPerformed(evt);
            }
        });

        siga.setText("Siguiente");
        siga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sigaActionPerformed(evt);
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
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(col)
                                    .addComponent(diu)
                                    .addComponent(escaGran))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(verte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(encadenar)
                                .addGap(48, 48, 48)
                                .addComponent(siga)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(arbo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(82, 82, 82))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(arbo)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(col)
                    .addComponent(verte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(diu)
                .addGap(18, 18, 18)
                .addComponent(escaGran)
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(encadenar)
                    .addComponent(siga))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void arboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_arboActionPerformed

    private void encadenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_encadenarActionPerformed
        String ar = "", cl = "", di = "", ega = "";
        ar = arbo.isSelected()? "si" : "no";
        cl = col.isSelected()? "si" : "no";
        di = diu.isSelected()? "si" : "no";
        ega = escaGran.isSelected()? "si" : "no";
        
        System.out.println("Arboricola = "+ar+"\nColoracion llamativa = "+cl
        +"\nDiurnos = "+di +"\nEscamas grandes acorazadas = "+ega);
        c = objbr.getV4Angui(v3, ar, cl, di, ega);
        System.out.println("V3 = "+c);
        verte.setText(c);
    }//GEN-LAST:event_encadenarActionPerformed

    private void sigaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sigaActionPerformed
        try{
            if (c.equals("ABRONIA")) {
                v5Abronia abro = new v5Abronia(v3);
                abro.setVisible(true);
            }
            else if (c.equals("REPTIL")){
            }
        }
        catch (NullPointerException e) {
            JOptionPane.showMessageDialog(this,
                    "Verifica las entradas", "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_sigaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox arbo;
    private javax.swing.JCheckBox col;
    private javax.swing.JCheckBox diu;
    private javax.swing.JButton encadenar;
    private javax.swing.JCheckBox escaGran;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton siga;
    private javax.swing.JLabel verte;
    // End of variables declaration//GEN-END:variables
}
