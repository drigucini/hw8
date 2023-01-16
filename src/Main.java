import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task0();
        task12();
        task3();
        task4();
    }

    public static void task0 () {
       System.out.println("Theory");
       //int[] months = new int [12];
       int[] weights = {90, 91, 93, 92, 85, 87, 88, 89, 0, 0, 0, 0};
       //weights[0] = 90;
       int januaryWeight = weights [0];
       System.out.println(januaryWeight);
       System.out.println(weights[0]);
       System.out.println(weights[4]);
       System.out.println(weights[11]);
       //shift + F10 = rerun
        // Ctrl + D = new line
        // Ctrl + Shift + arrow down = ,move line down
        System.out.println(weights.length);
        int january = 0;
        System.out.print(weights[january]);
        for (int i = 0; i < weights.length; i++) {
            System.out.print(weights[i] + " ");
        }
       }

    public static void task12 () {
        System.out.println("\n\nTask 1 and 2");
        int[] firstArray = new int[3];
        firstArray[0] = 1;
        firstArray[1] = 2;
        firstArray[2] = 3;
        System.out.println(Arrays.toString(firstArray));

        double[] secondArray = {1.57, 7.654, 9.986};
        System.out.println(Arrays.toString(secondArray));

        char[] thirdArray = new char[4];
        thirdArray[0] = 'a';
        thirdArray[1] = 'q';
        thirdArray[2] = 'r';
        thirdArray[3] = 'f';
        System.out.println(Arrays.toString(thirdArray));
    }

    public static void task3 () {
        System.out.println("\nTask 3");
        int[] firstArray = new int[3];
        firstArray[0] = 1;
        firstArray[1] = 2;
        firstArray[2] = 3;
        for (int i = firstArray.length; i >= 0; i--) {
            if(i == 1){
                System.out.print(firstArray[i-1]);
                break;
            }
            System.out.print(firstArray[i-1] + ", ");
        }
        System.out.println(" ");


        double[] secondArray = {1.57, 7.654, 9.986};
        for (int i = secondArray.length; i > 0; i--) {

            if(i == 1){
                System.out.print(secondArray[0]);
                break;
            }
            System.out.print(secondArray[i-1] + ", ");
        }
        System.out.println(" ");

        char[] thirdArray = new char[4];
        thirdArray[0] = 'a';
        thirdArray[1] = 'q';
        thirdArray[2] = 'r';
        thirdArray[3] = 'f';
        for (int i = thirdArray.length; i > 0; i--) {
            if(i == 1){
                System.out.print(thirdArray[i-1]);
                break;
            }
            System.out.print(thirdArray[i-1] + ", ");
        }
        System.out.println(" ");
    }

    public static void task4 () {
        System.out.println("\nTask 4");
        int[] firstArray = new int[3];
        firstArray[0] = 1;
        firstArray[1] = 2;
        firstArray[2] = 3;
        for (int i = 0; i < firstArray.length; i++) {
            if (firstArray[i]%2 == 1) {
                firstArray[i]++;
            }
            if(i == firstArray.length - 1){
                System.out.print(firstArray[i]);
                break;
            }
            System.out.print(firstArray[i] + ", ");
        }
    }
}