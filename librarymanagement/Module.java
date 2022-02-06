package librarymanagement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Module {
	public static void main(String[] args) {
		char r;
		int a;
		Library aa=new Library();
		do {
			System.out.println("*****************Welcome to Library Management System****************");
			System.out.println("Press 1 to add book");
			System.out.println("press 2 to view the available books");
			System.out.println("Press 3 to issue a book");
			System.out.println("Press 4 to return a book");
			System.out.println("Press 5 to print complete issue details");
			System.out.println("Press 6 to exit");
			System.out.println("Enter any Number");
			Scanner obj1=new Scanner(System.in);
			a=obj1.nextInt();
			switch(a)
			{
			case 1:
				aa.add();
				break;
			case 2:
				aa.books();
				break;
			case 3:
				aa.iss();
				break;
			case 4:
				aa.ret();
				break;
			case 5:
				aa.detail();
				break;
			case 6:
				System.out.println("Thanks For Visiting");
				System.exit(0);
				break;
				
			default:
				System.out.println("Invalid number");

			}
			System.out.println("\nYou Want To Select Next Option Y/N");
			r=obj1.next().charAt(0);
			
		}while(r=='y'||r=='Y');
			
	}

}	

class Library
{
	static String str,b,date;
	static int a,c;
	void add()
	{
		System.out.println("Enter book Name : ");
		Scanner a1 = new Scanner(System.in);
		str=a1.nextLine();
		System.out.println("Enter the Price: ");
		float price=a1.nextInt();
		System.out.println("Enter the book_no :");
		int bookno=a1.nextInt();
		System.out.println("book name : "+str+"\nprice : "+price+"\nbook no :"+bookno);
	}
	 void books()
	{
		String books[]={"DBMS","Maths","DSP","Electronics","Computer Networks"};
		System.out.println("\nThe books available : ");
		for(int i=0;i<books.length;i++)
		{
			System.out.println(books[i]);
		
		}
	}
	void iss()
	{
		String books[]={"DBMS","Maths","DSP","Electronics","Computer Networks"};
		ArrayList<String> list=new ArrayList<String>(Arrays.asList(books));
		Scanner i1=new Scanner(System.in);
		char s;
		do
		{
			Scanner i2=new Scanner(System.in);
			System.out.println("Book Name :");
			str=i2.nextLine();
			if(list.contains(str))
			{
				System.out.println(str+ " is available");
			}
			else
			{
				System.out.println(str+ " is not available");
			}
			System.out.println("\nif you want to select the book name again (Y/N)");
			s=i2.next().charAt(0);
		}while(s=='y'||s=='Y');
		System.out.println("Book_id : ");
		a=i1.nextInt();
		i1.nextLine();
		System.out.println("issue date :");
		b=i1.nextLine();
		System.out.println("total number of book Issued :");
		c=i1.nextInt();
		i1.nextLine();
	}
	int getid()
	{
		return a;
	}
	void ret()
	{
		Scanner r1 = new Scanner(System.in);
		System.out.println("Enter Student_name :");
		String name=r1.nextLine();
		System.out.println("Enter book_id :");
		int bookid=r1.nextInt();
		System.out.println("Enter return date :");
		String date=r1.next();
		if(a==bookid)
		{
			System.out.println("Total Details");
			System.out.println("Book Name:: "+str);
			System.out.println("Book id:: "+a);
			System.out.println("Book return date:: "+date);
		}
		else
		{
			System.out.println("wrong id,pls enter correct id");
		}
	}
	void  detail()
	{

		System.out.println("Book Name:: "+str);
		System.out.println("Book id:: "+a);
		System.out.println("issue date:: "+b);
		System.out.println("total number of book Issued:: "+c);
	}
	
}




	
