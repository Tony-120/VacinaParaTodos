/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viewProject;

import baseProject.Paciente;

import pacienteDAO.ColsultaPacDAO;
import java.sql.Connection;

import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;
import pacienteDAO.PacienteDAO;

/**
 *
 * @author Cauet Damasceno
 */
public class TelaCadastroPaciente extends javax.swing.JInternalFrame {

    int acao;
    int statusSaude;
    ColsultaPacDAO ConPacDAO;
    PacienteDAO pacDAO;
    Paciente paci = new Paciente();

    Connection conexao;

    /**
     * Creates new form TelaCadastroPaciente
     */
    public TelaCadastroPaciente() {
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jRadioSim = new javax.swing.JRadioButton();
        jRadioNao = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jtNome = new javax.swing.JTextField();
        jtIdade = new javax.swing.JTextField();
        jtEnde = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jtCod = new javax.swing.JTextField();
        jbtnPesquisar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jtData = new com.toedter.calendar.JDateChooser();
        jDataVac = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        jtRg = new javax.swing.JFormattedTextField();
        jtFone = new javax.swing.JTextField();
        jbtnNovo = new javax.swing.JButton();
        jbtnEditar = new javax.swing.JButton();
        jbtnSalvar = new javax.swing.JButton();
        jbtnExcluir = new javax.swing.JButton();
        jbtnCancelar = new javax.swing.JButton();
        jbtnSair = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastro de pacientes"));

        jLabel1.setText("Nome:");

        jLabel2.setText("Idade:");

        buttonGroup1.add(jRadioSim);
        jRadioSim.setText("Sim");

        buttonGroup1.add(jRadioNao);
        jRadioNao.setText("Não");

        jLabel3.setText("Área da saúde:");

        jLabel4.setText("Data do cadastro:");

        jLabel15.setText("Endereço:");

        jtNome.setEnabled(false);
        jtNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtNomeKeyReleased(evt);
            }
        });

        jtIdade.setEnabled(false);

        jtEnde.setEnabled(false);

        jLabel6.setText("Telefone:");

        jLabel7.setText("ID:");

        jbtnPesquisar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Cauet Damasceno\\Documents\\NetBeansProjects\\VaccineForAll\\src\\main\\java\\imagens\\search.png")); // NOI18N
        jbtnPesquisar.setText("Pesquisar");
        jbtnPesquisar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPesquisarActionPerformed(evt);
            }
        });

        jLabel9.setText("RG:");

        jtData.setEnabled(false);

        jDataVac.setEnabled(false);
        jDataVac.setMinSelectableDate(null);

        jLabel5.setText("Data Vacinação:");

        try {
            jtRg.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jtRg.setEnabled(false);

        jtFone.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 31, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jtEnde)
                        .addGap(122, 122, 122))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jtCod, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jbtnPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jtFone, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(13, 13, 13)
                                    .addComponent(jLabel9)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jtRg, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel3)
                                    .addGap(10, 10, 10))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jtData, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jDataVac, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jtIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jRadioSim)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jRadioNao))))
                .addGap(11, 11, 11))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbtnPesquisar)
                            .addComponent(jtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtCod, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel7))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jtData, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jDataVac, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel2))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel9)
                    .addComponent(jtRg, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtFone, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jRadioSim)
                    .addComponent(jRadioNao))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jtEnde, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );

        jbtnNovo.setIcon(new javax.swing.ImageIcon("C:\\Users\\Cauet Damasceno\\Documents\\NetBeansProjects\\VaccineForAll\\src\\main\\java\\imagens\\add-user.png")); // NOI18N
        jbtnNovo.setText("Novo");
        jbtnNovo.setToolTipText("Novo paciente");
        jbtnNovo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnNovoActionPerformed(evt);
            }
        });

        jbtnEditar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Cauet Damasceno\\Documents\\NetBeansProjects\\VaccineForAll\\src\\main\\java\\imagens\\pencil.png")); // NOI18N
        jbtnEditar.setText("Editar");
        jbtnEditar.setToolTipText("Editar paciente");
        jbtnEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnEditar.setEnabled(false);
        jbtnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEditarActionPerformed(evt);
            }
        });

        jbtnSalvar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Cauet Damasceno\\Documents\\NetBeansProjects\\VaccineForAll\\src\\main\\java\\imagens\\diskette.png")); // NOI18N
        jbtnSalvar.setText("Salvar");
        jbtnSalvar.setToolTipText("Salvar alterações");
        jbtnSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnSalvar.setEnabled(false);
        jbtnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSalvarActionPerformed(evt);
            }
        });

        jbtnExcluir.setIcon(new javax.swing.ImageIcon("C:\\Users\\Cauet Damasceno\\Documents\\NetBeansProjects\\VaccineForAll\\src\\main\\java\\imagens\\remove-user.png")); // NOI18N
        jbtnExcluir.setText("Excluir");
        jbtnExcluir.setToolTipText("Exlcuir cadastro de paciente");
        jbtnExcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnExcluir.setEnabled(false);
        jbtnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnExcluirActionPerformed(evt);
            }
        });

        jbtnCancelar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Cauet Damasceno\\Documents\\NetBeansProjects\\VaccineForAll\\src\\main\\java\\imagens\\broom.png")); // NOI18N
        jbtnCancelar.setText("Limpar os campos");
        jbtnCancelar.setToolTipText("Limpar campos do cadastro");
        jbtnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCancelarActionPerformed(evt);
            }
        });

        jbtnSair.setIcon(new javax.swing.ImageIcon("C:\\Users\\Cauet Damasceno\\Documents\\NetBeansProjects\\VaccineForAll\\src\\main\\java\\imagens\\exit.png")); // NOI18N
        jbtnSair.setText("Sair");
        jbtnSair.setToolTipText("Sair");
        jbtnSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jbtnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                            .addComponent(jbtnNovo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbtnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jbtnSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbtnCancelar))
                        .addGap(129, 129, 129))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        setBounds(0, 0, 845, 530);
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        // TODO add your handling code here:
        TelaPrincipal.telcad = true;
    }//GEN-LAST:event_formInternalFrameOpened

    private void jbtnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNovoActionPerformed
        // TODO add your handling code here:
        acao = 1;
        novo();

        // Data
        Date dataSistema = new Date();
        jtData.setDate(dataSistema);
        //String datasql = "dd/MM/yyyy HH:mm:ss";
        //DateFormat df = new SimpleDateFormat(datasql);


    }//GEN-LAST:event_jbtnNovoActionPerformed

    private void jbtnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSalvarActionPerformed
        // TODO add your handling code here:
        if (jRadioSim.isSelected()) {
            statusSaude = 1;
        }
        if (jRadioNao.isSelected()) {
            statusSaude = 0;
        }

        
        int cod;
        paci = new Paciente();
        preencher_objetos();
        try {
            pacDAO = new PacienteDAO();

            /// acao = 1 será para incluir novo registro
            if (acao == 1) {
                cod = pacDAO.incluirPaciente(paci);
                jtCod.setText(String.valueOf(cod));
                JOptionPane.showMessageDialog(this, "Salvo com sucesso!");
                salvar();

            }
            if (acao == 2) {
                paci.setPac_id(Integer.parseInt(jtCod.getText()));
                if (pacDAO.alterarPaciente(paci)) {

                    JOptionPane.showMessageDialog(this, "Alterado com sucesso !");
                    salvar();
                }

            }

        } catch (Exception error) {
            error.printStackTrace();
            JOptionPane.showMessageDialog(this, "Operação não realizada" + error.getMessage());
        }


    }//GEN-LAST:event_jbtnSalvarActionPerformed

    private void jbtnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEditarActionPerformed
        // TODO add your handling code here:
        acao = 2;
        editar();
    }//GEN-LAST:event_jbtnEditarActionPerformed

    private void jbtnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSairActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jbtnSairActionPerformed

    private void jbtnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPesquisarActionPerformed
        // TODO add your handling code here:
        paci = new Paciente();
        if (jtCod.getText().equals("")) {
            
            // Chama a tela de consulta:
            TelaConsultaPaciente consultaPac = new TelaConsultaPaciente();
            TelaPrincipal.Desktop.add(consultaPac);
            consultaPac.setVisible(true);
            TelaPrincipal.Desktop.setComponentZOrder(consultaPac, 0);
            
            // Chama a tela de consulta
            } else {
            paci.setPac_id(Integer.parseInt(jtCod.getText()));
            pacDAO = new PacienteDAO();
            try {
                if (pacDAO.pesquisarPaciente(paci)) {
                    if((paci !=null)){
                        pesquisa();
                    }
                }
            } catch (Exception ex) {
                Logger.getLogger(TelaCadastroPaciente.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jbtnPesquisarActionPerformed

    private void jbtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCancelarActionPerformed
        // TODO add your handling code here:
        limparCampo();
    }//GEN-LAST:event_jbtnCancelarActionPerformed

    private void jtNomeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtNomeKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jtNomeKeyReleased

    private void jbtnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnExcluirActionPerformed
        // TODO add your handling code here:
             if (jtCod.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Digite o código !");
        } else {
            int codigo = Integer.parseInt(jtCod.getText());
            pacDAO = new PacienteDAO();
            try {
                if (JOptionPane.showConfirmDialog(this, "Confirma a exclusão ?", "Confirmação", JOptionPane.YES_NO_CANCEL_OPTION) == JOptionPane.YES_OPTION) {
                    if (pacDAO.removerPaciente(codigo)) {
                        JOptionPane.showMessageDialog(this, "Excluido com sucesso !");
                        limparCampo();
                    } else {
                        JOptionPane.showMessageDialog(this, "Erro ao excluir o registro !");
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Operação cancelada !");
                    limparCampo();
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Erro: Exclusão Não Realizada !" + e.getMessage());
            }

        }
    }//GEN-LAST:event_jbtnExcluirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private static com.toedter.calendar.JDateChooser jDataVac;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioNao;
    private javax.swing.JRadioButton jRadioSim;
    private javax.swing.JButton jbtnCancelar;
    private javax.swing.JButton jbtnEditar;
    private javax.swing.JButton jbtnExcluir;
    private javax.swing.JButton jbtnNovo;
    private javax.swing.JButton jbtnPesquisar;
    private javax.swing.JButton jbtnSair;
    private javax.swing.JButton jbtnSalvar;
    private static javax.swing.JTextField jtCod;
    private static com.toedter.calendar.JDateChooser jtData;
    private javax.swing.JTextField jtEnde;
    private javax.swing.JTextField jtFone;
    private javax.swing.JTextField jtIdade;
    private javax.swing.JTextField jtNome;
    private javax.swing.JFormattedTextField jtRg;
    // End of variables declaration//GEN-END:variables

    public static void recebeid(Paciente paci) {
        jtCod.setText(String.valueOf(paci.getPac_id()));
        jtCod.requestFocus();
    }

    public void preencher_objetos() {
        paci.setPac_dtvacinacao(jDataVac.getDate());
        paci.setPac_dtcadastro(jtData.getDate());
        paci.setPac_nome(jtNome.getText().trim());
        paci.setPac_idade(Integer.parseInt(jtIdade.getText()));
        paci.setPac_ende(jtEnde.getText().trim());
        paci.setPac_tel(jtFone.getText().trim());
        paci.setPac_rg(jtRg.getText().trim());
        paci.setPac_area_saude(statusSaude);
        
    }

    public void novo() {
        jtNome.setEnabled(true);
        jtIdade.setEnabled(true);
        jtEnde.setEnabled(true);
        jtFone.setEnabled(true);
        jtRg.setEnabled(true);
        jtCod.setEnabled(false);
        jbtnEditar.setEnabled(true);
        jbtnSalvar.setEnabled(true);
        jbtnCancelar.setEnabled(true);
        jRadioSim.setEnabled(true);
        jtCod.setText("");
        jtNome.setText("");
        jtIdade.setText("");
        jtEnde.setText("");
        jtFone.setText("");
        jtRg.setText("");
    }

    public void limparCampo() {
        jtCod.setText("");
        jtNome.setText("");
        jtIdade.setText("");
        jtEnde.setText("");
        jtFone.setText("");
        jtRg.setText("");
        
        
       
        jtNome.setEnabled(false);
        jtIdade.setEnabled(false);
        jtEnde.setEnabled(false);
        jtFone.setEnabled(false);
        jtRg.setEnabled(false);
        jtCod.setEnabled(true);
        jbtnEditar.setEnabled(false);
        jbtnSalvar.setEnabled(false);
        jbtnCancelar.setEnabled(true);
        jbtnSair.setEnabled(true);
        jbtnNovo.setEnabled(true);
    }

    public void editar() {
        jtCod.setEnabled(false);
        jtNome.setEnabled(true);
        jtIdade.setEnabled(true);
        jtEnde.setEnabled(true);
        jtFone.setEnabled(true);
        jtRg.setEnabled(true);
        jbtnEditar.setEnabled(true);
        jbtnSalvar.setEnabled(true);
        jbtnCancelar.setEnabled(true);
        jbtnSair.setEnabled(true);
        jbtnNovo.setEnabled(true);
        jDataVac.setEnabled(true);

    }

    public void salvar() {
        jtCod.setEnabled(true);
        jtNome.setEnabled(false);
        jtIdade.setEnabled(false);
        jtEnde.setEnabled(false);
        jtFone.setEnabled(false);
        jtRg.setEnabled(false);
        jbtnEditar.setEnabled(true);
        jbtnSalvar.setEnabled(false);

    }

    public void pesquisa() {
        jtNome.setText(paci.getPac_nome().trim());
        jtIdade.setText(String.valueOf(paci.getPac_idade()));
        jtEnde.setText(paci.getPac_ende().trim());
        jtFone.setText(paci.getPac_tel().trim());
        jtRg.setText(paci.getPac_rg().trim());
        jbtnEditar.setEnabled(true);
        jbtnSalvar.setEnabled(true);
        jbtnCancelar.setEnabled(true);       
        jbtnNovo.setEnabled(false);
        jbtnExcluir.setEnabled(true);
        jDataVac.setEnabled(false);       
        jtData.setDate(paci.getPac_dtcadastro());
        
        if(paci.getPac_dtvacinacao()!=null){
            jDataVac.setDate(paci.getPac_dtvacinacao());
        }            
        
        statusSaude = paci.getPac_area_saude();
        if(statusSaude==1) {
            jRadioSim.setSelected(true);
        }
        if(statusSaude==0) {
            jRadioNao.setEnabled(true);
        }
        
    }// Fim do pesquisar

}
