public class BasicsDemo {

    public static void main(String[] args) {

        int marks = 85;

        if (marks >= 50) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        System.out.println("Numbers from 1 to 5:");

        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("Array Elements:");

        for (int num : numbers) {
            System.out.println(num);
        }
    }
}
