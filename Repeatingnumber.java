//Q1. n= 1,3,6,5,7,9,7,8,7,9
//How many times 7 occur in the problem
// Using modulo which is n%10
//      reminder is ==7

//code 
public class countnums{
  public static void main (string[] args)
  {
    int n = 1365797879;
    int Count = 0;
    while(n>0){
      int rem = n%10;
      if (rem==7){
        Count++;
      }
      n = n/10  // n/=10 also write 
        }
    system.out.println(count);
  }
}
