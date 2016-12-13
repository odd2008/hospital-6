package hospital;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.opensymphony.xwork2.ActionContext;



public class Register {

	private String patientID;//�����Զ�����(�����ظ�)���ɶ�����
	private String patientName;//����
	private int patientAge;//����
	private String patientSex;//�Ա�
	private String patientContact;//��ϵ��ʽ(�ֻ�������)
	private String detailillness;//��ϸ����
	private String bloodtype;//Ѫ��
	private String utype;
	private String Area;
	private String Position;
	private String Office;
	private String pkey;
	private String pkey1;
	
	public String getUtype() {
		return utype;
	}
	public void setUtype(String utype) {
		this.utype = utype;
	}
	public String getArea() {
		return Area;
	}
	public void setArea(String area) {
		Area = area;
	}
	public String getPosition() {
		return Position;
	}
	public void setPosition(String position) {
		Position = position;
	}
	public String getOffice() {
		return Office;
	}
	public void setOffice(String office) {
		Office = office;
	}
	public void setPatientID(String patientID)
	{
		this.patientID = patientID;
	}
	public String getPatientID()
	{
		return patientID;
	}
	public void setPatientName(String patientName)
	{
		this.patientName = patientName;
	}
	public String getPatientName()
	{
		return patientName;
	}
	public void setPatientAge(int patientAge)
	{
		this.patientAge = patientAge;
	}
	public int getPatientAge()
	{
		return patientAge;
	}
	public void setPatientSex(String patientSex)
	{
		this.patientSex = patientSex;
	}
	public String getPatientSex()
	{
		return patientSex;
	}
	public void setPatientContact(String patientContact)
	{
		this.patientContact = patientContact;
	}
	public String getPatientContact()
	{
		return patientContact;
	}
	public void setDetailillness(String detailillness)
	{
		this.detailillness = detailillness;
	}
	public String getDetailillness()
	{
		return detailillness;
	}
	public void setBloodtype(String bloodtype)
	{
		this.bloodtype = bloodtype;
	}
	public String getBloodtype()
	{
		return bloodtype;
	}
	public void setPkey(String pkey)
	{
		this.pkey = pkey;
	}
	public String getPkey()
	{
		return pkey;
	}
	public void setPkey1(String pkey1)
	{
		this.pkey1 = pkey1;
	}
	public String getPkey1()
	{
		return pkey1;
	}
	
	public String execute()
	{
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/selfillness","root","wan2013");
	        Statement stmt = con.createStatement();
	        ResultSet rs = stmt.executeQuery("select * from Patient where PatientID=\""+patientID+"\"");
	        System.out.println(rs);
	         if(!rs.next()){
	        	System.out.println("�ɵ����ݿ⣡");
	        	//rs.previous();
				if(pkey.equals(pkey1)&&utype.equals("patient")){
					System.out.println("�ɵ��ݿ⣡");
					String sql1 = "insert into patient (patientID,patientName,patientAge,patientSex,patientContact,detailillness,bloodtype,pkey,pkey1,utype) values(\""+patientID+"\",\""+patientName+"\","+patientAge+",\""+patientSex+"\",\""+patientContact+"\",\""+detailillness+"\",\""+bloodtype+"\",\""+pkey+"\",\""+pkey1+"\",\""+utype+"\")";	
					System.out.println("�ɵ����ݿ⣡");
					System.out.println(sql1);
					ActionContext.getContext().getSession().put("user",patientName);//ע��ɹ������û����ݷ��뵽Session�� 
					stmt = con.createStatement();
				    int result = stmt.executeUpdate(sql1);
				    System.out.println(result);
				    stmt.close();
				    return "SUCCESS";
				}
				else if(pkey.equals(pkey1)&&utype.equals("doctor")){
					System.out.println("�ɵ��ݿ⣡");
					String sql1 = "insert into patient (patientID,patientName,patientAge,patientSex,patientContact,detailillness,bloodtype,pkey,pkey1,utype,Department,Position,Office) values(\""+patientID+"\",\""+patientName+"\","+patientAge+",\""+patientSex+"\",\""+patientContact+"\",\""+detailillness+"\",\""+bloodtype+"\",\""+pkey+"\",\""+pkey1+"\",\""+utype+"\",\""+Area+"\",\""+Position+"\",\""+Office+"\")";	
					System.out.println("�ɵ����ݿ⣡");
					System.out.println(sql1);
					ActionContext.getContext().getSession().put("user",patientName);
					ActionContext.getContext().getSession().put("Department",Area);//ע��ɹ������û����ݷ��뵽Session�� 
					stmt = con.createStatement();
				    int result = stmt.executeUpdate(sql1);
				    System.out.println(result);
				    stmt.close();
				    return "SUCCESS1";
				}
				else{
					return "Password1";
				}
			}
			else{
				return "UserExist";
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


