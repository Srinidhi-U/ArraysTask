class EvenOddArray {
    public static void main(String[] args) {
        int a[] = {10, 15, 20, 25, 30};

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                System.out.println(a[i] + " is Even");
            } else {
                System.out.println(a[i] + " is Odd");
            }
        }
    }
}
