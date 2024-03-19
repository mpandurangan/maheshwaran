import java.util.*;
import java.util.stream.*;
public class Main {
  public static void main(String[] args) {
      String str = "madam";
      Map<Character,Long> res = str.chars().mapToObj((ch)-> (char)ch).collect(Collectors.groupingBy(ch->ch , Collectors.counting()));
      System.out.println(res);
  }
}
 
