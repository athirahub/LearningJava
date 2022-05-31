package assignmentusingwhile;

import java.util.Scanner;

public class TemperatureConversionLoop {

	public static void main(String[] args) {
		String temperatureType = "Celsius";
		double temperature = 32;
		System.out.println("Enter temperature");
		Scanner sc = new Scanner(System.in);
		temperature = sc.nextDouble();
		if (temperature == 0) {
			System.out.println("Celsius" + "              " + "Fahrenheit");
			for (double i = -20.00; i <= 25.00; i += 5.00) {
				double temperatureInFahrenheit = (i * 9 / 5) + 32;
				System.out.println(" " + i + "                  " + temperatureInFahrenheit);
			}
		} else {
			double temperatureInFahrenheit = (temperature * 9 / 5) + 32;
			System.out.println(temperature + " degree Celsius = " + temperatureInFahrenheit + " degree Farenheit");

		}

	}

}
