class PalindromeArray {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 2, 1};
        boolean palindrome = true;

        for (int i = 0; i < a.length / 2; i++) {
            if (a[i] != a[a.length - 1 - i]) {
                palindrome = false;
                break;
            }
        }

        if (palindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
