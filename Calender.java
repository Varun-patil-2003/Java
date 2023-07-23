import java.util.*;
import java.lang.*;
class Calender
{
	public static void main(String[] args)
	{
		int date,month,year;
		int div;
        int day;

		Scanner S=new Scanner(System.in);
		System.out.println("\nENTER FOLLOWING FOR FIND DAY LIKEWISE :\nDD MM YY = ");
		date=S.nextInt();
		month=S.nextInt();
		year=S.nextInt();
		System.out.print("YOUR DATE IS "+date+"-"+month+"-"+year+".\n");

		
		
		
		System.out.println("");
		int yearN=year-1;
		int LY,NY,NLY,sumLYNY;
		LY=yearN/4;
		NY=yearN-LY;
		NLY=LY+LY;
		sumLYNY=NY+NLY;
		
		if (month == 01)
		{
			div=(date+sumLYNY);
			 day=div%7;
        if(day==0)
		{
			System.out.println("ON "+date+" "+month+" "+year+"\n"+"DAY IS SUNDAY\n");
		}
		if(day==1)
		{
			System.out.println("ON "+date+" "+month+" "+year+"\n"+"DAY IS MONDAY\n");
		}
		if(day==2)
		{
			System.out.println("ON "+date+" "+month+" "+year+"\n"+"DAY IS TUESDAY\n");
		}
		if(day==3)
		{
			System.out.println("ON "+date+" "+month+" "+year+"\n"+"DAY IS WEDNESDAY\n");
		}
		if(day==4)
		{
			System.out.println("ON "+date+" "+month+" "+year+"\n"+"DAY IS THURSDAY\n");
		}
		if(day==5)
		{
			System.out.println("ON "+date+" "+month+" "+year+"\n"+"DAY IS FRIDAY\n");
		}
		if(day==6)
		{
			System.out.println("ON "+date+" "+month+" "+year+"\n"+"DAY IS SATURDAY\n");
		}
			 
		}
		if (month == 02)
		{
			div=(3+date+sumLYNY);
			 day=div%7;
             if(day==0)
             {
                 System.out.println("ON "+date+" "+month+" "+year+"\n"+"DAY IS SUNDAY\n");
             }
             if(day==1)
             {
                 System.out.println("ON "+date+" "+month+" "+year+"\n"+"DAY IS MONDAY\n");
             }
             if(day==2)
             {
                 System.out.println("ON "+date+" "+month+" "+year+"\n"+"DAY IS TUESDAY\n");
             }
             if(day==3)
             {
                 System.out.println("ON "+date+" "+month+" "+year+"\n"+"DAY IS WEDNESDAY\n");
             }
             if(day==4)
             {
                 System.out.println("ON "+date+" "+month+" "+year+"\n"+"DAY IS THURSDAY\n");
             }
             if(day==5)
             {
                 System.out.println("ON "+date+" "+month+" "+year+"\n"+"DAY IS FRIDAY\n");
             }
             if(day==6)
             {
                 System.out.println("ON "+date+" "+month+" "+year+"\n"+"DAY IS SATURDAY\n");
             }
			 
		}
		if (month == 03)
		{
			if((year%4)==0)
			{
				div=(3+1+date+sumLYNY);
				  day=div%7;
                  if(day==0)
                  {
                      System.out.println("ON "+date+" "+month+" "+year+"\n"+"DAY IS SUNDAY\n");
                  }
                  if(day==1)
                  {
                      System.out.println("ON "+date+" "+month+" "+year+"\n"+"DAY IS MONDAY\n");
                  }
                  if(day==2)
                  {
                      System.out.println("ON "+date+" "+month+" "+year+"\n"+"DAY IS TUESDAY\n");
                  }
                  if(day==3)
                  {
                      System.out.println("ON "+date+" "+month+" "+year+"\n"+"DAY IS WEDNESDAY\n");
                  }
                  if(day==4)
                  {
                      System.out.println("ON "+date+" "+month+" "+year+"\n"+"DAY IS THURSDAY\n");
                  }
                  if(day==5)
                  {
                      System.out.println("ON "+date+" "+month+" "+year+"\n"+"DAY IS FRIDAY\n");
                  }
                  if(day==6)
                  {
                      System.out.println("ON "+date+" "+month+" "+year+"\n"+"DAY IS SATURDAY\n");
                  }
			}
			else
			{
				div=(3+0+date+sumLYNY);
				  day=div%7;
                  if(day==0)
                  {
                      System.out.println("ON "+date+" "+month+" "+year+"\n"+"DAY IS SUNDAY\n");
                  }
                  if(day==1)
                  {
                      System.out.println("ON "+date+" "+month+" "+year+"\n"+"DAY IS MONDAY\n");
                  }
                  if(day==2)
                  {
                      System.out.println("ON "+date+" "+month+" "+year+"\n"+"DAY IS TUESDAY\n");
                  }
                  if(day==3)
                  {
                      System.out.println("ON "+date+" "+month+" "+year+"\n"+"DAY IS WEDNESDAY\n");
                  }
                  if(day==4)
                  {
                      System.out.println("ON "+date+" "+month+" "+year+"\n"+"DAY IS THURSDAY\n");
                  }
                  if(day==5)
                  {
                      System.out.println("ON "+date+" "+month+" "+year+"\n"+"DAY IS FRIDAY\n");
                  }
                  if(day==6)
                  {
                      System.out.println("ON "+date+" "+month+" "+year+"\n"+"DAY IS SATURDAY\n");
                  }
			}
			 
		}
		if (month == 04)
		{
			if((year%4)==0)
			{
				div=(3+1+3+date+sumLYNY);
				  day=div%7;
                  if(day==0)
                  {
                      System.out.println("ON "+date+" "+month+" "+year+"\n"+"DAY IS SUNDAY\n");
                  }
                  if(day==1)
                  {
                      System.out.println("ON "+date+" "+month+" "+year+"\n"+"DAY IS MONDAY\n");
                  }
                  if(day==2)
                  {
                      System.out.println("ON "+date+" "+month+" "+year+"\n"+"DAY IS TUESDAY\n");
                  }
                  if(day==3)
                  {
                      System.out.println("ON "+date+" "+month+" "+year+"\n"+"DAY IS WEDNESDAY\n");
                  }
                  if(day==4)
                  {
                      System.out.println("ON "+date+" "+month+" "+year+"\n"+"DAY IS THURSDAY\n");
                  }
                  if(day==5)
                  {
                      System.out.println("ON "+date+" "+month+" "+year+"\n"+"DAY IS FRIDAY\n");
                  }
                  if(day==6)
                  {
                      System.out.println("ON "+date+" "+month+" "+year+"\n"+"DAY IS SATURDAY\n");
                  }
			}
			else
			{
				div=(3+0+3+date+sumLYNY);
				  day=div%7;
                  if(day==0)
                  {
                      System.out.println("ON "+date+" "+month+" "+year+"\n"+"DAY IS SUNDAY\n");
                  }
                  if(day==1)
                  {
                      System.out.println("ON "+date+" "+month+" "+year+"\n"+"DAY IS MONDAY\n");
                  }
                  if(day==2)
                  {
                      System.out.println("ON "+date+" "+month+" "+year+"\n"+"DAY IS TUESDAY\n");
                  }
                  if(day==3)
                  {
                      System.out.println("ON "+date+" "+month+" "+year+"\n"+"DAY IS WEDNESDAY\n");
                  }
                  if(day==4)
                  {
                      System.out.println("ON "+date+" "+month+" "+year+"\n"+"DAY IS THURSDAY\n");
                  }
                  if(day==5)
                  {
                      System.out.println("ON "+date+" "+month+" "+year+"\n"+"DAY IS FRIDAY\n");
                  }
                  if(day==6)
                  {
                      System.out.println("ON "+date+" "+month+" "+year+"\n"+"DAY IS SATURDAY\n");
                  }
			}
			 
		}
		if (month == 05)
		{
			if((year%4)==0)
			{
				div=(3+1+3+2+date+sumLYNY);
				  day=div%7;
                  if(day==0)
                  {
                      System.out.println("ON "+date+" "+month+" "+year+"\n"+"DAY IS SUNDAY\n");
                  }
                  if(day==1)
                  {
                      System.out.println("ON "+date+" "+month+" "+year+"\n"+"DAY IS MONDAY\n");
                  }
                  if(day==2)
                  {
                      System.out.println("ON "+date+" "+month+" "+year+"\n"+"DAY IS TUESDAY\n");
                  }
                  if(day==3)
                  {
                      System.out.println("ON "+date+" "+month+" "+year+"\n"+"DAY IS WEDNESDAY\n");
                  }
                  if(day==4)
                  {
                      System.out.println("ON "+date+" "+month+" "+year+"\n"+"DAY IS THURSDAY\n");
                  }
                  if(day==5)
                  {
                      System.out.println("ON "+date+" "+month+" "+year+"\n"+"DAY IS FRIDAY\n");
                  }
                  if(day==6)
                  {
                      System.out.println("ON "+date+" "+month+" "+year+"\n"+"DAY IS SATURDAY\n");
                  }
			}
			else
			{
				div=(3+0+3+2+date+sumLYNY);
				  day=div%7;
                  if(day==0)
                  {
                      System.out.println("ON "+date+" "+month+" "+year+"\n"+"DAY IS SUNDAY\n");
                  }
                  if(day==1)
                  {
                      System.out.println("ON "+date+" "+month+" "+year+"\n"+"DAY IS MONDAY\n");
                  }
                  if(day==2)
                  {
                      System.out.println("ON "+date+" "+month+" "+year+"\n"+"DAY IS TUESDAY\n");
                  }
                  if(day==3)
                  {
                      System.out.println("ON "+date+" "+month+" "+year+"\n"+"DAY IS WEDNESDAY\n");
                  }
                  if(day==4)
                  {
                      System.out.println("ON "+date+" "+month+" "+year+"\n"+"DAY IS THURSDAY\n");
                  }
                  if(day==5)
                  {
                      System.out.println("ON "+date+" "+month+" "+year+"\n"+"DAY IS FRIDAY\n");
                  }
                  if(day==6)
                  {
                      System.out.println("ON "+date+" "+month+" "+year+"\n"+"DAY IS SATURDAY\n");
                  }
			}
			 
		}
		if (month == 06)
		{
			if((year%4)==0)
			{
				div=(3+1+3+2+3+date+sumLYNY);
				  day=div%7;
                  if(day==0)
                  {
                      System.out.println("ON "+date+" "+month+" "+year+"\n"+"DAY IS SUNDAY\n");
                  }
                  if(day==1)
                  {
                      System.out.println("ON "+date+" "+month+" "+year+"\n"+"DAY IS MONDAY\n");
                  }
                  if(day==2)
                  {
                      System.out.println("ON "+date+" "+month+" "+year+"\n"+"DAY IS TUESDAY\n");
                  }
                  if(day==3)
                  {
                      System.out.println("ON "+date+" "+month+" "+year+"\n"+"DAY IS WEDNESDAY\n");
                  }
                  if(day==4)
                  {
                      System.out.println("ON "+date+" "+month+" "+year+"\n"+"DAY IS THURSDAY\n");
                  }
                  if(day==5)
                  {
                      System.out.println("ON "+date+" "+month+" "+year+"\n"+"DAY IS FRIDAY\n");
                  }
                  if(day==6)
                  {
                      System.out.println("ON "+date+" "+month+" "+year+"\n"+"DAY IS SATURDAY\n");
                  }
			}
			else
			{
				div=(3+0+3+2+3+date+sumLYNY);
				  day=div%7;
                  if(day==0)
                  {
                      System.out.println("ON "+date+" "+month+" "+year+"\n"+"DAY IS SUNDAY\n");
                  }
                  if(day==1)
                  {
                      System.out.println("ON "+date+" "+month+" "+year+"\n"+"DAY IS MONDAY\n");
                  }
                  if(day==2)
                  {
                      System.out.println("ON "+date+" "+month+" "+year+"\n"+"DAY IS TUESDAY\n");
                  }
                  if(day==3)
                  {
                      System.out.println("ON "+date+" "+month+" "+year+"\n"+"DAY IS WEDNESDAY\n");
                  }
                  if(day==4)
                  {
                      System.out.println("ON "+date+" "+month+" "+year+"\n"+"DAY IS THURSDAY\n");
                  }
                  if(day==5)
                  {
                      System.out.println("ON "+date+" "+month+" "+year+"\n"+"DAY IS FRIDAY\n");
                  }
                  if(day==6)
                  {
                      System.out.println("ON "+date+" "+month+" "+year+"\n"+"DAY IS SATURDAY\n");
                  }
			}
			 
		}
		if (month == 07)
		{
			if((year%4)==0)
			{
				div=(3+1+3+2+3+2+date+sumLYNY);
				  day=div%7;
                  if(day==0)
                  {
                      System.out.println("ON "+date+" "+month+" "+year+"\n"+"DAY IS SUNDAY\n");
                  }
                  if(day==1)
                  {
                      System.out.println("ON "+date+" "+month+" "+year+"\n"+"DAY IS MONDAY\n");
                  }
                  if(day==2)
                  {
                      System.out.println("ON "+date+" "+month+" "+year+"\n"+"DAY IS TUESDAY\n");
                  }
                  if(day==3)
                  {
                      System.out.println("ON "+date+" "+month+" "+year+"\n"+"DAY IS WEDNESDAY\n");
                  }
                  if(day==4)
                  {
                      System.out.println("ON "+date+" "+month+" "+year+"\n"+"DAY IS THURSDAY\n");
                  }
                  if(day==5)
                  {
                      System.out.println("ON "+date+" "+month+" "+year+"\n"+"DAY IS FRIDAY\n");
                  }
                  if(day==6)
                  {
                      System.out.println("ON "+date+" "+month+" "+year+"\n"+"DAY IS SATURDAY\n");
                  }
			}
			else
			{
				div=(3+0+3+2+3+2+date+sumLYNY);
				  day=div%7;
                  if(day==0)
                  {
                      System.out.println("ON "+date+" "+month+" "+year+"\n"+"DAY IS SUNDAY\n");
                  }
                  if(day==1)
                  {
                      System.out.println("ON "+date+" "+month+" "+year+"\n"+"DAY IS MONDAY\n");
                  }
                  if(day==2)
                  {
                      System.out.println("ON "+date+" "+month+" "+year+"\n"+"DAY IS TUESDAY\n");
                  }
                  if(day==3)
                  {
                      System.out.println("ON "+date+" "+month+" "+year+"\n"+"DAY IS WEDNESDAY\n");
                  }
                  if(day==4)
                  {
                      System.out.println("ON "+date+" "+month+" "+year+"\n"+"DAY IS THURSDAY\n");
                  }
                  if(day==5)
                  {
                      System.out.println("ON "+date+" "+month+" "+year+"\n"+"DAY IS FRIDAY\n");
                  }
                  if(day==6)
                  {
                      System.out.println("ON "+date+" "+month+" "+year+"\n"+"DAY IS SATURDAY\n");
                  }
			}
			 
		}
		if (month == 8)
		{
			if((year%4)==0)
			{
				div=(3+1+3+2+3+2+3+date+sumLYNY);
				  day=div%7;
                  if(day==0)
                  {
                      System.out.println("ON "+date+" "+month+" "+year+"\n"+"DAY IS SUNDAY\n");
                  }
                  if(day==1)
                  {
                      System.out.println("ON "+date+" "+month+" "+year+"\n"+"DAY IS MONDAY\n");
                  }
                  if(day==2)
                  {
                      System.out.println("ON "+date+" "+month+" "+year+"\n"+"DAY IS TUESDAY\n");
                  }
                  if(day==3)
                  {
                      System.out.println("ON "+date+" "+month+" "+year+"\n"+"DAY IS WEDNESDAY\n");
                  }
                  if(day==4)
                  {
                      System.out.println("ON "+date+" "+month+" "+year+"\n"+"DAY IS THURSDAY\n");
                  }
                  if(day==5)
                  {
                      System.out.println("ON "+date+" "+month+" "+year+"\n"+"DAY IS FRIDAY\n");
                  }
                  if(day==6)
                  {
                      System.out.println("ON "+date+" "+month+" "+year+"\n"+"DAY IS SATURDAY\n");
                  }
			}
			else
			{
				div=(3+0+3+2+3+2+3+date+sumLYNY);
				  day=div%7;
                  if(day==0)
                  {
                      System.out.println("ON "+date+" "+month+" "+year+"\n"+"DAY IS SUNDAY\n");
                  }
                  if(day==1)
                  {
                      System.out.println("ON "+date+" "+month+" "+year+"\n"+"DAY IS MONDAY\n");
                  }
                  if(day==2)
                  {
                      System.out.println("ON "+date+" "+month+" "+year+"\n"+"DAY IS TUESDAY\n");
                  }
                  if(day==3)
                  {
                      System.out.println("ON "+date+" "+month+" "+year+"\n"+"DAY IS WEDNESDAY\n");
                  }
                  if(day==4)
                  {
                      System.out.println("ON "+date+" "+month+" "+year+"\n"+"DAY IS THURSDAY\n");
                  }
                  if(day==5)
                  {
                      System.out.println("ON "+date+" "+month+" "+year+"\n"+"DAY IS FRIDAY\n");
                  }
                  if(day==6)
                  {
                      System.out.println("ON "+date+" "+month+" "+year+"\n"+"DAY IS SATURDAY\n");
                  }
			}
			 
		}
		if (month == 9)
		{
			if((year%4)==0)
			{
				div=(3+1+3+2+3+2+3+3+date+sumLYNY);
				 day=div%7;
                 if(day==0)
                 {
                     System.out.println("ON "+date+" "+month+" "+year+"\n"+"DAY IS SUNDAY\n");
                 }
                 if(day==1)
                 {
                     System.out.println("ON "+date+" "+month+" "+year+"\n"+"DAY IS MONDAY\n");
                 }
                 if(day==2)
                 {
                     System.out.println("ON "+date+" "+month+" "+year+"\n"+"DAY IS TUESDAY\n");
                 }
                 if(day==3)
                 {
                     System.out.println("ON "+date+" "+month+" "+year+"\n"+"DAY IS WEDNESDAY\n");
                 }
                 if(day==4)
                 {
                     System.out.println("ON "+date+" "+month+" "+year+"\n"+"DAY IS THURSDAY\n");
                 }
                 if(day==5)
                 {
                     System.out.println("ON "+date+" "+month+" "+year+"\n"+"DAY IS FRIDAY\n");
                 }
                 if(day==6)
                 {
                     System.out.println("ON "+date+" "+month+" "+year+"\n"+"DAY IS SATURDAY\n");
                 }
			}
			else
			{
				div=(3+0+3+2+3+2+3+3+date+sumLYNY);
				  day=div%7;
                  if(day==0)
                  {
                      System.out.println("ON "+date+" "+month+" "+year+"\n"+"DAY IS SUNDAY\n");
                  }
                  if(day==1)
                  {
                      System.out.println("ON "+date+" "+month+" "+year+"\n"+"DAY IS MONDAY\n");
                  }
                  if(day==2)
                  {
                      System.out.println("ON "+date+" "+month+" "+year+"\n"+"DAY IS TUESDAY\n");
                  }
                  if(day==3)
                  {
                      System.out.println("ON "+date+" "+month+" "+year+"\n"+"DAY IS WEDNESDAY\n");
                  }
                  if(day==4)
                  {
                      System.out.println("ON "+date+" "+month+" "+year+"\n"+"DAY IS THURSDAY\n");
                  }
                  if(day==5)
                  {
                      System.out.println("ON "+date+" "+month+" "+year+"\n"+"DAY IS FRIDAY\n");
                  }
                  if(day==6)
                  {
                      System.out.println("ON "+date+" "+month+" "+year+"\n"+"DAY IS SATURDAY\n");
                  }
			}
			 
		}
		if (month == 10)
		{
			if((year%4)==0)
			{
				div=(3+1+3+2+3+2+3+3+2+date+sumLYNY);
				  day=div%7;
			}
			else
			{
				div=(3+0+3+2+3+2+3+3+2+date+sumLYNY);
				  day=div%7;
                  if(day==0)
                  {
                      System.out.println("ON "+date+" "+month+" "+year+"\n"+"DAY IS SUNDAY\n");
                  }
                  if(day==1)
                  {
                      System.out.println("ON "+date+" "+month+" "+year+"\n"+"DAY IS MONDAY\n");
                  }
                  if(day==2)
                  {
                      System.out.println("ON "+date+" "+month+" "+year+"\n"+"DAY IS TUESDAY\n");
                  }
                  if(day==3)
                  {
                      System.out.println("ON "+date+" "+month+" "+year+"\n"+"DAY IS WEDNESDAY\n");
                  }
                  if(day==4)
                  {
                      System.out.println("ON "+date+" "+month+" "+year+"\n"+"DAY IS THURSDAY\n");
                  }
                  if(day==5)
                  {
                      System.out.println("ON "+date+" "+month+" "+year+"\n"+"DAY IS FRIDAY\n");
                  }
                  if(day==6)
                  {
                      System.out.println("ON "+date+" "+month+" "+year+"\n"+"DAY IS SATURDAY\n");
                  }
			}
			 
		}
		if (month == 11)
		{
			if((year%4)==0)
			{
				div=(3+1+3+2+3+2+3+3+2+3+date+sumLYNY);
				  day=div%7;
                  if(day==0)
                  {
                      System.out.println("ON "+date+" "+month+" "+year+"\n"+"DAY IS SUNDAY\n");
                  }
                  if(day==1)
                  {
                      System.out.println("ON "+date+" "+month+" "+year+"\n"+"DAY IS MONDAY\n");
                  }
                  if(day==2)
                  {
                      System.out.println("ON "+date+" "+month+" "+year+"\n"+"DAY IS TUESDAY\n");
                  }
                  if(day==3)
                  {
                      System.out.println("ON "+date+" "+month+" "+year+"\n"+"DAY IS WEDNESDAY\n");
                  }
                  if(day==4)
                  {
                      System.out.println("ON "+date+" "+month+" "+year+"\n"+"DAY IS THURSDAY\n");
                  }
                  if(day==5)
                  {
                      System.out.println("ON "+date+" "+month+" "+year+"\n"+"DAY IS FRIDAY\n");
                  }
                  if(day==6)
                  {
                      System.out.println("ON "+date+" "+month+" "+year+"\n"+"DAY IS SATURDAY\n");
                  }
			}
			else
			{
				div=(3+0+3+2+3+2+3+3+2+3+date+sumLYNY);
				  day=div%7;
                  if(day==0)
                  {
                      System.out.println("ON "+date+" "+month+" "+year+"\n"+"DAY IS SUNDAY\n");
                  }
                  if(day==1)
                  {
                      System.out.println("ON "+date+" "+month+" "+year+"\n"+"DAY IS MONDAY\n");
                  }
                  if(day==2)
                  {
                      System.out.println("ON "+date+" "+month+" "+year+"\n"+"DAY IS TUESDAY\n");
                  }
                  if(day==3)
                  {
                      System.out.println("ON "+date+" "+month+" "+year+"\n"+"DAY IS WEDNESDAY\n");
                  }
                  if(day==4)
                  {
                      System.out.println("ON "+date+" "+month+" "+year+"\n"+"DAY IS THURSDAY\n");
                  }
                  if(day==5)
                  {
                      System.out.println("ON "+date+" "+month+" "+year+"\n"+"DAY IS FRIDAY\n");
                  }
                  if(day==6)
                  {
                      System.out.println("ON "+date+" "+month+" "+year+"\n"+"DAY IS SATURDAY\n");
                  }
			}
			 
		}
		if (month == 12)
		{
			if((year%4)==0)
			{
				div=(3+1+3+2+3+2+3+3+2+3+2+date+sumLYNY);
				  day=div%7;
                  if(day==0)
                  {
                      System.out.println("ON "+date+" "+month+" "+year+"\n"+"DAY IS SUNDAY\n");
                  }
                  if(day==1)
                  {
                      System.out.println("ON "+date+" "+month+" "+year+"\n"+"DAY IS MONDAY\n");
                  }
                  if(day==2)
                  {
                      System.out.println("ON "+date+" "+month+" "+year+"\n"+"DAY IS TUESDAY\n");
                  }
                  if(day==3)
                  {
                      System.out.println("ON "+date+" "+month+" "+year+"\n"+"DAY IS WEDNESDAY\n");
                  }
                  if(day==4)
                  {
                      System.out.println("ON "+date+" "+month+" "+year+"\n"+"DAY IS THURSDAY\n");
                  }
                  if(day==5)
                  {
                      System.out.println("ON "+date+" "+month+" "+year+"\n"+"DAY IS FRIDAY\n");
                  }
                  if(day==6)
                  {
                      System.out.println("ON "+date+" "+month+" "+year+"\n"+"DAY IS SATURDAY\n");
                  }
			}
			else
			{
				div=(3+0+3+2+3+2+3+3+2+3+2+date+sumLYNY);
				  day=div%7;
                  if(day==0)
                  {
                      System.out.println("ON "+date+" "+month+" "+year+"\n"+"DAY IS SUNDAY\n");
                  }
                  if(day==1)
                  {
                      System.out.println("ON "+date+" "+month+" "+year+"\n"+"DAY IS MONDAY\n");
                  }
                  if(day==2)
                  {
                      System.out.println("ON "+date+" "+month+" "+year+"\n"+"DAY IS TUESDAY\n");
                  }
                  if(day==3)
                  {
                      System.out.println("ON "+date+" "+month+" "+year+"\n"+"DAY IS WEDNESDAY\n");
                  }
                  if(day==4)
                  {
                      System.out.println("ON "+date+" "+month+" "+year+"\n"+"DAY IS THURSDAY\n");
                  }
                  if(day==5)
                  {
                      System.out.println("ON "+date+" "+month+" "+year+"\n"+"DAY IS FRIDAY\n");
                  }
                  if(day==6)
                  {
                      System.out.println("ON "+date+" "+month+" "+year+"\n"+"DAY IS SATURDAY\n");
                  }
			}
			 
		}


		

		
		
		
		
	}
}