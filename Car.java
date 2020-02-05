class Vehicle
{
	private static void move1()
	{	System.out.println("Move vehicle slowly");}
	
	public static final void move2()
	{	System.out.println("Move vehicle fast");}
	
}
public class Car extends Vehicle
{
	public static void move1()
	{	System.out.println("Move car slowly");}
	
//	public static final void move2()
//	{	System.out.println("Move car fast");}
	
	public static void main(String[] args) {
		Car obj = new Car();
		obj.move1();
		obj.move2();
	}
}