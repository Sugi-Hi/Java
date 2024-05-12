public class data{
  public static void main(String[] args){
    Integer iInt = new Integer(100);
    Double dDouble = new Double(100.123);
    Float dFloat = new Float(iInt);
    System.out.println("和:" + (dFloat + dDouble));
    System.out.print("差:" + (dDouble - dFloat) + "⇒⇒⇒");
    System.out.printf("小数点第3位まで:%.3f \n",(dDouble - dFloat)); //C言語と同様

  }
}