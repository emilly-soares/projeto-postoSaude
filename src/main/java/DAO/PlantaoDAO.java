package DAO;

import DTO.PlantaoDTO;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class PlantaoDAO {

    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<PlantaoDTO> lista = new ArrayList<>();

    public PlantaoDAO() {
        conn = new conexaoDAO().conectaBD();
    }

    public void cadastrarPlantao(PlantaoDTO objPlantaoDTO) {
        String sql = "INSERT INTO Plantao (codeplanenf, codenf, horentrada, horasaida, dataplant, codmed) "
                + "VALUES (?, ?, ?, ?, ?, ?)";

        try (Connection conn = new conexaoDAO().conectaBD(); PreparedStatement pstm = conn.prepareStatement(sql)) {
            pstm.setInt(1, objPlantaoDTO.getCodigoPlantaoEnfermeiro());
            pstm.setInt(2, objPlantaoDTO.getCodigoEnfermeiro());
            pstm.setString(3, objPlantaoDTO.getHorarioEntrada());
            pstm.setString(4, objPlantaoDTO.getHorarioSaida());
            pstm.setDate(5, (Date) objPlantaoDTO.getDataPlantao());
            pstm.setInt(6, objPlantaoDTO.getCodigoMedico());

            pstm.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro no PlantaoDAO - Cadastrar" + e);
        }
    }

    public ArrayList<PlantaoDTO> pesquisarPlantao() {
        String sql = "SELECT * FROM Plantao";
        conn = new conexaoDAO().conectaBD();
        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();

            while (rs.next()) {
                PlantaoDTO objPlantaoDTO = new PlantaoDTO();
                objPlantaoDTO.setCodigoPlantaoEnfermeiro(rs.getInt("codeplanenf"));
                objPlantaoDTO.setCodigoEnfermeiro(rs.getInt("codenf"));
                objPlantaoDTO.setHorarioEntrada(rs.getString("horentrada"));
                objPlantaoDTO.setHorarioSaida(rs.getString("horasaida"));
                objPlantaoDTO.setDataPlantao(rs.getDate("dataplant"));
                objPlantaoDTO.setCodigoMedico(rs.getInt("codmed"));

                lista.add(objPlantaoDTO);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro no PlantaoDAO - Pesquisar" + e);
        }
        return lista;
    }

    public void alterarPlantao(PlantaoDTO objPlantaoDTO) {
        String sql = "UPDATE Plantao SET codenf = ?, horentrada = ?, horasaida = ?, dataplant = ?, codmed = ? "
                + "WHERE codeplanenf = ?";

        conn = new conexaoDAO().conectaBD();

        try {
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, objPlantaoDTO.getCodigoEnfermeiro());
            pstm.setString(2, objPlantaoDTO.getHorarioEntrada());
            pstm.setString(3, objPlantaoDTO.getHorarioSaida());
            pstm.setDate(4, (Date) objPlantaoDTO.getDataPlantao());
            pstm.setInt(5, objPlantaoDTO.getCodigoMedico());
            pstm.setInt(6, objPlantaoDTO.getCodigoPlantaoEnfermeiro());

            pstm.execute();
            pstm.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro no PlantaoDAO - Alterar" + e);
        }
    }

    public void excluirPlantao(PlantaoDTO objPlantaoDTO) {
        String sql = "DELETE FROM Plantao WHERE codeplanenf = ?";
        conn = new conexaoDAO().conectaBD();

        try {
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, objPlantaoDTO.getCodigoPlantaoEnfermeiro());

            pstm.execute();
            pstm.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro no PlantaoDAO - Excluir" + e);
        }
    }

}
