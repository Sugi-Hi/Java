public class while2{
  public static void main(String[] args)
    throws Exception
    {
      int numberOfChoices = 4;
      byte[] b = new byte[128];
      int answer;

      while(true){
        System.out.print("==>");
        System.in.read(b);
        answer = Integer.parseInt((new String(b)).substring(0,1));
        if(answer >= 1 && answer <=numberOfChoices){
          break;
        }else{
          System.out.println("正しい選択ではありません。再入力お願いします");
        }
      }

      System.out.println("Answer => " + answer);
    }
  }