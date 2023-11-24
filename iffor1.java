public class iffor1{
  public static void main(String[] args)
    throws Exception
    {
      int[] correct = {4,1,2,3,1,2,3,2,4,1};
      int[] intArray ={0,0,0,0,0,0,0,0,0,0};

      byte[] b = new byte[128];
  
      System.out.println("あなたのご回答の得点結果！");
      int score = 0;
      for(int i=0; i<correct.length; i++){

        int answer = System.in.read(b);
        intArray[i] = answer;
        if(correct[i]==intArray[i]){
          score ++;
        }

      }
      System.out.print("得点："+(score*10)+ "\n");
    
    }
}