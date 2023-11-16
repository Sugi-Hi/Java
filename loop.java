public class loop{
  public static void main(String[] args){
    int i;
    int sum=0;
    int mul=1;

    for(i=1;i<=100;i++){
      sum += i;
      mul *= i;
    }
      System.out.println("和："+sum);
      System.out.println("積："+mul);
  }
}