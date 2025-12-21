public class OTPGenerator {

    // Method to generate a 6-digit OTP
    public static int generateOTP() {
        return (int) (Math.random() * 900000) + 100000;
    }

    // Method to check if all OTPs are unique
    public static boolean areOTPsUnique(int[] otpArray) {

        for (int i = 0; i < otpArray.length; i++) {
            for (int j = i + 1; j < otpArray.length; j++) {
                if (otpArray[i] == otpArray[j]) {
                    return false; // Duplicate found
                }
            }
        }
        return true; // All unique
    }

    // Main method
    public static void main(String[] args) {

        int[] otpArray = new int[10];

        // Generate 10 OTPs
        for (int i = 0; i < otpArray.length; i++) {
            otpArray[i] = generateOTP();
        }

        // Display OTPs
        System.out.println("Generated OTPs:");
        for (int i = 0; i < otpArray.length; i++) {
            System.out.println("OTP " + (i + 1) + ": " + otpArray[i]);
        }

        // Check uniqueness
        if (areOTPsUnique(otpArray)) {
            System.out.println("All OTPs are UNIQUE");
        } else {
            System.out.println("Duplicate OTPs found");
        }
    }
}
