package application.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexao {
	private static final String URL="jdbc:mysql://localhost:3306/DB";
	private static final String USER="root";
	private static final String PASS="Casa34124826.";
	
	public static Connection getConnetion() throws SQLException{
		return DriverManager.getConnection(URL,USER,PASS);
	}
}
