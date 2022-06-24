
package mypack;


/**
 *
 * @author bahajyy
 */
public class FunctionsFrame extends javax.swing.JFrame {
    
    addMovieFrame addMovie = new addMovieFrame();
    showMovieFrame showMovie = new showMovieFrame();
    addStarFrame addStar = new addStarFrame();
    addRatingFrame addRating = new addRatingFrame();
    noOfTimesWatchedFrame noOfTimes = new noOfTimesWatchedFrame();
    showImageFrame showImage = new showImageFrame();
    highestRatedFrame highestRated = new highestRatedFrame();
    moviesOfStar moviesOfStar = new moviesOfStar();
    
    
    int movieId;
    String title;
    int year;
    int length;
    String genre;
    String studioName;
    String producerName;
    String shortDescription;
    double avgRating;
    int numWatched;
    
    /**
     * Creates new form FunctionsFrame
     */
    public FunctionsFrame() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        addMovieButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        addStarButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        addRatingButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        showMovieButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        noOfTimesButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        showImageButton = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        genreButton = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        moviesOfStarButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("FUNCTIONS");

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Add Movie");

        addMovieButton.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        addMovieButton.setForeground(new java.awt.Color(0, 0, 0));
        addMovieButton.setText("Enter");
        addMovieButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMovieButtonActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Add Star");

        addStarButton.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        addStarButton.setForeground(new java.awt.Color(0, 0, 0));
        addStarButton.setText("Enter");
        addStarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addStarButtonActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Add Rating");

        addRatingButton.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        addRatingButton.setForeground(new java.awt.Color(0, 0, 0));
        addRatingButton.setText("Enter");
        addRatingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addRatingButtonActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Show Movie");

        showMovieButton.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        showMovieButton.setForeground(new java.awt.Color(0, 0, 0));
        showMovieButton.setText("Enter");
        showMovieButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showMovieButtonActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 3, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("No of times watched");

        noOfTimesButton.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        noOfTimesButton.setForeground(new java.awt.Color(0, 0, 0));
        noOfTimesButton.setText("Enter");
        noOfTimesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noOfTimesButtonActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Helvetica Neue", 3, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Show Image");

        showImageButton.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        showImageButton.setForeground(new java.awt.Color(0, 0, 0));
        showImageButton.setText("Enter");
        showImageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showImageButtonActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Helvetica Neue", 3, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("Genre with highest rated");

        genreButton.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        genreButton.setForeground(new java.awt.Color(0, 0, 0));
        genreButton.setText("Enter");
        genreButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genreButtonActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Helvetica Neue", 3, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("Movies of star");

        moviesOfStarButton.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        moviesOfStarButton.setForeground(new java.awt.Color(0, 0, 0));
        moviesOfStarButton.setText("Enter");
        moviesOfStarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moviesOfStarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(141, 141, 141))
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(showImageButton, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(showMovieButton, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                        .addComponent(addRatingButton, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                        .addComponent(addStarButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addMovieButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(noOfTimesButton, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                    .addComponent(genreButton, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                    .addComponent(moviesOfStarButton, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE))
                .addGap(66, 66, 66))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(addMovieButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(addStarButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addRatingButton)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(showMovieButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(noOfTimesButton)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(showImageButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(genreButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(moviesOfStarButton)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(70, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addMovieButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addMovieButtonActionPerformed
        addMovie.setVisible(true);
    }//GEN-LAST:event_addMovieButtonActionPerformed

    private void showMovieButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showMovieButtonActionPerformed
       showMovie.setVisible(true);
    }//GEN-LAST:event_showMovieButtonActionPerformed

    private void noOfTimesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noOfTimesButtonActionPerformed
        noOfTimes.setVisible(true);
    }//GEN-LAST:event_noOfTimesButtonActionPerformed

    private void showImageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showImageButtonActionPerformed
        showImage.setVisible(true);
    }//GEN-LAST:event_showImageButtonActionPerformed

    private void addRatingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addRatingButtonActionPerformed
        addRating.setVisible(true);
    }//GEN-LAST:event_addRatingButtonActionPerformed

    private void addStarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addStarButtonActionPerformed
        addStar.setVisible(true);
    }//GEN-LAST:event_addStarButtonActionPerformed

    private void genreButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genreButtonActionPerformed
        highestRated.setVisible(true);
    }//GEN-LAST:event_genreButtonActionPerformed

    private void moviesOfStarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moviesOfStarButtonActionPerformed
        moviesOfStar.setVisible(true);
    }//GEN-LAST:event_moviesOfStarButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FunctionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FunctionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FunctionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FunctionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FunctionsFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addMovieButton;
    private javax.swing.JButton addRatingButton;
    private javax.swing.JButton addStarButton;
    private javax.swing.JButton genreButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton moviesOfStarButton;
    private javax.swing.JButton noOfTimesButton;
    private javax.swing.JButton showImageButton;
    private javax.swing.JButton showMovieButton;
    // End of variables declaration//GEN-END:variables
}