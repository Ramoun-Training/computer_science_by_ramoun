package oop;
import static java.lang.System.*;

public class CanRunner {
  public static void main(String[] args){
    Can pepsi = new Can(300, Flavors.COLA);
    pepsi.fill();
    pepsi.empty();
    pepsi.fill(300);
    pepsi.pour(200);
    out.println(pepsi.getLiquidAmount());
  }
}