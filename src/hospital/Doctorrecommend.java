package hospital;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

import com.opensymphony.xwork2.ActionContext;

public class Doctorrecommend {
	private Doctor dc = null;
	public ArrayList<String> DoctorList = new ArrayList<String>();
	public Doctor getDc()
	{
		return dc;
	}
	public ArrayList<String> getDoctorList() {
		return DoctorList;
	}

	public void setDoctorList(ArrayList<String> doctorList) {
		DoctorList = doctorList;
	}
	private String Disease;

	public String getDisease() {
		return Disease;
	}

	public void setDisease(String disease) {
		Disease = disease;
	}

	public String execute()
	{
	try{
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("�ɹ����ӵ����ݿ⣡");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital?useUnicode=true&characterEncoding=utf-8&useSSL=false","root","wan2013");
		System.out.println(Disease);
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("select * from Doctor where Area ='"+Disease+"'");
		dc = new Doctor();
        while(rs.next())
        {
        	DoctorList.add(rs.getString(2));
        }
        ActionContext.getContext().put("li",DoctorList);
       
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

