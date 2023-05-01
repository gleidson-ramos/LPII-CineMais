/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import Negocio.Cinema;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Gleidson
 */
public class TelaCadastroCinema extends javax.swing.JFrame {
    private ArrayList<Cinema> cinema = new ArrayList<Cinema>();

    /**
     * Creates new form TelaSessao
     */
    public TelaCadastroCinema(ArrayList<Cinema> cinema) {
        this.cinema = cinema;
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
        txtNome = new javax.swing.JTextField();
        txtEndereco = new javax.swing.JTextField();
        botaoSalvar2D = new javax.swing.JButton();
        capacidadeSala1 = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        txtValorFDS = new javax.swing.JTextField();
        capacidadeSala2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Informações do Cinema", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

        numeroSala.setText("Nome:");

        capacidadeSala.setText("Endereço:");

        botaoSalvar2D.setText("Salvar");
        botaoSalvar2D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvar2DActionPerformed(evt);
            }
        });

        capacidadeSala1.setText("Valor do Ingresso:");

        capacidadeSala2.setText("Valor do Ingresso Fim de Semana:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(numeroSala)
                                    .addComponent(capacidadeSala)
                                    .addComponent(capacidadeSala1))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(40, 40, 40)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                                            .addComponent(txtNome)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(capacidadeSala2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                                .addComponent(txtValorFDS, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(botaoSalvar2D)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numeroSala)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(capacidadeSala)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(capacidadeSala1)
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(capacidadeSala2)
                    .addComponent(txtValorFDS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(botaoSalvar2D)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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
        
        Cinema cine;
        double valorIngresso = Double.parseDouble(txtValor.getText());
        double valorIngressoFDS = Double.parseDouble(txtValorFDS.getText());

        cine = new Cinema(txtNome.getText(), txtEndereco.getText(), valorIngresso, valorIngressoFDS);
        
        cinema.add(cine);
        
        JOptionPane.showMessageDialog(null, "Cinema cadastrado com sucesso!");
        limpar();
        }
    }//GEN-LAST:event_botaoSalvar2DActionPerformed

    
    public void limpar(){
        txtNome.setText("");
        txtEndereco.setText("");
        txtValor.setText("");
        txtValorFDS.setText("");
    }
    
    public boolean validarCampos(){
        
        if (txtNome.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Informe o nome do Shopping");
            return false;
        }
        else if (txtEndereco.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Informe o Endereço");
            return false;
        }
        else if (txtValor.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Informe o valor do ingresso durante Semana");
            return false;
        }
        else if (txtValorFDS.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Informe o valor do ingresso durante Semana");
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
    private javax.swing.JLabel capacidadeSala1;
    private javax.swing.JLabel capacidadeSala2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel numeroSala;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtValor;
    private javax.swing.JTextField txtValorFDS;
    // End of variables declaration//GEN-END:variables
}