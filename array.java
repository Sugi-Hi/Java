public class array{
  public int[] intArray={ 1, 200, -1, 50, 33 , -15};

  public static void main(String[] args){
    // int[] intArray = new int[6];  2回宣言エラー

    int[] intArray={ 1, 200, -1, 50, 33 , -15};
    System.out.println(intArray.length);

    intArray[2] = 5;
    intArray[0] -= 3;
    intArray[1] = intArray[2]*4;
    intArray[3] ++;

    System.out.println("{"+intArray[0]+","+intArray[1]+","+intArray[2]+","+intArray[3]+","+intArray[4]+","+intArray[5]+"}");
  }

}