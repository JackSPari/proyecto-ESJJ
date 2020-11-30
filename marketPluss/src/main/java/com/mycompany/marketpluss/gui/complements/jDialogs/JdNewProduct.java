
package com.mycompany.marketpluss.gui.complements.jDialogs;

import com.mycompany.marketpluss.gui.utils.TextPrompt;

public class JdNewProduct extends javax.swing.JDialog {

    public JdNewProduct(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setResizable(false);
        this.setLocationRelativeTo(null);
        placeHolder();
        
    }
    public void placeHolder()
    {
        TextPrompt textProduct = new TextPrompt("Product Name", jtfCardMainProduct);
        TextPrompt textDescription = new TextPrompt("Description", jtfCardMainDescription);
        TextPrompt textPrice = new TextPrompt("Price", jtfCardMainPrice);
        TextPrompt textStock = new TextPrompt("Stock", jtfCardMainStock);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpCardChange = new javax.swing.JPanel();
        jpCardBar = new javax.swing.JPanel();
        jlCardBarRename = new javax.swing.JLabel();
        jpCardMain = new javax.swing.JPanel();
        jtfCardMainProduct = new javax.swing.JTextField();
        jtfCardMainStock = new javax.swing.JTextField();
        jtfCardMainDescription = new javax.swing.JTextField();
        jtfCardMainPrice = new javax.swing.JTextField();
        jcbCardMainIgv = new javax.swing.JCheckBox();
        jcbCardMainStatus = new javax.swing.JCheckBox();
        jsCardMainS1 = new javax.swing.JSeparator();
        jsCardMainS2 = new javax.swing.JSeparator();
        jsCardMainS3 = new javax.swing.JSeparator();
        jsCardMainS4 = new javax.swing.JSeparator();
        buttonClass1 = new styles.ButtonClass();
        buttonClass2 = new styles.ButtonClass();

        setResizable(false);

        jpCardBar.setBackground(new java.awt.Color(13, 71, 161));

        jlCardBarRename.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jlCardBarRename.setForeground(new java.awt.Color(255, 255, 255));
        jlCardBarRename.setText("Nuevo Producto");

        javax.swing.GroupLayout jpCardBarLayout = new javax.swing.GroupLayout(jpCardBar);
        jpCardBar.setLayout(jpCardBarLayout);
        jpCardBarLayout.setHorizontalGroup(
            jpCardBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCardBarLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jlCardBarRename)
                .addContainerGap(410, Short.MAX_VALUE))
        );
        jpCardBarLayout.setVerticalGroup(
            jpCardBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCardBarLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jlCardBarRename)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jpCardMain.setBackground(new java.awt.Color(255, 255, 255));

        jtfCardMainProduct.setBackground(new java.awt.Color(255, 255, 255));
        jtfCardMainProduct.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        jtfCardMainProduct.setBorder(null);
        jtfCardMainProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfCardMainProductActionPerformed(evt);
            }
        });

        jtfCardMainStock.setBackground(new java.awt.Color(255, 255, 255));
        jtfCardMainStock.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        jtfCardMainStock.setBorder(null);

        jtfCardMainDescription.setBackground(new java.awt.Color(255, 255, 255));
        jtfCardMainDescription.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        jtfCardMainDescription.setBorder(null);

        jtfCardMainPrice.setBackground(new java.awt.Color(255, 255, 255));
        jtfCardMainPrice.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        jtfCardMainPrice.setBorder(null);

        jcbCardMainIgv.setBackground(new java.awt.Color(255, 255, 255));
        jcbCardMainIgv.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jcbCardMainIgv.setForeground(new java.awt.Color(51, 51, 51));
        jcbCardMainIgv.setText("Igv");
        jcbCardMainIgv.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jcbCardMainStatus.setBackground(new java.awt.Color(255, 255, 255));
        jcbCardMainStatus.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jcbCardMainStatus.setForeground(new java.awt.Color(51, 51, 51));
        jcbCardMainStatus.setText("Status");
        jcbCardMainStatus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jsCardMainS3.setPreferredSize(new java.awt.Dimension(0, 5));

        jsCardMainS4.setPreferredSize(new java.awt.Dimension(0, 7));

        buttonClass1.setBackground(new java.awt.Color(244, 67, 54));
        buttonClass1.setText("Cancelar");
        buttonClass1.setColorHover(new java.awt.Color(228, 62, 50));
        buttonClass1.setColorNormal(new java.awt.Color(244, 67, 54));
        buttonClass1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N

        buttonClass2.setBackground(new java.awt.Color(30, 136, 229));
        buttonClass2.setText("Aceptar");
        buttonClass2.setColorHover(new java.awt.Color(27, 125, 210));
        buttonClass2.setColorNormal(new java.awt.Color(30, 136, 229));
        buttonClass2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N

        javax.swing.GroupLayout jpCardMainLayout = new javax.swing.GroupLayout(jpCardMain);
        jpCardMain.setLayout(jpCardMainLayout);
        jpCardMainLayout.setHorizontalGroup(
            jpCardMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCardMainLayout.createSequentialGroup()
                .addGroup(jpCardMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jpCardMainLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonClass1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buttonClass2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpCardMainLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jpCardMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jsCardMainS2)
                            .addComponent(jtfCardMainProduct)
                            .addComponent(jtfCardMainDescription)
                            .addComponent(jsCardMainS1)
                            .addGroup(jpCardMainLayout.createSequentialGroup()
                                .addGroup(jpCardMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtfCardMainPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtfCardMainStock, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jsCardMainS4, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jsCardMainS3, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(168, 168, 168)
                                .addGroup(jpCardMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jcbCardMainStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jcbCardMainIgv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(102, 102, 102)))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jpCardMainLayout.setVerticalGroup(
            jpCardMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCardMainLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jtfCardMainProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jsCardMainS1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jtfCardMainDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jsCardMainS2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jpCardMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpCardMainLayout.createSequentialGroup()
                        .addComponent(jcbCardMainStatus)
                        .addGap(31, 31, 31)
                        .addComponent(jcbCardMainIgv))
                    .addGroup(jpCardMainLayout.createSequentialGroup()
                        .addComponent(jtfCardMainPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jsCardMainS3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(jtfCardMainStock, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jsCardMainS4, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 117, Short.MAX_VALUE)
                .addGroup(jpCardMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonClass1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonClass2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout jpCardChangeLayout = new javax.swing.GroupLayout(jpCardChange);
        jpCardChange.setLayout(jpCardChangeLayout);
        jpCardChangeLayout.setHorizontalGroup(
            jpCardChangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpCardBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpCardMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpCardChangeLayout.setVerticalGroup(
            jpCardChangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCardChangeLayout.createSequentialGroup()
                .addComponent(jpCardBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jpCardMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpCardChange, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpCardChange, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfCardMainProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfCardMainProductActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfCardMainProductActionPerformed

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
            java.util.logging.Logger.getLogger(JdNewProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JdNewProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JdNewProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JdNewProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JdNewProduct dialog = new JdNewProduct(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private styles.ButtonClass buttonClass1;
    private styles.ButtonClass buttonClass2;
    private javax.swing.JCheckBox jcbCardMainIgv;
    private javax.swing.JCheckBox jcbCardMainStatus;
    private javax.swing.JLabel jlCardBarRename;
    private javax.swing.JPanel jpCardBar;
    private javax.swing.JPanel jpCardChange;
    private javax.swing.JPanel jpCardMain;
    private javax.swing.JSeparator jsCardMainS1;
    private javax.swing.JSeparator jsCardMainS2;
    private javax.swing.JSeparator jsCardMainS3;
    private javax.swing.JSeparator jsCardMainS4;
    private javax.swing.JTextField jtfCardMainDescription;
    private javax.swing.JTextField jtfCardMainPrice;
    private javax.swing.JTextField jtfCardMainProduct;
    private javax.swing.JTextField jtfCardMainStock;
    // End of variables declaration//GEN-END:variables
}
