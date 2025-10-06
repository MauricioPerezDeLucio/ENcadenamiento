
package animal;

import javax.swing.JOptionPane;

public class Filo extends javax.swing.JFrame {
    String v1;
    String c;
    animalBR objbr=new animalBR();
    public Filo(String vv1) {
        v1 = vv1;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        simetria = new javax.swing.JCheckBox();
        sistema = new javax.swing.JCheckBox();
        exoes = new javax.swing.JCheckBox();
        segmen = new javax.swing.JCheckBox();
        cutiflex = new javax.swing.JCheckBox();
        probosc = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        filo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        simetria.setText("Simetría bilateral");
        simetria.setToolTipText("");

        sistema.setText("Sistema circulatorio");

        exoes.setText("Exoesqueleto");

        segmen.setText("Segmentación");

        cutiflex.setText("Cutícula flexible");

        probosc.setText("Probóscide retráctil");

        jButton1.setText("Encadenar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Siguiente");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setText("Filo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(simetria)
                    .addComponent(sistema)
                    .addComponent(exoes)
                    .addComponent(segmen)
                    .addComponent(cutiflex)
                    .addComponent(probosc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(102, 102, 102)
                        .addComponent(jButton2))
                    .addComponent(filo))
                .addGap(16, 16, 16))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(simetria)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sistema)
                    .addComponent(filo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(exoes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(segmen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cutiflex)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(probosc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        String sib="",sc="",exo="",seg="",cf="",pr="";
        sib = simetria.isSelected()?"si":"no";
        sc = sistema.isSelected()?"si":"no";
        exo = exoes.isSelected()?"si":"no";
        seg = segmen.isSelected()?"si":"no";
        cf = cutiflex.isSelected()?"si":"no";
        pr = probosc.isSelected()?"si":"no";
        c = objbr.geFilo1(v1, sib, sc, exo, seg, cf, pr);
        System.out.println(c);
        System.out.println(v1);
        filo.setText(c);
    }                                        

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        try{
            if (c.equals("CHORDATA")) {
                jftv1 jfAve = new jftv1(c);
                jfAve.setVisible(true);
            }
        }
        catch (NullPointerException e) {
            JOptionPane.showMessageDialog(this,
                    "Verifica las entradas", "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }                                        

    // Variables declaration - do not modify                     
    private javax.swing.JCheckBox cutiflex;
    private javax.swing.JCheckBox exoes;
    private javax.swing.JLabel filo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JCheckBox probosc;
    private javax.swing.JCheckBox segmen;
    private javax.swing.JCheckBox simetria;
    private javax.swing.JCheckBox sistema;
    // End of variables declaration                   
}
