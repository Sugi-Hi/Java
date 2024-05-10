public class loopbreak{
  public static void main(String[] args){

    int i;
    int[] data = {1,2,3,3,2,5,4,6,7,1,0,2,7,9,8,2,5};

    for(i=0;i<data.length;i++){
      if(data[i] == 8){
        break;
      }
    }

    System.out.println("見つけたい8を発見 " + (i+1) + "番目にありました！");
  }
}