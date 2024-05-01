import java.io.FileReader;

public class fileread{
  public static void main(String[] words)
    throws Exception
  {
    FileReader fr = new FileReader("nations.txt");

    while(true){
      char[] c = new char[128];
      int len = fr.read(c);
      if(len <= 0)
        break;
      System.out.print(new String(c));
    }

    fr.close();
  }
}