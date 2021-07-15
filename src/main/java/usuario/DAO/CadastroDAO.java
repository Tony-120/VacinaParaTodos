package usuario.DAO;

// Importações de pacotes fora do 'baseDAO': 
import java.sql.Connection;
import java.sql.PreparedStatement;
import baseProject.Cadastro;
import conexao.ConexaoDB;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Cauet Damasceno
 */
public class CadastroDAO {

    Cadastro cadastro = new Cadastro();

    // Função para fazer busca de usuários por 'iduser'
    public boolean buscarCadastro(Cadastro cadastro) throws SQLException {

        int cod = cadastro.getIduser();
        String sql = "select * from tb_usuario where iduser = ?";

        try (Connection conexao = ConexaoDB.obtemConexao();
                PreparedStatement pst = conexao.prepareStatement(sql);) {
            pst.setInt(1, cod);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                cadastro.setNome(rs.getString("nome"));
                cadastro.setFone(rs.getString("fone"));
                cadastro.setLogin(rs.getString("login"));
                cadastro.setSenha(rs.getString("senha"));
                cadastro.setPerfil(rs.getString("perfil"));
                
               
            }
        }
        return true;
    }
    // Fim da função para busca de usuários.

    // Funcão de adicionar novos cadastros. 'Está funcional'.
    public int incluirCadastro(Cadastro cadastro) throws Exception {
        int registros;
        try (PreparedStatement pst = ConexaoDB.obtemConexao().prepareStatement("INSERT INTO tb_usuario(nome,fone,login,senha,perfil) VALUES (?,?,?,?,?)")) {

            pst.setString(1, cadastro.getNome());
            pst.setString(2, cadastro.getFone());
            pst.setString(3, cadastro.getLogin());
            pst.setString(4, cadastro.getSenha());
            pst.setString(5, cadastro.getPerfil());            
            registros = pst.executeUpdate();
        }
        PreparedStatement pstAux = ConexaoDB.obtemConexao().prepareStatement("SELECT MAX(iduser)FROM tb_usuario");
        ResultSet rs = pstAux.executeQuery();
        int codigo = 0;
        if ((registros ==1)&&(rs != null)) {
            rs.next();
            codigo = rs.getInt(1);
            return codigo;
        } else {
            return codigo;
        }
    }
    // Fim da função de adicionar novos cadastros

    public boolean alterarCadastro(Cadastro cadastro) throws SQLException {

        int registros;
        String sql = "UPDATE tb_usuario SET nome=?, fone=?, login=?, senha=?, perfil=? where iduser=?";

        try (Connection conexao = ConexaoDB.obtemConexao(); PreparedStatement pst = conexao.prepareStatement(sql)) {
            pst.setString(1, cadastro.getNome().toUpperCase().trim());
            pst.setString(2, cadastro.getFone().trim());
            pst.setString(3, cadastro.getLogin().trim());
            pst.setString(4, cadastro.getSenha().trim());
            pst.setString(5, cadastro.getPerfil().trim());
            pst.setInt(6, cadastro.getIduser());
            registros = pst.executeUpdate();
            pst.close();
        }
        if (registros == 1) {
            return true;
        } else {
            return false;
        }
    }

    // Função para deletar usuário do db.
    public boolean removerCadastro(int cadastro) throws SQLException {
        int registros;
        String sql = "DELETE FROM tb_usuario WHERE iduser = ?";
        try (Connection conexao = ConexaoDB.obtemConexao();
                PreparedStatement pst = conexao.prepareStatement(sql);) {
            pst.setInt(1, cadastro);
            registros = pst.executeUpdate();
        }
        if (registros == 1) {
            return true;
        } else {
            return false;
        }
    } // Fim da função para deletar usuário do db.

    public boolean pesquisarCadastro(Cadastro cadastro) throws Exception {
        int cod = cadastro.getIduser();
        ConexaoDB conexao = new ConexaoDB();
        PreparedStatement pst = conexao.obtemConexao().prepareStatement("SELECT * FROM tb_usuario WHERE iduser = ?");
        pst.setInt(1, cod);
        ResultSet rs = pst.executeQuery();
        if (rs.next()) {
            cadastro.setNome(rs.getString("nome"));
            cadastro.setFone(rs.getString("fone"));
            cadastro.setLogin(rs.getString("login"));
            cadastro.setSenha(rs.getString("senha"));
            cadastro.setPerfil(rs.getString("perfil"));
        }
        return true;
    }
}
