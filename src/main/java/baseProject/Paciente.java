/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baseProject;

import java.util.Date;

/**
 *
 * @author Cauet Damasceno
 */
public class Paciente {

    int pac_id;
    String pac_nome;
    int pac_idade;
    String pac_ende;
    String pac_tel;
    String pac_rg;
    Date pac_dtcadastro;
    Date pac_dtvacinacao;
    int pac_area_saude;

    public Paciente() {
    }

    public Paciente(Date pac_dtcadastro) {
        this.pac_dtcadastro = pac_dtcadastro;
    }
    

    public Paciente(int pac_id, String pac_nome, int pac_idade, String pac_ende, String pac_tel, String pac_rg, Date pac_dtcadastro, Date pac_dtvacinacao,int pac_area_saude) {
        this.pac_id = pac_id;
        this.pac_nome = pac_nome;
        this.pac_idade = pac_idade;
        this.pac_ende = pac_ende;
        this.pac_tel = pac_tel;
        this.pac_rg = pac_rg;
        this.pac_dtcadastro = pac_dtcadastro;
        this.pac_dtvacinacao = pac_dtvacinacao;
        this.pac_area_saude = pac_area_saude;
        
    }

    public int getPac_id() {
        return pac_id;
    }

    public void setPac_id(int pac_id) {
        this.pac_id = pac_id;
    }

    public String getPac_nome() {
        return pac_nome;
    }

    public void setPac_nome(String pac_nome) {
        this.pac_nome = pac_nome;
    }

    public int getPac_idade() {
        return pac_idade;
    }

    public void setPac_idade(int pac_idade) {
        this.pac_idade = pac_idade;
    }

    public String getPac_ende() {
        return pac_ende;
    }

    public void setPac_ende(String pac_ende) {
        this.pac_ende = pac_ende;
    }

    public String getPac_tel() {
        return pac_tel;
    }

    public void setPac_tel(String pac_tel) {
        this.pac_tel = pac_tel;
    }

    public String getPac_rg() {
        return pac_rg;
    }

    public void setPac_rg(String pac_rg) {
        this.pac_rg = pac_rg;
    }

    public Date getPac_dtcadastro() {
        return pac_dtcadastro;
    }

    public void setPac_dtcadastro(Date pac_dtcadastro) {
        this.pac_dtcadastro = pac_dtcadastro;
    }

    public Date getPac_dtvacinacao() {
        return pac_dtvacinacao;
    }

    public void setPac_dtvacinacao(Date pac_dtvacinacao) {
        this.pac_dtvacinacao = pac_dtvacinacao;
    }

    public int getPac_area_saude() {
        return pac_area_saude;
    }

    public void setPac_area_saude(int pac_area_saude) {
        this.pac_area_saude = pac_area_saude;
    }
    
    

   

} // Fim da classe pacientes


