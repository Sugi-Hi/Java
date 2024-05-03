public class substring{
  public static void main(String[] words)
    throws Exception

  {
    int numberOfChoices = 4;
    byte[] b = new byte[128];
    int answer;

    while(true){

      System.out.print("4択式の番号を入力して下さい!==>");
      System.in.read(b);
      answer = Integer.parseInt((new String(b)).substring(0,1));
      if(answer >= 1 && answer <= numberOfChoices){
        break;
      }
      else{
        System.out.print("正しい選択ではありませんので、再入力お願いします。\n");
      }
    }

    System.out.println("Answer =>" + answer);
  }

}