package mypack;  
import java.io.FileWriter;
import javax.swing.JOptionPane;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.File;
import java.io.IOException;

public class addMovieFrame extends javax.swing.JFrame {    
  
                
    public addMovieFrame() {
        initComponents();
    }   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        titleText = new javax.swing.JTextField();
        yearText = new javax.swing.JTextField();
        lengthText = new javax.swing.JTextField();
        genreText = new javax.swing.JTextField();
        studioText = new javax.swing.JTextField();
        producerText = new javax.swing.JTextField();
        descriptionText = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        submitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("Title:");

        jLabel3.setText("Year:");

        jLabel4.setText("Length:");

        jLabel5.setText("Genre:");

        jLabel6.setText("Studio:");

        jLabel7.setText("Producer:");

        jLabel8.setText("Description:");

        jLabel11.setFont(new java.awt.Font("Helvetica Neue", 3, 18)); // NOI18N
        jLabel11.setText("ADD MOVIE");

        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(yearText)
                                    .addComponent(lengthText)
                                    .addComponent(genreText)
                                    .addComponent(studioText)
                                    .addComponent(producerText)
                                    .addComponent(descriptionText)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(60, 60, 60)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(titleText, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(submitButton)))
                .addContainerGap(147, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel11)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(titleText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(yearText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(lengthText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(genreText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(studioText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(producerText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(descriptionText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(submitButton)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public static String fileReading() throws FileNotFoundException
    {
        BufferedReader buff = new BufferedReader(new FileReader("/Users/bahajyy/Desktop/java/Proje/2224PROJECT/Movies.txt"));
        String line = null;
        String result = "";
        
        try {
           
            while((line = buff.readLine()) != null)
            {
                String[] elements = line.split(" ");               
                result += line + "\n";
            }                        
            buff.close();
        }
        catch(IOException ex){
            System.out.println("Fail IO Exception");
        }
        return result;
    } 
    
      public int getLastId()
    {
        File MovieFile = new File("/Users/bahajyy/Desktop/java/Proje/2224PROJECT/Movies.txt");
        String lastId;
        int idInt = 0;
        
        try {   
           
            try (BufferedReader read = new BufferedReader(new FileReader(MovieFile))) {
                String line;
                
                while((line = read.readLine()) != null)
                {
                    String[] movieInfo = line.split(" ");
                    lastId = movieInfo[0];
                    idInt = Integer.parseInt(lastId.trim());
                }
                idInt = idInt + 1;
            }                
        }   
        catch (FileNotFoundException ex) {
            System.out.println("File is not found");
        } 
        catch (IOException ex) {
             System.out.println("IO Exception");
        }             
        return idInt;
    }
     
    
    
    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
      
        int movieId=getLastId();
        String title=titleText.getText();
        int year=Integer.parseInt(yearText.getText());
        int length=Integer.parseInt(lengthText.getText());
        String genre=genreText.getText();
        String studioName=studioText.getText();
        String producerName=producerText.getText();
        String shortDescription=descriptionText.getText();
        int avgRating=0;      
        
         try
        {
            FileWriter Writer = new FileWriter("/Users/bahajyy/Desktop/java/Proje/2224PROJECT/Movies.txt",true);
            Writer.write(movieId+" "+title+" "+year+" "+length+" "+genre+" "+studioName+" "+producerName+" "+shortDescription+" "+avgRating+"\n");
            Writer.close();
            JOptionPane.showMessageDialog(null,"Movie added to the file");
            setVisible(false);
            new addMovieFrame().setVisible(true);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Error");
        }
    }//GEN-LAST:event_submitButtonActionPerformed
       
    public static void main(String args[]) {       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               new addMovieFrame().setVisible(true);
               
                               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JTextField descriptionText;
    private static javax.swing.JTextField genreText;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private static javax.swing.JTextField lengthText;
    private static javax.swing.JTextField producerText;
    private static javax.swing.JTextField studioText;
    private javax.swing.JButton submitButton;
    private static javax.swing.JTextField titleText;
    private static javax.swing.JTextField yearText;
    // End of variables declaration//GEN-END:variables
}
