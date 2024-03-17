class Reverb_string {
    public static String reverseString(String str) {
        if (str.isEmpty()) {
            return str;
        } else {
            return reverseString(str.substring(1)) + str.charAt(0);
        }
    }

    public static void main(String[] args) {
        String str = "Olá, mundo!";
        String reversed = reverseString(str);
        System.out.println("String original: " + str);
        System.out.println("String invertida: " + reversed);
    }
}