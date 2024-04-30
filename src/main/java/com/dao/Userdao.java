package com.dao;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.user.User;

public class Userdao {
	public static Connection getConnection() {
		Connection con=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","tinku");
			}catch(Exception e) {
				System.out.println(e);
			}
		return con;
	}
		public static int save(User u) {
			int status=0;
			try {
				Connection con=getConnection();
				PreparedStatement ps=con.prepareStatement("insert into register(name,password,email,sex,country) values(?,?,?,?,?)");
				ps.setString(1, u.getname());
				ps.setString(2, u.getPassword());
				ps.setString(3, u.getemail());
				ps.setString(4, u.getsex());
				ps.setString(5, u.getcountry());
				status=ps.executeUpdate();
				
				}catch(Exception e) {
					System.out.println(e);
					
				}
			return status;
			
		}
		public static int update(User u) {
			int status =0;
			try {
				Connection con=getConnection();
				PreparedStatement ps=con.prepareStatement("update register set name=?,password=?,email=?,sex=?,country=? where id=?");
				ps.setString(1, u.getname());
				ps.setString(2, u.getPassword());
				ps.setString(3, u.getemail());
				ps.setString(4, u.getsex());
				ps.setString(5, u.getcountry());
				ps.setInt(6, u.getId());
				status=ps.executeUpdate();
				
				}catch(Exception e) {
					System.out.println(e);
					
				}
			return status;
			
			}
			public static int delete(User u) {
				int status =0;
				try {
					Connection con=getConnection();
					PreparedStatement ps=con.prepareStatement("delete from register where id=?");
				    ps.setInt(1, u.getId());
					status=ps.executeUpdate();
					
					}catch(Exception e) {
						System.out.println(e);
						
					}
				return status;
				
			}
			public static List<User> getAllRecords(){
				List<User> list=new ArrayList<User>();
				try {
					Connection con=getConnection();
					PreparedStatement ps=con.prepareStatement("select * from register");
					ResultSet rs=ps.executeQuery();
					while(rs.next()) {
						User u=new User();
					u.setId(rs.getInt("id"));
				    u.setname(rs.getString("name"));
					u.setpassword(rs.getString("password"));
					u.setemail(rs.getString("email"));
					u.setsex(rs.getString("sex"));
					u.setcountry(rs.getString("country"));
					list.add(u);
					}
					}catch(Exception e) {
						System.out.println(e);
						}
					return list;
				}
			public static User getRecordById(int id) {
				User u=null;
				try {
					Connection con=getConnection();
					PreparedStatement ps=con.prepareStatement("select*from register where id=?");
					ps.setInt(1,id);
					ResultSet rs=ps.executeQuery();
					while(rs.next()) {
						u=new User();
						u.setId(rs.getInt("id"));
						u.setname(rs.getString("name"));
						u.setpassword(rs.getString("password"));
						u.setemail(rs.getString("email"));
						u.setsex(rs.getString("sex"));
						u.setcountry(rs.getString("country"));
						}
						}catch(Exception e) {
							System.out.println(e);
							}
						return u;
						
					}
					
					}
				
			
