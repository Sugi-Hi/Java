public class systemin{
  public static void main(String[] args)
    throws Exception
    {
      byte[] b = new byte[128];
      int len = System.in.read (b);
      String str = new String (b);
      System.out.print("Read " + len + "bytes: " + str);
    }
}