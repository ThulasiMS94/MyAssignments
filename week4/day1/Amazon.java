package week4.day1;

public class Amazon extends CanaraBank {

	@Override
	public void cashOnDelivery() {
		System.out.println("Cash on delivery has been added");

	}

	@Override
	public void upiPayments() {
		System.out.println("Upi payment has been added");

	}

	@Override
	public void cardPayments() {
		System.out.println("Card payment has been added");

	}

	@Override
	public void internetBanking() {
		System.out.println("Internet banking has been added");
	}

	public static void main(String[] args) {
		Amazon paymentOptions = new Amazon();
		paymentOptions.cashOnDelivery();
		paymentOptions.upiPayments();
		paymentOptions.cardPayments();
		paymentOptions.internetBanking();
		paymentOptions.recordPaymentDetails();

	}

}
