package DAO;

import DTO.VacinaPacienteDTO;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class VacinaPacienteDAO {

    private Connection conn;

    public VacinaPacienteDAO() {
        conn = new conexaoDAO().conectaBD();
    }

    public void cadastrarVacinaPaciente(VacinaPacienteDTO vacinaPacienteDTO) throws SQLException {

        String sql = "INSERT INTO Vacina_Paciente (codvac, codpac, datavacpac, dose) VALUES (?, ?, ?, ?)";
        try (Connection conn = new conexaoDAO().conectaBD(); PreparedStatement pstm = conn.prepareStatement(sql)) {
            pstm.setInt(1, vacinaPacienteDTO.getCodigoVacina());
            pstm.setInt(2, vacinaPacienteDTO.getCodigoPaciente());
            pstm.setDate(3, (Date) vacinaPacienteDTO.getDataVacPac());
            pstm.setString(4, vacinaPacienteDTO.getDose());
            pstm.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro no FuncionarioDAO - Cadastrar" + e);
        }
    }

    public ArrayList<VacinaPacienteDTO> pesquisarVacinaPaciente() {
        ArrayList<VacinaPacienteDTO> listaVacinaPacientes = new ArrayList<>();

        try {
            String sql = "SELECT * FROM Vacina_Paciente";
            try (PreparedStatement pstm = conn.prepareStatement(sql)) {
                ResultSet rs = pstm.executeQuery();

                while (rs.next()) {
                    VacinaPacienteDTO vacinaPaciente = new VacinaPacienteDTO();
                    vacinaPaciente.setCodigoVacinaPaciente(rs.getInt("codvacpac"));
                    vacinaPaciente.setCodigoVacina(rs.getInt("codvac"));
                    vacinaPaciente.setCodigoPaciente(rs.getInt("codpac"));
                    vacinaPaciente.setDataVacPac(rs.getDate("datavacpac"));
                    vacinaPaciente.setDose(rs.getString("dose"));

                    listaVacinaPacientes.add(vacinaPaciente);
                }
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao pesquisar relação Vacina_Paciente: " + erro);
        }

        return listaVacinaPacientes;
    }

    public void alterarVacinaPaciente(VacinaPacienteDTO vacinaPacienteDTO) {
        try {
            String sql = "UPDATE Vacina_Paciente SET codvac=?, codpac=?, datavacpac=?, dose=? WHERE codvacpac=?";
            try (PreparedStatement pstm = conn.prepareStatement(sql)) {
                pstm.setInt(1, vacinaPacienteDTO.getCodigoVacina());
                pstm.setInt(2, vacinaPacienteDTO.getCodigoPaciente());
                pstm.setDate(3, (Date) vacinaPacienteDTO.getDataVacPac());
                pstm.setString(4, vacinaPacienteDTO.getDose());
                pstm.setInt(5, vacinaPacienteDTO.getCodigoVacinaPaciente());

                pstm.executeUpdate();
            }
            JOptionPane.showMessageDialog(null, "Relação Vacina_Paciente alterada com sucesso!");
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar relação Vacina_Paciente: " + erro);
        }
    }

    public void excluirVacinaPaciente(VacinaPacienteDTO vacinaPacienteDTO) {
        try {
            String sql = "DELETE FROM Vacina_Paciente WHERE codvacpac=?";
            try (PreparedStatement pstm = conn.prepareStatement(sql)) {
                pstm.setInt(1, vacinaPacienteDTO.getCodigoVacinaPaciente());

                pstm.executeUpdate();
            }
            JOptionPane.showMessageDialog(null, "Relação Vacina_Paciente excluída com sucesso!");
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir relação Vacina_Paciente: " + erro);
        }
    }
}
