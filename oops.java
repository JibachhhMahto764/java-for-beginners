public class MyClass {
    // Fields
    int x;

    }

    // Method
    public void display() {
        System.out.println("Value of x: " + x);
    }

    // Main method to create an object
    public static void main(String[] args) {
        MyClass obj = new MyClass(10);
        obj.display();
    }
}