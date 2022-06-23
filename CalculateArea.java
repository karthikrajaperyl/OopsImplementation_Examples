package oops_Implementation;
import java.util.*;
abstract class Box
{
	private int length;
	private int breadth;
	private int height;
	Box(int length,int breadth,int height)
	{
		this.length=length;
		this.breadth=breadth;
		this.height=height;
	}
	public int getLength()
	{
		return length;
	}
	public int getbreadth()
	{
		return breadth;
	}
	public int getHeight()
	{
		return height;
	}
	abstract int calculateArea();
}
class Square extends Box
{
	Square(int length,int breadth,int height)
	{
	  super(length,breadth,height);
	}
	public int calculateArea()
	{
		return this.getLength()*this.getLength();
	}
}
class Rectangle extends Box
{
	Rectangle(int length,int breadth,int height)
	{
		super(length,breadth,height);
	}
	public int calculateArea()
	{
		return this.getLength()*this.getbreadth();
	}
}
public class CalculateArea {
	
	public static void main(String[] args) {
		Scanner scannerObj=new Scanner(System.in);
		int length=scannerObj.nextInt();
		int breadth=scannerObj.nextInt();
		int height=scannerObj.nextInt();
		Box boxObj=null;
		if((length==breadth)&&(breadth==height))
		{
			boxObj=new Square(length,breadth,height);
		}
		else if(length != breadth)
		{
			boxObj=new Rectangle(length,breadth,height);
		}
		else
			System.out.println("Enter the valid input");
		System.out.println(boxObj.calculateArea());
	}

}
