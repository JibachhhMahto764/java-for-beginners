public class Tringle{
  public static void main(string[] args){
    trinagle2(4,0);
      }
  static void tringle2(int r,int c){
    if (r==0){
      return;
    }
    if(c<r){
      tringle2(r,c+1);
      System.out.print("*");
    }else{
      System.out.printIn(l);
      tringle2(r-1,0);
    }
  }
}
