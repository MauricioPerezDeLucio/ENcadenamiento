package animal;

public class v4Micru extends javax.swing.JFrame {
    String c;
    String v2;
    animalBR objbr = new animalBR();
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(v4Micru.class.getName());

    
    public v4Micru(String vv2) {
        v2 = vv2;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cuello = new javax.swing.JCheckBox();
        ani = new javax.swing.JCheckBox();
        zonaMonta = new javax.swing.JCheckBox();
        endeMex = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        verte = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cuello.setText("Cuello ancho y oscuro");

        ani.setText("Anillos medianos");

        zonaMonta.setText("Zonas montañosas y templadas");

        endeMex.setText("Endémica de México");

        jButton1.setText("Encadenar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Vertebrado 5");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cuello)
                    .addComponent(ani)
                    .addComponent(zonaMonta)
                    .addComponent(endeMex))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(verte))
                .addGap(77, 77, 77))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cuello)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ani)
                    .addComponent(verte))
                .addGap(18, 18, 18)
                .addComponent(zonaMonta)
                .addGap(18, 18, 18)
                .addComponent(endeMex)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String cao="", am="", zmt="", em="";
        cao = cuello.isSelected()?"si":"no";
        am = ani.isSelected()?"si":"no";
        zmt = zonaMonta.isSelected()?"si":"no";
        em = endeMex.isSelected()?"si":"no";
        c = objbr.getV5Micru(v2, cao, am, zmt, em);
        verte.setText(c);
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox ani;
    private javax.swing.JCheckBox cuello;
    private javax.swing.JCheckBox endeMex;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel verte;
    private javax.swing.JCheckBox zonaMonta;
    // End of variables declaration//GEN-END:variables
}
