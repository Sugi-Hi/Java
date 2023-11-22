public class loop{
  public static void main(String[] args){
    int i;
    int sum = 0;
    long mul = 1;

    for(i=1;i<=100;i++){
      sum += i;
    }
    for(i=1;i<=10;i++){
      mul *= i;
    }

      System.out.println("和(100)："+sum);
      System.out.println("積(10 )："+mul);
  }
}