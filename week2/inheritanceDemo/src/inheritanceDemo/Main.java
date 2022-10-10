package inheritanceDemo.src.inheritanceDemo;

public class Main {

	public static void main(String[] args) {

		CreditUI creditUI = new CreditUI();
		creditUI.calculateCredit(new AgriculturalCreditManager());
								// Polymorphism
		creditUI.calculateCredit(new SoldierCreditManager());

		// AgriculturalCreditManager agriculturalCreditManager = new
		// AgriculturalCreditManager();
		// agriculturalCreditManager.calculate();

	}

}
