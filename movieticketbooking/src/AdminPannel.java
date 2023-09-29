
import java.sql.*;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class AdminPannel extends javax.swing.JFrame {

    public AdminPannel() {
        initComponents();
        serverConnect();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        testDateEvaluator1 = new com.toedter.calendar.demo.TestDateEvaluator();
        jLocaleChooserBeanInfo1 = new com.toedter.components.JLocaleChooserBeanInfo();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        moviename = new javax.swing.JTextField();
        movietheator = new javax.swing.JTextField();
        movieshows = new javax.swing.JTextField();
        movieticket = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        moviesave = new javax.swing.JButton();
        moviedate = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        DeleteMovie = new javax.swing.JButton();
        IdToDelete = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        ToUsers = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Movie name", "Date", "Theater", "Shows", "Tickets"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        moviename.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                movienameActionPerformed(evt);
            }
        });

        movietheator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                movietheatorActionPerformed(evt);
            }
        });

        movieshows.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                movieshowsActionPerformed(evt);
            }
        });

        movieticket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                movieticketActionPerformed(evt);
            }
        });

        jLabel2.setText("Movie Name");

        jLabel3.setText("Theater");

        jLabel4.setText("Date");

        jLabel5.setText("Tickets");

        jLabel6.setText("Shows");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Add A Show");

        moviesave.setBackground(new java.awt.Color(0, 153, 153));
        moviesave.setForeground(new java.awt.Color(255, 255, 255));
        moviesave.setText("Save");
        moviesave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                moviesaveMouseClicked(evt);
            }
        });

        jDesktopPane1.setLayer(moviename, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(movietheator, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(movieshows, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(movieticket, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(moviesave, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(moviedate, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jDesktopPane1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(moviename)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(moviedate, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(313, 313, 313)
                        .addComponent(moviesave, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(movietheator, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                                .addContainerGap(32, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(220, 220, 220)))
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(movieticket, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(movieshows, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(66, 66, 66))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(moviename, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(46, 46, 46))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(movieshows, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6))
                            .addComponent(moviedate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(movieticket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(movietheator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(moviesave)
                .addGap(21, 21, 21))
        );

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Movies & Shows");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Delete A Show");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setText("Enter the movie id");

        DeleteMovie.setBackground(new java.awt.Color(0, 153, 153));
        DeleteMovie.setForeground(new java.awt.Color(255, 255, 255));
        DeleteMovie.setText("Delete");
        DeleteMovie.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteMovieMouseClicked(evt);
            }
        });

        IdToDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdToDeleteActionPerformed(evt);
            }
        });

        jDesktopPane2.setLayer(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(DeleteMovie, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(IdToDelete, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane2Layout = new javax.swing.GroupLayout(jDesktopPane2);
        jDesktopPane2.setLayout(jDesktopPane2Layout);
        jDesktopPane2Layout.setHorizontalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(IdToDelete)
                .addGap(18, 18, 18)
                .addComponent(DeleteMovie, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(181, 181, 181))
            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDesktopPane2Layout.setVerticalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel8)
                .addGap(39, 39, 39)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(IdToDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DeleteMovie))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jButton1.setBackground(new java.awt.Color(255, 0, 51));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("LOGOUT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        ToUsers.setBackground(new java.awt.Color(0, 102, 102));
        ToUsers.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        ToUsers.setForeground(new java.awt.Color(255, 255, 255));
        ToUsers.setText("USERS");
        ToUsers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ToUsersMouseClicked(evt);
            }
        });
        ToUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ToUsersActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 787, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(ToUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jDesktopPane2, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(6, 6, 6)
                            .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ToUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jDesktopPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void movienameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_movienameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_movienameActionPerformed

    private void movietheatorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_movietheatorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_movietheatorActionPerformed

    private void movieticketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_movieticketActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_movieticketActionPerformed

    private void movieshowsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_movieshowsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_movieshowsActionPerformed

    private void IdToDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdToDeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IdToDeleteActionPerformed

    private void DeleteMovieMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteMovieMouseClicked
        // Get the movie ID to delete
    String idToDelete = IdToDelete.getText();

    // Check if the movie ID is null or empty
    if (idToDelete == null || idToDelete.trim().isEmpty()) {
        // Show an error dialog if the input is empty
        JOptionPane.showMessageDialog(this, "Please enter a valid movie ID.");
    } else {
        // Perform the movie deletion here (e.g., from your database)
        boolean deleted = deleteMovie(idToDelete);

        // Show a message based on the result
        if (deleted) {
            // Movie deleted successfully
            JOptionPane.showMessageDialog(this, "Movie with ID '" + idToDelete + "' has been deleted.");
             refreshTableData();
        } else {
            // Movie not found
            JOptionPane.showMessageDialog(this, "Movie with ID '" + idToDelete + "' not found.");
        }
    }
        
        
    }//GEN-LAST:event_DeleteMovieMouseClicked

    private void moviesaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_moviesaveMouseClicked
        // TODO add your handling code here:
        // Gather data from input fields
        String movieName = moviename.getText();
        String date = ((JTextField) moviedate.getDateEditor().getUiComponent()).getText();
        String theater = movietheator.getText();
        String shows = movieshows.getText();
        String ticketText = movieticket.getText();

        // Check if any of the required fields are empty
        if (movieName.isEmpty() || date.isEmpty() || theater.isEmpty() || shows.isEmpty() || ticketText.isEmpty()) {
            JOptionPane.showMessageDialog(AdminPannel.this, "Please fill in all required fields.");
        } else {
            try {
                int tickets = Integer.parseInt(ticketText);
                
                // Insert data into the database
                boolean inserted = insertMovie(movieName, date, theater, shows, tickets);

                if (inserted) {
                    JOptionPane.showMessageDialog(AdminPannel.this, "Movie added successfully.");
                    // Refresh the table data
                    refreshTableData();
                } else {
                    JOptionPane.showMessageDialog(AdminPannel.this, "Failed to add movie.");
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(AdminPannel.this, "Please enter a valid number for tickets.");
            }
        }
    }//GEN-LAST:event_moviesaveMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        mainLanding logout = new mainLanding();
        logout.setVisible(true);
        AdminPannel.this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ToUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ToUsersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ToUsersActionPerformed

    private void ToUsersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ToUsersMouseClicked
        // TODO add your handling code here:
        AdminUsers ad = new AdminUsers();
        ad.setVisible(true);
        AdminPannel.this.setVisible(false);
    }//GEN-LAST:event_ToUsersMouseClicked

    private boolean insertMovie(String movieName, String date, String theater, String shows, int tickets) {
    boolean inserted = false;
    try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost/java_dbmovies", "root", "");

        // Prepare the SQL statement to insert the movie data
        String sql = "INSERT INTO table3 (movieName, date, theatre, shows, tickets) VALUES (?, ?, ?, ?, ?)";
        PreparedStatement preparedStatement = c.prepareStatement(sql);
        preparedStatement.setString(1, movieName);
        preparedStatement.setString(2, date);
        preparedStatement.setString(3, theater);
        preparedStatement.setString(4, shows);
        preparedStatement.setInt(5, tickets);

        // Execute the SQL statement
        int rowsAffected = preparedStatement.executeUpdate();

        // If rowsAffected is greater than 0, the movie was inserted successfully
        if (rowsAffected > 0) {
            inserted = true;
        }

        c.close();
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }
    return inserted;
}
    
    // Implement a method to delete the movie from the database
private boolean deleteMovie(String idToDelete) {
    boolean deleted = false;
    try {
        // Add your database delete logic here
        // For demonstration purposes, we assume that the movie is deleted successfully
        // You should replace this with your actual database delete code
        Class.forName("com.mysql.jdbc.Driver");
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost/java_dbmovies", "root", "");

        PreparedStatement ps = c.prepareStatement("DELETE FROM table3 WHERE id = ?");
        ps.setString(1, idToDelete);

        int rowsAffected = ps.executeUpdate();

        // If rowsAffected is greater than 0, the movie was deleted successfully
        if (rowsAffected > 0) {
            deleted = true;
        }

        c.close();
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }
    return deleted;
}
// Method to refresh the table data from the database
private void refreshTableData() {
    DefaultTableModel tblModel = (DefaultTableModel) jTable1.getModel();
    tblModel.setRowCount(0); // Clear the table data

    // Fetch and populate the updated data from the database
    serverConnect();
}

    private void serverConnect(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection c=DriverManager.getConnection("jdbc:mysql://localhost/java_dbmovies","root","");
            
            Statement st = c.createStatement();
            String sql= "SELECT * FROM table3";
            
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                String id = String.valueOf(rs.getInt("id"));
                String name = rs.getString("movieName");                 
                String date = rs.getString("date");
                String theatre = rs.getString("theatre");
                String shows = rs.getString("shows");
                String tickets = String.valueOf(rs.getInt("tickets"));
                String tdData[] = {id,name,date,theatre,shows,tickets};
                DefaultTableModel tblModel = (DefaultTableModel)jTable1.getModel();
                tblModel.addRow(tdData);
            }
            c.close();
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

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
            java.util.logging.Logger.getLogger(AdminPannel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminPannel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminPannel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminPannel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminPannel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DeleteMovie;
    private javax.swing.JTextField IdToDelete;
    private javax.swing.JButton ToUsers;
    private javax.swing.JButton jButton1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private com.toedter.components.JLocaleChooserBeanInfo jLocaleChooserBeanInfo1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private com.toedter.calendar.JDateChooser moviedate;
    private javax.swing.JTextField moviename;
    private javax.swing.JButton moviesave;
    private javax.swing.JTextField movieshows;
    private javax.swing.JTextField movietheator;
    private javax.swing.JTextField movieticket;
    private com.toedter.calendar.demo.TestDateEvaluator testDateEvaluator1;
    // End of variables declaration//GEN-END:variables
}
