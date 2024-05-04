public class string1{
  public static void main(String[] args){
    String str;
    str = new String("Thank You for your seeing!");
    // String str = new String("Thank You for your seeing!");

    int index  = str.indexOf('!');
    int index1 = str.indexOf(' ');
    int index2 = str.indexOf(' ',index1+1);
    int index3 = str.indexOf(' ',index2+1);

    str = str.substring(0, index);

    System.out.println("大文字："+str.toUpperCase());
    System.out.println("小文字："+str.toLowerCase());

    System.out.println("用　語："+ str +"⇒単語の抜粋："+ index1 + "番目～、" + index2 + "番目～、" + index3 + "番目、" +"末尾番号："+index);
  }
}