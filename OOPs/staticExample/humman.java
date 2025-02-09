

public class humman {
    Integer age;
    String name;
    double salary;
    boolean married;

    static long population;
    public humman(Integer age, String name, double salary, boolean married){
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        humman.population += 1;
    }
}
