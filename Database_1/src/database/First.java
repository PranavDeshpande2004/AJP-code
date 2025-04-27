package database;
import java.sql.*;
import com.mysql.cj.protocol.Resultset;

public class First {
	public static void main(String args[] )throws Exception {
		String url="jdbc:mysql://localhost:3306/data";
		String name="root";
		String password="pranav1910";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection(url,name,password);
		
		System.out.println("database connected");
		
		Statement st=con.createStatement();
		
		String query="select *from studentinfo";
		
		ResultSet rs= st.executeQuery(query);
		
		System.out.println("Rollno"+"\t"+"StdName"+"\t"+"Batch"+"\t"+"SubName"+"\t"+"Marks");
		while(rs.next()) {
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t"+rs.getInt(5));
		}
		
		con.close();
		st.close();
	}
	

}
