package default_package;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jsonToJava {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn=null;
		conn=DriverManager.getConnection("jbdc:mysql://localhost:3306/Business","root","root");
		
		//object of statement class will help us to execute queries
		Statement st =conn.createStatement();
		ResultSet rs =st.executeQuery("select * from CustomerInfo where purchasedDate=CURDATE() and Location ='Asia'");
		while(rs.next()) {
			System.out.println(rs.getString(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getInt(3));
			System.out.println(rs.getString(4));
		}
		
		conn.close();
		
	}

}
