/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pantallacatalogoscuentas;

import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JComponent;

/**
 *
 * @author rafae_000
 */
public class NuevaCuenta extends javax.swing.JInternalFrame {

    private JComponent Barra = ((javax.swing.plaf.basic.BasicInternalFrameUI) getUI()).getNorthPane();
    private Dimension dimBarra = null;

    public NuevaCuenta() {
        super("Agregar Nueva Cuenta", false, false, false, false);
        ocultarBarraTitulo();
        initComponents();
        
    }
    
  

    public void ocultarBarraTitulo() {
        Barra = ((javax.swing.plaf.basic.BasicInternalFrameUI) getUI()).getNorthPane();
        dimBarra = Barra.getPreferredSize();
        Barra.setSize(0, 0);
        Barra.setPreferredSize(new Dimension(0, 0));
        repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        labelNombre = new javax.swing.JLabel();
        lCodigo = new javax.swing.JLabel();
        tfNombre = new javax.swing.JTextField();
        tfCodigo = new javax.swing.JTextField();
        bAceptar = new javax.swing.JButton();

        setBorder(null);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        labelNombre.setText("Nombre:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 54;
        gridBagConstraints.ipady = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 90, 0, 0);
        getContentPane().add(labelNombre, gridBagConstraints);

        lCodigo.setText("Código:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(38, 90, 0, 0);
        getContentPane().add(lCodigo, gridBagConstraints);

        tfNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 180;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 5, 0, 94);
        getContentPane().add(tfNombre, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 180;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(38, 5, 0, 94);
        getContentPane().add(tfCodigo, gridBagConstraints);

        bAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgIconos/btnOk2.png"))); // NOI18N
        bAceptar.setText("Aceptar");
        bAceptar.setBorder(null);
        bAceptar.setBorderPainted(false);
        bAceptar.setContentAreaFilled(false);
        bAceptar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bAceptar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bAceptar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgIconos/btnOk3.png"))); // NOI18N
        bAceptar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgIconos/btnOk1.png"))); // NOI18N
        bAceptar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 39;
        gridBagConstraints.ipady = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(50, 53, 8, 0);
        getContentPane().add(bAceptar, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAceptar;
    private javax.swing.JLabel lCodigo;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JTextField tfCodigo;
    private javax.swing.JTextField tfNombre;
    // End of variables declaration//GEN-END:variables
}
