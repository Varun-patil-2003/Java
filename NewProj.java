import java.util.*;
import java.lang.*;
class NewProj
{
	public static void main(String[] args)
	{
		int date,month,year,div;
		

		Scanner S=new Scanner(System.in);
		System.out.println("\nENTER FOLLOWING FOR FIND DAY LIKEWISE :\nDD MM YY = ");
		date=S.nextInt();
		month=S.nextInt();
		year=S.nextInt();
		System.out.print("YOUR DATE IS "+date+"-"+month+"-"+year+".\n");

		
		
		
		System.out.println("\n\n");
		int yearN=year-1;
		int LY,NY,NLY,sumLYNY;
		LY=yearN/4;
		NY=yearN-LY;
		NLY=LY+LY;
		sumLYNY=NY+NLY;
		System.out.println(sumLYNY);
		
		if (month == 01)
		{
			div=date+sumLYNY;
			System.out.println(div);
			 
		}
		if (month == 02)
		{
			div=3+date+sumLYNY;
			System.out.println(div);
			 
		}
		if (month == 03)
		{
			if((year%4)==0)
			{
				div=3+1+date+sumLYNY;
				System.out.println(div);
			}
			else
			{
				div=3+0+date+sumLYNY;
				System.out.println(div);
			}
			 
		}
		if (month == 04)
		{
			if((year%4)==0)
			{
				div=3+1+3+date+sumLYNY;
				System.out.println(div);
			}
			else
			{
				div=3+0+3+date+sumLYNY;
				System.out.println(div);
			}
			 
		}
		if (month == 05)
		{
			if((year%4)==0)
			{
				div=3+1+3+2+date+sumLYNY;
				System.out.println(div);
			}
			else
			{
				div=3+0+3+2+date+sumLYNY;
				System.out.println(div);
			}
			 
		}
		if (month == 06)
		{
			if((year%4)==0)
			{
				div=3+1+3+2+3+date+sumLYNY;
				System.out.println(div);
			}
			else
			{
				div=3+0+3+2+3+date+sumLYNY;
				System.out.println(div);
			}
			 
		}
		if (month == 07)
		{
			if((year%4)==0)
			{
				div=3+1+3+2+3+2+date+sumLYNY;
				System.out.println(div);
			}
			else
			{
				div=3+0+3+2+3+2+date+sumLYNY;
				System.out.println(div);
			}
			 
		}
		if (month == 8)
		{
			if((year%4)==0)
			{
				div=3+1+3+2+3+2+3+date+sumLYNY;
				System.out.println(div);
			}
			else
			{
				div=3+0+3+2+3+2+3+date+sumLYNY;
				System.out.println(div);
			}
			 
		}
		if (month == 9)
		{
			if((year%4)==0)
			{
				div=3+1+3+2+3+2+3+3+date+sumLYNY;
				System.out.println(div);
			}
			else
			{
				div=3+0+3+2+3+2+3+3+date+sumLYNY;
				System.out.println(div);
			}
			 
		}
		if (month == 10)
		{
			if((year%4)==0)
			{
				div=3+1+3+2+3+2+3+3+2+date+sumLYNY;
				System.out.println(div);
			}
			else
			{
				div=3+0+3+2+3+2+3+3+2+date+sumLYNY;
				System.out.println(div);
			}
			 
		}
		if (month == 11)
		{
			if((year%4)==0)
			{
				div=3+1+3+2+3+2+3+3+2+3+date+sumLYNY;
				System.out.println(div);
			}
			else
			{
				div=3+0+3+2+3+2+3+3+2+3+date+sumLYNY;
				System.out.println(div);
			}
			 
		}
		if (month == 12)
		{
			if((year%4)==0)
			{
				div=3+1+3+2+3+2+3+3+2+3+2+date+sumLYNY;
				System.out.println(div);
			}
			else
			{
				div=3+0+3+2+3+2+3+3+2+3+2+date+sumLYNY;
				System.out.println(div);
			}
			 
		}
		else
		{
			System.out.println("CHECK THE MONTH IS BETWEEN 01-12 IF NOT THEN PROVIDE RIGHT MONTH ...");
		}

		


		int day;

		day=div%7;

		if(day==0)
		{
			System.out.println("ON "+date+" "+month+" "+year+"\n"+"DAY IS SUNDAY");
		}
		if(day==1)
		{
			System.out.println("ON "+date+" "+month+" "+year+"\n"+"DAY IS MONDAY");
		}
		if(day==2)
		{
			System.out.println("ON "+date+" "+month+" "+year+"\n"+"DAY IS TUESDAY");
		}
		if(day==3)
		{
			System.out.println("ON "+date+" "+month+" "+year+"\n"+"DAY IS WEDNESDAY");
		}
		if(day==4)
		{
			System.out.println("ON "+date+" "+month+" "+year+"\n"+"DAY IS THURSDAY");
		}
		if(day==5)
		{
			System.out.println("ON "+date+" "+month+" "+year+"\n"+"DAY IS FRIDAY");
		}
		if(day==6)
		{
			System.out.println("ON "+date+" "+month+" "+year+"\n"+"DAY IS SATURDAY");
		}

		

		
		
		
		
	}
}