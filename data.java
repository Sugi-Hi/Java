public class data{
  public static void main(String[] args){
    Integer iInt = new Integer(100);
    Double dDouble = new Double(100.123);
    Float dFloat = new Float(iInt);
    System.out.println(dFloat + dDouble);
    System.out.println(dDouble - dFloat);

  }
}