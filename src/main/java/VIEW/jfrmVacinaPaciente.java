package VIEW;

import DAO.PacienteDAO;
import DAO.VacinaDAO;
import DAO.VacinaPacienteDAO;
import DTO.PacienteDTO;
import DTO.VacinaDTO;
import DTO.VacinaPacienteDTO;
import java.sql.SQLException;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class jfrmVacinaPaciente extends javax.swing.JFrame {

    public jfrmVacinaPaciente() {
        initComponents();
        listarValores();
        carregarComboboxPacientes();
        carregarComboboxVacinas();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaVacinaPaciente = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnLimparVacinaPaciente = new javax.swing.JButton();
        txtcodvacpac = new javax.swing.JTextField();
        txtdose = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnCadastrarVacinaPaciente = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnCarregarVacinaPaciente = new javax.swing.JButton();
        cbxvacina = new javax.swing.JComboBox<>();
        cbxpaciente = new javax.swing.JComboBox<>();
        txtdatavac = new javax.swing.JTextField();
        btnAlterar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("Paciente");

        tabelaVacinaPaciente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "CÓDIGO", "PACIENTE", "VACINA", "DOSE", "DATA VACINA"
            }
        )
    );
    jScrollPane1.setViewportView(tabelaVacinaPaciente);

    jLabel3.setText("ID");

    jLabel11.setText("Data Vacina");

    btnLimparVacinaPaciente.setText("Limpar");
    btnLimparVacinaPaciente.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnLimparVacinaPacienteActionPerformed(evt);
        }
    });

    txtcodvacpac.setEnabled(false);
    txtcodvacpac.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            txtcodvacpacActionPerformed(evt);
        }
    });

    txtdose.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            txtdoseActionPerformed(evt);
        }
    });

    jLabel6.setText("Dose");

    btnCadastrarVacinaPaciente.setText("Cadastrar");
    btnCadastrarVacinaPaciente.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnCadastrarVacinaPacienteActionPerformed(evt);
        }
    });

    jLabel1.setText("Vacina");

    btnCarregarVacinaPaciente.setText("Carregar Campos");
    btnCarregarVacinaPaciente.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnCarregarVacinaPacienteActionPerformed(evt);
        }
    });

    cbxvacina.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));

    cbxpaciente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));

    txtdatavac.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            txtdatavacActionPerformed(evt);
        }
    });

    btnAlterar.setText("Alterar");
    btnAlterar.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnAlterarActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addGap(164, 164, 164))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(txtdose, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(31, 31, 31)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                        .addComponent(txtdatavac)))
                .addGroup(layout.createSequentialGroup()
                    .addGap(58, 58, 58)
                    .addComponent(btnCadastrarVacinaPaciente)
                    .addGap(18, 18, 18)
                    .addComponent(btnCarregarVacinaPaciente)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(btnLimparVacinaPaciente)
                    .addGap(18, 18, 18)
                    .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtcodvacpac, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addComponent(cbxpaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addComponent(cbxvacina, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addGroup(layout.createSequentialGroup()
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 16, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(5, 5, 5))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtcodvacpac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbxpaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jLabel1)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(cbxvacina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel6)
                .addComponent(jLabel11))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(txtdose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(txtdatavac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(46, 46, 46)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(btnCadastrarVacinaPaciente)
                .addComponent(btnCarregarVacinaPaciente)
                .addComponent(btnLimparVacinaPaciente)
                .addComponent(btnAlterar))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimparVacinaPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparVacinaPacienteActionPerformed
        //LimparCampos();
    }//GEN-LAST:event_btnLimparVacinaPacienteActionPerformed

    private void txtcodvacpacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcodvacpacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcodvacpacActionPerformed

    private void txtdoseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdoseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdoseActionPerformed

    private void btnCadastrarVacinaPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarVacinaPacienteActionPerformed
        String nomeVacina, nomePaciente, dose;
        Date dataVacPac;
        int codigoVacina, codigoPaciente, codigovacpac = 0;

        nomeVacina = cbxvacina.getSelectedItem().toString();
        nomePaciente = cbxpaciente.getSelectedItem().toString();
        dose = txtdose.getText();

        try {
            java.util.Date utilDate = new SimpleDateFormat("dd/MM/yyyy").parse(txtdatavac.getText());
            dataVacPac = new java.sql.Date(utilDate.getTime());
        } catch (java.text.ParseException ex) {
            JOptionPane.showMessageDialog(this, "Erro ao converter a data de vacinação.");
            return;
        }

        codigoVacina = obterCodigoVacinaPorNome(nomeVacina);
        codigoPaciente = obterCodigoPacientePorNome(nomePaciente);
        System.out.println(nomePaciente);
        System.out.println(codigoPaciente);

        VacinaPacienteDTO vacinaPacienteDTO = new VacinaPacienteDTO();
        vacinaPacienteDTO.setCodigoVacinaPaciente(codigovacpac);
        vacinaPacienteDTO.setCodigoVacina(codigoVacina);
        vacinaPacienteDTO.setCodigoPaciente(codigoPaciente);
        vacinaPacienteDTO.setDose(dose);
        vacinaPacienteDTO.setDataVacPac(dataVacPac);

        VacinaPacienteDAO vacinaPacienteDAO = new VacinaPacienteDAO();

        try {
            vacinaPacienteDAO.cadastrarVacinaPaciente(vacinaPacienteDTO);
        } catch (SQLException ex) {
            Logger.getLogger(jfrmVacinaPaciente.class.getName()).log(Level.SEVERE, null, ex);
        }

        listarValores();
        limparCampos();

    }//GEN-LAST:event_btnCadastrarVacinaPacienteActionPerformed

    private void btnCarregarVacinaPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarregarVacinaPacienteActionPerformed
        carregarValores();
    }//GEN-LAST:event_btnCarregarVacinaPacienteActionPerformed

    private void txtdatavacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdatavacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdatavacActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        AlterarVacinaPaciente();
        listarValores();
        limparCampos();
    }//GEN-LAST:event_btnAlterarActionPerformed

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
            java.util.logging.Logger.getLogger(jfrmVacinaPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jfrmVacinaPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jfrmVacinaPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jfrmVacinaPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jfrmVacinaPaciente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCadastrarVacinaPaciente;
    private javax.swing.JButton btnCarregarVacinaPaciente;
    private javax.swing.JButton btnLimparVacinaPaciente;
    private javax.swing.JComboBox<String> cbxpaciente;
    private javax.swing.JComboBox<String> cbxvacina;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaVacinaPaciente;
    private javax.swing.JTextField txtcodvacpac;
    private javax.swing.JTextField txtdatavac;
    private javax.swing.JTextField txtdose;
    // End of variables declaration//GEN-END:variables

    private void listarValores() {
        try {
            VacinaPacienteDAO vacinaPacienteDAO = new VacinaPacienteDAO();
            DefaultTableModel model = (DefaultTableModel) tabelaVacinaPaciente.getModel();
            model.setNumRows(0);

            ArrayList<VacinaPacienteDTO> listaVacinaPaciente = vacinaPacienteDAO.pesquisarVacinaPaciente();

            for (int num = 0; num < listaVacinaPaciente.size(); num++) {
                model.addRow(new Object[]{
                    listaVacinaPaciente.get(num).getCodigoVacinaPaciente(),
                    listaVacinaPaciente.get(num).getCodigoPaciente(),
                    listaVacinaPaciente.get(num).getCodigoVacina(),
                    listaVacinaPaciente.get(num).getDose(),
                    listaVacinaPaciente.get(num).getDataVacPac()
                });
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar Vacina Paciente: " + e);
        }
    }

    private void carregarValores() {
        int setar = tabelaVacinaPaciente.getSelectedRow();

        cbxvacina.setSelectedItem(tabelaVacinaPaciente.getModel().getValueAt(setar, 1).toString());
        cbxpaciente.setSelectedItem(tabelaVacinaPaciente.getModel().getValueAt(setar, 2).toString());
        txtdatavac.setText(tabelaVacinaPaciente.getModel().getValueAt(setar, 3).toString());
        txtdose.setText(tabelaVacinaPaciente.getModel().getValueAt(setar, 4).toString());
    }

    private void limparCampos() {
        cbxvacina.setSelectedIndex(0);
        cbxpaciente.setSelectedIndex(0);
        txtdatavac.setText("");
        txtdose.setText("");

        cbxvacina.requestFocus();
    }

    private int obterCodigoVacinaPorNome(String nomeVacina) {
        VacinaDAO vacinaDAO = new VacinaDAO();
        return vacinaDAO.obterCodigoVacinaPorNome(nomeVacina);
    }

    private int obterCodigoPacientePorNome(String nomePaciente) {
        PacienteDAO pacienteDAO = new PacienteDAO();
        return pacienteDAO.obterCodigoPacientePorNome(nomePaciente);
    }

    private void carregarComboboxPacientes() {
        PacienteDAO pacienteDAO = new PacienteDAO();
        ArrayList<PacienteDTO> pacientes = pacienteDAO.pesquisarPaciente();

        cbxpaciente.removeAllItems();
        cbxpaciente.addItem("Selecione");

        for (PacienteDTO paciente : pacientes) {
            cbxpaciente.addItem(paciente.getNomePaciente());
        }
    }

    private void carregarComboboxVacinas() {
        VacinaDAO vacinaDAO = new VacinaDAO();
        ArrayList<VacinaDTO> vacinas = vacinaDAO.pesquisarVacina();

        cbxvacina.removeAllItems();
        cbxvacina.addItem("Selecione");

        for (VacinaDTO vacina : vacinas) {
            cbxvacina.addItem(vacina.getNomeVacina());
        }
    }

    private void AlterarVacinaPaciente() {
        int codigoVacinaPaciente;
        String nomeVacina, nomePaciente, dose;
        Date dataVacPac;

        codigoVacinaPaciente = Integer.parseInt(txtcodvacpac.getText());
        nomeVacina = cbxvacina.getSelectedItem().toString();
        nomePaciente = cbxpaciente.getSelectedItem().toString();
        dose = txtdose.getText();

        try {
            java.util.Date utilDate = new SimpleDateFormat("dd/MM/yyyy").parse(txtdatavac.getText());
            dataVacPac = new java.sql.Date(utilDate.getTime());
        } catch (java.text.ParseException ex) {
            JOptionPane.showMessageDialog(this, "Erro ao converter a data de vacinação.");
            return;
        }

        int codigoVacina = obterCodigoVacinaPorNome(nomeVacina);
        int codigoPaciente = obterCodigoPacientePorNome(nomePaciente);

        VacinaPacienteDTO vacinaPacienteDTO = new VacinaPacienteDTO();
        vacinaPacienteDTO.setCodigoVacinaPaciente(codigoVacinaPaciente);
        vacinaPacienteDTO.setCodigoVacina(codigoVacina);
        vacinaPacienteDTO.setCodigoPaciente(codigoPaciente);
        vacinaPacienteDTO.setDose(dose);
        vacinaPacienteDTO.setDataVacPac(dataVacPac);

        VacinaPacienteDAO vacinaPacienteDAO = new VacinaPacienteDAO();

        vacinaPacienteDAO.alterarVacinaPaciente(vacinaPacienteDTO);

        listarValores();
        limparCampos();
    }

}
