package animal;

public class v5Cachyx extends javax.swing.JFrame {
    String c;
    String v4;
    animalBR objbr = new animalBR();
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(v5Cachyx.class.getName());

    public v5Cachyx(String vv4) {
        v4 = vv4;
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        delga = new javax.swing.JCheckBox();
        arbo = new javax.swing.JCheckBox();
        cola = new javax.swing.JCheckBox();
        marcas = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        verte = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        delga.setText("Forma delgada");

        arbo.setText("Arbórea");

        cola.setText("Cola larga");

        marcas.setText("Marcas claras en el abdomen");

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
                    .addComponent(delga)
                    .addComponent(arbo)
                    .addComponent(cola)
                    .addComponent(marcas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(verte))
                .addGap(66, 66, 66))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(delga)
                    .addComponent(jLabel1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(arbo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(verte)))
                .addGap(18, 18, 18)
                .addComponent(cola)
                .addGap(18, 18, 18)
                .addComponent(marcas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String fd="", ar="",cl="",mca="";
        fd = delga.isSelected()?"si":"no";
        ar = arbo.isSelected()?"si":"no";
        cl = cola.isSelected()?"si":"no";
        mca = marcas.isSelected()?"si":"no";
        c = objbr.getV5cach(v4, fd, ar, cl, mca);
        verte.setText(c);
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox arbo;
    private javax.swing.JCheckBox cola;
    private javax.swing.JCheckBox delga;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JCheckBox marcas;
    private javax.swing.JLabel verte;
    // End of variables declaration//GEN-END:variables
}
