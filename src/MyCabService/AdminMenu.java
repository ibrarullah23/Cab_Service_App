
package MyCabService;

import java.sql.ResultSet;

public class AdminMenu extends javax.swing.JFrame {

    public AdminMenu() {
        initComponents();
        setFields();
    }

   private void setFields(){
       try {
           int captains = 0, passengers = 0, rides = 0, earnings = 0;
           
           ResultSet rsRides = DataBaseConnection.getData("select * from Rides");
           ResultSet rsCaptains = DataBaseConnection.getData("select * from Captains");
           ResultSet rsPassengers = DataBaseConnection.getData("select * from Clients");
           
           while(rsCaptains.next()){
               captains++;
           }
           while(rsPassengers.next()){
               passengers++;
           }
           while(rsRides.next()){
               rides++;
               if(rsRides.getString("Status").equals("Dropped")){
                   earnings += Integer.parseInt(rsRides.getString("Fare"));
               }
           }
           float CEarnings = earnings*0.07f;
           
           btnEarnings.setText("Total Earnings Rs "+ CEarnings);
           btnRides.setText("Rides Taken : "+rides);
           btnCaptains.setText("Captains : "+ captains);
           btnPassengers.setText("Passengers : "+passengers );
           
       } catch (Exception e) {
       }
       
   }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btnRides = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        btnEarnings = new javax.swing.JButton();
        btnCaptains = new javax.swing.JButton();
        btnPassengers = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(729, 535));
        setPreferredSize(new java.awt.Dimension(729, 535));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(244, 244, 244));
        jPanel1.setPreferredSize(new java.awt.Dimension(756, 496));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setMinimumSize(new java.awt.Dimension(870, 401));

        btnRides.setBackground(new java.awt.Color(255, 140, 10));
        btnRides.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnRides.setForeground(new java.awt.Color(255, 255, 255));
        btnRides.setText("Rides Taken ##");
        btnRides.setMinimumSize(new java.awt.Dimension(91, 31));
        btnRides.setPreferredSize(new java.awt.Dimension(91, 31));
        btnRides.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRidesActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(120, 128, 134));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Log out");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        btnEarnings.setBackground(new java.awt.Color(29, 225, 120));
        btnEarnings.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnEarnings.setForeground(new java.awt.Color(255, 255, 255));
        btnEarnings.setText("Total Earnings Rs ###");
        btnEarnings.setMinimumSize(new java.awt.Dimension(91, 31));
        btnEarnings.setPreferredSize(new java.awt.Dimension(91, 31));
        btnEarnings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEarningsActionPerformed(evt);
            }
        });

        btnCaptains.setBackground(new java.awt.Color(79, 166, 241));
        btnCaptains.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnCaptains.setForeground(new java.awt.Color(255, 255, 255));
        btnCaptains.setText("Captains ##");
        btnCaptains.setMinimumSize(new java.awt.Dimension(91, 31));
        btnCaptains.setPreferredSize(new java.awt.Dimension(91, 31));
        btnCaptains.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCaptainsActionPerformed(evt);
            }
        });

        btnPassengers.setBackground(new java.awt.Color(79, 166, 241));
        btnPassengers.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnPassengers.setForeground(new java.awt.Color(255, 255, 255));
        btnPassengers.setText("Passengers ##");
        btnPassengers.setMinimumSize(new java.awt.Dimension(91, 31));
        btnPassengers.setPreferredSize(new java.awt.Dimension(91, 31));
        btnPassengers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPassengersActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnCaptains, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnPassengers, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnEarnings, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(btnRides, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(146, 146, 146)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEarnings, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRides, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCaptains, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPassengers, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.setForeground(new java.awt.Color(214, 214, 214));

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Admin Dashboard");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(210, 210, 210))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 709, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 729, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(729, 535));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCaptainsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCaptainsActionPerformed
       new AllUsers("select * from Captains", "All Captains").setVisible(true);
    }//GEN-LAST:event_btnCaptainsActionPerformed

    private void btnRidesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRidesActionPerformed
        new RideHistory("SELECT * FROM Rides ").setVisible(true);
    }//GEN-LAST:event_btnRidesActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnEarningsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEarningsActionPerformed
        setFields();
    }//GEN-LAST:event_btnEarningsActionPerformed

    private void btnPassengersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPassengersActionPerformed
        new AllUsers("select * from Clients", "All Passengers").setVisible(true);
    }//GEN-LAST:event_btnPassengersActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCaptains;
    private javax.swing.JButton btnEarnings;
    private javax.swing.JButton btnPassengers;
    private javax.swing.JButton btnRides;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables

}
