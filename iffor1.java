public class iffor1{
  public static void main(String[] args){
    int[] correct = {4,1,2,3,1,2,3,2,4,1};
    int[] answer = {1,2,3,3,2,4,3,2,1,4};

    System.out.println("あなたのご回答の得点結果！");
    int score = 0;
    for(int i=0; i<correct.length; i++){
      if(correct[i]==answer[i]){
        score ++;
      }
    }
    System.out.println("得点："+(score*10));
  }
}