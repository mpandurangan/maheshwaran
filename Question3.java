import java.util.*;
import java.util.stream.*;

interface Sample{
  void print();
}

public class Main {
  public static void main(String[] args) {
    Sample sm = new Sample({
      void print(){
        System.out.println("printed");
      }
    });
    sm.print();
    Sample sm1 = ()-> System.out.println("printed lambda");
    sm1.print();
  }
}