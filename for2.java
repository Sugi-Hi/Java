public class for2{
  public static void main(String[] args){

    outer:
    for(int i=0;i<50;i++){
      for(int j=0;j<50;j++){
        if(i*j==391){
          System.out.println(i+" "+j);
          break outer;
        }
      }
    }
  }

}