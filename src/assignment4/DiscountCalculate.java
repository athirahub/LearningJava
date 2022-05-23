package assignment4;

public class DiscountCalculate {

	public static void main(String[] args) {
		double initialDiscount = 50;
		String promoCode1 = "Promo5";
		String promoCode2 = "Promo10";
		String promoCode3 = "Promo20";
		String promoCodeProduct = "Promo5;";
		if (promoCodeProduct.equals(promoCode1)) {
			double finalDiscount = initialDiscount + 5;
			System.out.println("Final Discounted Value:" + finalDiscount);
		} else if (promoCodeProduct.equals(promoCode2)) {
			double finalDiscount = initialDiscount + 10;
			System.out.println("Final Discounted Value:" + finalDiscount);
		} else if (promoCodeProduct.equals(promoCode3)) {
			double finalDiscount = initialDiscount + 15;
			System.out.println("Final Discounted Value:"+ finalDiscount);
		} else {
			double finalDiscount = initialDiscount;
			System.out.println("Final Discounted Value:"+finalDiscount);
		}
	}

}
