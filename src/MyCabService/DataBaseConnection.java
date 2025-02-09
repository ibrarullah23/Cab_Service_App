package MyCabService;

import java.sql.*;

public class DataBaseConnection {
    
    public static Connection setConnection(){
        String SourceFileName = "CabService.accdb";
        String projectLocation = System.getProperty("user.dir");
        
        String url = "jdbc:ucanaccess://" + projectLocation + "\\Data\\" + SourceFileName;
        Connection cnn = null;
        
        try {
            cnn = DriverManager.getConnection(url);
        } catch (Exception e) {
            System.out.println(e+"  sdgs");
        }
        return cnn;
    }
    
    
    public static ResultSet getData(String sql){
        ResultSet rs = null;
        try {
            Connection cnn = setConnection();
            Statement st = cnn.createStatement();
            rs = st.executeQuery(sql);
            cnn.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return rs;
    }
    
    public static void insertData(String sql){
        try {
            Connection cnn = setConnection();
            Statement st = cnn.createStatement();
            PreparedStatement ps = cnn.prepareStatement(sql);
            st.executeUpdate(sql);
            cnn.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public static void updateData(String sql){
        try {
            Connection cnn = setConnection();
            PreparedStatement ps = cnn.prepareStatement(sql);
            ps.executeUpdate();
            cnn.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public static void deleteData(String sql){
        try {
            Connection cnn = setConnection();
            PreparedStatement ps = cnn.prepareStatement(sql);
            ps.execute();
            cnn.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}