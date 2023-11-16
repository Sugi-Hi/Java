public class for1{
  // public 

  public static void main(String[] args){
    String[] capitals = {"ハノイ","東京","バンコク","デリー","ジャカルタ"};
    // String[] capitals = new String[50];
    // capitals[0]="ハノイ";
    int index;
    int selectID;

    for(index=0; index<capitals.length; index++){
      selectID = index + 1;
      System.out.println(selectID+"."+capitals[index]);
    }

  }
}