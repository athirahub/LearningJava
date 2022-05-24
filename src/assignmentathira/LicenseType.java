package assignmentathira;

public class LicenseType {

	public static void main(String[] args) {
				int ageOfPerson = 16;
				int requiredAge = 16;
				String currentLicenseLevel = "G1";
				String primaryLicense = "G1";
				String secondaryLicense = "G2";
				String finalLicenseLevel = "G";
				String noLicense = "nil";
				if (ageOfPerson >= requiredAge && (currentLicenseLevel.equals(primaryLicense))) {
					System.out.println("License will be issued and type of license issued:" + secondaryLicense);
				} else if (ageOfPerson >= requiredAge && currentLicenseLevel.equals(secondaryLicense)) {
					System.out.println("License will be issued and type of license issued:" + finalLicenseLevel);
				} else if (ageOfPerson >= requiredAge && currentLicenseLevel.equals(noLicense)) {
					System.out.println("License will be issued and type of license issued:G1");
				} else {
					System.out.println("License wont be issued");
				}
			}

		}

	

