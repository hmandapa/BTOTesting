package daynamicvalueexample;
public class Scenario5 {

    public static void main(String[] args) {

        String S1 = "Your order number is XXXX. Please note this for future reference";
        String S2 = "Your order number to YYYY. Please note this for future reference";

        int length1 = S1.length();
        int length2 = S2.length();

        System.out.println("Length of the string S1: " + length1);
        System.out.println("Length of the string S2: " + length2);

        if (length1 == length2) {
            String[] arrOfStr1 = S1.split(" ");
            String[] arrOfStr2 = S2.split(" ");

            int arrLength = arrOfStr1.length;

            if (arrLength == arrOfStr2.length) {
                String status = "success"; // Assume success initially

                for (int i = 0; i < arrLength; i++) {
                    if (i == 4) { // Check if it's the fifth word (0-based index)
                        // Do nothing for the fifth word
                    } else {
                        if (!arrOfStr1[i].equals(arrOfStr2[i])) {
                            status = "fail";
                            break; // Exit the loop as soon as a mismatch is found
                        }
                    }
                }

                System.out.println("Status: " + status);
            } else {
                System.out.println("Status: fail (Different number of words)");
            }
        } else {
            System.out.println("Status: fail (Different string lengths)");
        }
    }
}
