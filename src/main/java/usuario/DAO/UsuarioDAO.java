package usuario.DAO;

import conexao.ConexaoDB;
import baseProject.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import viewProject.TelaPrincipal;

/**
 *
 * @author Cauet Damasceno
 */
public class UsuarioDAO {

    public boolean existe(Usuario usuario) throws Exception {
        String sql = "SELECT * FROM tb_usuario WHERE login=?" + "AND senha=?";

        try {
            Connection conn = ConexaoDB.obtemConexao();
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, usuario.getUsuario());
            pst.setString(2, usuario.getSenha());

            // Executando o comando 'SELECT' e recebendo o retorno:
            ResultSet resultado = pst.executeQuery();
            if (resultado.next()) {

                //  a linha abaixo obtem o conteudo do campo perfil na tabela 'tb_usuario':
                String perfil = resultado.getString(6);
                // System.out.println(perfil);

                // A estrutura abaixo faz o tratamendo do usuario:
                if (perfil.equals("Admin")) {
                    TelaPrincipal principal = new TelaPrincipal();
                    principal.setVisible(true);

                    TelaPrincipal.MenuCadastro.setEnabled(true);
                    TelaPrincipal.MenuCadUsu.setEnabled(true);
                    TelaPrincipal.MenuCadPac.setEnabled(true);
                    TelaPrincipal.MenuRelVac.setEnabled(true);
                    TelaPrincipal.UsuarioLabel.setText(resultado.getString(2));

                } else {
                    TelaPrincipal principal = new TelaPrincipal();
                    TelaPrincipal.UsuarioLabel.setText(resultado.getString(2));
                    principal.setVisible(true);
                }

            } else {
                JOptionPane.showMessageDialog(null, "Usuario e/ou senha inválida!");
            }
            // Tenta acessar os resultados:
            return resultado.next();

        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }

    }

}
