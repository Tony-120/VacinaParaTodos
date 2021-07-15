
package conexao;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Cauet Damasceno
 */
public class ConexaoDB {
    private static String host = "localhost";
    private static String porta = "3306";
    private static String db = "dbprojectcovid";
    private static String usuario = "root";
    private static String senha = "123@mudaR";
    
    public static Connection obtemConexao() {
        try {
            Connection c = DriverManager.getConnection("jdbc:mysql://" + host + ":" + porta + "/" + db, // endereço URL
                    usuario, senha);
            return c;
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
}
