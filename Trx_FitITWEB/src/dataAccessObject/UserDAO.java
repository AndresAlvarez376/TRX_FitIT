package dataAccessObject;

import modelo.GetConnection;

public class UserDAO {
    public boolean validateUser(String uName, String pass){
      String sql="select * from user where uname =? and pass =?";
      
      GetConnection gc= new GetConnection();
      
      try{
      gc.ps = GetConnection.getMySQLConnection().preparedStatement(sql);
      gc.ps.setString(1, uName);
      gc.ps.setString(2, pass);
      
      gc.ps = gc.ps.executeQuery();
      
      return gc.ps.next();
      }catch (SQLException e){
        e.printStackTrace();
      }
      
      return false;
    }
}
