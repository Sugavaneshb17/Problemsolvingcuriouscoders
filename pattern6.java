public class MyClass {
  public static void main(String args[]) {
    int i;
    int j;
    int n =4;
    for(i=1;i<=n;i++){
        for(j=1;j<=n-i+1;j++){
            System.out.print("$");
        }
        System.out.println(" ");
    }

  }
}
