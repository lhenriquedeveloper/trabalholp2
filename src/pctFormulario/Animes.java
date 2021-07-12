/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pctFormulario;

import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;
import pctControle.Anime;
import pctControle.Usuario;
import pctDAO.GlobalDAO;
import utils.Imagem;

/**
 *
 * @author ahnitam
 */
public class Animes extends javax.swing.JFrame {

    /**
     * Creates new form Animes
     */
    private final Usuario user;

    public Animes(Usuario user) {
        this.user = user;
        initComponents();
        ListarAnimes();
        FilterJComboBox();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        animeImagem = new javax.swing.JLabel();
        btnHome = new javax.swing.JButton();
        btnReviews = new javax.swing.JButton();
        boxAnimes = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        labelAnime = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        labelEstudio = new javax.swing.JLabel();
        labelData = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        labelGeneros = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        labelNota = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        labelDescricao = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Animes");
        setResizable(false);

        animeImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/bitmap.png"))); // NOI18N

        btnHome.setText("Home");
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        btnReviews.setText("Reviews");
        btnReviews.setEnabled(false);
        btnReviews.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReviewsActionPerformed(evt);
            }
        });

        boxAnimes.setEditable(true);
        boxAnimes.setToolTipText("Escolha um Anime");
        boxAnimes.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                boxAnimesItemStateChanged(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel1.setText("Titulo:");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel2.setText("Descrição:");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel3.setText("Data de Lançamento:");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel4.setText("Estudio:");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel7.setText("Gêneros:");

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel9.setText("Nota:");

        labelDescricao.setEditable(false);
        labelDescricao.setBackground(new java.awt.Color(233, 233, 233));
        labelDescricao.setColumns(20);
        labelDescricao.setLineWrap(true);
        labelDescricao.setRows(5);
        labelDescricao.setWrapStyleWord(true);
        labelDescricao.setFocusable(false);
        jScrollPane2.setViewportView(labelDescricao);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnReviews)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(boxAnimes, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(labelNota, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(94, 94, 94)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelGeneros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelEstudio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelData, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelAnime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jScrollPane2))
                        .addGap(18, 18, 18)))
                .addComponent(animeImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(boxAnimes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelAnime, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addGap(4, 4, 4)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(labelData, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(labelEstudio, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(labelGeneros, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(labelNota, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnHome)
                            .addComponent(btnReviews)))
                    .addComponent(animeImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void boxAnimesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_boxAnimesItemStateChanged
        if (boxAnimes.getSelectedIndex() != -1) {
            animeInfo((Anime) boxAnimes.getSelectedItem());
            btnReviews.setEnabled(true);
        }
    }//GEN-LAST:event_boxAnimesItemStateChanged

    private void btnReviewsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReviewsActionPerformed
        new ConsultaReview(this.user, (Anime) boxAnimes.getSelectedItem()).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnReviewsActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        new HomeUsuario(this.user).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnHomeActionPerformed

    private void ListarAnimes() {
        DefaultComboBoxModel dados = (DefaultComboBoxModel) boxAnimes.getModel();
        dados.removeAllElements();

        List<Anime> AnimeList = GlobalDAO.getInstance().animeDAO.listarAnimes();
        AnimeList.forEach(anime -> {
            dados.addElement(anime);
        });
    }

    private void animeInfo(Anime anime) {
        try {
            labelAnime.setText(anime.getName());
            labelDescricao.setText(anime.getSinopse());
            labelEstudio.setText(anime.getEstudio().getNome());
            labelData.setText(anime.getDataString());
            labelGeneros.setText(anime.Generos());
            labelNota.setText(String.valueOf(anime.getMedia()));

            if (anime.getUrlImagem() != null) {
                animeImagem.setIcon(Imagem.resize(anime.getUrlImagem(), 200, 300));
            } else {
                animeImagem.setIcon(Imagem.resize(new ImageIcon(getClass().getResource("/imgs/bitmap.png")), 200, 300));
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    private void FilterJComboBox() {
        AutoCompleteDecorator.decorate(boxAnimes);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel animeImagem;
    private javax.swing.JComboBox<String> boxAnimes;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnReviews;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelAnime;
    private javax.swing.JLabel labelData;
    private javax.swing.JTextArea labelDescricao;
    private javax.swing.JLabel labelEstudio;
    private javax.swing.JLabel labelGeneros;
    private javax.swing.JLabel labelNota;
    // End of variables declaration//GEN-END:variables
}
