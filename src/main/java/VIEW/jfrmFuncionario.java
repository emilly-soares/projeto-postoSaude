package VIEW;

import DAO.FuncionarioDAO;
import DTO.FuncionarioDTO;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class jfrmFuncionario extends javax.swing.JFrame {

    String[] ufs = {"AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO"};
    DefaultComboBoxModel<String> ufModel = new DefaultComboBoxModel<>(ufs);

    public jfrmFuncionario() {
        initComponents();
        listarValores();
        cbxuf.setModel(ufModel);
        cbxsexo.addItem("M");
        cbxsexo.addItem("F");
        cbxfuncaofun.addItem("Enfermeiro(a)");
        cbxfuncaofun.addItem("Médico(a)");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCadastrarFuncionario = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaFuncionario = new javax.swing.JTable();
        txtbairro = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtcidade = new javax.swing.JTextField();
        txtcodfun = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        btnCarregarFuncionario = new javax.swing.JButton();
        cbxuf = new javax.swing.JComboBox<>();
        btnLimparFuncionario = new javax.swing.JButton();
        btnAlterarFuncionario = new javax.swing.JButton();
        btnExcluirFuncionario = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtdatnascfun = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        txttelefun = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        cbxsexo = new javax.swing.JComboBox<>();
        txtnomefun = new javax.swing.JTextField();
        txtendfun = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtrg = new javax.swing.JTextField();
        txtcelfun = new javax.swing.JTextField();
        txtogexp = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtcpf = new javax.swing.JFormattedTextField();
        cbxfuncaofun = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnCadastrarFuncionario.setText("Cadastrar");
        btnCadastrarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarFuncionarioActionPerformed(evt);
            }
        });

        jLabel8.setText("UF");

        tabelaFuncionario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "CÓDIGO", "NOME", "NASCIMENTO", "ENDEREÇO", "TELEFONE", "ORGEXP", "RG", "UF", "CIDADE", "BAIRRO", "CPF", "FUNÇÃO", "SEXO", "CELULAR"
            }
        )
    );
    jScrollPane1.setViewportView(tabelaFuncionario);

    jLabel9.setText("Cidade");

    jLabel3.setText("ID");

    txtcodfun.setEnabled(false);
    txtcodfun.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            txtcodfunActionPerformed(evt);
        }
    });

    jLabel10.setText("Bairro");

    btnCarregarFuncionario.setText("Carregar Campos");
    btnCarregarFuncionario.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnCarregarFuncionarioActionPerformed(evt);
        }
    });

    cbxuf.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));

    btnLimparFuncionario.setText("Limpar");
    btnLimparFuncionario.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnLimparFuncionarioActionPerformed(evt);
        }
    });

    btnAlterarFuncionario.setText("Alterar");
    btnAlterarFuncionario.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnAlterarFuncionarioActionPerformed(evt);
        }
    });

    btnExcluirFuncionario.setText("Excluir");
    btnExcluirFuncionario.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnExcluirFuncionarioActionPerformed(evt);
        }
    });

    jLabel4.setText("Endereço");

    jLabel5.setText("Nascimento");

    jLabel6.setText("Telefone");

    txttelefun.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            txttelefunActionPerformed(evt);
        }
    });

    jLabel7.setText("Sexo");

    jLabel1.setText("Nome");

    jLabel2.setText("RG");

    jLabel14.setText("Função");

    cbxsexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));

    jLabel11.setText("Celular");

    txtcelfun.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            txtcelfunActionPerformed(evt);
        }
    });

    jLabel12.setText("Orgão Expedidor");

    jLabel13.setText("CPF");

    cbxfuncaofun.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(35, 35, 35)
                            .addComponent(btnCadastrarFuncionario)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnCarregarFuncionario)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnLimparFuncionario)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnAlterarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnExcluirFuncionario))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(txtcodfun, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtnomefun, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel14)
                                .addComponent(cbxfuncaofun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jLabel3)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtendfun, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel10)
                                .addComponent(txtbairro, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(23, 23, 23)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel9)
                                .addComponent(txtcidade, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel8)
                                .addComponent(cbxuf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(37, 37, 37))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(txttelefun)
                                            .addGap(4, 4, 4)))
                                    .addGap(14, 14, 14)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtcelfun, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(txtrg, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtogexp, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel12))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(12, 12, 12)
                                    .addComponent(cbxsexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel5)
                                        .addComponent(txtdatnascfun, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel13)
                                        .addComponent(txtcpf, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addGroup(layout.createSequentialGroup()
                    .addGap(14, 14, 14)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 627, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addContainerGap(8, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jLabel3)
                    .addGap(5, 5, 5))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel14))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(txtcodfun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(txtnomefun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(cbxfuncaofun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel2)
                .addComponent(jLabel12)
                .addComponent(jLabel13))
            .addGap(2, 2, 2)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(txtrg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(txtogexp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(txtcpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(10, 10, 10)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel6)
                .addComponent(jLabel11)
                .addComponent(jLabel7)
                .addComponent(jLabel5))
            .addGap(2, 2, 2)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(txttelefun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(txtcelfun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(cbxsexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(txtdatnascfun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel8))
                .addComponent(jLabel4))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(txtendfun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(txtbairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(txtcidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(cbxuf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(btnCadastrarFuncionario)
                .addComponent(btnCarregarFuncionario)
                .addComponent(btnLimparFuncionario)
                .addComponent(btnAlterarFuncionario)
                .addComponent(btnExcluirFuncionario))
            .addGap(18, 18, 18)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap())
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarFuncionarioActionPerformed
        String nome, endereco, telefone, sexo, rg, uf, cidade, bairro, funcao, celular, cpf, ogexp;
        Date dataNascimento;
        int codigoFuncionario = 0;

        nome = txtnomefun.getText();
        endereco = txtendfun.getText();
        telefone = txttelefun.getText();
        sexo = cbxsexo.getSelectedItem().toString();
        rg = txtrg.getText();
        uf = cbxuf.getSelectedItem().toString();
        cidade = txtcidade.getText();
        bairro = txtbairro.getText();
        funcao = cbxfuncaofun.getSelectedItem().toString();
        celular = txtcelfun.getText();
        cpf = txtcpf.getText();
        ogexp = txtogexp.getText();

        try {
            dataNascimento = new SimpleDateFormat("dd/MM/yyyy").parse(txtdatnascfun.getText());
        } catch (java.text.ParseException ex) {
            JOptionPane.showMessageDialog(this, "Erro ao converter a data de nascimento.");
            return;
        }

        FuncionarioDTO funcionarioDTO = new FuncionarioDTO();
        
        funcionarioDTO.setNomeFuncionario(nome);
        funcionarioDTO.setDataNascimento(dataNascimento);
        funcionarioDTO.setEndereco(endereco);
        funcionarioDTO.setTelefone(telefone);
        funcionarioDTO.setSexo(sexo);
        funcionarioDTO.setRg(rg);
        funcionarioDTO.setUf(uf);
        funcionarioDTO.setCidade(cidade);
        funcionarioDTO.setBairro(bairro);
        funcionarioDTO.setFuncao(funcao);
        funcionarioDTO.setCodigoFuncionario(codigoFuncionario);
        funcionarioDTO.setCelular(celular);
        funcionarioDTO.setCpf(cpf);
        funcionarioDTO.setOrgaoExpedidor(ogexp);

        FuncionarioDAO cadastrarFuncionarioDAO = new FuncionarioDAO();
        cadastrarFuncionarioDAO.cadastrarFuncionario(funcionarioDTO);

        listarValores();
        LimparCampos();
    }//GEN-LAST:event_btnCadastrarFuncionarioActionPerformed

    private void txtcodfunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcodfunActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcodfunActionPerformed

    private void btnCarregarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarregarFuncionarioActionPerformed
        CarregarValores();
    }//GEN-LAST:event_btnCarregarFuncionarioActionPerformed

    private void btnLimparFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparFuncionarioActionPerformed
        LimparCampos();
    }//GEN-LAST:event_btnLimparFuncionarioActionPerformed

    private void btnExcluirFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirFuncionarioActionPerformed
        //ExcluirFuncionario();
        listarValores();
        LimparCampos();
    }//GEN-LAST:event_btnExcluirFuncionarioActionPerformed

    private void txttelefunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttelefunActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttelefunActionPerformed

    private void txtcelfunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcelfunActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcelfunActionPerformed

    private void btnAlterarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarFuncionarioActionPerformed
        AlterarFuncionario();
        listarValores();
        LimparCampos();
    }//GEN-LAST:event_btnAlterarFuncionarioActionPerformed

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
            java.util.logging.Logger.getLogger(jfrmFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jfrmFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jfrmFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jfrmFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new jfrmFuncionario().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterarFuncionario;
    private javax.swing.JButton btnCadastrarFuncionario;
    private javax.swing.JButton btnCarregarFuncionario;
    private javax.swing.JButton btnExcluirFuncionario;
    private javax.swing.JButton btnLimparFuncionario;
    private javax.swing.JComboBox<String> cbxfuncaofun;
    private javax.swing.JComboBox<String> cbxsexo;
    private javax.swing.JComboBox<String> cbxuf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaFuncionario;
    private javax.swing.JTextField txtbairro;
    private javax.swing.JTextField txtcelfun;
    private javax.swing.JTextField txtcidade;
    private javax.swing.JTextField txtcodfun;
    private javax.swing.JFormattedTextField txtcpf;
    private javax.swing.JFormattedTextField txtdatnascfun;
    private javax.swing.JTextField txtendfun;
    private javax.swing.JTextField txtnomefun;
    private javax.swing.JTextField txtogexp;
    private javax.swing.JTextField txtrg;
    private javax.swing.JTextField txttelefun;
    // End of variables declaration//GEN-END:variables

    private void listarValores() {
        try {
            FuncionarioDAO objFuncionarioDAO = new FuncionarioDAO();
            DefaultTableModel model = (DefaultTableModel) tabelaFuncionario.getModel();
            model.setNumRows(0);

            ArrayList<FuncionarioDTO> lista = objFuncionarioDAO.pesquisarFuncionario();

            for (int num = 0; num < lista.size(); num++) {
                model.addRow(new Object[]{
                    lista.get(num).getCodigoFuncionario(),
                    lista.get(num).getNomeFuncionario(),
                    lista.get(num).getDataNascimento(),
                    lista.get(num).getEndereco(),
                    lista.get(num).getTelefone(),
                    lista.get(num).getOrgaoExpedidor(),
                    lista.get(num).getRg(),
                    lista.get(num).getUf(),
                    lista.get(num).getCidade(),
                    lista.get(num).getBairro(),
                    lista.get(num).getCpf(),
                    lista.get(num).getFuncao(),
                    lista.get(num).getSexo(),
                    lista.get(num).getCelular()
                });
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro JFFuncionario" + e);
        }
    }

    private void CarregarValores() {
        int setar = tabelaFuncionario.getSelectedRow();

        txtcodfun.setText(tabelaFuncionario.getModel().getValueAt(setar, 0).toString());
        txtnomefun.setText(tabelaFuncionario.getModel().getValueAt(setar, 1).toString());
        txtdatnascfun.setText(tabelaFuncionario.getModel().getValueAt(setar, 2).toString());
        txtendfun.setText(tabelaFuncionario.getModel().getValueAt(setar, 3).toString());
        txttelefun.setText(tabelaFuncionario.getModel().getValueAt(setar, 4).toString());
        txtogexp.setText(tabelaFuncionario.getModel().getValueAt(setar, 5).toString());
        txtrg.setText(tabelaFuncionario.getModel().getValueAt(setar, 6).toString());
        cbxuf.setSelectedItem(tabelaFuncionario.getModel().getValueAt(setar, 7).toString());
        txtcidade.setText(tabelaFuncionario.getModel().getValueAt(setar, 8).toString());
        txtbairro.setText(tabelaFuncionario.getModel().getValueAt(setar, 9).toString());
        txtcpf.setText(tabelaFuncionario.getModel().getValueAt(setar, 10).toString());
        cbxfuncaofun.setSelectedItem(tabelaFuncionario.getModel().getValueAt(setar, 11).toString());
        cbxsexo.setSelectedItem(tabelaFuncionario.getModel().getValueAt(setar, 12).toString());
        txtcelfun.setText(tabelaFuncionario.getModel().getValueAt(setar, 13).toString());
    }

    private void LimparCampos() {
        txtcodfun.setText("");
        txtnomefun.setText("");
        txtdatnascfun.setText("");
        txtendfun.setText("");
        txttelefun.setText("");
        txtogexp.setText("");
        txtrg.setText("");
        cbxuf.setSelectedIndex(0);
        txtcidade.setText("");
        txtbairro.setText("");
        txtcpf.setText("");
        cbxfuncaofun.setSelectedIndex(0);
        cbxsexo.setSelectedIndex(0);
        txtcelfun.setText("");

        txtnomefun.requestFocus();
    }

    private void AlterarFuncionario() {

        int codigoFuncionario;
        String nomeFuncionario, enderecoFuncionario, telefoneFuncionario, orgaoExpedidor, rgFuncionario, ufFuncionario, cidadeFuncionario, bairroFuncionario,
                cpfFuncionario, funcaoFuncionario, sexoFuncionario, celularFuncionario;
        Date dataNascimento;
        codigoFuncionario = Integer.parseInt(txtcodfun.getText());
        nomeFuncionario = txtnomefun.getText();
        enderecoFuncionario = txtendfun.getText();
        telefoneFuncionario = txttelefun.getText();
        orgaoExpedidor = txtogexp.getText();
        rgFuncionario = txtrg.getText();
        ufFuncionario = cbxuf.getSelectedItem().toString();
        cidadeFuncionario = txtcidade.getText();
        bairroFuncionario = txtbairro.getText();
        cpfFuncionario = txtcpf.getText();
        funcaoFuncionario = cbxfuncaofun.getSelectedItem().toString();
        sexoFuncionario = cbxsexo.getSelectedItem().toString();
        celularFuncionario = txtcelfun.getText();
        try {
            dataNascimento = new SimpleDateFormat("dd/MM/yyyy").parse(txtdatnascfun.getText());
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(this, "Erro ao converter a data de nascimento.");
            return;
        }

        FuncionarioDTO objFuncionarioDTO = new FuncionarioDTO();

        objFuncionarioDTO.setCodigoFuncionario(codigoFuncionario);
        objFuncionarioDTO.setNomeFuncionario(nomeFuncionario);
        objFuncionarioDTO.setDataNascimento(dataNascimento);
        objFuncionarioDTO.setEndereco(enderecoFuncionario);
        objFuncionarioDTO.setTelefone(telefoneFuncionario);
        objFuncionarioDTO.setOrgaoExpedidor(orgaoExpedidor);
        objFuncionarioDTO.setRg(rgFuncionario);
        objFuncionarioDTO.setUf(ufFuncionario);
        objFuncionarioDTO.setCidade(cidadeFuncionario);
        objFuncionarioDTO.setBairro(bairroFuncionario);
        objFuncionarioDTO.setCpf(cpfFuncionario);
        objFuncionarioDTO.setFuncao(funcaoFuncionario);
        objFuncionarioDTO.setSexo(sexoFuncionario);
        objFuncionarioDTO.setCelular(celularFuncionario);

        FuncionarioDAO objFuncionarioDAO = new FuncionarioDAO();
        
        objFuncionarioDAO.alterarFuncionario(objFuncionarioDTO);
        listarValores();
        LimparCampos();
    }
/*
    private void ExcluirFuncionario() {
        try {
            int idFuncionario = Integer.parseInt(txtcodfun.getText());

            FuncionarioDTO objFuncionarioDTO = new FuncionarioDTO();

            objFuncionarioDTO.setCodigoFuncionario(idFuncionario);

            FuncionarioDAO objFuncionarioDAO = new FuncionarioDAO();

            objFuncionarioDAO.excluirFuncionario(objFuncionarioDTO);
            listarValores();
            LimparCampos();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Erro ao excluir funcionário: " + e.getMessage());
        }
    }*/
}
