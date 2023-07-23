class MultipleFun
{
	void show()
	{
		System.out.println("Welcome");
		System.out.println("To JAVA");
	}
	void display()
	{
		System.out.println("Thank You !");
	}
}
class Second
{
	public static void main(String[] args)
	{
		First F=new First();
		F.show();
		F.display();
	}
}