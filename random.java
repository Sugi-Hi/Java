import java.util.ArrayList;
import java.util.Random;

public class random{
  public static void main(String[] args)
    throws Exception
  {
    ArrayList<String> nations = new ArrayList<String> ();
    Random r = new Random();
    for(int i=0;i<10;i++){
      int qIndex = r.nextInt(nations.size());
      System.out.println(nations.get(qIndex));
    }
  }
}