
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

     Student jibachh = new Student(12,"jibachh singh",70.76f);
     Student rahul = new Student();
    //jibachh.changeName("watch lover");
      //  jibachh.greeting();
//        jibachh.rno = 12;
//        jibachh.name = "jibachh singh";
//        jibachh.marks = 70.76F;
    System.out.println(jibachh.rno);
        System.out.println(jibachh.name);
       System.out.println(jibachh.marks);
       Student random = new Student(jibachh);
        System.out.println(random.name);
        Student random2 = new Student();
        System.out.println(random2.name);

        // memory allocation
        Student one = new Student();

        Student two = one;
        one.name ="something something";
        System.out.println(two.name);
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
        void greeting(){
            System.out.println("Hello! My name is " + this.name);
        }
        void changeName(String newName){
            this.name =  newName;
        }
        Student (Student other){
            this.name = other.name;
            this.rno = other.rno;
            this.marks = other.marks;
        }
        Student(){
            // constroctor

            // this is how you call a constructor from another constroctor
            // using this keyword
             // internally : new student(14,"rohit singh",66.54f);

            this(14,"rohit singh",66.54f);


        }
        //Student rahul = new Student(1,"rahul",44.4f);
        // here , this will be replaced with rahul
        Student(int rno, String name, float marks){
            this.rno = rno;
            this.name = name;
            this.marks = marks;
        }
    }
}
