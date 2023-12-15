import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Random;

public class random{
  public static void main(String[] args)
    throws Exception
  {
    FileReader fr = new FileReader("nations.txt");
    BufferedReader br = new BufferedReader(fr);
    // 国名・首都を格納する ArrayList
    ArrayList<String> nations = new ArrayList<String> ();
    ArrayList<String> capitals = new ArrayList<String> ();
    Random r = new Random();
    String correctCapital;

    for(int i=0;i<10;i++){
      int qIndex = r.nextInt(nations.size());
      System.out.println(nations.get(qIndex));
      nations.remove(qIndex);
      correctCapital = capitals.remove(qIndex);
    }

  }
}