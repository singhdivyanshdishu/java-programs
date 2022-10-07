import java.util.*;

public class Solution {

  private static String getRuler(String kingdom) {
    
    String ruler = "";
    int l=kingdom.length();
    char ch=kingdom.charAt(l-1);
    if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
    {
        ruler="Alice";
    }
    if(ch=='y')
    {
        ruler="Nobody";
    }
    else{
        ruler="Bob";
    }
    return ruler;
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
      int T = in.nextInt();

      for (int t = 1; t <= T; ++t) {
        String kingdom = in.next();
        System.out.println(
            "Case #" + t + ": " + kingdom + " is ruled by " + getRuler(kingdom) + ".");
      }
    
  }
}
