package se.iths.kevin.arrayprojekt;
import java.util.Arrays;
public class myArrayList {

//    G-delen av uppgiften
//    public static void printArray(String[] values) {
//        for (int i = 0; i < values.length; i++) {
//            System.out.print(values[i] + " ");
//        }
//    }
//
//    public static void main(String[] args) {
//    String[] words = {"Hello", "World", "!"};
//    printArray(words);
//




//}


    //VG-delen av uppgiften

    //metod 1
    public static int findMax(int[] numbers) {
        return Arrays.stream(numbers).max().getAsInt();
    }
    //metod2
    public static double bigDouble(double a, double b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
    //metod3
    public static void fullName(String lastName, String firstName) {
        System.out.println(firstName + " " + lastName);
    }



    public static void main(String[] args) {
        //anropning av metod1
        int[] numbers = {9998, 5, 11, 23, 44, 1456, 1112, 1, 9999, 25000};
        int max = findMax(numbers);
        System.out.println("Största talet i arrayen: " + max);
        //
        //anropning metod 2
        double biggest = bigDouble(5.5, 7.1);
        System.out.println("Största double: " + biggest);
        //anropning metod 3
        fullName("Dübois", "Kevin");

    }


}
