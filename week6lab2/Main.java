public class Main {
    public static void main(String[] args) {
        MathDemo mathDemo = new MathDemo();
        int a = 5;
        int b = 10;
        int[] arr = {1, 2, 3, 4, 5};

        System.out.println("Min: " + mathDemo.min(a, b));
        System.out.println("Max: " + mathDemo.max(a, b));
        System.out.println("Sum: " + mathDemo.sum(arr));
    }
}
