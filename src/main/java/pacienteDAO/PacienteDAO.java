/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacienteDAO;

import baseProject.Paciente;

import conexao.ConexaoDB;
import java.sql.Connection;
import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Cauet Damasceno
 */
public class PacienteDAO {

    Paciente objtpaciente = new Paciente();

    // Função para fazer busca de usuários por 'pac_id'
    public boolean buscarPaciente(Paciente paciente) throws Exception {

        int cod = paciente.getPac_id();
        String sql = "select * from tb_pacientes where pac_id = ?";

        try (Connection conexao = ConexaoDB.obtemConexao();
                PreparedStatement pst = conexao.prepareStatement(sql);) {
            pst.setInt(1, cod);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                paciente.setPac_nome(rs.getString("pac_nome"));
                paciente.setPac_idade(rs.getInt("pac_idade"));
                paciente.setPac_ende(rs.getString("pac_ende"));
                paciente.setPac_tel(rs.getString("pac_tel"));
                paciente.setPac_rg(rs.getString("pac_rg"));
                // paciente.setPac_dtcadastro(rs.getDate("pac_dtcadastro"));
                if (!rs.getString("pac_dtcadastro").isEmpty()) {
                    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                    Date date = sdf.parse(rs.getString("pac_dtcadastro"));
                    paciente.setPac_dtcadastro(date);
                    // System.out.println(date);
                }
                paciente.setPac_area_saude(rs.getInt("pac_area_saude"));
            }
        }
        return true;
    }// Fim da função para busca de usuários.

    // Funcão de adicionar novos cadastros. 'Está funcional'.
    public int incluirPaciente(Paciente paciente) throws Exception {
        int registros;

        try (PreparedStatement pst = ConexaoDB.obtemConexao().prepareStatement("INSERT INTO tb_pacientes(pac_nome,pac_idade,pac_ende,pac_tel,pac_rg,pac_dtcadastro,pac_area_saude) "
                + "VALUES (?,?,?,?,?,?,?)")) {
            pst.setString(1, paciente.getPac_nome());
            pst.setInt(2, paciente.getPac_idade());
            pst.setString(3, paciente.getPac_ende());
            pst.setString(4, paciente.getPac_tel());
            pst.setString(5, paciente.getPac_rg());

            String datasql = "dd/MM/yyyy HH:mm:ss";
            DateFormat df = new SimpleDateFormat(datasql);
            String data = df.format(paciente.getPac_dtcadastro());

            pst.setString(6, data);
            pst.setInt(7, paciente.getPac_area_saude());

            registros = pst.executeUpdate();
        }
        PreparedStatement pstAux = ConexaoDB.obtemConexao().prepareStatement("SELECT MAX(pac_id)FROM tb_pacientes");
        ResultSet rs = pstAux.executeQuery();
        int codigo = 0;
        if ((registros == 1) && (rs != null)) {
            rs.next();
            codigo = rs.getInt(1);
            return codigo;
        } else {
            return codigo;
        }
    } // Fim da função de adicionar novos cadastros

    public boolean alterarPaciente(Paciente paciente) throws Exception {
        int registros;
        String sql = "UPDATE tb_pacientes SET pac_nome=?, pac_idade=?, pac_ende=?, pac_tel=?,pac_rg=?, pac_area_saude=?, pac_dtvacinacao = ? where pac_id=?";
        try (Connection conexao = ConexaoDB.obtemConexao(); PreparedStatement pst = conexao.prepareStatement(sql)) {
            pst.setString(1, paciente.getPac_nome().toUpperCase().trim());
            pst.setInt(2, paciente.getPac_idade());
            pst.setString(3, paciente.getPac_ende().trim());
            pst.setString(4, paciente.getPac_tel().trim());
            pst.setString(5, paciente.getPac_rg().trim());
            pst.setInt(6, paciente.getPac_area_saude());

            //pst.setString(7, paciente.getPac_dtvacinacao().toString());
            String datasql = "dd/MM/yyyy HH:mm:ss";
            DateFormat df = new SimpleDateFormat(datasql);
            String data = df.format(paciente.getPac_dtvacinacao());

            pst.setString(7, data);

            pst.setInt(8, paciente.getPac_id());

            registros = pst.executeUpdate();
            pst.close();
        }
        if (registros == 1) {
            return true;
        } else {
            return false;
        }
    } // Fim da função alterar paciente
    
    public boolean alterarData(int id) throws Exception {
        int registros;
        String sql = "UPDATE tb_pacientes SET  pac_dtvacinacao = ? where pac_id=?";
        try (Connection conexao = ConexaoDB.obtemConexao(); PreparedStatement pst = conexao.prepareStatement(sql)) {           

            
            String datasql = "dd/MM/yyyy HH:mm:ss";
            DateFormat df = new SimpleDateFormat(datasql);
            String data = df.format(new Date());

            pst.setString(1, data);
            pst.setInt(2, id);
           

            registros = pst.executeUpdate();
            pst.close();
        }
        if (registros == 1) {
            return true;
        } else {
            return false;
        }
    } // Fim da função alt
    


// Função para deletar usuário do db.
    public boolean removerPaciente(int paciente) throws Exception {
        int registros;
        String sql = "DELETE FROM tb_pacientes WHERE pac_id = ?";
        try (Connection conexao = ConexaoDB.obtemConexao();
                PreparedStatement pst = conexao.prepareStatement(sql);) {
            pst.setInt(1, paciente);
            registros = pst.executeUpdate();
        }
        if (registros == 1) {
            return true;
        } else {
            return false;
        }
    } // Fim da função para deletar usuário do db.

    public boolean pesquisarPaciente(Paciente paciente) throws Exception {
        int cod = paciente.getPac_id();
        ConexaoDB conexao = new ConexaoDB();
        PreparedStatement pst = conexao.obtemConexao().prepareStatement("SELECT * FROM tb_pacientes WHERE pac_id = ?");
        pst.setInt(1, cod);
        ResultSet rs = pst.executeQuery();
        if (rs.next()) {
            paciente.setPac_nome(rs.getString("pac_nome"));
            paciente.setPac_idade(rs.getInt("pac_idade"));
            paciente.setPac_ende(rs.getString("pac_ende"));
            paciente.setPac_tel(rs.getString("pac_tel"));
            paciente.setPac_rg(rs.getString("pac_rg"));
            // paciente.setPac_dtcadastro(rs.getString("pac_dtcadastro"));

            if (rs.getString("pac_dtcadastro") != null && !rs.getString("pac_dtcadastro").isEmpty()) {
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                Date date = sdf.parse(rs.getString("pac_dtcadastro"));
                paciente.setPac_dtcadastro(date);
                // System.out.println(date);
            } else {
                paciente.setPac_dtcadastro(null);
            }

            paciente.setPac_area_saude(rs.getInt("pac_area_saude"));

            if (rs.getString("pac_dtvacinacao") != null && !rs.getString("pac_dtvacinacao").isEmpty()) {
                //paciente.setPac_dtvacinacao(rs.getDate("pac_dtvacinacao"));
                SimpleDateFormat sdF = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                Date data = sdF.parse(rs.getString("pac_dtvacinacao"));
                paciente.setPac_dtvacinacao(data);
            } else {
                paciente.setPac_dtvacinacao(null);
            }

        }
        return true;
    }

    public static List<Paciente> carregarLista() {
        List<Paciente> dadosPaciente = new ArrayList<>();
        String sql = "SELECT pac_id,pac_nome,pac_tel,pac_idade,pac_ende,pac_rg,pac_dtcadastro,pac_area_saude, pac_dtvacinacao FROM tb_pacientes";
        try (Connection conexao = ConexaoDB.obtemConexao();
                PreparedStatement pst = conexao.prepareStatement(sql);) {
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                Paciente x = new Paciente();
                x.setPac_id(rs.getInt("pac_id"));
                x.setPac_nome(rs.getString("pac_nome"));
                x.setPac_tel(rs.getString("pac_tel"));
                x.setPac_idade(rs.getInt("pac_idade"));
                x.setPac_ende(rs.getString("pac_ende"));
                x.setPac_rg(rs.getString("pac_rg"));
                x.setPac_area_saude(rs.getInt("pac_area_saude"));

                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                Date dataFormato = sdf.parse(rs.getString("pac_dtcadastro"));
                x.setPac_dtcadastro(dataFormato);
                
                if (rs.getString("pac_dtvacinacao") != null && !rs.getString("pac_dtvacinacao").isEmpty()) {

                dataFormato = sdf.parse(rs.getString("pac_dtvacinacao"));
                x.setPac_dtvacinacao(dataFormato);
                }
                
                else{
                    x.setPac_dtvacinacao(null);
                }
                dadosPaciente.add(x);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return dadosPaciente;

    }

}
