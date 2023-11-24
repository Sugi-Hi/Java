public class iffor1{
  public static void main(String[] args)
    throws Exception
    {
      int[] correct = {4,1,2,3,1,2,3,2,4,1};
      int[] answer ={};

      byte[] b = new byte[128];
      int len = System.in.read (b);
  
      System.out.println("あなたのご回答の得点結果！");
      int score = 0;
      for(int i=0; i<correct.length; i++){
        answer[i] = len;
        if(correct[i]==answer[i]){
          score ++;
        }
      }
      System.out.print("得点："+(score*10));
    
    }
}