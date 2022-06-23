package oops_Implementation;

import java.util.Date;

class MacVersion {
	private String name;
	private Date date;
	MacVersion() {
		setBrandName();
	}

	public void setBrandName() {
		this.name = "M1 chip";
	}

	public void showBrandName() {
		System.out.println(name);
	}

	public void showFeatures() {
		System.out.println(
				"It is designed to accelerate machine learning tasks across the Mac for things like video analysis, voice recognition, image processing, and more.");
	}

	public static void main(String[] args) {
		MonteryPro monteryObj=new MonteryPro();
		monteryObj.setRelease("MonteryProX", new Date());
		System.out.println(monteryObj.toString());
	}
}

class Catalina extends MacVersion {
	private String name;

	Catalina() {
		this.setReleaseName();
	}

	public void setReleaseName() {
		this.name = this.getClass().getName();
	}

	public void showReleaseName() {
		System.out.println(name);
	}

	public void showMemory() {
		System.out.println("64GB");
	}

	public void showStorage() {
		System.out.println("512GB, 1TB, 2TB, 4TB");
	}
}

class Montery extends MacVersion {
	private String name;

	Montery() {
		this.setReleaseName();
	}

	public void setReleaseName() {
		this.name = this.getClass().getName();
	}

	public void showReleaseName() {
		System.out.println(name);
	}

	public void showReleaseDate() {
		System.out.println("October 25, 2021");
	}

	public void showVersion() {
		System.out.println("MacOs 12");
	}

	public void showMemory() {
		System.out.println("64GB");
	}

	public void showStorage() {
		System.out.println("512GB, 1TB, 2TB, 4TB");
	}

	public void showFeatures() {
		System.out.println("It improve the stability, performance, or compatibility of your Mac ");
	}
}

class MonteryPro extends Montery {
	private String name;
	private Date date;

	@Override
	public void showFeatures() {
		System.out.println("It show a Universal Control, AirPlay to Mac, Shortcuts application");
	}

	public void setRelease(String name, Date date) {
		this.name = name;
		this.date = date;
	}
	@Override
	public String toString() {
		return "Name-" + this.name + "Date-" + this.date;
	}
}
