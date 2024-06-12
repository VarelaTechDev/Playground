public class StringConverter {

    // Convert String to byte[]
    public static byte[] stringToBytes(String input) {
        return input.getBytes();
    }

    // Convert byte[] back to String
    public static String bytesToString(byte[] bytes) {
        return new String(bytes);
    }

    public static void main(String[] args) {
        String inputString = "53af6d12-de18-4d64-880a-3f95b8966264"; // Example string
        byte[] byteArray = stringToBytes(inputString);


        String secretMessage = "this is a secret message with @#&#@*(#&(@#(@*#";
        byte[] secretMessageBytes = stringToBytes(secretMessage);

        // convert back to string
        String secretMessageConvertedBack = bytesToString(secretMessageBytes);
        System.out.printf("Secret message converted back: %s\n", secretMessageConvertedBack);
        System.out.println(secretMessage.equals(secretMessageConvertedBack));

        // Print byte array
        System.out.println("Byte array: ");
        for (byte b : byteArray) {
            System.out.printf("%02x ", b);
        }
        System.out.println();

        // Convert back to string
        String convertedBackString = bytesToString(byteArray);
        System.out.println("Converted back string: " + convertedBackString);
    }
}
