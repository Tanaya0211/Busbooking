import java.util.*;
import java.util.Scanner.*;

class details{

String name;
String email;
int number;
}




public class transport
{static	details[][] a=new details[8][21];
static	details[][] b=new details[8][21];
static	details[][] c=new details[8][21];
static Scanner sc =new Scanner(System.in);

static String p;
static int choice;
public static void main(String args[])
                             {
                             
                              
                             while(choice!=4)
					{
 					System.out.println("Welcome to transport service: ");
      				        System.out.println("1.Book a ticket");
                                        System.out.println("2.View price details");
                                        System.out.println("3.Check your booking");
                                        System.out.println("4.Exit");
                                        choice = sc.nextInt();
        
                                        switch(choice)
						{
						case 1:View();break;
						case 2:Price();break;
						case 3:Search();break;
						}
					}




                             }






public static void View()
{
 Scanner st=new Scanner(System.in);
 Scanner sp=new Scanner(System.in);
int flag=0;
System.out.println("Select your day");
System.out.println("1.monday");
System.out.println("2.tuesday");
System.out.println("3.wednesday");
System.out.println("4.thursday");
System.out.println("5.friday");
System.out.println("6.saturday");
System.out.println("7.sunday");
int day = sc.nextInt();

System.out.println("Select your destination");
System.out.println("1.Surat");
System.out.println("2.Banglore");
System.out.println("3.Hyderabad");
int route =sc.nextInt();

if(route==1){
	for(int seat=1;seat<21;seat++)
	{if(a[day][seat]==null)
   		{System.out.println("Seat available");
		System.out.println("Price is 1000");
		System.out.println("Enter name\n");
		String name =st.nextLine();
		System.out.println("Enter number");    
		int num =sc.nextInt();
		System.out.println("Enter email");
		String id =sp.nextLine();
   		flag=1;
		a[day][seat].name=name;
		a[day][seat].number=num;
		a[day][seat].email=id;
		System.out.println("Booking done Succesfully");
		break;
		}
	}}


if(route==2){
	for(int seat=1;seat<21;seat++)
	{if(a[day][seat]==null)
   		{System.out.println("Seat available");
		System.out.println("Price is 2000");
		System.out.println("Enter name");
		String name =st.nextLine();
		System.out.println("Enter number");    
		int num =sc.nextInt();
		System.out.println("Enter email");
		String id =sp.nextLine();
   		flag=1;
 System.out.println("flag");
		b[day][seat].name=name;
 System.out.println("name");
		b[day][seat].number=num;
 System.out.println("num");
		b[day][seat].email=id;
		System.out.println("Booking done Succesfully");
		break;
		}
	}}


if(route==3){
	for(int seat=1;seat<21;seat++)
	{if(a[day][seat]==null)
   		{System.out.println("Seat available");
               
		System.out.println("Price is 2500");
		System.out.println("Enter name");
		String name =st.nextLine();
		System.out.println("Enter number");    
		int num =sc.nextInt();
		System.out.println("Enter email");
		String id =sp.nextLine();
   		flag=1;
		c[day][seat].name=name;
		c[day][seat].number=num;
		c[day][seat].email=id;
		System.out.println("Booking done Succesfully");
		break;
		}
	}}

if(flag==0){System.out.println("Seats full");}

}



public static void Price()
{
System.out.println("Price of tickets:");
System.out.println("Mumbai-Surat Rs1000");
System.out.println("Mumbai-Banglore Rs2000");
System.out.println("Mumbai-Hyderabad Rs2500");
}


public static void Search()
{

System.out.println("Enter your phone number:");
int phone=sc.nextInt();
System.out.println("Select your destination");
System.out.println("1.Surat");
System.out.println("2.Banglore");
System.out.println("3.Hyderabad");
int route =sc.nextInt();
if (route==1){
	for(int days=1;days<8;days++)
		{for(int seats=1;seats<21;seats++)
    			{
    			if(a[days][seats].number==phone){System.out.println("Your seat number is" +seats);
    						if(days==1){p="monday";}    
						if(days==2){p="tuesday";}  	  
						if(days==3){p="wednessday";}    
						if(days==4){p="thursday";} 	   
						if(days==5){p="friday";}    
						if(days==6){p="saturday";}    
						if(days==7){p="sunday";}    
						System.out.println("day is "+p);
   			  			}
			}


		}

       	 }
}











  	

}

