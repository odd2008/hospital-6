package hospital;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.http.HttpSession;
import javax.servlet.ServletException; 
import javax.servlet.http.HttpServlet; 
import javax.servlet.http.HttpServletRequest; 
import javax.servlet.http.HttpServletResponse;






import com.opensymphony.xwork2.ActionContext;

import link.link;
public class Login{
	private Patient pt =null;
	public Patient getPt()
	{
		return pt;
	}
	private String patientID;
	private String pkey;
	public void setPatientID(String p_id)
	{
		this.patientID = p_id;
	}
	public String getPatientID()
	{
		return patientID;
	}
	public void setPkey(String p_key)
	{
		this.pkey = p_key;
	}
	public String getPkey()
	{
		return pkey;
	}
	public String execute(){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/selfillness","root","123456");
	        Statement stmt = con.createStatement();
	        ResultSet rs = stmt.executeQuery("select * from Patient where PatientID=\""+patientID+"\"");
	        pt = new Patient();
			if(rs.next()){
				System.out.println(rs.getString(1));
	        	System.out.println(rs.getString(2));
	        	System.out.println(rs.getInt(3));
	        	System.out.println(rs.getString(4));
	        	System.out.println(rs.getString(5));
	        	System.out.println(rs.getString(6));
	        	System.out.println(rs.getString(7));
	        	System.out.println(rs.getString(8));
	        	System.out.println(rs.getString(9));
				if(rs.getString(8).equals(pkey)){
					ActionContext.getContext().getSession().put("user",rs.getString(2));//��¼�ɹ������û����ݷ��뵽Session�� 
					return "SUCCESS";
				}
				else{
					return "PsError";
				}
				
			}
			else{
				return "NoUser";
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
	}
}
