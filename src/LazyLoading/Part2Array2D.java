package LazyLoading;

import java.io.*;

public class Part2Array2D implements Part2Array2DInterface {
    private int[][] array2D;
    private String fileName;

    public Part2Array2D(int row, int col) {
        array2D = new int[row][col];
    }

    public Part2Array2D(String fileName) {
        this.fileName = fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void set(int row, int col, int value) {
        array2D[row][col] = value;
    }

    @Override
    public int get(int row, int col) {
        return array2D[row][col];
    }

    public void load() {
        try {
            FileInputStream fis = new FileInputStream(fileName);
            ObjectInputStream iis = new ObjectInputStream(fis);
            array2D = (int[][]) iis.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void save() throws IOException {
        try {
            FileOutputStream fos = new FileOutputStream(fileName);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(array2D);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
