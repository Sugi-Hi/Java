public class iffor2{
  public static void main(String[] conditions){
    int[] correct = {4,1,2,3,1,2,3,2,4,1};
    int[] answer = {1,2,3,3,2,4,3,2,1,4};

    System.out.print("あなたのご回答の得点結果です。\n");
    int score = 0;
    for(int i=0; i<correct.length; i++){
      if(correct[i]==answer[i]){
        System.out.println((i+1)+"番目：正解！");
        score ++;
      }else{
        System.out.println((i+1)+"番目：不正解");
      }
    }
    System.out.println("得点："+(score*10));
  }
}