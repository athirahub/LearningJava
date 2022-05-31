package assignmentusingwhile;

import java.util.Scanner;

public class TemperatureConversion {

	public static void main(String[] args) {
		String temperatureType = "";
		String temperatureType1 = "Celsius";
		String temperatureType2 = "Fahrenheit";
		double temperature = 0;
		System.out.println("Enter the unit of temperature you want to convert from");
		System.out.println("Enter temperature");
		Scanner sc = new Scanner(System.in);
		temperatureType = sc.next();
		temperature = sc.nextDouble();
		if (temperatureType.equals(temperatureType1)) {
			double temperatureInFahrenheit = (temperature * 9 / 5) + 32;
			System.out.println(temperature + " degree Celsius = " + temperatureInFahrenheit + " degree Fahrenheit");

		} else {

			double temperatureInCelsius = (temperature - 32) * 5 / 9;
			System.out.println(temperature + " degree Fahrenheit = " + temperatureInCelsius + " degree Celsius");
		}
	}
}
