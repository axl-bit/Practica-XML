package pe.edu.idat.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	public static Connection getConnection()
            throws ClassNotFoundException, SQLException
    {
        Class.forName("com.mysql.jdbc.Driver"); //com.mysql.cj.jdbc.Driver
        
        //Obtener una conexión a la BD
        Connection cnx = DriverManager.getConnection("jdbc:mysql://localhost:3306/idat_ec2?useTimeZone=true&serverTimezone=UTC&useSSL=false&allowPublicKeyRetrieval=True", "root","2392001");
        return cnx;
    }
	
}
