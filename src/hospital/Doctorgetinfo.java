package hospital;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

public class Doctorgetinfo {
	private Doctor dc = null;
	public Doctor getDc()
	{
		return dc;
	}
	private String doctorName;

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public String execute()
	{
	try{
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("�ɹ����ӵ����ݿ⣡");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital?useUnicode=true&characterEncoding=utf-8&useSSL=false","root","wan2013");
		System.out.println(doctorName);
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("select * from Doctor where DoctorName= '"+doctorName+"'");
		dc = new Doctor();
        while(rs.next())
        {
        	System.out.println(rs.getString(1));
        	System.out.println(rs.getString(2));
        	System.out.println(rs.getString(3));
        	System.out.println(rs.getString(4));
        	System.out.println(rs.getString(5));
        	System.out.println(rs.getString(6));
        	System.out.println(rs.getString(7));
        	dc.setDoctorID(rs.getString(1));
	        dc.setDoctorName(rs.getString(2));
	        dc.setDoctorAge(rs.getString(3));
	        dc.setArea(rs.getString(4));
	        dc.setPosition(rs.getString(5));
	        dc.setOffice(rs.getString(6));
	        dc.setContact(rs.getString(7));
        }
       
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

	
		
	
