public class L4T13 {

    public static void main(String[] args) {
        String hexNumber = "AB8C";
        System.out.println("The decimal value is " + hexToDecimal(hexNumber));
    }

    public static int hexToDecimal(String hexNumber) {
        int decimalValue = 0;
        for (int i = 0; i < hexNumber.length(); i++) {
            decimalValue = (decimalValue * 16) + hexCharToDec(hexNumber.charAt(i));
        }
        return decimalValue;
    }

    public static int hexCharToDec(char hexChar) {
        if (hexChar >= 'A' && hexChar <= 'F') {
            return 10 + (hexChar - 'A');
        } else if (hexChar >= 'a' && hexChar <= 'f') {
            return 10 + (hexChar - 'a');
        } else if (hexChar >= '0' && hexChar <= '9') {
            return hexChar - '0';
        } else {
            throw new IllegalArgumentException("Invalid hexadecimal character: " + hexChar);
        }
    }
}