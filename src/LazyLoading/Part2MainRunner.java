package LazyLoading;

public class Part2MainRunner {
    public static void main(String[] args) {
        // create a proxy object
        Part2Proxy proxy = new Part2Proxy("Array2D.txt");
        // check if the array2D is loaded
        System.out.println("Is the array2D loaded? " + proxy.isLoaded());
        // set the value at (1, 1) to 10
        proxy.set(1, 1, 10);
        // get the value at (1, 1)
        System.out.println("The value at (1, 1) is: " + proxy.get(1, 1));
        // set the value at (2, 2) to 20
        proxy.set(2, 2, 20);
        // get the value at (2, 2)
        System.out.println("The value at (2, 2) is: " + proxy.get(2, 2));
        // set the value at (3, 3) to 30
        proxy.set(3, 3, 30);
        // get the value at (3, 3)
        System.out.println("The value at (3, 3) is: " + proxy.get(3, 3));
        // check if the array2D is loaded
        System.out.println("Is the array2D loaded? " + proxy.isLoaded());
    }
}
