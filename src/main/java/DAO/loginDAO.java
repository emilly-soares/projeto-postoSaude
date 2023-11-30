package DAO;

import DTO.LoginDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class loginDAO {

    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;

    public ResultSet autenticarUsuario(LoginDTO objUsuarioDTO) {
        conn = new conexaoDAO().conectaBD();

        try {
            String sql = "SELECT * FROM login WHERE usuario = ? AND senha = ?";
            try (PreparedStatement pstm = conn.prepareStatement(sql)) {
                pstm.setString(1, objUsuarioDTO.getUsuario());
                pstm.setString(2, objUsuarioDTO.getSenha());

                ResultSet rs = pstm.executeQuery();
                return rs;
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Usuario DAO:" + erro);
            return null;
        }
    }

    public void cadastrarUsuario(LoginDTO objUsuarioDTO) {
        conn = new conexaoDAO().conectaBD();

        try {
            String sql = "INSERT INTO login (usuario, senha, permissao) VALUES (?, ?, ?)";
            try (PreparedStatement pstm = conn.prepareStatement(sql)) {
                pstm.setString(1, objUsuarioDTO.getUsuario());
                pstm.setString(2, objUsuarioDTO.getSenha());
                pstm.setString(3, objUsuarioDTO.getPermissao());

                pstm.executeUpdate();

                JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso!");
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar usuário: " + erro);
        }
    }

    public ArrayList<LoginDTO> listarUsuarios() {
        ArrayList<LoginDTO> lista = new ArrayList<>();
        String sql = "SELECT * FROM Login";
        conn = new conexaoDAO().conectaBD();

        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();

            while (rs.next()) {
                LoginDTO objUsuarioDTO = new LoginDTO();
                objUsuarioDTO.setCodigo(rs.getInt("codigo"));
                objUsuarioDTO.setUsuario(rs.getString("usuario"));
                objUsuarioDTO.setSenha(rs.getString("senha"));
                objUsuarioDTO.setPermissao(rs.getString("permissao"));

                lista.add(objUsuarioDTO);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro no UsuarioDAO - Listar: " + e);
        }
        return lista;
    }

    public void alterarUsuario(LoginDTO objUsuarioDTO) {
        String sql = "UPDATE Login SET usuario = ?, senha = ?, permissao = ? WHERE codigo = ?";
        conn = new conexaoDAO().conectaBD();

        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objUsuarioDTO.getUsuario());
            pstm.setString(2, objUsuarioDTO.getSenha());
            pstm.setString(3, objUsuarioDTO.getPermissao());
            pstm.setInt(4, objUsuarioDTO.getCodigo());

            pstm.execute();
            pstm.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro no UsuarioDAO - Alterar: " + e);
        }
    }

    public void excluirUsuario(LoginDTO objUsuarioDTO) {
        String sql = "DELETE FROM Login WHERE codigo = ?";
        conn = new conexaoDAO().conectaBD();

        try {
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, objUsuarioDTO.getCodigo());

            pstm.execute();
            pstm.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro no UsuarioDAO - Excluir: " + e);
        }
    }
}
