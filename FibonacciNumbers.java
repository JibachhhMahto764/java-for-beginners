import java.util..Scanner;
public static void main(strings[] args){
  scanner in = New Scanner(system.in);
  int n = in.nextInt();
  int a= 0;
  int b= 1;
  int count = 2;
  while(count <= n){
    int temp = b;
    b = b+a;
    a = temp;
    count++;
  }
  sysytem.out.printLn(b);
}
}
