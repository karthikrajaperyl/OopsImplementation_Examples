package oops_Implementation;

enum Gender {
	Male, Female;
}

public class Person {
	private String name;
	public Gender gender;
	private String bloodGroup;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void showWork() {
		System.out.println("Nothing to do");
	}
}

class Employee extends Person {
	private int rollNo;
	private String deptName;

	Employee(int rollNo) {
		this.rollNo = rollNo;
	}

	Employee(int rollNo, String deptName) {
		this.rollNo = rollNo;
		this.deptName = deptName;
	}

	public int getRollNo() {
		return this.rollNo;
	}

	public String getDepartment() {
		return this.deptName;
	}
}

class TechnologyStudent extends Person {
	private int index;
	private String[] skills;

	public void setSkils(String skill) {
		this.skills[++index] = skill;
	}

	public String[] getSkills() {
		return skills;
	}
}
