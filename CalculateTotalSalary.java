package oops_Implementation;

enum WorkStatus {
	Excellent, Good, Normal
}

class MTSSalary {
	private int amount;

	MTSSalary(int amount) {
		this.amount = amount;
	}

	public int getAmount() {
		return amount;
	}

	public void updateAmount(int amount) {
		this.amount += amount;
	}
}

class PerformanceSalary extends MTSSalary {
	private int amount;

	PerformanceSalary(int amount) {
		super(amount);
	}

	public void workStatus(WorkStatus status) {
		if (WorkStatus.Excellent == status) {
			amount += 2000;
		}
		if (WorkStatus.Good == status) {
			amount += 1000;
		}
		if (WorkStatus.Normal == status) {
			amount += 500;
		}
		updateAmount(amount);
	}
}

public class CalculateTotalSalary extends PerformanceSalary {
	private int totalAmount;

	CalculateTotalSalary(int amount) {
		super(amount);
		updateAmount(amount + getBonus());
	}

	private int getBonus() {
		return 5000;
	}

	public static void main(String[] args) {
		CalculateTotalSalary totalSalary = new CalculateTotalSalary(0);
		totalSalary.workStatus(WorkStatus.Excellent);
		totalSalary.totalAmount += totalSalary.getAmount();
		System.out.println("Total Amount-" + totalSalary.totalAmount);
	}
}
