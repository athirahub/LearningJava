package assignmentathira;

public class FinalDiscount {

	public static void main(String[] args) {
		double initialDiscount = 50;
		String promoCode1 = "Promo5";
		String promoCode2 = "Promo10";
		String promoCode3 = "Promo20";
		String noPromo = "nil";
		String promoCodeApplied = "Promo20";
		if (promoCodeApplied.equals(promoCode1)) {
			double finalDiscount = initialDiscount + 5;
			System.out.println("Final Discounted Value:" + finalDiscount + "%");
		} else if (promoCodeApplied.equals(promoCode2)) {
			double finalDiscount = initialDiscount + 10;
			System.out.println("Final Discounted Value:" + finalDiscount + "%");
		} else if (promoCodeApplied.equals(promoCode3)) {
			double finalDiscount = initialDiscount + 20;
			System.out.println("Final Discounted Value:" + finalDiscount + "%");
		} else {
			double finalDiscount = initialDiscount;
			System.out.println("Final Discounted Value:" + finalDiscount + "%");
		}
	}
}
