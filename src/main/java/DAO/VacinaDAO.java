package DAO;

import DTO.VacinaDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class VacinaDAO {

    private Connection conn; 

    public VacinaDAO() {
        conn = new conexaoDAO().conectaBD();
    }

    public void cadastrarVacina(VacinaDTO vacinaDTO) {
        try {
            String sql = "INSERT INTO Vacina (nomevaci, form_admvaci, via_admvaci, lugar_admvaci, codvaci, descricao) VALUES (?, ?, ?, ?, ?, ?)";
            try (PreparedStatement pstm = conn.prepareStatement(sql)) {
                pstm.setString(1, vacinaDTO.getNomeVacina());
                pstm.setString(2, vacinaDTO.getFormaAdministracao());
                pstm.setString(3, vacinaDTO.getViaAdministracao());
                pstm.setString(4, vacinaDTO.getLugarAdministracao());
                pstm.setInt(5, vacinaDTO.getCodigoVacina());
                pstm.setString(6, vacinaDTO.getDescricao());

                pstm.execute();
            }
            JOptionPane.showMessageDialog(null, "Vacina cadastrada com sucesso!");
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar vacina: " + erro);
        }
    }

    public ArrayList<VacinaDTO> pesquisarVacina() {
        ArrayList<VacinaDTO> listaVacinas = new ArrayList<>();

        try {
            String sql = "SELECT * FROM Vacina";
            try (PreparedStatement pstm = conn.prepareStatement(sql)) {
                ResultSet rs = pstm.executeQuery();

                while (rs.next()) {
                    VacinaDTO vacina = new VacinaDTO();
                    vacina.setNomeVacina(rs.getString("nomevaci"));
                    vacina.setFormaAdministracao(rs.getString("form_admvaci"));
                    vacina.setViaAdministracao(rs.getString("via_admvaci"));
                    vacina.setLugarAdministracao(rs.getString("lugar_admvaci"));
                    vacina.setCodigoVacina(rs.getInt("codvaci"));
                    vacina.setDescricao(rs.getString("descricao"));

                    listaVacinas.add(vacina);
                }
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao pesquisar vacinas: " + erro);
        }

        return listaVacinas;
    }

    public void alterarVacina(VacinaDTO vacinaDTO) {
        try {
            String sql = "UPDATE Vacina SET nomevaci=?, form_admvaci=?, via_admvaci=?, lugar_admvaci=?, descricao=? WHERE codvaci=?";
            try (PreparedStatement pstm = conn.prepareStatement(sql)) {
                pstm.setString(1, vacinaDTO.getNomeVacina());
                pstm.setString(2, vacinaDTO.getFormaAdministracao());
                pstm.setString(3, vacinaDTO.getViaAdministracao());
                pstm.setString(4, vacinaDTO.getLugarAdministracao());
                pstm.setString(5, vacinaDTO.getDescricao());
                pstm.setInt(6, vacinaDTO.getCodigoVacina());

                pstm.executeUpdate();
            }
            JOptionPane.showMessageDialog(null, "Vacina alterada com sucesso!");
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar vacina: " + erro);
        }
    }

    public void excluirVacina(VacinaDTO vacinaDTO) {
        try {
            String sql = "DELETE FROM Vacina WHERE codvaci=?";
            try (PreparedStatement pstm = conn.prepareStatement(sql)) {
                pstm.setInt(1, vacinaDTO.getCodigoVacina());

                pstm.executeUpdate();
            }
            JOptionPane.showMessageDialog(null, "Vacina excluída com sucesso!");
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir vacina: " + erro);
        }
    }

    public int obterCodigoVacinaPorNome(String nomeVacina) {
        int codigoVacina = -1; // Valor padrão caso não seja encontrado

        try {
            String sql = "SELECT codvaci FROM Vacina WHERE nomevaci = ?";
            try (PreparedStatement pstm = conn.prepareStatement(sql)) {
                pstm.setString(1, nomeVacina);
                ResultSet rs = pstm.executeQuery();

                if (rs.next()) {
                    codigoVacina = rs.getInt("codvaci");
                }
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao obter código da vacina: " + erro);
        }

        return codigoVacina;
    }

    public ArrayList<String> recuperarNomesVacinas() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
