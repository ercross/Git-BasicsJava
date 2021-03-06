public class Palindromes {

    public static void main(String[] args) {
        int limit = 10000;
        System.out.println(getPalindromesSum(limit));
    }

    static int getPalindromesSum(int limit) {
        int palindromesSum = 0;
        int number;

        for (int j = 0; j < 2; j++) {
            int i = 1;
            while ((number = createPalindrome(i, 10, j % 2)) < limit) {
                palindromesSum += number;
                i++;
            }
        }
        return palindromesSum;
    }

    static int createPalindrome(int input, int b, int isOdd) {
        int n = input;
        int palin = input;

        if (isOdd == 1)
            n /= b;

        while (n > 0) {
            palin = palin * b + (n % b);
            n /= b;
        }
        return palin;
    }
}
