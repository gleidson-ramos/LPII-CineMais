/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import javax.swing.JOptionPane;
import Negocio.Sala2D;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Gleidson
 */
public class TelaAlterarSala2D extends javax.swing.JFrame {

    /**
     * Creates new form TelaCadastroFilme
     */
    
    private ArrayList<Sala2D> sala2d = new ArrayList<Sala2D>();
    public TelaAlterarSala2D(ArrayList<Sala2D> sala2d) {
        this.sala2d = sala2d;
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
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
        painelEditar = new javax.swing.JPanel();
        NumeroSala = new javax.swing.JLabel();
        CapacidadeSala = new javax.swing.JLabel();
        txtNumeroSala = new javax.swing.JTextField();
        txtCapacidadeSala = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        botaoSalvar = new javax.swing.JButton();
        painelDeletar = new javax.swing.JPanel();
        botaoExcluir = new javax.swing.JButton();
        painelEdicao = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaSala2D = new javax.swing.JTable();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        painelEditar.setBackground(new java.awt.Color(255, 255, 255));
        painelEditar.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Edição de Filmes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        NumeroSala.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        NumeroSala.setText("Numero da Sala:");

        CapacidadeSala.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        CapacidadeSala.setText("Capacidade da Sala:");

        txtNumeroSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroSalaActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 49, Short.MAX_VALUE)
        );

        botaoSalvar.setText("Salvar Alterações");
        botaoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelEditarLayout = new javax.swing.GroupLayout(painelEditar);
        painelEditar.setLayout(painelEditarLayout);
        painelEditarLayout.setHorizontalGroup(
            painelEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelEditarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(painelEditarLayout.createSequentialGroup()
                        .addGroup(painelEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CapacidadeSala)
                            .addComponent(NumeroSala))
                        .addGap(27, 27, 27)
                        .addGroup(painelEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNumeroSala, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCapacidadeSala, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(painelEditarLayout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(botaoSalvar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelEditarLayout.setVerticalGroup(
            painelEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelEditarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painelEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NumeroSala, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtNumeroSala, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CapacidadeSala, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtCapacidadeSala, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(botaoSalvar)
                .addGap(105, 105, 105)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        painelDeletar.setBackground(new java.awt.Color(255, 255, 255));
        painelDeletar.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Deletar Filme", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        botaoExcluir.setText("Excluir Item Seleciondado");
        botaoExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelDeletarLayout = new javax.swing.GroupLayout(painelDeletar);
        painelDeletar.setLayout(painelDeletarLayout);
        painelDeletarLayout.setHorizontalGroup(
            painelDeletarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelDeletarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botaoExcluir)
                .addGap(94, 94, 94))
        );
        painelDeletarLayout.setVerticalGroup(
            painelDeletarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDeletarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botaoExcluir)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        painelEdicao.setBackground(new java.awt.Color(255, 255, 255));
        painelEdicao.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Selecione a sala 2D que deseja alterar ou excluir", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        tabelaSala2D.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Numero da Sala", "Capacidade sa Sala"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaSala2D.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaSala2DMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaSala2D);

        javax.swing.GroupLayout painelEdicaoLayout = new javax.swing.GroupLayout(painelEdicao);
        painelEdicao.setLayout(painelEdicaoLayout);
        painelEdicaoLayout.setHorizontalGroup(
            painelEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelEdicaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 614, Short.MAX_VALUE)
                .addContainerGap())
        );
        painelEdicaoLayout.setVerticalGroup(
            painelEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelEdicaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 391, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelEdicao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(painelEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelDeletar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(painelEdicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(painelEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(painelDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNumeroSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroSalaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroSalaActionPerformed

    private void botaoExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExcluirActionPerformed
        // TODO add your handling code here:
        int i = tabelaSala2D.getSelectedRow();
        sala2d.remove(i);
        atualizarTabela();
    }//GEN-LAST:event_botaoExcluirActionPerformed

    private void botaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarActionPerformed
        // TODO add your handling code here:
        
        if (validarCampos()){
        
        int i = tabelaSala2D.getSelectedRow();
        int numero = Integer.parseInt(txtNumeroSala.getText());
        int capacidade = Integer.parseInt(txtCapacidadeSala.getText());
        
        sala2d.get(i).setNumeroSala(numero);
        sala2d.get(i).setCapacidadeSala(capacidade);

        atualizarTabela();
        
        JOptionPane.showMessageDialog(null, "Sala 2D alterada com sucesso!");
        limpar();
        }
    }//GEN-LAST:event_botaoSalvarActionPerformed

    private void tabelaSala2DMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaSala2DMouseClicked
        // TODO add your handling code here:
        int i = tabelaSala2D.getSelectedRow();
        
        txtNumeroSala.setText(tabelaSala2D.getValueAt(i, 0).toString());
        txtCapacidadeSala.setText(tabelaSala2D.getValueAt(i, 1).toString());
        
    }//GEN-LAST:event_tabelaSala2DMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        DefaultTableModel modelo = (DefaultTableModel) tabelaSala2D.getModel();
        modelo.setNumRows(0);
        
        for (Sala2D s2d: sala2d){
            modelo.addRow(new Object []{
                s2d.getNumeroSala(),
                s2d.getCapacidadeSala(),
                s2d.getTipoSala()
            });
        }
    }//GEN-LAST:event_formWindowOpened

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
    
    public void atualizarTabela(){
        DefaultTableModel modelo = (DefaultTableModel) tabelaSala2D.getModel();
        modelo.setNumRows(0);
        
        for (Sala2D s2d: sala2d){
            modelo.addRow(new Object []{
                s2d.getNumeroSala(),
                s2d.getCapacidadeSala()
            });
        }
    }
    
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CapacidadeSala;
    private javax.swing.JLabel NumeroSala;
    private javax.swing.JButton botaoExcluir;
    private javax.swing.JButton botaoSalvar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel painelDeletar;
    private javax.swing.JPanel painelEdicao;
    private javax.swing.JPanel painelEditar;
    private javax.swing.JTable tabelaSala2D;
    private javax.swing.JTextField txtCapacidadeSala;
    private javax.swing.JTextField txtNumeroSala;
    // End of variables declaration//GEN-END:variables
}
