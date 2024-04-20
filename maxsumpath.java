//maximumsumpath of two arrays
public class Main {
    public static void main(String args[]) {
        int arr1[] = {2, 3, 7, 10, 12, 15, 30, 34};
        int arr2[] = {1, 5, 7, 8, 10, 15, 16, 19};

        int i = 0;
        int j = 0;
        int sum1 = 0;
        int sum2 = 0;
        int result = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] == arr2[j]) {
                result += Math.max(sum1, sum2) + arr1[i];
                sum1 = 0;
                sum2 = 0;
                i++;
                j++;
            } else if (arr1[i] > arr2[j]) {
                sum2 += arr2[j];
                j++;
            } else {
                sum1 += arr1[i];
                i++;
            }
        }

        while (i < arr1.length) {
            sum1 += arr1[i];
            i++;
        }

        while (j < arr2.length) {
            sum2 += arr2[j];
            j++;
        }

        result += Math.max(sum1, sum2);

        System.out.println(result);
        System.out.println("sum1=" + sum1);
        System.out.println("sum2=" + sum2);
    }
}
