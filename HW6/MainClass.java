class AfterLast4 {
    static int[] arr;
    static int last4;
    static int[] newArr;
    static int newLength;

    public AfterLast4(int[] array) {
        arr = array;
    }

    public static void main(String[] args) {
        AfterLast4 m = new AfterLast4(new int[]{1, 2, 3, 4, 5, 6, 7});
        last4 = m.lastFour();
        newLength = arr.length - last4 - 1;
        newArr = new int[newLength];
        for (int i = 0; i < newLength; i++) {
            newArr[i] = arr[last4 + i + 1];
            System.out.print(newArr[i] + " ");
        }
        System.out.println();

    }

    public int lastFour() {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == 4)
                return i;
        }
        return -1;
    }
}
