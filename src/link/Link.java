package link;
import java.sql.*;
public class Link {
	Connection con =null;
	Statement state=null;
	ResultSet res=null;
	public Link()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");//�������� driver
			con=DriverManager.getConnection("jdbc:mysql://w.rdc.sae.sina.com.cn:3307/app_fsyflh","041ml54mxx","zjm5yz0yxkzyilm14z0ykhm1244lxkh1h3wwizzy");//�������ݿ�   java��sql
			state=con.createStatement();
		}
		
		catch(Exception e)
		{
			con=null;
		}
	}
	public ResultSet executeQuery(String sql)
	{
		try
		{
			
			res=state.executeQuery(sql);
		}
		
		catch(Exception e)
		{
			res=null;
		}
		return res;
	}
	public int executeUpdate(String sql)
	{
		try
		{
			state.executeUpdate(sql);
			return 0;
		}
		catch(Exception e)
		{
			return -1;
		}
	}
}
