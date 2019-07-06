package emailapp;

import java.util.Scanner;

public class Email {

	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private int mailboxCapacity=500;
	private String email;
	private int defaultPasswordLength=10;
	private String alternateEmail;
	private String companySuffix="abccompany.com";
	
	
	//Constructor to receive the first name and last name
	public Email(String firstName, String lastName)
	{
		this.firstName=firstName;
		this.lastName=lastName;
		System.out.println("EMAIL CREATED: "+this.firstName+" "+this.lastName);
		
		//Call a method to ask for department - return the department
		this.department=setDepartment();
		System.out.println("Department: "+this.department);
		
		
		//Call a method to return a random password
		this.password=setPassword(defaultPasswordLength);
		System.out.println("Your password is "+this.password);
		
		//Combine elements to generate email
		email=firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+"department"+"."+companySuffix;
	
		
		
		
		
	}
	
	//Ask for the department
	private String setDepartment()
	{
		System.out.println("Department Codes\n1 for Sales \n2 Development \n3 for Accounting \n0 for none");
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the department code: ");
		int depChoice=in.nextInt();
		if (depChoice ==1)
		{return "sales";}
		else if (depChoice ==2)
		{return "dev";}
		else if (depChoice ==3)
		{return "acct";}
		else
		{return "none";}
	}
	
	//Generate a random password
	private String setPassword(int length)
	{
		String passwordSet="ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
		char[] passwrd=new char[length];
		for (int i=0;i<length;i++)
		{
			int rand= (int)(Math.random()*passwordSet.length());
			passwrd[i]=passwordSet.charAt(rand);
		}
		return new String (passwrd);
	}
	//Set the mailbox capacity
	public void setMailboxCapacity(int capacity)
	{
		this.mailboxCapacity=capacity;
	}
	
	//Set the alternate email
	public void setAlternateEmail(String altEmail)
	{
		this.alternateEmail=altEmail;
	}
	
	//Change the password
	public void changePassword(String password)
	{
		this.password=password;
		
	}
	
	public int getMailboxCapacity() {return mailboxCapacity;}
	public String getAlternateEmail() {return alternateEmail;}
	public String getPassword() {return password;}
	
	public String showInfo()
	{
		return "DISPLAY NAME: "+ firstName +
				" "+ lastName+
				"\nCompany Email: "+email+
				"\nMailbox Capacity: "+ mailboxCapacity;
	}
	
}
