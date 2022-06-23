package oops_Implementation;

interface Action {
	void setMovement();

	String getMovement();
}

interface Backbone {
	boolean hasBackbone();

	void setPostion(String position);

	void hasVitalParts();
}

abstract public class Animalia implements Action, Backbone {
	private String name;
	
	Animalia(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public boolean hasBackbone() {
		return true;
	}

	abstract public void setMovement();

	abstract public String getMovement();

}

class Vertebrate extends Animalia {
	private String behaviour;
	private boolean vitalOrgans;
	private String position;

	Vertebrate(String name) {
		super(name);
	}

	public void setMovement() {
		this.behaviour = "It will walk";
	}

	public String getMovement() {
		return behaviour;
	}

	public void hasVitalParts() {
		this.vitalOrgans = true;
	}
	public boolean hasVitalOrgans()
	{
		return vitalOrgans;
	}

	public void setPostion(String name) {
		this.position = name;
	}

	public String getPosition() {
		return position;
	}

}

class Aves extends Animalia {
	private String behaviour;
	private boolean vitalOrgans;
	private String position;

	Aves(String name) {
		super(name);
	}

	public void setMovement() {
		this.behaviour = "It will Fly";
	}

	public String getMovement() {
		return behaviour;
	}

	public void hasVitalParts() {
		this.vitalOrgans = true;
	}

	public void setPostion(String name) {
		this.position = name;
	}

	public String getPosition() {
		return position;
	}
}