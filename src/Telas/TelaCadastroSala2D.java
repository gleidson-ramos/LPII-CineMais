/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import Negocio.Sala2D;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Gleidson
 */
public class TelaCadastroSala2D extends javax.swing.JFrame {
    private ArrayList<Sala2D> sala2d = new ArrayList<>();

    /**
     * Creates new form TelaSessao
     */
    public TelaCadastroSala2D(ArrayList<Sala2D> sala2d) {
        this.sala2d = sala2d;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        numeroSala = new javax.swing.JLabel();
        capacidadeSala = new javax.swing.JLabel();
        txtNumeroSala = new javax.swing.JTextField();
        txtCapacidadeSala = new javax.swing.JTextField();
        botaoSalvar2D = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastrar Sala 2D", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

        numeroSala.setText("Sala:");

        capacidadeSala.setText("Capacidade:");

        botaoSalvar2D.setText("Salvar");
        botaoSalvar2D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvar2DActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(numeroSala)
                        .addGap(62, 62, 62)
                        .addComponent(txtNumeroSala, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(capacidadeSala)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botaoSalvar2D)
                            .addComponent(txtCapacidadeSala, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(74, 74, 74))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numeroSala)
                    .addComponent(txtNumeroSala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(capacidadeSala)
                    .addComponent(txtCapacidadeSala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(botaoSalvar2D)
                .addContainerGap(68, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoSalvar2DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvar2DActionPerformed
        // TODO add your handling code here:
        
        if (validarCampos()){
        
        Sala2D s2;
        int numero = Integer.parseInt(txtNumeroSala.getText());
        int capacidade = Integer.parseInt(txtCapacidadeSala.getText());
        //String tipoSala = "2D";
        s2 = new Sala2D(numero, capacidade, "2D");
        
        sala2d.add(s2);
        
        JOptionPane.showMessageDialog(null, "Sala incluida com sucesso!");
        limpar();
        }
    }//GEN-LAST:event_botaoSalvar2DActionPerformed

    
    public void limpar(){
        txtNumeroSala.setText("");
        txtCapacidadeSala.setText("");
    }
    
    public boolean validarCampos(){
        
        if (txtNumeroSala.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Informe o numero da Sala");
            return false;
        }
        else if (txtCapacidadeSala.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Informe a capacidade da Sala");
            return false;
        }
        return true;
    }
    
    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoSalvar2D;
    private javax.swing.JLabel capacidadeSala;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel numeroSala;
    private javax.swing.JTextField txtCapacidadeSala;
    private javax.swing.JTextField txtNumeroSala;
    // End of variables declaration//GEN-END:variables
}
