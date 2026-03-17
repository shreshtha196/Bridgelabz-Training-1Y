package Com.Gla.Level3;

public class Otp {
    public static int generateOTP() {
        return (int)(Math.random() * 900000) + 100000;
    }
    public static boolean checkUnique(int[] otp) {
        for (int i = 0; i < otp.length; i++) {
            for (int j = i + 1; j < otp.length; j++) {
                if (otp[i] == otp[j])
                    return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {

        int[] otp = new int[10];

        for (int i = 0; i < 10; i++) {

            otp[i] = generateOTP();
            System.out.println("OTP " + (i + 1) + ": " + otp[i]);
        }

        System.out.println("All OTPs Unique: " + checkUnique(otp));
    }
}
