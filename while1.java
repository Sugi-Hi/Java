public class while1{
  // public String[] capitals = {"ハノイ","東京","バンコク","デリー","ジャカルタ"};

  public static void main(String[] args){
    // String[] capitals = new String[50];
    String[] capitals = {"ハノイ","東京","バンコク","デリー","ジャカルタ"};
    // capitals[0]="ハノイ";
    int index = 0;
    int selectID;

    while(index < capitals.length){
      selectID = index + 1;
      System.out.println(selectID+"."+capitals[index]);
      index ++;
    }

  }
}