package oops_Implementation;

import java.util.*;

class TeacherDetails extends Person {
	private String subjectName;
	private int experienceYear;
	public void setSubject(String subName) {
		this.subjectName = subName;
	}

	public void Teach() {
		System.out.println(getName() + " teaches " + this.subjectName);
	}

	public void Teach(String[] str) {
		System.out.println(getName() + "-teaches-" + Arrays.toString(str));
	}

	public void setExperienceYear(int year)
	{
		this.experienceYear=year;
	}
	public int getExperienceYear()
	{
		return this.experienceYear;
	}
	@Override
	public void showWork() {
		System.out.println("Has the work to teach");
	}
	public String toString()
	{
		return this.getName()+this.getExperienceYear()+this.gender;
	}
}
public class Teacher 
{
public static void main(String[] args)
{
	//Scanner scannerObj=new Scanner(System.in);
	//String name=scannerObj.nextLine();
	TeacherDetails teacherObj=new TeacherDetails();
	teacherObj.setName("xyz");
	teacherObj.setGender(Gender.Male);
	teacherObj.setBloodGroup("B+ve");
	teacherObj.setExperienceYear(2);
	System.out.println(teacherObj.toString());
	
}
}
