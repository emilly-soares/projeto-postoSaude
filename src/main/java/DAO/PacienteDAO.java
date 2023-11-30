package DAO;

import DTO.PacienteDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Date;
import javax.swing.JOptionPane;

public class PacienteDAO {

    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<PacienteDTO> lista = new ArrayList<>();

    public PacienteDAO() {
        conn = new conexaoDAO().conectaBD();
    }

    public void cadastrarPaciente(PacienteDTO objPacienteDTO) {
        String sql = "INSERT INTO Paciente (nomepc, datnascpac, endpac, telepac, sexo, rg, uf, cidade, bairro, certidao, celpac) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = new conexaoDAO().conectaBD(); PreparedStatement pstm = conn.prepareStatement(sql)) {

            pstm.setString(1, objPacienteDTO.getNomePaciente());

            java.util.Date dataUtil = objPacienteDTO.getDataNascimento();
            java.sql.Date dataSql = new java.sql.Date(dataUtil.getTime());
            pstm.setDate(2, dataSql);

            pstm.setString(3, objPacienteDTO.getEndereco());
            pstm.setString(4, objPacienteDTO.getTelefone());
            pstm.setString(5, objPacienteDTO.getSexo());
            pstm.setString(6, objPacienteDTO.getRg());
            pstm.setString(7, objPacienteDTO.getUf());
            pstm.setString(8, objPacienteDTO.getCidade());
            pstm.setString(9, objPacienteDTO.getBairro());
            // pstm.setInt(10, objPacienteDTO.getCodigoPaciente());
            pstm.setString(10, objPacienteDTO.getCertidao());
            pstm.setString(11, objPacienteDTO.getCelular());

            pstm.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro no PacienteDAO - Cadastrar" + e);
        }
    }

    public ArrayList<PacienteDTO> pesquisarPaciente() {
        String sql = "SELECT * FROM Paciente";
        conn = new conexaoDAO().conectaBD();
        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();

            while (rs.next()) {
                PacienteDTO objPacienteDTO = new PacienteDTO();
                objPacienteDTO.setNomePaciente(rs.getString("nomepc"));
                objPacienteDTO.setDataNascimento(rs.getDate("datnascpac"));
                objPacienteDTO.setEndereco(rs.getString("endpac"));
                objPacienteDTO.setTelefone(rs.getString("telepac"));
                objPacienteDTO.setSexo(rs.getString("sexo"));
                objPacienteDTO.setRg(rs.getString("rg"));
                objPacienteDTO.setUf(rs.getString("uf"));
                objPacienteDTO.setCidade(rs.getString("cidade"));
                objPacienteDTO.setBairro(rs.getString("bairro"));
                objPacienteDTO.setCodigoPaciente(rs.getInt("codpaci"));
                objPacienteDTO.setCertidao(rs.getString("certidao"));
                objPacienteDTO.setCelular(rs.getString("celpac"));

                lista.add(objPacienteDTO);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro no PacienteDAO - Pesquisar" + e);
        }
        return lista;
    }

    public void alterarPaciente(PacienteDTO objPacienteDTO) {
        String sql = "UPDATE Paciente SET nomepc = ?, datnascpac = ?, endpac = ?, telepac = ?, "
                + "sexo = ?, rg = ?, uf = ?, cidade = ?, bairro = ?, certidao = ?, celpac = ? "
                + "WHERE codpaci = ?";

        conn = new conexaoDAO().conectaBD();

        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objPacienteDTO.getNomePaciente());
            java.util.Date dataUtil = objPacienteDTO.getDataNascimento();
            java.sql.Date dataSql = new java.sql.Date(dataUtil.getTime());
            pstm.setDate(2, dataSql);
            pstm.setString(3, objPacienteDTO.getEndereco());
            pstm.setString(4, objPacienteDTO.getTelefone());
            pstm.setString(5, objPacienteDTO.getSexo());
            pstm.setString(6, objPacienteDTO.getRg());
            pstm.setString(7, objPacienteDTO.getUf());
            pstm.setString(8, objPacienteDTO.getCidade());
            pstm.setString(9, objPacienteDTO.getBairro());
            pstm.setString(10, objPacienteDTO.getCertidao());
            pstm.setString(11, objPacienteDTO.getCelular());
            pstm.setInt(12, objPacienteDTO.getCodigoPaciente());

            pstm.execute();
            pstm.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro no PacienteDAO - Alterar" + e);
        }
    }

    public void excluirPaciente(PacienteDTO objPacienteDTO) {
        String sql = "DELETE FROM Paciente WHERE codpaci = ?";
        conn = new conexaoDAO().conectaBD();

        try {
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, objPacienteDTO.getCodigoPaciente());

            pstm.execute();
            pstm.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro no PacienteDAO - Excluir" + e);
        }
    }

    public int obterCodigoPacientePorNome(String nomePaciente) {
        int codigoPaciente = -1; 
        try {
            String sql = "SELECT codpaci FROM Paciente WHERE nomepc = ?";
            try (PreparedStatement pstm = conn.prepareStatement(sql)) {
                pstm.setString(1, nomePaciente);
                ResultSet rs = pstm.executeQuery();

                if (rs.next()) {
                    codigoPaciente = rs.getInt("codpaci");
                }
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao obter código do paciente: " + erro);
        }

        return codigoPaciente;
    }

    public ArrayList<String> recuperarNomesPacientes() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
