/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao;

import DAO.ProdutoDAO;
import Modelo.Produto;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Jorge
 */
public class JAtendimento extends javax.swing.JFrame {

    /**
     * Creates new form JAtendimento
     */
    public JAtendimento() {
        initComponents();
        DefaultTableModel T = (DefaultTableModel) jTableCompras.getModel();
        jTableCompras.setRowSorter(new TableRowSorter(T));
        
        
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
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCompras = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldCOD = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldQuant = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldPreco = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldtotal = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldValortotal = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextFieldNome = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldTroco = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(53, 136, 178));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 0, 51), null));

        jLabel1.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Caixa livre");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel2.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Cumpom fiscal");
        jLabel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 255, 255), new java.awt.Color(52, 134, 175), null, new java.awt.Color(52, 134, 175)));

        jTableCompras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nome", "Cod. Barras", "Preço", "Qnt"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableCompras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableComprasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableCompras);

        jLabel3.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Informações do produto");
        jLabel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 255, 255), new java.awt.Color(52, 134, 175), null, new java.awt.Color(52, 134, 175)));

        jTextFieldCOD.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jTextFieldCOD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCODActionPerformed(evt);
            }
        });
        jTextFieldCOD.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldCODKeyReleased(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Código de Barras");

        jTextFieldQuant.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jTextFieldQuant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldQuantActionPerformed(evt);
            }
        });
        jTextFieldQuant.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldQuantKeyReleased(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Quantidade");

        jTextFieldPreco.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Preço únitario");

        jTextFieldtotal.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jTextFieldtotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldtotalActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Preço total");

        jTextFieldValortotal.setFont(new java.awt.Font("Yu Gothic", 0, 24)); // NOI18N
        jTextFieldValortotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldValortotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldValortotalActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Total à pagar");

        jButton1.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jButton1.setText("Finalizar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jButton2.setText("Consulta");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTextFieldNome.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Nome do Produto");

        jTextFieldTroco.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jTextFieldTroco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTrocoActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Troco");

        jLabel11.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Pagamento");

        jComboBox1.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Selecionar-", "Dinheiro", "Crédito", "Débito", "Cheque", "Boleto", "PIX" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(256, 256, 256)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(242, 242, 242))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(161, 161, 161)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jTextFieldCOD, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                                        .addComponent(jTextFieldNome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextFieldQuant, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextFieldPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(jTextFieldValortotal, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(95, 95, 95)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTextFieldTroco)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldtotal)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldCOD, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldQuant, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextFieldtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldTroco, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldValortotal, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(913, 724));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

   public void ReadjTable(){
       
        
        DefaultTableModel M = (DefaultTableModel) jTableCompras.getModel();
    M.setNumRows(0);
        ProdutoDAO daop = new ProdutoDAO();
        for(Produto p : daop.buscarProdutos()){
        
        M.addRow(new Object[]{
            p.getId_produto(),
            p.getNome(),
            p.getValordvenda()
        });
        }
    
    }
    
    
    public void BuscarjTable(String COD){
        
    DefaultTableModel M = (DefaultTableModel) jTableCompras.getModel();
    M.setNumRows(0);
        ProdutoDAO daop = new ProdutoDAO();
        for(Produto p : daop.BuscarProduto(COD)){
            JOptionPane.showMessageDialog(null, p.getNome());
            
            jTextFieldNome.setText(p.getNome());
            jTextFieldPreco.setText(String.valueOf(p.getValordvenda()));
        
            
        
    
        }
        
        
    }
    
    
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Busca b = new Busca();
        b.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        float TP = Float.parseFloat(jTextFieldValortotal.getText());
        float F;
        
        F=TP+TP;
        JOptionPane.showMessageDialog(null, F);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextFieldCODActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCODActionPerformed
        // TODO add your handling code here:
        BuscarjTable(jTextFieldCOD.getText());
        
        
        DefaultTableModel M = (DefaultTableModel) jTableCompras.getModel();
        Object[] dados = {jTextFieldNome.getText(),jTextFieldCOD.getText(),jTextFieldPreco.getText(),jTextFieldQuant.getText()};
        M.setNumRows(0);
        M.addRow(dados);
    }//GEN-LAST:event_jTextFieldCODActionPerformed

    private void jTextFieldValortotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldValortotalActionPerformed
        // TODO add your handling code here:
        
        
        
        
    }//GEN-LAST:event_jTextFieldValortotalActionPerformed

    private void jTextFieldtotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldtotalActionPerformed
        // TODO add your handling code here:
        float V = Float.parseFloat(jTextFieldPreco.getText());
        float Q = Float.parseFloat(jTextFieldQuant.getText());
        float T;
        float VF = Float.parseFloat(jTextFieldValortotal.getText());
        T=V*Q;
        
        jTextFieldtotal.setText(String.valueOf(T));
        
        Action action = new AbstractAction()
{
    @Override
    public void actionPerformed(ActionEvent e)
    {
        System.out.println("some action");
//        BuscarjTable(jTextFieldCOD.getText());
//        jTextFieldQuant.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString());
//        jTextFieldtotal.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString());
//        jTextFieldPreco.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 3).toString());
    }
    
};

    JTextField textField = new JTextField(10);
textField.addActionListener( action );
    }//GEN-LAST:event_jTextFieldtotalActionPerformed

    private void jTableComprasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableComprasMouseClicked
        // TODO add your handling code here:
        
        if(jTableCompras.getSelectedRow() != -1){
        jTextFieldNome.setText(jTableCompras.getValueAt(jTableCompras.getSelectedRow(), 0).toString());
            
        jTextFieldPreco.setText(jTableCompras.getValueAt(jTableCompras.getSelectedRow(), 2).toString());
        
        }else{
        JOptionPane.showMessageDialog(null, "selecione uma linha");
        }
    }//GEN-LAST:event_jTableComprasMouseClicked

    private void jTextFieldQuantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldQuantActionPerformed
        // TODO add your handling code here:
        
         Action action = new AbstractAction()
{
    @Override
    public void actionPerformed(ActionEvent e)
    {
        System.out.println("some action");
    }
};
    JTextField textField = new JTextField(10);
textField.addActionListener( action );
    }//GEN-LAST:event_jTextFieldQuantActionPerformed

    private void jTextFieldQuantKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldQuantKeyReleased
        // TODO add your handling code here:
        float V = Float.parseFloat(jTextFieldPreco.getText());
        float Q = Float.parseFloat(jTextFieldQuant.getText());
        float T;
        float TR;
        float Pg;
        float VF;
        
        T=V*Q;
        
        jTextFieldtotal.setText(String.valueOf(T));
        
        float PT = Float.parseFloat(jTextFieldtotal.getText());
        
        
        VF=T+PT;
        
        jTextFieldValortotal.setText(String.valueOf(VF));
        
        if(jComboBox1.getSelectedItem().toString().equals("Dinheiro")){
        
            Pg = Float.parseFloat(JOptionPane.showInputDialog("Digite o Valor pago"));
            
            TR=Pg-VF;
            
        jTextFieldTroco.setText(String.valueOf(TR));
            
        
        }else if(jComboBox1.getSelectedItem().toString().equals("Crédito")){
        
            jTextFieldTroco.setText("Não tem troco");
        
        
        }else if(jComboBox1.getSelectedItem().toString().equals("Débito")){
        
            jTextFieldTroco.setText("Não tem troco");
        
        }else if(jComboBox1.getSelectedItem().toString().equals("Cheque")){
        
            jTextFieldTroco.setText("Não tem troco");
        
        }else if(jComboBox1.getSelectedItem().toString().equals("Boleto")){
        
            jTextFieldTroco.setText("Não tem troco");
        
        }else if(jComboBox1.getSelectedItem().toString().equals("PIX")){
        
            jTextFieldTroco.setText("Não tem troco");
        
        }else{
        
            jTextFieldTroco.setText("Selecione forma de pagamento");
        
        }
        
        
        
        
    }//GEN-LAST:event_jTextFieldQuantKeyReleased

    private void jTextFieldCODKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCODKeyReleased
        // TODO add your handling code here:
//        DefaultTableModel dtm = (DefaultTableModel) jTableCompras.getModel();
//        Object[] dados = {jTextFieldNome.getText(),jTextFieldCOD.getText(),jTextFieldPreco.getText(),jTextFieldQuant.getText()};
//        dtm.setNumRows(0);
//        dtm.addRow(dados);
        
//        BuscarjTable(jTextFieldCOD.getText());
    }//GEN-LAST:event_jTextFieldCODKeyReleased

    private void jTextFieldTrocoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTrocoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTrocoActionPerformed

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
            java.util.logging.Logger.getLogger(JAtendimento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JAtendimento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JAtendimento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JAtendimento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JAtendimento().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableCompras;
    private javax.swing.JTextField jTextFieldCOD;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldPreco;
    private javax.swing.JTextField jTextFieldQuant;
    private javax.swing.JTextField jTextFieldTroco;
    private javax.swing.JTextField jTextFieldValortotal;
    private javax.swing.JTextField jTextFieldtotal;
    // End of variables declaration//GEN-END:variables
}
