// File: /E:/OOPs/OOPs/staticExample/main.java
public class money {

   
    public void display() {
        System.out.println("This is the Money class.");
    }

    public static void main(String[] args) {
        money monkey = new money();
        monkey.display();
         money.show(); // This method is not defined
    }
}