/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacienteDAO;

import conexao.ConexaoDB;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Cauet Damasceno
 */
public class ColsultaPacDAO {
    public static ResultSet carregaTabela() throws Exception{
        ConexaoDB conexao = new ConexaoDB();
        PreparedStatement pst = conexao.obtemConexao().prepareStatement("SELECT pac_id,pac_nome,pac_tel,pac_idade,pac_ende,pac_rg,pac_area_saude FROM tb_pacientes");
        ResultSet rs = pst.executeQuery();
        return rs;
        
    }
    
    public static ResultSet getResultSet(String tipo, String arg) throws Exception {
        String argument = "pac_"+tipo+ " like '%" + arg+ "%'";
        // System.out.println(argument);
        
        ConexaoDB conexao = new ConexaoDB();
        PreparedStatement pst = conexao.obtemConexao().prepareStatement(
            "Select pac_id,pac_nome,pac_tel,pac_idade,pac_ende,pac_rg,pac_area_saude FROM tb_pacientes where " +argument);
        ResultSet rs = pst.executeQuery();
        return rs;
    }
    
}
