package sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DataBaseCnx {

    private Connection  cnx;
    private ResultSet queryRessult;

    //Open Cnx with Database
    private  void open()
    {
        String dbname="gcmv2",user="root",password="root",url="jdbc:mysql://localhost:8889/"+dbname;

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            cnx = DriverManager.getConnection(url,user,password);
        }catch (Exception e)
        {
            e.printStackTrace();
            e.getCause();
        }
    }
    //Insert Into DataBase
    public int InsertRow(String Requite)
    {
        int res=0;
        open();

        try{
            Statement statement =cnx.createStatement();
            res=statement.executeUpdate(Requite);
        }catch (Exception e)
        {
            e.printStackTrace();
            e.getCause();
        }
        return res;
    }
    //Get from DataBase
    public ResultSet GetRow(String Requite)
    {
        open();
        try{
            Statement statement =cnx.createStatement();
            queryRessult = statement.executeQuery(Requite);
        }catch (Exception e)
        {
            e.printStackTrace();
            e.getCause();
        }

        return queryRessult ;
    }
}
