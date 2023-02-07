import java.util.Arrays;

public class Main {
    public static void reverse(int[] nums) {
        int[] temp = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            temp[nums.length - 1 - i] = nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = temp[i];
        }
    }

    public static void reverse(double[] nums) {
        double[] temp = new double[nums.length];

        for (double i = 0; i < nums.length; i++) {
            temp[(int) (nums.length - 1 - i)] = nums[(int) i];
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = temp[i];
        }
    }

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] i = new int[3];
        i[0] = 1;
        i[1] = 2;
        i[2] = 3;
        double[] a = {1.57, 7.654, 9.986};
        int[] c = {1, 2, 3, 10};
    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] i = new int[3];
        i[0] = 1;
        i[1] = 2;
        i[2] = 3;
        System.out.println(Arrays.toString(i));
        double[] a = {1.57, 7.654, 9.986};
        System.out.println(Arrays.toString(a));
        int[] c = {1, 2, 3, 10};
        System.out.println(Arrays.toString(c));
    }

    public static void task3() {
        System.out.println("Задача 3");
        int[] i = new int[3];
        i[0] = 1;
        i[1] = 2;
        i[2] = 3;
        reverse(i);
        System.out.println(Arrays.toString(i));
        double[] a = {1.57, 7.654, 9.986};
        reverse(a);
        System.out.println(Arrays.toString(a));
        int[] c = {1, 2, 3, 10};
        reverse(c);
        System.out.println(Arrays.toString(c));
    }

    public static void task4() {
        System.out.println("Задача 4");
        int[] i = new int[3];
        i[0] = 1;
        i[1] = 2;
        i[2] = 3;

        for (int a = 0; a < 3; a++) {
            if (i[a] % 2 != 0)
            i[a] = i[a] + 1;
            System.out.println(i[a]);
        }
    }
}