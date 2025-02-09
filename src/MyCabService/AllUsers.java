
package MyCabService;

import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

public class AllUsers extends javax.swing.JFrame {

    /**
     * Creates new form RidesHistory
     * @param Sql
     */
    
    public AllUsers(String Sql, String lable) {
        initComponents();
        lbl.setText(lable);
        DefaultTableModel m = (DefaultTableModel) tbl.getModel();
        
        try {
            ResultSet rs = DataBaseConnection.getData(Sql);
            while(rs.next()){
                m.addRow(new String[]{rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6)});
            }
        } catch (Exception e) {
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        lbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(914, 551));
        setResizable(false);

        tbl.setBackground(new java.awt.Color(247, 247, 247));
        tbl.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Full Name", "Phone No", "CNIC", "Email", "Username"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl.setToolTipText("");
        tbl.setSelectionBackground(new java.awt.Color(121, 170, 210));
        tbl.getTableHeader().setResizingAllowed(false);
        tbl.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tbl);
        if (tbl.getColumnModel().getColumnCount() > 0) {
            tbl.getColumnModel().getColumn(0).setResizable(false);
            tbl.getColumnModel().getColumn(0).setPreferredWidth(1);
            tbl.getColumnModel().getColumn(1).setResizable(false);
            tbl.getColumnModel().getColumn(1).setPreferredWidth(99);
            tbl.getColumnModel().getColumn(2).setResizable(false);
            tbl.getColumnModel().getColumn(2).setPreferredWidth(99);
            tbl.getColumnModel().getColumn(3).setResizable(false);
            tbl.getColumnModel().getColumn(3).setPreferredWidth(99);
            tbl.getColumnModel().getColumn(4).setResizable(false);
            tbl.getColumnModel().getColumn(4).setPreferredWidth(99);
            tbl.getColumnModel().getColumn(5).setResizable(false);
            tbl.getColumnModel().getColumn(5).setPreferredWidth(99);
        }

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        lbl.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 20)); // NOI18N
        lbl.setForeground(new java.awt.Color(51, 51, 51));
        lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl.setText("All Users");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(292, Short.MAX_VALUE)
                .addComponent(lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(318, 318, 318))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 878, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 421, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(914, 551));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl;
    private javax.swing.JTable tbl;
    // End of variables declaration//GEN-END:variables
}
