/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pctFormulario;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import pctControle.Usuario;
import pctDAO.UsuarioDAO;

/**
 *
 * @author Luis Henrique
 */
public class GerenciaUsuario extends javax.swing.JFrame {

    /**
     * Creates new form GerenciaAdm
     */
    private Usuario user;
    private List<Usuario> users;
    private String comp;
    private Usuario selectedUser;
    
    public GerenciaUsuario(Usuario user) {
        this.user = user;
        initComponents();
        Tabela();
    }
    
    private void Tabela() {
        UsuarioDAO dao = new UsuarioDAO();
        this.users = dao.listarClientes();
        DefaultTableModel dados = (DefaultTableModel) userTable.getModel();

        dados.setNumRows(0);

        for (Usuario usuario : this.users) {
            dados.addRow(new Object[]{
                usuario.getIduser(),
                usuario,
                usuario.getEmail(),
                usuario.getPermission()
            });

        }
    }
    
    private void Tabela(String s) {
        DefaultTableModel dados = (DefaultTableModel) userTable.getModel();
        dados.setNumRows(0);

        for (Usuario usuario : this.users) {
            if (usuario.getUsername().toLowerCase().contains(s.toLowerCase())){
                dados.addRow(new Object[]{
                    usuario.getIduser(),
                    usuario,
                    usuario.getEmail(),
                    usuario.getPermission()
                });
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        userTable = new javax.swing.JTable();
        digitaUsernameLabel = new javax.swing.JLabel();
        txtDigitaUsername = new javax.swing.JTextField();
        btnUpdateUser = new javax.swing.JButton();
        btnToHomeUser = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gerenciar Usuários");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        userTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IdUsuário", "Usuário", "Email", "Permissão"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        userTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        userTable.getTableHeader().setReorderingAllowed(false);
        userTable.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                userTableFocusGained(evt);
            }
        });
        userTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userTableMouseClicked(evt);
            }
        });
        userTable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                userTableKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(userTable);
        if (userTable.getColumnModel().getColumnCount() > 0) {
            userTable.getColumnModel().getColumn(0).setResizable(false);
            userTable.getColumnModel().getColumn(0).setPreferredWidth(70);
            userTable.getColumnModel().getColumn(1).setPreferredWidth(150);
            userTable.getColumnModel().getColumn(2).setPreferredWidth(380);
            userTable.getColumnModel().getColumn(3).setPreferredWidth(100);
        }

        digitaUsernameLabel.setText("Digite o nome do Usuário:");

        txtDigitaUsername.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtDigitaUsernameFocusGained(evt);
            }
        });
        txtDigitaUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDigitaUsernameActionPerformed(evt);
            }
        });
        txtDigitaUsername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDigitaUsernameKeyReleased(evt);
            }
        });

        btnUpdateUser.setText("Atualizar");
        btnUpdateUser.setEnabled(false);
        btnUpdateUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateUserActionPerformed(evt);
            }
        });

        btnToHomeUser.setText("Voltar pra Home");
        btnToHomeUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnToHomeUserActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.setEnabled(false);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDigitaUsername, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 737, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(digitaUsernameLabel)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnToHomeUser)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnUpdateUser)
                        .addGap(18, 18, 18)
                        .addComponent(btnExcluir)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(digitaUsernameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDigitaUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdateUser)
                    .addComponent(btnToHomeUser)
                    .addComponent(btnExcluir))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtDigitaUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDigitaUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDigitaUsernameActionPerformed

    private void btnToHomeUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnToHomeUserActionPerformed
        new HomeAdm(this.user).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnToHomeUserActionPerformed

    private void txtDigitaUsernameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDigitaUsernameKeyReleased
        if(!txtDigitaUsername.getText().equals(this.comp) && txtDigitaUsername.getText().isEmpty()){
            Tabela();
        }else if(!txtDigitaUsername.getText().equals(this.comp)){
            Tabela(txtDigitaUsername.getText());
        }
        this.comp = txtDigitaUsername.getText();
    }//GEN-LAST:event_txtDigitaUsernameKeyReleased

    private void userTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userTableMouseClicked
        this.selectedUser = (Usuario) userTable.getValueAt(userTable.getSelectedRow(), 1);
    }//GEN-LAST:event_userTableMouseClicked

    private void userTableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_userTableKeyReleased
        if (evt.getKeyCode()== 40 || evt.getKeyCode() == 38){
            this.selectedUser = (Usuario) userTable.getValueAt(userTable.getSelectedRow(), 1);
        }
    }//GEN-LAST:event_userTableKeyReleased

    private void userTableFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_userTableFocusGained
        btnUpdateUser.setEnabled(true);
        btnExcluir.setEnabled(true);
    }//GEN-LAST:event_userTableFocusGained

    private void txtDigitaUsernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDigitaUsernameFocusGained
        btnUpdateUser.setEnabled(false);
        btnExcluir.setEnabled(false);
        userTable.clearSelection();
        this.selectedUser = null;
    }//GEN-LAST:event_txtDigitaUsernameFocusGained

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        int a = JOptionPane.showConfirmDialog(null, "Deseja Excluir?\nUsuário: "+this.selectedUser.getUsername());
        if (a == 0){
            DefaultTableModel dados = (DefaultTableModel) userTable.getModel();
            UsuarioDAO dao = new UsuarioDAO();
            dao.excluirUsuario(this.selectedUser);
            if (!txtDigitaUsername.getText().isEmpty()){
                this.users.remove(this.selectedUser);
                dados.removeRow(userTable.getSelectedRow());
                Tabela(txtDigitaUsername.getText());
            }else{
                Tabela();
            }
            btnUpdateUser.setEnabled(false);
            btnExcluir.setEnabled(false);
            userTable.clearSelection();
            this.selectedUser = null;
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnUpdateUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateUserActionPerformed
        if (this.userTable.getValueAt(userTable.getSelectedRow(), 2).toString().isEmpty() && this.userTable.getValueAt(userTable.getSelectedRow(), 3).toString().isEmpty()){
            JOptionPane.showMessageDialog(null, "Não pode deixar valores vázios!!");
        }else{
            String alteracoes = "";
            if (!this.selectedUser.getEmail().equals(this.userTable.getValueAt(userTable.getSelectedRow(), 2).toString())){
                alteracoes += "\n(Email) De: "+this.selectedUser.getEmail()+"\n(Email) Para: "+this.userTable.getValueAt(userTable.getSelectedRow(), 2).toString();
            }
            if (this.selectedUser.getPermission() != Integer.valueOf(this.userTable.getValueAt(userTable.getSelectedRow(), 3).toString())){
                alteracoes += "\n(Permissão) De: "+this.selectedUser.getPermission()+"\n(Permissão) Para: "+this.userTable.getValueAt(userTable.getSelectedRow(), 3);
            }
            
            if (!alteracoes.equals("")){
                int a = JOptionPane.showConfirmDialog(null, "Deseja Atualizar?"+alteracoes);
                if (a == 0){
                    UsuarioDAO dao = new UsuarioDAO();
                    Usuario UpdatedUser = new Usuario(this.selectedUser.getIduser(), this.selectedUser.getUsername(), this.userTable.getValueAt(userTable.getSelectedRow(), 2).toString(), this.selectedUser.getPassword(), Integer.valueOf(this.userTable.getValueAt(userTable.getSelectedRow(), 3).toString()));
                    dao.atualizarCliente(UpdatedUser);
                    btnUpdateUser.setEnabled(false);
                    btnExcluir.setEnabled(false);
                    userTable.clearSelection();
                    this.selectedUser = null;
                    Tabela();
                }
            }else{
                JOptionPane.showMessageDialog(null, "Altere Algum Campo para Atualizar!!");
            }
        }
    }//GEN-LAST:event_btnUpdateUserActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnToHomeUser;
    private javax.swing.JButton btnUpdateUser;
    private javax.swing.JLabel digitaUsernameLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtDigitaUsername;
    private javax.swing.JTable userTable;
    // End of variables declaration//GEN-END:variables
}
