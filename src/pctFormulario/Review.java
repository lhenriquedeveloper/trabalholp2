/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pctFormulario;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import pctControle.Anime;
import pctControle.Usuario;
import pctDAO.ReviewDAO;

/**
 *
 * @author Luis Henrique
 */
public class Review extends javax.swing.JFrame {

    /**
     * Creates new form Review
     */
    private final Usuario user;
    private final Anime anime;
    private final JFrame parent;
    private final pctControle.Review review; 
    
    public Review(Usuario user, Anime anime, JFrame parent) {
        this.user = user;
        this.anime = anime;
        this.parent = parent;
        this.review = null;
        initComponents();
        selectLabel.setText("Anime: "+this.anime.getName());
        userLabel.setText("Usuário: "+this.user.getUsername());
    }
    public Review(Usuario user, Anime anime, JFrame parent, pctControle.Review review) {
        this.user = user;
        this.anime = anime;
        this.parent = parent;
        this.review = review;
        initComponents();
        selectLabel.setText("Anime: "+this.anime.getName());
        userLabel.setText("Usuário: "+this.user.getUsername());
        EditarInit();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        selectLabel = new javax.swing.JLabel();
        selectNotaBox = new javax.swing.JComboBox<>();
        notaLabel = new javax.swing.JLabel();
        btnCancelRev = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        btxtDescricao = new javax.swing.JTextPane();
        descricaoLabel = new javax.swing.JLabel();
        btnCreateReview = new javax.swing.JButton();
        userLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        selectLabel.setFont(new java.awt.Font("Noto Sans Mono SemiCondensed Black", 1, 24)); // NOI18N
        selectLabel.setText("Anime:");

        selectNotaBox.setMaximumRowCount(5);
        selectNotaBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10", "9", "8", "7", "6", "5", "4", "3", "2", "1" }));
        selectNotaBox.setSelectedIndex(-1);
        selectNotaBox.setToolTipText("Selecione Uma Nota");

        notaLabel.setText("Nota:");

        btnCancelRev.setText("Cancelar");
        btnCancelRev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelRevActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(btxtDescricao);

        descricaoLabel.setText("Review:");

        btnCreateReview.setText("Criar");
        btnCreateReview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateReviewActionPerformed(evt);
            }
        });

        userLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        userLabel.setText("Usuário: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(selectLabel)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(descricaoLabel)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCreateReview)
                                .addGap(18, 18, 18)
                                .addComponent(btnCancelRev)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(userLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(notaLabel)
                            .addComponent(selectNotaBox, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(selectLabel)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(descricaoLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(notaLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(selectNotaBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 120, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreateReview)
                    .addComponent(btnCancelRev)
                    .addComponent(userLabel))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelRevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelRevActionPerformed
        this.parent.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCancelRevActionPerformed

    private void btnCreateReviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateReviewActionPerformed
        if (btnCreateReview.getText().equals("Atualizar")){
            Editar();
        }else{
            Cadastrar();
        }
        
    }//GEN-LAST:event_btnCreateReviewActionPerformed
    
    protected void EditarInit(){
        btnCreateReview.setText("Atualizar");
        this.setTitle("Editar Review");
        btxtDescricao.setText(this.review.getDescricao());
        selectNotaBox.setSelectedItem(String.valueOf(this.review.getNota()));
    }
    protected void Editar(){
        if (btxtDescricao.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Digite uma review!");
        }else if (selectNotaBox.getSelectedIndex() == -1){
            JOptionPane.showMessageDialog(null, "Selecione uma nota!");
        }else if (this.review.getDescricao().equals(btxtDescricao.getText()) && selectNotaBox.getSelectedItem().toString().equals(String.valueOf(this.review.getNota()))){
            JOptionPane.showMessageDialog(null, "Faça uma alteração para atualizar!");
        }else{
            ReviewDAO dao = new ReviewDAO();
            dao.atualizarReview(new pctControle.Review(this.review.getIdReview(), btxtDescricao.getText(), Integer.valueOf(selectNotaBox.getSelectedItem().toString()), this.review.getUser(), this.review.getId_Anime(), this.review.getId_user(), this.review.getData()));
            this.parent.dispose();
            new ConsultaReview(this.user).setVisible(true);
            this.dispose();
        }
    }
    
    protected void Cadastrar(){
        if (btxtDescricao.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Digite uma review!");
        }else if(selectNotaBox.getSelectedIndex() == -1){
            JOptionPane.showMessageDialog(null, "Selecione uma nota!");
        }else{
            ReviewDAO dao = new ReviewDAO();
            dao.cadastrarReview(this.user, this.anime, btxtDescricao.getText(), Integer.valueOf(selectNotaBox.getItemAt(selectNotaBox.getSelectedIndex())));
            this.parent.dispose();
            new ConsultaReview(this.user).setVisible(true);
            this.dispose();
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        JOptionPane.showMessageDialog(null, "Faça Login!");
        System.exit(0);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelRev;
    private javax.swing.JButton btnCreateReview;
    private javax.swing.JTextPane btxtDescricao;
    private javax.swing.JLabel descricaoLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel notaLabel;
    private javax.swing.JLabel selectLabel;
    private javax.swing.JComboBox<String> selectNotaBox;
    private javax.swing.JLabel userLabel;
    // End of variables declaration//GEN-END:variables
}
