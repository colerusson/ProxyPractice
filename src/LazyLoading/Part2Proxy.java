package LazyLoading;

public class Part2Proxy implements Part2Array2DInterface {
    private final String fileName;
    private Part2Array2D array2D;
    public Part2Proxy(String fileName) {
        this.fileName = fileName;
    }

    public boolean isLoaded() {
        return array2D != null;
    }

    @Override
    public void set(int row, int col, int value) {
        if (array2D == null) {
            array2D = new Part2Array2D(fileName);
            array2D.load();
        }
        array2D.set(row, col, value);
    }

    @Override
    public int get(int row, int col) {
        if (array2D == null) {
            array2D = new Part2Array2D(fileName);
            array2D.load();
        }
        return array2D.get(row, col);
    }
}
