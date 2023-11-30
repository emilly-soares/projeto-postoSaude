package DAO;

import DTO.FuncionarioDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class FuncionarioDAO {

    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<FuncionarioDTO> lista = new ArrayList<>();

    public FuncionarioDAO() {
        conn = new conexaoDAO().conectaBD();
    }

    public void cadastrarFuncionario(FuncionarioDTO objFuncionarioDTO) {
        String sql = "INSERT INTO Funcionario (nomefun, datnascfun, endfun, telefun, ogexp, rg, uffunc, cidade, bairro, cpf, funcaofun, sexo, celfun) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = new conexaoDAO().conectaBD(); PreparedStatement pstm = conn.prepareStatement(sql)) {

            pstm.setString(1, objFuncionarioDTO.getNomeFuncionario());

            java.util.Date dataUtil = objFuncionarioDTO.getDataNascimento();
            java.sql.Date dataSql = new java.sql.Date(dataUtil.getTime());
            pstm.setDate(2, dataSql);

            pstm.setString(3, objFuncionarioDTO.getEndereco());
            pstm.setString(4, objFuncionarioDTO.getTelefone());
            pstm.setString(5, objFuncionarioDTO.getOrgaoExpedidor());
            pstm.setString(6, objFuncionarioDTO.getRg());
            pstm.setString(7, objFuncionarioDTO.getUf());
            pstm.setString(8, objFuncionarioDTO.getCidade());
            pstm.setString(9, objFuncionarioDTO.getBairro());
            pstm.setString(10, objFuncionarioDTO.getCpf());
            pstm.setString(11, objFuncionarioDTO.getFuncao());
            pstm.setString(12, objFuncionarioDTO.getSexo());
            pstm.setString(13, objFuncionarioDTO.getCelular());

            pstm.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro no FuncionarioDAO - Cadastrar" + e);
        }
    }

    public ArrayList<FuncionarioDTO> pesquisarFuncionario() {
        String sql = "SELECT * FROM Funcionario";
        conn = new conexaoDAO().conectaBD();
        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();

            while (rs.next()) {
                FuncionarioDTO objFuncionarioDTO = new FuncionarioDTO();
                objFuncionarioDTO.setNomeFuncionario(rs.getString("nomefun"));
                objFuncionarioDTO.setDataNascimento(rs.getDate("datnascfun"));
                objFuncionarioDTO.setEndereco(rs.getString("endfun"));
                objFuncionarioDTO.setTelefone(rs.getString("telefun"));
                objFuncionarioDTO.setOrgaoExpedidor(rs.getString("ogexp"));
                objFuncionarioDTO.setRg(rs.getString("rg"));
                objFuncionarioDTO.setUf(rs.getString("uffunc"));
                objFuncionarioDTO.setCidade(rs.getString("cidade"));
                objFuncionarioDTO.setBairro(rs.getString("bairro"));
                objFuncionarioDTO.setCpf(rs.getString("cpf"));
                objFuncionarioDTO.setFuncao(rs.getString("funcaofun"));
                objFuncionarioDTO.setCodigoFuncionario(rs.getInt("codfun"));
                objFuncionarioDTO.setSexo(rs.getString("sexo"));
                objFuncionarioDTO.setCelular(rs.getString("celfun"));

                lista.add(objFuncionarioDTO);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro no FuncionarioDAO - Pesquisar" + e);
        }
        return lista;
    }

    public void alterarFuncionario(FuncionarioDTO objFuncionarioDTO) {
        String sql = "UPDATE Funcionario SET nomefun = ?, datnascfun = ?, endfun = ?, telefun = ?, "
                + "ogexp = ?, rg = ?, uffunc = ?, cidade = ?, bairro = ?, cpf = ?, funcaofun = ?, sexo = ?, celfun = ? "
                + "WHERE codfun = ?";

        conn = new conexaoDAO().conectaBD();

        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objFuncionarioDTO.getNomeFuncionario());
            java.util.Date dataUtil = objFuncionarioDTO.getDataNascimento();
            java.sql.Date dataSql = new java.sql.Date(dataUtil.getTime());
            pstm.setDate(2, dataSql);
            pstm.setString(3, objFuncionarioDTO.getEndereco());
            pstm.setString(4, objFuncionarioDTO.getTelefone());
            pstm.setString(5, objFuncionarioDTO.getOrgaoExpedidor());
            pstm.setString(6, objFuncionarioDTO.getRg());
            pstm.setString(7, objFuncionarioDTO.getUf());
            pstm.setString(8, objFuncionarioDTO.getCidade());
            pstm.setString(9, objFuncionarioDTO.getBairro());
            pstm.setString(10, objFuncionarioDTO.getCpf());
            pstm.setString(11, objFuncionarioDTO.getFuncao());
            pstm.setString(12, objFuncionarioDTO.getSexo());
            pstm.setString(13, objFuncionarioDTO.getCelular());
            pstm.setInt(14, objFuncionarioDTO.getCodigoFuncionario());

            pstm.execute();
            pstm.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro no FuncionarioDAO - Alterar" + e);
        }
    }

    public void excluirFuncionario(FuncionarioDTO objFuncionarioDTO) {
        String sql = "DELETE FROM Funcionario WHERE codfun = ?";
        conn = new conexaoDAO().conectaBD();

        try {
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, objFuncionarioDTO.getCodigoFuncionario());

            pstm.execute();
            pstm.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro no FuncionarioDAO - Excluir" + e);
        }
    }

    public ArrayList<String> recuperarNomesMedicos() {
        ArrayList<String> nomesMedicos = new ArrayList<>();
        String sql = "SELECT nomefun FROM Funcionario WHERE funcaofun = 'Médico(a)'";

        try (Connection conn = new conexaoDAO().conectaBD(); PreparedStatement pstm = conn.prepareStatement(sql); ResultSet rs = pstm.executeQuery()) {

            while (rs.next()) {
                nomesMedicos.add(rs.getString("nomefun"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao recuperar nomes de médicos: " + e);
        }

        return nomesMedicos;
    }

    public ArrayList<String> recuperarNomesEnfermeiros() {
        ArrayList<String> nomesEnfermeiros = new ArrayList<>();
        String sql = "SELECT nomefun FROM Funcionario WHERE funcaofun = 'Enfermeiro(a)'";

        try (Connection conn = new conexaoDAO().conectaBD(); PreparedStatement pstm = conn.prepareStatement(sql); ResultSet rs = pstm.executeQuery()) {

            while (rs.next()) {
                nomesEnfermeiros.add(rs.getString("nomefun"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao recuperar nomes de enfermeiros: " + e);
        }

        return nomesEnfermeiros;
    }

    public int obterCodigoFuncionarioPorNome(String nomeFuncionario) {
        int codigoFuncionario = -1;
        try {
            String sql = "SELECT codfun FROM Funcionario WHERE nomefun = ?";
            try (PreparedStatement pstm = conn.prepareStatement(sql)) {
                pstm.setString(1, nomeFuncionario);
                ResultSet rs = pstm.executeQuery();

                if (rs.next()) {
                    codigoFuncionario = rs.getInt("codfun");
                }
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao obter código do funcionário: " + erro);
        }

        return codigoFuncionario;
    }

}
