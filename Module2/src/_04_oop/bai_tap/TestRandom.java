package _04_oop.bai_tap;

public class TestRandom {

    static void sort(int arr[])
    {
        int n = arr.length;

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            // Swap the found minimum element with the first
            // element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
//        System.out.println((int) (Math.random() * 10000));
//        System.out.println(System.currentTimeMillis());
        int[] a = new int[10000];

        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 10000);
        }
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        sort(a);
        stopWatch.stop();
        System.out.println(stopWatch.getElapsed());

//        for (int i = 0; i < a.length; i++) {
//            System.out.println(a[i]);
//        }

    }
}
