package assignment4;

public class OntarioLicense {

	public static void main(String[] args) {
		int ageOfPerson = 17;
		int requiredAge=16;
		String currentLicenseLevel = "G1";
		String primaryLicense = "G1";
		String secondaryLicense = "G2";
		String finalLicenseLevel = "G";
		String noLicense = "nil";
		if (ageOfPerson >= requiredAge && (currentLicenseLevel == primaryLicense)) {
			System.out.println("License will be issued and type of license issued:" + secondaryLicense);
		} else if (ageOfPerson >= requiredAge && currentLicenseLevel == secondaryLicense) {
			System.out.println("License will be issued and type of license issued:" + finalLicenseLevel);
		} else if (ageOfPerson >= requiredAge && currentLicenseLevel == noLicense) {
			System.out.println("License will be issued and type of license issued:G1");
		} else {
			System.out.println("License wont be issued");
		}
	}

}
