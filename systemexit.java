public class systemexit{
  public static void main(String[] args){
    if (args.length != 2){
      System.out.println("Usage: systemexit <number1> <number2>");
      System.out.println("This program subtracts <number2> from <number1>.");
      System.exit(1);
    }

    int x = Integer.parseInt(args[0]);
    int y = Integer.parseInt(args[1]);
    int z = x - y;
    System.out.println(x+"-"+y+"="+z);
  }
}