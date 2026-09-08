class CountElement {
    public static void main(String[] args) {
        int a[] = {10, 20, 30, 20, 40, 20};
        int number = 20;
        int count = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == number) {
                count++;
            }
        }

        System.out.println("Count = " + count);
    }
}
