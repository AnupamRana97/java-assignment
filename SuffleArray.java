public class SuffleArray {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7};

        shuffleThisArray(a);

        for (int element : a) {
            System.out.print(element + " ");
        }
    }

    public static void shuffleThisArray(int[] a) {
        int n = a.length;

        for (int i = 0; i < n; i++) {
            int swap = (i * 2 + 1) % n;

            int temp = a[i];
            a[i] = a[swap];
            a[swap] = temp;
        }
    }
}
