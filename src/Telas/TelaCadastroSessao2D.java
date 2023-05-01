/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import Negocio.Filme;
import Negocio.Sala2D;
import Negocio.Sessao;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Gleidson
 */
public class TelaCadastroSessao2D extends javax.swing.JFrame {
    private ArrayList<Filme> filme = new ArrayList<>();
    private ArrayList<Sala2D> sala2d = new ArrayList<>();
    private ArrayList<Sessao> sessao = new ArrayList<>();

    
    public TelaCadastroSessao2D(ArrayList<Filme> filme, ArrayList<Sala2D> sala2d, ArrayList<Sessao> sessao) {
        initComponents();
        this.filme = filme;
        this.sessao = sessao;
        this.sala2d = sala2d;
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
        horarioSessao = new javax.swing.JLabel();
        capacidadeSessao = new javax.swing.JLabel();
        dataSessao = new javax.swing.JLabel();
        filmeSessao = new javax.swing.JLabel();
        salaSessao = new javax.swing.JLabel();
        selecionarSala = new javax.swing.JComboBox<>();
        selecionarFilme = new javax.swing.JComboBox<>();
        txtHorario = new javax.swing.JTextField();
        txtCapacidade = new javax.swing.JTextField();
        txtData = new javax.swing.JTextField();
        botaoSalvarSessao = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastrar Sessão 2D", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

        horarioSessao.setText("Horário:");

        capacidadeSessao.setText("Capacidade:");

        dataSessao.setText("Data:");

        filmeSessao.setText("Filme:");

        salaSessao.setText("Sala:");

        selecionarSala.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar Sala" }));

        selecionarFilme.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar Filme" }));
        selecionarFilme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selecionarFilmeActionPerformed(evt);
            }
        });

        botaoSalvarSessao.setText("Salvar");
        botaoSalvarSessao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarSessaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(capacidadeSessao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtCapacidade, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(horarioSessao)
                        .addGap(62, 62, 62)
                        .addComponent(txtHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dataSessao)
                            .addComponent(filmeSessao)
                            .addComponent(salaSessao))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(selecionarSala, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtData)
                                .addComponent(selecionarFilme, 0, 130, Short.MAX_VALUE))
                            .addComponent(botaoSalvarSessao))))
                .addGap(98, 98, 98))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(horarioSessao)
                    .addComponent(txtHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(capacidadeSessao)
                    .addComponent(txtCapacidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dataSessao)
                    .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(filmeSessao)
                    .addComponent(selecionarFilme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salaSessao)
                    .addComponent(selecionarSala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(botaoSalvarSessao)
                .addContainerGap())
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

    private void selecionarFilmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selecionarFilmeActionPerformed
        selecionarFilme.getSelectedIndex();
    }//GEN-LAST:event_selecionarFilmeActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        
        selecionarFilme.removeAllItems();
        
        for (Filme f: filme){
            selecionarFilme.addItem(f.getTitulo());
        }

        
        selecionarSala.removeAllItems();       
        
        for (Sala2D s2: sala2d){
            selecionarSala.addItem(String.valueOf(s2.getNumeroSala()));
        }
        
    }//GEN-LAST:event_formWindowOpened

    private void botaoSalvarSessaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarSessaoActionPerformed
        
        if (validarCampos()){
        
        Sessao s;
        
        int capacidade = Integer.parseInt(txtCapacidade.getText());
        int i = selecionarSala.getSelectedIndex();
        
        if (sala2d.get(i).getCapacidadeSala() < capacidade){
            //limita a capacidade da sessão a capacidade da sala
            capacidade = sala2d.get(i).getCapacidadeSala();
            JOptionPane.showMessageDialog(null, "A capacidade da sessão foi definida como "+capacidade);
        }
        
        s = new Sessao(txtHorario.getText(), capacidade, txtData.getText(),sala2d.get(selecionarSala.getSelectedIndex()), filme.get(selecionarFilme.getSelectedIndex()));
        sessao.add(s);
        
        JOptionPane.showMessageDialog(null, "Sessão incluida com sucesso!");
        }
    }//GEN-LAST:event_botaoSalvarSessaoActionPerformed

    public void limpar(){
        txtHorario.setText("");
        txtCapacidade.setText("");
        txtData.setText("");
    }
    
    public boolean validarCampos(){
        
        if (txtHorario.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Informe o horario da sessão");
            return false;
        }
        else if (txtCapacidade.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Informe a capacidade da sessão");
            return false;
        }
        else if (txtData.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Informe a data da sessão");
            return false;
        } 
        return true;
    }
    
    
    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoSalvarSessao;
    private javax.swing.JLabel capacidadeSessao;
    private javax.swing.JLabel dataSessao;
    private javax.swing.JLabel filmeSessao;
    private javax.swing.JLabel horarioSessao;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel salaSessao;
    private javax.swing.JComboBox<String> selecionarFilme;
    private javax.swing.JComboBox<String> selecionarSala;
    private javax.swing.JTextField txtCapacidade;
    private javax.swing.JTextField txtData;
    private javax.swing.JTextField txtHorario;
    // End of variables declaration//GEN-END:variables
}
