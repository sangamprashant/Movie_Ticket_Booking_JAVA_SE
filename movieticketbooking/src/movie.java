import java.sql.*;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
/**
 *
 * @author Prasnat Srivastav
 */
public class movie extends javax.swing.JFrame {

     private Connection connection;
    private Statement statement;
    
    public movie() {
        initComponents();
         initializeDatabase();
        loadMovies();
    }
    
    private void initializeDatabase() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost/java_dbmovies", "root", "");
            statement = connection.createStatement();
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(this, "Error connecting to the database: " + e.getMessage());
        }
    }
    private void loadMovies() {
        MovieSelector.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select a movie" }));
        try {
            ResultSet resultSet = statement.executeQuery("SELECT DISTINCT movieName FROM table3");
            while (resultSet.next()) {
                String movieName = resultSet.getString("movieName");
                MovieSelector.addItem(movieName);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error loading movies from the database: " + e.getMessage());
        }
    }

    private void loadTheaters(String selectedMovie) {
        TheatreSelector.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select a theatre" }));
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT DISTINCT theatre FROM table3 WHERE movieName = ?");
            preparedStatement.setString(1, selectedMovie);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String theaterName = resultSet.getString("theatre");
                TheatreSelector.addItem(theaterName);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error loading theaters: " + e.getMessage());
        }
    }

    private void loadDates(String selectedMovie, String selectedTheater) {
        DateSelector.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select a date" }));
        try {
            ResultSet resultSet = statement.executeQuery("SELECT DISTINCT date FROM table3 WHERE movieName = '" + selectedMovie + "' AND theatre = '" + selectedTheater + "'");
            while (resultSet.next()) {
                String showDate = resultSet.getString("date");
                DateSelector.addItem(showDate);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error loading dates: " + e.getMessage());
        }
    }

    private void loadTimes(String selectedMovie, String selectedTheater, String selectedDate) {
       TimeSelector.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select a show" }));
        try {
            ResultSet resultSet = statement.executeQuery("SELECT DISTINCT shows FROM table3 WHERE movieName = '" + selectedMovie + "' AND theatre = '" + selectedTheater + "' AND date = '" + selectedDate + "'");
            while (resultSet.next()) {
                String showTime = resultSet.getString("shows");
                TimeSelector.addItem(showTime);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error loading times: " + e.getMessage());
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

        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        MovieSelector = new javax.swing.JComboBox<>();
        TheatreSelector = new javax.swing.JComboBox<>();
        TimeSelector = new javax.swing.JComboBox<>();
        DateSelector = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "MOVIE DETAILS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Algerian", 1, 36), new java.awt.Color(0, 204, 204))); // NOI18N
        jPanel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("SELECT MOVIE:");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setText("SELECT  THEATRE:");

        MovieSelector.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        MovieSelector.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select a movie" }));
        MovieSelector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MovieSelectorActionPerformed(evt);
            }
        });

        TheatreSelector.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        TheatreSelector.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select a theatre" }));
        TheatreSelector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TheatreSelectorActionPerformed(evt);
            }
        });

        TimeSelector.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        TimeSelector.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select a show " }));

        DateSelector.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        DateSelector.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select a date" }));
        DateSelector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DateSelectorActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setText("SELECT DATE:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setText("SELECT TIME:");

        jTextField1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N

        jButton1.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jButton1.setText("SUBMIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setText("NO OF TICKETS:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(190, 190, 190)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(74, 74, 74)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(MovieSelector, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TheatreSelector, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(DateSelector, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TimeSelector, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(60, 60, 60))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(MovieSelector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(TheatreSelector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(DateSelector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(TimeSelector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(jButton1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(220, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        workWithDatabase();
    }
     public void workWithDatabase()
    {
         String selectedMovie = (String) MovieSelector.getSelectedItem();
        String selectedTheater = (String) TheatreSelector.getSelectedItem();
        String selectedDate = (String) DateSelector.getSelectedItem();
        String selectedTime = (String) TimeSelector.getSelectedItem();
        String ticketCountText = jTextField1.getText();
        String a=(String) MovieSelector.getSelectedItem();
       String b=(String) TheatreSelector.getSelectedItem();
        String e=(String) TimeSelector.getSelectedItem();
        String f=(String) DateSelector.getSelectedItem();
       String d=jTextField1.getText();
       String N=jTextField1.getText();
        int N1=100*Integer.parseInt(N);

        if (selectedMovie == null || "Select a movie".equals(selectedMovie) ||
    selectedTheater == null || "Select a theatre".equals(selectedTheater) ||
    selectedDate == null || "Select a date".equals(selectedDate) ||
    selectedTime == null || "Select a show".equals(selectedTime) ||
    ticketCountText.isEmpty()) {
    JOptionPane.showMessageDialog(this, "Please select all options and enter the number of tickets.");
    return;
}

        try {
            int ticketCount = Integer.parseInt(ticketCountText);
            
            if(ticketCount>10||ticketCount<=0){
                JOptionPane.showMessageDialog(this, "Ticket should be atleast 1 and not exceed above of 10.");
                return;
            }

            // Check ticket availability before booking
            ResultSet resultSet = statement.executeQuery("SELECT tickets FROM table3 WHERE movieName = '" + selectedMovie + "' AND theatre = '" + selectedTheater + "' AND date = '" + selectedDate + "' AND shows = '" + selectedTime + "'");
            if (resultSet.next()) {
                int availableTickets = resultSet.getInt("tickets");
                if (ticketCount <= availableTickets) {
                    // Perform booking and update available tickets in the database
//                    int newAvailableTickets = availableTickets - ticketCount;
//                    statement.executeUpdate("UPDATE table3 SET tickets = " + newAvailableTickets + " WHERE movieName = '" + selectedMovie + "' AND theatre = '" + selectedTheater + "' AND date = '" + selectedDate + "' AND shows = '" + selectedTime + "'");
//                    JOptionPane.showMessageDialog(this, "Booking successful!");
                    this.setVisible(false);  new recepit(a,b,e,d,N1,f).setVisible(true); 
                } else {
                    JOptionPane.showMessageDialog(this, "Not enough tickets available.");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Tickets information not found.");
            }
        } catch (NumberFormatException | SQLException er) {
            JOptionPane.showMessageDialog(this, "Error processing booking: " + er.getMessage());
        }
    
             
// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void DateSelectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DateSelectorActionPerformed
        // TODO add your handling code here:
             String selectedMovie = (String) MovieSelector.getSelectedItem();
    String selectedTheater = (String) TheatreSelector.getSelectedItem();
    String selectedDate = (String) DateSelector.getSelectedItem();

    if (selectedMovie != null && selectedTheater != null && selectedDate != null) {
        loadTimes(selectedMovie, selectedTheater, selectedDate);
    }
    }//GEN-LAST:event_DateSelectorActionPerformed

    private void MovieSelectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MovieSelectorActionPerformed

        String selectedMovie = (String) MovieSelector.getSelectedItem();
    if (selectedMovie != null) {
        loadTheaters(selectedMovie);
    }
    }//GEN-LAST:event_MovieSelectorActionPerformed

    private void TheatreSelectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TheatreSelectorActionPerformed
        // TODO add your handling code here:
     String selectedMovie = (String) MovieSelector.getSelectedItem();
    String selectedTheater = (String) TheatreSelector.getSelectedItem();

    if (selectedMovie != null && selectedTheater != null) {
        loadDates(selectedMovie, selectedTheater);
    }
    }//GEN-LAST:event_TheatreSelectorActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new movie().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> DateSelector;
    private javax.swing.JComboBox<String> MovieSelector;
    private javax.swing.JComboBox<String> TheatreSelector;
    private javax.swing.JComboBox<String> TimeSelector;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
