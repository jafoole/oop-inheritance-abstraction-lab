package AbstractionLab;


public class Driver {

	public static void main(String[] args) {
		//Create households and add to list or array
		
		//iterate through list or array and perform required actions

		Household cityHouse = new Household();
		cityHouse.insidePet = "cat";

		Household urbanHouse = new Household();
		urbanHouse.insidePet = "Maltese";

		Household[] houses = new Household[]{townHouse, apartment};

		for (Household households : houses){
			int income = households.gainIncome(85000);
			households.payTaxes(income);
			households.isFed();
			households.isGroomed();
			households.playedWith();
		}
	}
}

public abstract class Household {
	Pet insidePet;

	public abstract int gainIncome();
	public void payTaxes(int income){
		double paidTaxes = income * .2;
	}
}

public class SubHousehold extends Household implements gotPet{
	@Override
	public int gainIncome(int income) {
		return income;
	}

	@Override
	public void isFed() {
		System.out.println("The Animal is fed!");
	}

	@Override
	public void isGroomed() {
		System.out.println("The Animal is groomed!");
	}

	@Override
	public void playedWith() {
		System.out.println("Your Animal is played with.");
	}
}



public interface gotPet {
	public void isGroomed();
	public void playedWith();
	public void isFed();

}

public class Pet{
	String petBreed;
}
