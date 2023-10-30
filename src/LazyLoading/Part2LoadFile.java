package LazyLoading;


import java.io.IOException;

public class Part2LoadFile {
    public static void main(String[] args) throws IOException {
        Part2Array2D array2D = new Part2Array2D(10, 10);
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                array2D.set(i, j, i * j);
            }
        }

        array2D.setFileName("Array2D.txt");

        // Save the array2D to a file.
        array2D.save();

        // print the array2D
        System.out.println("The array2D is:");
        for (int i = 0; i < 10; i++) {
            System.out.print("[");
            for (int j = 0; j < 10; j++) {
                System.out.print(array2D.get(i, j) + " ");
            }
            System.out.print("]\n");
        }
    }
}
