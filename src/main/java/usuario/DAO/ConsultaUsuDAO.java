package usuario.DAO;

import com.mysql.cj.xdevapi.PreparableStatement;
import conexao.ConexaoDB;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Cauet Damasceno
 */
public class ConsultaUsuDAO {

    public static ResultSet carregaTabela() throws Exception {
        ConexaoDB conexao = new ConexaoDB();
        PreparedStatement pst = conexao.obtemConexao().prepareStatement("SELECT iduser, nome,fone,login,senha,perfil FROM tb_usuario");
        ResultSet rs = pst.executeQuery();
        return rs;

    }

    public static ResultSet getResultSet(String tipo, String arg) throws Exception {
        
    String argument =tipo+ " like '%" + arg+ "%'";
    // System.out.println(argument);
    

        ConexaoDB conexao = new ConexaoDB();
        PreparedStatement pst = conexao.obtemConexao().prepareStatement(
                "Select iduser,nome,fone,login,perfil FROM tb_usuario where " +argument);
        ResultSet rs = pst.executeQuery();
        return rs;       
      
    }

}
