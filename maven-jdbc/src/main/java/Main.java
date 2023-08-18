import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;



public class Main {

	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/osttra_jdbc", "root", "root");

		PreparedStatement statement = conn.prepareStatement("select * from user");
		
		ResultSet rs = statement.executeQuery();
		
		while( rs.next()) {
			
			System.out.println(rs.getString(1)+", "+rs.getString(2)+", "+rs.getString(3));
			
		}
		
		
	}
}


//public class Main {
//
//	public static void main(String[] args) throws Exception {
//
//		Class.forName("com.mysql.cj.jdbc.Driver");
//
//		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/osttra_jdbc", "root", "root");
//
//		PreparedStatement statement = conn.prepareStatement("delete from user where username = ?");
//		
//		statement.setString(1, "bcde");
//		
//		statement.executeUpdate();
//	}
//}


//public class Main {
//
//	public static void main(String[] args) throws Exception {
//
//		Class.forName("com.mysql.cj.jdbc.Driver");
//
//		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/osttra_jdbc", "root", "root");
//
//		String uname = "asdf";
//		String password = "25677";
//		String name = "Avi";
//		
//		PreparedStatement statement = conn.prepareStatement("insert into user values(?, ?, ?)");
//		
//		statement.setString(1, uname);
//		statement.setString(2, password);
//		statement.setString(3, name);
//		
//		statement.executeUpdate();
//	}
//}

//public class Main {
//
//	public static void main(String[] args) throws Exception {
//
//		Class.forName("com.mysql.cj.jdbc.Driver");
//
//		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/osttra_jdbc", "root", "root");
//
//		String uname = "qwer";
//		String password = "2341";
//		String name = "Deepti";
//		
//		Statement statement = conn.createStatement();
//
//		statement.executeUpdate("insert into user values("+"'"+uname+"','"+password+"','"+name+"')");
//
//	}
//}

//public class Main {
//
//	public static void main(String[] args) throws Exception {
//
//		Class.forName("com.mysql.cj.jdbc.Driver");
//
//		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/osttra_jdbc", "root", "root");
//
//		Statement statement = conn.createStatement();
//
//		statement.executeUpdate("insert into user values('bcde', '23456', 'Khushh')");
//
//	}
//}
