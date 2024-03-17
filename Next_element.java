public class Next_element {

    public static int nextOddNumber(int current) {
        return current + 2;
    }

    public static int nextPowerOfTwo(int current) {
        return current * 2;
    }

    public static int nextSquare(int current) {
        int root = (int) Math.sqrt(current);
        return (int) Math.pow(root + 1, 2);
    }

    public static int nextEvenSquare(int current) {
        int root = (int) Math.sqrt(current);
        return (root % 2 == 0) ? (int) Math.pow(root + 2, 2) : (int) Math.pow(root + 1, 2);
    }

    public static int nextFibonacci(int n1, int n2) {
        return n1 + n2;
    }

    public static int nextCustomSequence(int current) {
        return (current == 10 || current == 16) ? current + 2 : current + 1;
    }

    public static void main(String[] args) {
        System.out.println("Próximo elemento da sequência a) é: " + nextOddNumber(7));
        System.out.println("Próximo elemento da sequência b) é: " + nextPowerOfTwo(64));
        System.out.println("Próximo elemento da sequência c) é: " + nextSquare(36));
        System.out.println("Próximo elemento da sequência d) é: " + nextEvenSquare(64));
        System.out.println("Próximo elemento da sequência e) é: " + nextFibonacci(5, 8));
        System.out.println("Próximo elemento da sequência f) é: " + nextCustomSequence(19));
    }
}