package com.satya.airlines;

import java.sql.*;
import java.util.*;



public class PracticeMain 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		
		Connection connection = JdbcConnection.connect();
		PreparedStatement ps;
		System.out.println("press 1 for insert  trveller details  ");
		System.out.println("press 2 for update traveller details  ");
		System.out.println("press 3 for delete traveller record ");
		System.out.println("press 4 for retraive traveller records..");
		Scanner sc = new Scanner(System.in);
		int option = sc.nextInt();
		Random random = new Random();
		int pid = random.nextInt(999);
		
		while (option>4);
		{
			
			switch (option) 
			{
			case 1: 
			{
				System.out.println("you are choosing insert records........");
				System.out.println("insert all records.pid,pname,pmobno,p_age,p_from,p_to,p_ticket_id..");
					String query = "insert into passenger values (?,?,?,?,?,?,?)";
					ps = connection.prepareStatement(query);
					System.out.print("enter passenger name here  :");
					System.err.println(" * name should not have any spaces ");
					ps.setString(2,sc.next());
					System.out.println("enter passenger mobile no : ");
					ps.setString(3, sc.next());
					System.out.println("enter passenger age ");
					ps.setInt(4, sc.nextInt());
					System.out.println("enter passenger from location");
					ps.setString(5, sc.next());
					System.out.println("enter passenger to location ");
					ps.setString(6, sc.next());
					ps.setInt(1, pid);
					ps.setString(7, "HAPPY-"+random.nextInt(99999));
					int record = ps.executeUpdate();
					if(record>0)
						{
						System.out.println("record updated...............");
						pid++;
						}
					else
					{
						System.err.println("give valid credentials....");
					}
					System.out.println("thank you.....................");
			}break;
			
			case 2:
			{
				System.out.println("press 1 for update details of destination  by using phno  ");
				System.out.println("press 2 for update details of destination by using passenger name and phno ");
				int updatekey = sc.nextInt();
				
				if (updatekey==1)
				{
					ps= connection.prepareStatement("update passenger set p_to = ? where p_mobno = ?");
					System.out.println("enter your phone number for update record.. ");
					String phno = sc.next();
					ps.setString(2, phno);
					System.out.println("enter your new destination.......");
					ps.setString(1, sc.next());
					int record = ps.executeUpdate();
					if(record>0)
					{
						System.out.println("destination updated here your new details....");
						ps = connection.prepareStatement("select * from passenger where P_mobno=?");
						ps.setString(1, phno);
						ResultSet rs = ps.executeQuery();
						while(rs.next())
						{
							System.out.println(rs.getInt(1)+ " "+rs.getString(2)+" "+rs.getString(3)+""
									+ " "+rs.getInt(4)+" "+rs.getString(5)+" "+rs.getString(6)+" "+rs.getString(7));
						}
					}
					else
					{
						System.err.println("enter correct mobile number.....");
					}
				}
				else if(updatekey==2)
				{
					ps =connection.prepareStatement("update passenger set p_to = ? where p_name = ? and p_mobno = ?");
					System.out.print("enter passenger name : ");
					ps.setString(2, sc.next());
					System.out.println("enter passenger phone number : ");
					String phno = sc.next();
					ps.setString(3, phno);
					System.out.println("enter your new destination : ");
					ps.setString(1, sc.next());
					int record = ps.executeUpdate();
					if (record>0)
					{
						System.out.println("destination updated here your new details....");
						ps = connection.prepareStatement("select * from passenger where P_mobno=?");
						ps.setString(1, phno);
						ResultSet rs = ps.executeQuery();
						while(rs.next())
						{
							System.out.println(rs.getInt(1)+ " "+rs.getString(2)+" "+rs.getString(3)+""
									+ " "+rs.getInt(4)+" "+rs.getString(5)+" "+rs.getString(6)+" "+rs.getString(7));
						}	
					}
					else
					{
						System.err.println("enter correct mobile number or passenger name ....");
					}	
				}
				System.out.println("thank you ...........");
			}break;
			case 3 :
			{
				System.out.println("press 1 for delete passenger record by using ticket id ");
				System.out.println("press 2 for delete passenger record by using passenger destination ");
				int token = sc.nextInt();
				
				if (token==1)
				{
					ps = connection.prepareStatement("delete from passenger where p_ticketid=?");
					System.out.println("enter your ticket id :");
					String tic = sc.next();
					ps.setString(1, tic);
					System.err.println("if you really want delete record type yes here otherwise no :");
					String confermation=sc.next();
					if(confermation.equalsIgnoreCase("yes"))
					{
						int record = ps.executeUpdate();
						if (record>0)
						{
							System.out.println(tic+" passenger was deleted by admin.....");
						}
						else
						{
							System.err.println("enter correct ticket id ....");
						}
					}
					else
					{
						System.out.println("your record is not delete don't panic.....");
					}	
				}
				else if (token==2)
				{
					ps=connection.prepareStatement("delete from passenger where p_to=?");
					System.out.println("enter destination what you want delete  :");
					String dest = sc.next();
					ps.setString(1, dest);
					System.err.println("if you really want delete record type yes here otherwise no :");
					String confermation=sc.next();
					if(confermation.equalsIgnoreCase("yes"))
					{
						int record = ps.executeUpdate();
						if (record>0)
						{
							System.out.println(dest+" passenger was deleted by admin.....");
						}
						else
						{
							System.err.println("enter correct ticket id ....");
						}
					}
					else
					{
						System.out.println("your record is not delete don't panic.....");
					}		
				}
				System.out.println("Thank you.................");
			}break;	
			case 4:
			{
				System.out.println("if you are admin and check all details your table press 1");
				System.out.println("if you are passenger check your details plz enter 2 ");
				int admorpass=sc.nextInt();
				if (admorpass==1)
				{
					System.out.println("plz enter your username : ");
					String uname=sc.next();
					if (uname.equalsIgnoreCase("satya"))
					{
						System.out.println("welcome mr."+uname);
						System.out.println("enter "+uname+"'s password");
						String pass = sc.next();
						if(pass.equalsIgnoreCase("12345"))
						{
							System.out.println("access granted");
							
							ps = connection.prepareStatement("select * from passenger");
							ResultSet rs= ps.executeQuery();
							while (rs.next())
							{
								System.out.println("passenger id            : "+rs.getInt(1));
								System.out.println("passneger name          : "+rs.getString(2));
								System.out.println("passenger phone number  : "+rs.getString(3));
								System.out.println("passneger age           : "+rs.getInt(4));
								System.out.println("passenger travel from   : "+rs.getString(5));
								System.out.println("passenger travel to     : "+rs.getString(6));
								System.out.println("passenger ticket id     : "+rs.getString(7));
								System.out.println("==============================================");
							}
						}
						else
						{
							System.err.println("incorrect password....");
						}
					}
					else
					{
						System.err.println("user not found >>> enter valid username......");
					}
				}
				else if(admorpass==2)
				{
					ps = connection.prepareStatement("select * from passenger where p_name=? and p_mobno=?");
					System.out.println("enter your name ");
					ps.setString(1, sc.next());
					System.out.println("enter your mobile number : ");
					ps.setString(2, sc.next());
					
					ResultSet rs =ps.executeQuery();
					while(rs.next())
					{
						System.out.println("passenger id            : "+rs.getInt(1));
						System.out.println("passneger name          : "+rs.getString(2));
						System.out.println("passenger phone number  : "+rs.getString(3));
						System.out.println("passneger age           : "+rs.getInt(4));
						System.out.println("passenger travel from   : "+rs.getString(5));
						System.out.println("passenger travel to     : "+rs.getString(6));
						System.out.println("passenger ticket id     : "+rs.getString(7));
						System.out.println("==============================================");
						
					}
				}
				
			}
		  } 
	  }		
   }
}