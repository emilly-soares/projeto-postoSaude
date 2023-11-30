package VIEW;

import DAO.PacienteDAO;
import DTO.PacienteDTO;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.DefaultComboBoxModel;

public class jfrmPaciente extends javax.swing.JFrame {

    String[] ufs = {"AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO"};
    DefaultComboBoxModel<String> ufModel = new DefaultComboBoxModel<>(ufs);

    public jfrmPaciente() {
        initComponents();
        listarValores();
        cbxuf.setModel(ufModel);
        cbxsexo.addItem("M");
        cbxsexo.addItem("F");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cbxPaciente1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtnomepc = new javax.swing.JTextField();
        txtrg = new javax.swing.JTextField();
        btnCadastrarPaciente = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaPaciente = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        txtcodpaci = new javax.swing.JTextField();
        btnCarregarPaciente = new javax.swing.JButton();
        btnLimparPaciente = new javax.swing.JButton();
        btnAlterPaciente = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtdatnascpac = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        txttelepac = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cbxsexo = new javax.swing.JComboBox<>();
        txtendpac = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtbairro = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtcidade = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        cbxuf = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        txtcertidao = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtcelpac = new javax.swing.JTextField();

        cbxPaciente1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nome");

        jLabel2.setText("RG");

        btnCadastrarPaciente.setText("Cadastrar");
        btnCadastrarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarPacienteActionPerformed(evt);
            }
        });

        tabelaPaciente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "CÓDIGO", "NOME", "NASCIMENTO", "ENDEREÇO", "TELEFONE", "SEXO", "RG", "UF", "CIDADE", "BAIRRO", "CERTIDÃO", "CELULAR"
            }
        )
    );
    jScrollPane1.setViewportView(tabelaPaciente);

    jLabel3.setText("ID");

    txtcodpaci.setEnabled(false);
    txtcodpaci.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            txtcodpaciActionPerformed(evt);
        }
    });

    btnCarregarPaciente.setText("Carregar Campos");
    btnCarregarPaciente.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnCarregarPacienteActionPerformed(evt);
        }
    });

    btnLimparPaciente.setText("Limpar");
    btnLimparPaciente.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnLimparPacienteActionPerformed(evt);
        }
    });

    btnAlterPaciente.setText("Alterar");
    btnAlterPaciente.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnAlterPacienteActionPerformed(evt);
        }
    });

    jLabel4.setText("Endereço");

    jLabel5.setText("Nascimento");

    jLabel6.setText("Telefone");

    txttelepac.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            txttelepacActionPerformed(evt);
        }
    });

    jLabel7.setText("Sexo");

    cbxsexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));

    jLabel8.setText("UF");

    jLabel9.setText("Cidade");

    jLabel10.setText("Bairro");

    cbxuf.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));

    jLabel14.setText("Certidao");

    jLabel11.setText("Celular");

    txtcelpac.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            txtcelpacActionPerformed(evt);
        }
    });

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
                            .addComponent(txtcodpaci, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(txtnomepc, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jLabel3)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtrg, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2))
                            .addGap(28, 28, 28)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txttelepac, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(33, 33, 33)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtcelpac, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(35, 35, 35)
                            .addComponent(btnCadastrarPaciente)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnCarregarPaciente)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnLimparPaciente)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnAlterPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtendpac, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel10)
                                            .addComponent(txtbairro, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(94, 94, 94))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtcidade)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(cbxuf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14)
                                    .addComponent(txtcertidao, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbxsexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtdatnascpac, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))))))
                .addGroup(layout.createSequentialGroup()
                    .addGap(14, 14, 14)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 627, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addContainerGap(27, Short.MAX_VALUE))
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
                    .addComponent(jLabel1)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtcodpaci, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtnomepc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(2, 2, 2)
                            .addComponent(txtrg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel11)
                            .addGap(2, 2, 2)
                            .addComponent(txtcelpac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jLabel6)
                    .addGap(2, 2, 2)
                    .addComponent(txttelepac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addComponent(jLabel14)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtcertidao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbxsexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(4, 4, 4))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(jLabel5))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(txtdatnascpac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGap(8, 8, 8)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel4)
                .addComponent(jLabel9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel8)))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(txtendpac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(txtbairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(txtcidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(cbxuf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(btnCadastrarPaciente)
                .addComponent(btnCarregarPaciente)
                .addComponent(btnLimparPaciente)
                .addComponent(btnAlterPaciente))
            .addGap(18, 18, 18)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap())
    );

    pack();
    setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarPacienteActionPerformed
        String nome, endereco, telefone, sexo, rg, uf, cidade, bairro, certidao, celular;
        Date dataNascimento = null;
        int codigoPaciente = 0;

        nome = txtnomepc.getText();
        endereco = txtendpac.getText();
        telefone = txttelepac.getText();
        sexo = cbxsexo.getSelectedItem().toString();
        rg = txtrg.getText();
        uf = cbxuf.getSelectedItem().toString();
        cidade = txtcidade.getText();
        bairro = txtbairro.getText();
        certidao = txtcertidao.getText();
        celular = txtcelpac.getText();

     try {
            dataNascimento = new SimpleDateFormat("dd/MM/yyyy").parse(txtdatnascpac.getText());
        } catch (java.text.ParseException ex) {
            JOptionPane.showMessageDialog(this, "Erro ao converter a data de nascimento.");
            return;
        }

        PacienteDTO pacienteDTO = new PacienteDTO();
        pacienteDTO.setNomePaciente(nome);
        pacienteDTO.setDataNascimento(dataNascimento);
        pacienteDTO.setEndereco(endereco);
        pacienteDTO.setTelefone(telefone);
        pacienteDTO.setSexo(sexo);
        pacienteDTO.setRg(rg);
        pacienteDTO.setUf(uf);
        pacienteDTO.setCidade(cidade);
        pacienteDTO.setBairro(bairro);
        pacienteDTO.setCodigoPaciente(codigoPaciente);
        pacienteDTO.setCertidao(certidao);
        pacienteDTO.setCelular(celular);

        PacienteDAO cadastrarPacienteDAO = new PacienteDAO();
        cadastrarPacienteDAO.cadastrarPaciente(pacienteDTO);

        listarValores();
        LimparCampos();
    }//GEN-LAST:event_btnCadastrarPacienteActionPerformed

    private void txtcodpaciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcodpaciActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcodpaciActionPerformed

    private void btnCarregarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarregarPacienteActionPerformed
        CarregarValores();
    }//GEN-LAST:event_btnCarregarPacienteActionPerformed

    private void btnLimparPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparPacienteActionPerformed
        LimparCampos();
    }//GEN-LAST:event_btnLimparPacienteActionPerformed

    private void btnAlterPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterPacienteActionPerformed
        AlterarPaciente();
        listarValores();
        LimparCampos();
    }//GEN-LAST:event_btnAlterPacienteActionPerformed

    private void txttelepacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttelepacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttelepacActionPerformed

    private void txtcelpacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcelpacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcelpacActionPerformed

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
            java.util.logging.Logger.getLogger(jfrmPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jfrmPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jfrmPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jfrmPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new jfrmPaciente().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterPaciente;
    private javax.swing.JButton btnCadastrarPaciente;
    private javax.swing.JButton btnCarregarPaciente;
    private javax.swing.JButton btnLimparPaciente;
    private javax.swing.JComboBox<String> cbxPaciente1;
    private javax.swing.JComboBox<String> cbxsexo;
    private javax.swing.JComboBox<String> cbxuf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JTable tabelaPaciente;
    private javax.swing.JTextField txtbairro;
    private javax.swing.JTextField txtcelpac;
    private javax.swing.JTextField txtcertidao;
    private javax.swing.JTextField txtcidade;
    private javax.swing.JTextField txtcodpaci;
    private javax.swing.JFormattedTextField txtdatnascpac;
    private javax.swing.JTextField txtendpac;
    private javax.swing.JTextField txtnomepc;
    private javax.swing.JTextField txtrg;
    private javax.swing.JTextField txttelepac;
    // End of variables declaration//GEN-END:variables

    private void listarValores() {
        try {
            PacienteDAO pacienteDAO = new PacienteDAO();
            DefaultTableModel model = (DefaultTableModel) tabelaPaciente.getModel();
            model.setNumRows(0);

            ArrayList<PacienteDTO> lista = pacienteDAO.pesquisarPaciente();

            for (int num = 0; num < lista.size(); num++) {
                model.addRow(new Object[]{
                    lista.get(num).getCodigoPaciente(),
                    lista.get(num).getNomePaciente(),
                    lista.get(num).getDataNascimento(),
                    lista.get(num).getEndereco(),
                    lista.get(num).getTelefone(),
                    lista.get(num).getSexo(),
                    lista.get(num).getRg(),
                    lista.get(num).getUf(),
                    lista.get(num).getCidade(),
                    lista.get(num).getBairro(),
                    lista.get(num).getCertidao(),
                    lista.get(num).getCelular()

                });
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro JFPaciente" + e);
        }
    }

    private void CarregarValores() {
        int setar = tabelaPaciente.getSelectedRow();

        txtcodpaci.setText(tabelaPaciente.getModel().getValueAt(setar, 0).toString());
        txtnomepc.setText(tabelaPaciente.getModel().getValueAt(setar, 1).toString());
        txtdatnascpac.setText(tabelaPaciente.getModel().getValueAt(setar, 2).toString());
        txtendpac.setText(tabelaPaciente.getModel().getValueAt(setar, 3).toString());
        txttelepac.setText(tabelaPaciente.getModel().getValueAt(setar, 4).toString());
        cbxsexo.setSelectedItem(tabelaPaciente.getModel().getValueAt(setar, 5).toString());
        txtrg.setText(tabelaPaciente.getModel().getValueAt(setar, 6).toString());
        cbxuf.setSelectedItem(tabelaPaciente.getModel().getValueAt(setar, 7).toString());
        txtcidade.setText(tabelaPaciente.getModel().getValueAt(setar, 8).toString());
        txtbairro.setText(tabelaPaciente.getModel().getValueAt(setar, 9).toString());
        txtcertidao.setText(tabelaPaciente.getModel().getValueAt(setar, 10).toString());
        txtcelpac.setText(tabelaPaciente.getModel().getValueAt(setar, 11).toString());
    }

    private void LimparCampos() {
        txtcodpaci.setText("");
        txtnomepc.setText("");
        txtrg.setText("");
        txttelepac.setText("");
        txtendpac.setText("");
        cbxsexo.setSelectedIndex(0);
        txtdatnascpac.setText("");
        txtbairro.setText("");
        txtcidade.setText("");
        cbxuf.setSelectedIndex(0);
        txtcertidao.setText("");
        txtcelpac.setText("");

        txtnomepc.requestFocus();

    }

    private void AlterarPaciente() {
        int codigoPaciente;
        String nomePaciente, endereco, telefone, sexo, rg, uf, cidade, bairro, certidao, celular;
        Date dataNascimento;

        codigoPaciente = Integer.parseInt(txtcodpaci.getText());
        nomePaciente = txtnomepc.getText();
        endereco = txtendpac.getText();
        telefone = txttelepac.getText();
        sexo = cbxsexo.getSelectedItem().toString();
        rg = txtrg.getText();
        uf = cbxuf.getSelectedItem().toString();
        cidade = txtcidade.getText();
        bairro = txtbairro.getText();
        certidao = txtcertidao.getText();
        celular = txtcelpac.getText();

        try {
            dataNascimento = (Date) new SimpleDateFormat("dd/MM/yyyy").parse(txtdatnascpac.getText());
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(this, "Erro ao converter a data de nascimento.");
            return;
        }

        PacienteDTO pacienteDTO = new PacienteDTO();
        pacienteDTO.setCodigoPaciente(codigoPaciente);
        pacienteDTO.setNomePaciente(nomePaciente);
        pacienteDTO.setDataNascimento(dataNascimento);
        pacienteDTO.setEndereco(endereco);
        pacienteDTO.setTelefone(telefone);
        pacienteDTO.setSexo(sexo);
        pacienteDTO.setRg(rg);
        pacienteDTO.setUf(uf);
        pacienteDTO.setCidade(cidade);
        pacienteDTO.setBairro(bairro);
        pacienteDTO.setCertidao(certidao);
        pacienteDTO.setCelular(celular);

        PacienteDAO pacienteDAO = new PacienteDAO();
        pacienteDAO.alterarPaciente(pacienteDTO);
    }


}
