package hospital;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Register {
	private String Username;
	private String Password;
	private String Password1;
	private String Type;
	private String Age;
	private String Contect;
	private String Doctorid;
	private String Area;
	private String Position;
	private String Office;
	public String execute()
	{
	if(Password.equals(Password1)){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("�ɹ����ӵ����ݿ⣡");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital?useUnicode=true&characterEncoding=utf-8&useSSL=false","root","wan2013");
			System.out.println(doctorName);
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from Doctor where DoctorName= '"+doctorName+"'");
			dc = new Doctor();
		}catch(SQLException e)
		{
			System.out.println("Error:���ݿ����Ӵ���!");
			return "FAIL";
		}catch(ClassNotFoundException e)
		{
			System.out.println("Error:���ݿ��������ش���!");
			return "FAIL";
		}
		return "SUCCESS";
	}
 }
}
