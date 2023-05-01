/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import Negocio.Sessao;
import Negocio.Sala2D;
import Negocio.Sala3D;
import Negocio.Ingresso;
import Negocio.Cinema;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Gleidson
 */
public class TelaVenderIngresso extends javax.swing.JFrame {
    private String tipo;
    private double valor;

    /**
     * Creates new form TelaCadastroFilme
     */
    
    private ArrayList<Sessao> sessao = new ArrayList<>();
    private ArrayList<Ingresso> ingresso = new ArrayList<>();
    private ArrayList<Cinema> cinema = new ArrayList<>();
    private ArrayList<Sala2D> sala2d = new ArrayList<>();
    private ArrayList<Sala3D> sala3d = new ArrayList<>();
    
    public TelaVenderIngresso(ArrayList<Sessao> sessao, ArrayList<Ingresso> ingresso, ArrayList<Cinema> cinema){
        this.sessao = sessao;
        this.ingresso = ingresso;
        this.cinema = cinema;
        this.sala2d = sala2d;
        this.sala3d = sala3d;
        this.tipo = tipo;
        this.valor = valor;
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
        jPanel2 = new javax.swing.JPanel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaSessao = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        selecionarSessao = new javax.swing.JComboBox<>();
        botaoComprar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtQuantidade = new javax.swing.JTextField();
        radioInteira = new javax.swing.JRadioButton();
        radioMeia = new javax.swing.JRadioButton();
        selecionarDia = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sessoes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        tabelaSessao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Hora", "Assentos Disponíveis", "Data", "Filme", "Sala", "Tipo da Sala"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelaSessao);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 849, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 471, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Data", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        selecionarSessao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        botaoComprar.setText("realizar venda");
        botaoComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoComprarActionPerformed(evt);
            }
        });

        jLabel1.setText("Selecione a Sessão:");

        jLabel2.setText("Informe a quantidade:");

        radioInteira.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(radioInteira);
        radioInteira.setText("Inteira");
        radioInteira.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radioInteiraMouseClicked(evt);
            }
        });

        radioMeia.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(radioMeia);
        radioMeia.setText("Meia entrada");
        radioMeia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radioMeiaMouseClicked(evt);
            }
        });

        selecionarDia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Informe o dia", "Domingo", "Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado" }));
        selecionarDia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                selecionarDiaMouseClicked(evt);
            }
        });
        selecionarDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selecionarDiaActionPerformed(evt);
            }
        });

        jLabel3.setText("Informe o dia:");

        jLabel4.setText("Tipo do Ingresso:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 113, Short.MAX_VALUE)
                .addComponent(botaoComprar)
                .addGap(116, 116, 116))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1)
                        .addComponent(selecionarSessao, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(radioInteira)
                            .addGap(32, 32, 32)
                            .addComponent(radioMeia))
                        .addComponent(selecionarDia, 0, 310, Short.MAX_VALUE))
                    .addComponent(jLabel3)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(selecionarSessao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(selecionarDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioInteira)
                    .addComponent(radioMeia))
                .addGap(75, 75, 75)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68)
                .addComponent(botaoComprar)
                .addGap(63, 63, 63))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
        atualizarTabela();       
        
        selecionarSessao.removeAllItems();
        for (Sessao st: sessao){
            String info = "Filme: "+st.getFilme().getTitulo()+" Horario: "+st.getHorarioSessao()+" Data: "+st.getData()+" Sala: "+st.getSalas().getNumeroSala()+" Tipo: "+st.getSalas().getTipoSala();
            selecionarSessao.addItem(info);
        }       
        
    }//GEN-LAST:event_formWindowOpened

    private void botaoComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoComprarActionPerformed
        
        
        if (validarCampos()){
        int i = selecionarSessao.getSelectedIndex();
        
        int quantidade = Integer.parseInt(txtQuantidade.getText());
        
        if (sessao.get(i).getCapacidadeSessao() >= quantidade){
            
            for (int q=0; q<quantidade; q++){
                sessao.get(i).setCapacidadeSessao(sessao.get(i).getCapacidadeSessao() - 1);
        
                Ingresso ing;

                ing = new Ingresso(sessao.get(i).getFilme().getTitulo(), sessao.get(i).getHorarioSessao(), sessao.get(i).getData(), sessao.get(i).getSalas().getNumeroSala(), sessao.get(i).getSalas().getTipoSala(), tipo, "VENDIDO");
                
                ingresso.add(ing);
        
                imprimirIngresso();
        
            }
            atualizarTabela();
            valor = valor * quantidade;
            JOptionPane.showMessageDialog(null, "Compra no valor de R$"+valor+" efetuada com sucesso!");
            
        }
            
        else {
            JOptionPane.showMessageDialog(null, "Impossível realizar a compra. Assentos Disponíveis: "+sessao.get(i).getCapacidadeSessao());
        }
        
        limpar();
        }

    }//GEN-LAST:event_botaoComprarActionPerformed

    private void radioInteiraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radioInteiraMouseClicked
        if (radioInteira.isSelected()){
            tipo = "Inteira";
            
            
            int i = selecionarSessao.getSelectedIndex();
            //Sala2D sala2d = new Sala2D();
            //Sala3D sala3d = new Sala3D();
            
            if (sessao.get(i).getSalas().getTipoSala().toString() == "3D"){
                //sala3d.calcularIngresso();
                calcularInteira3D();
            } else {
                //sala2d.calcularIngresso();
                calcularInteira();
            }
        }
    }//GEN-LAST:event_radioInteiraMouseClicked

    private void radioMeiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radioMeiaMouseClicked
        if (radioMeia.isSelected()){
            tipo = "Meia";
            
            int i = selecionarSessao.getSelectedIndex();
            //Sala2D sala2d = new Sala2D();
            //Sala3D sala3d = new Sala3D();
            
            if (sessao.get(i).getSalas().getTipoSala().toString() == "3D"){
                //sala3d.calcularMeia();
                calcularMeia3D();
            } else {
                //sala2d.calcularMeia();
                calcularMeia();
            }
        }            
    }//GEN-LAST:event_radioMeiaMouseClicked

    private void selecionarDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selecionarDiaActionPerformed
        if (selecionarDia.getSelectedItem().toString().equals("Sábado") || selecionarDia.getSelectedItem().toString().equals("Domingo")){
            valor = cinema.get(0).getValorIngressoFDS();
        }else{
            valor = cinema.get(0).getValorIngresso();
        }
    }//GEN-LAST:event_selecionarDiaActionPerformed

    private void selecionarDiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selecionarDiaMouseClicked
        //selecionarDia.getSelectedItem();
    }//GEN-LAST:event_selecionarDiaMouseClicked

    void atualizarTabela(){
        DefaultTableModel modelo = (DefaultTableModel) tabelaSessao.getModel();
        modelo.setNumRows(0);
                
        for (Sessao st: sessao){
            
            modelo.addRow(new Object []{
                st.getHorarioSessao(),
                st.getCapacidadeSessao(),
                st.getData(),
                st.getFilme().getTitulo(),
                st.getSalas().getNumeroSala(),
                st.getSalas().getTipoSala()                    
            });
        }
    }
    
    public void limpar(){
        txtQuantidade.setText("");
        radioInteira.setSelected(true);
        selecionarDia.setSelectedIndex(0);
    }
    
    public boolean validarCampos(){
        
        if (selecionarDia.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(null, "Selecione o dia");
            return false;
        }
        
        else if((radioMeia.isSelected()==false)&&(radioInteira.isSelected()==false)){
            JOptionPane.showMessageDialog(null,"Informe o tipo do ingresso");
        }        
        else if (txtQuantidade.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Informe a quantidade de ingressos");
            return false;
        } 
        return true;
    }
        
        void calcularMeia(){
            valor = valor / 2;
        }
        
        void calcularInteira(){
            valor = valor;
        }
        
        void calcularMeia3D(){
            valor = (valor * 1.2) / 2;
        }
        
        void calcularInteira3D(){
            valor = valor * 1.2;
        }
        
        void imprimirIngresso(){
            int i = ingresso.size() - 1;
            
            System.out.println("");
            System.out.println("********************");
            System.out.println("Código do ingresso: " +i);
            System.out.println("Filme: "+ingresso.get(i).getFilme()+" ("+ingresso.get(i).getTipoSala()+")");
            System.out.println("Tipo: "+ingresso.get(i).getTipoIngresso());
            System.out.println("Sala: "+ingresso.get(i).getSala());
            System.out.println("Sessão: "+ingresso.get(i).getData()+" - "+ingresso.get(i).getHorario());
            System.out.println("********************");
            System.out.println("");
            
        }
                
    
    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoComprar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton radioInteira;
    private javax.swing.JRadioButton radioMeia;
    private javax.swing.JComboBox<String> selecionarDia;
    private javax.swing.JComboBox<String> selecionarSessao;
    private javax.swing.JTable tabelaSessao;
    private javax.swing.JTextField txtQuantidade;
    // End of variables declaration//GEN-END:variables
}
