import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        // store 5 roll numbers

//        int[] numbers = new int[5];
//        numbers[0] = 1;
//        numbers[1] = 2;
//        numbers[2] = 3;
//        numbers[3] = 4;
//        numbers[4] = 5;
//

        // storing  5 names

//        String[] names = new String[5];
//        names[0] = "jibachh";
//        names[1] = "jibachh";
//        names[2] = "jibachh";
//        names[3] = "jibachh";
//        names[4] = "jibachh";
//
//
//        //System.out.println(Arrays.toString(numbers));
//        System.out.println(Arrays.toString(names));
// data of 5 students :: { roll no, name,marks}
        int[] rno =  new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];

     Student jibachh = new Student();
     jibachh.rno = 12;
     jibachh.name = "jibachh singh";
     jibachh.marks = 70.76F;
    System.out.println(jibachh.rno);
        System.out.println(jibachh.name);
        System.out.println(jibachh.marks);
       // System.out.println(Arrays.toString(students));
    }

    // create a class
// the datatype is for every single student
    static class Student{

        // class ----> logical construct
        // object ---> physical reality  / occupying space in the memory

        // Properties of  object
        // there are three propertise of the object
        // 1.state of the object --> it's value from it's datatype
        // 2. identity of the object --> one object is diffrent from other
        // 3.behariour of the object --> example two reference objects is pointing to the same object if you make change the refrence variable the next the change is visible at the second refrence variable
        int rno;

        String name;
        float marks;

        // how to access the objects is to uses the dot operator :: sout ( student.rnoll)

        // the variables that are declared inside the class is called instance variable
    }
}
