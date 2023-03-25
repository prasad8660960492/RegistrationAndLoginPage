package com.techpalle.Dao;

import java.sql.*;

import com.techpalle.model1.Student;

public class DataAcces {
	
	static Connection con=null;
	static Statement s=null;
	static PreparedStatement ps=null;
	static ResultSet rs=null;
	
	public static String url="jdbc:mysql://localhost:3306/palle";
	public static String username="root";
	public static String dbpassword="admin";

	public static void insertCustomer(Student s)
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(url,username,dbpassword);
			ps=con.prepareStatement("insert into Student1 (name,email,password,state) values(?,?,?,?)");
			
			ps.setString(1, s.getName());
			ps.setString(2, s.getEmail());
			ps.setString(3, s.getPassword());
			ps.setString(4, s.getState());
			
			ps.executeUpdate();
			
			
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		finally
		{
			try
			{
			   if(ps!=null)
			{
		        ps.close();
			}
			   if(con!=null)
			   {
				   con.close();
			   }
			}
			   catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	public static boolean validCustomer(String email,String password)
	{
		boolean b=false;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(url,username,dbpassword);
			ps=con.prepareStatement("select email,password from Student1 where email=? and password=?");
			ps.setString(1, email);
			ps.setString(2, password);
			rs=ps.executeQuery();
			b=rs.next();
			

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			try
			{
				if(rs!=null)
				{
					rs.close();
				}
				if(ps!=null)
				{
					ps.close();
				}
				if(con!=null)
				{
					con.close();
				}
			}
			
			catch(SQLException e1)
			{
				e1.printStackTrace();
			}
		}
	return b;
		
	}
	}

