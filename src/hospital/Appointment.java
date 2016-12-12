package hospital;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;

public class Appointment implements Action {
	Connection con=null;
	Statement stmt=null;
	ResultSet res=null;
	private String Department;
	private String Month;
	private String Date;
	ArrayList<Doctor1> applist = new ArrayList<Doctor1>();


	public ArrayList<Doctor1> getApplist() {
		return applist;
	}

	public void setApplist(ArrayList<Doctor1> applist) {
		this.applist = applist;
	}

	public String getDepartment() {
		return Department;
	}

	public void setDepartment(String department) {
		Department = department;
	}

	public String getMonth() {
		return Month;
	}

	public void setMonth(String month) {
		Month = month;
	}

	public String getDate() {
		return Date;
	}

	public void setDate(String date) {
		Date = date;
	}

	@Override
	public String execute() throws Exception {
		try{
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("�ɹ����ӵ����ݿ⣡");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/selfillness?useUnicode=true&characterEncoding=utf-8&useSSL=false","root","wan2013");
			stmt = con.createStatement();	       
		}catch(SQLException e)
		{
			System.out.println("Error:���ݿ����Ӵ���!");
			return "FAIL";
		}catch(ClassNotFoundException e)
		{
			System.out.println("Error:���ݿ��������ش���!");
			return "FAIL";
		}
		System.out.println(getDepartment());
		String sql = "select * from DoctorList where date = '"+getMonth()+getDate()+"' and Department ='"+getDepartment()+"'";
		res = stmt.executeQuery(sql);
		if(res.next()){
			System.out.println("1");
			String sql1 = "select * from DoctorList where date = '"+getMonth()+getDate()+"' and Department ='"+getDepartment()+"'";
			res = stmt.executeQuery(sql1);
			while(res.next()){
				System.out.println("3");
				Doctor1 D = new Doctor1();
				D.name = res.getString(2);
				System.out.println(D.name);
				System.out.println(res.getString(9));
				if(((String)res.getString(9)).equals("0")){
					D.a = "ԤԼ";
					System.out.println(D.a);
				}
				else{
					D.a ="ԤԼ����/����ԤԼ";
				}
				if(((String)res.getString(10)).equals("0")){
					D.b = "ԤԼ";
				}
				else{
					D.b ="ԤԼ����/����ԤԼ";
				}
				if(((String)res.getString(11)).equals("0")){
					D.c = "ԤԼ";
				}
				else{
					D.c ="ԤԼ����/����ԤԼ";
				}
				if(((String)res.getString(12)).equals("0")){
					D.d = "ԤԼ";
				}
				else{
					D.d ="ԤԼ����/����ԤԼ";
				}
				if(((String)res.getString(13)).equals("0")){
					D.e = "ԤԼ";
				}
				else{
					D.e ="ԤԼ����/����ԤԼ";
				}
				if(((String)res.getString(14)).equals("0")){
					D.f = "ԤԼ";
				}
				else{
					D.f ="ԤԼ����/����ԤԼ";
				}
				D.Date=getMonth()+getDate();
				D.Department=getDepartment();
				applist.add(D);
			}
			//ActionContext.getContext().put("li",AppList);
			setApplist(applist);
			System.out.println(applist.get(0).Date);
			return "App";
		}
		else{
			return "NoDoc";
		}
	}

}
