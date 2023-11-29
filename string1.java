public class string1{
  public static void main(String[] args){
    String str;
    str = new String("Thank You for your seeing!");
    int index = str.indexOf(' ');
    // String str = new String("Thank You for your seeing!");
    String str1 = str.substring(0, index);
    String str2 = str.substring(index+1,index+4);
    String str3 = str.substring(index+5);

    System.out.println("大文字："+str.toUpperCase());
    System.out.print("用　語："+ str +"⇒単語の抜粋："+ str1 + "～" + str2 + "～" + str3 + "\n");
  }
}