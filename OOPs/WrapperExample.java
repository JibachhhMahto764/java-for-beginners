public class WrapperExample {
    public static void main(String[] args) {
        // wrapper class is permitive converting into object

//        int a = 10;
//         int b= 20;
        // in java doest not pass by reference there are only pass by value
       // Integer num = 45;
        Integer a = 10;
        Integer b = 20;
  swap(a,b);
        System.out.println(a + " " + b);
//        final int bonus = 2;
//        bonus = 3;// you can't modifie the final keyword data
       
        final  A jibachh = new A("jibachh singh");
      jibachh.name = "other name";
      //jibachh = new A("new object");// i can't do this
        // when a non primitive is final you cannot reassign it
    }
     static  void swap(Integer a,Integer b){
        Integer temp = a;
        a = b;
        b = temp;
    }

}
class  A{
    final int num = 10; // :: always intialize it while declarait it
      String name;
  public A(String name){
      this.name = name;
  }
}
