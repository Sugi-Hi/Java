public class array{
  public static void main(String[] args){
    int[] intArray = new int[6];
    System.out.println(intArray.length);

    // intArray = {1, 200, -1, 50, 33, -15};
    intArray[2] = 5;
    intArray[0] -= 3;
    intArray[1] = intArray[2]*4;
    intArray[3] ++;

    System.out.println("{"+intArray[0]+","+intArray[1]+","+intArray[2]+","+intArray[3]+","+intArray[4]+","+intArray[5]+"}");
  }

}