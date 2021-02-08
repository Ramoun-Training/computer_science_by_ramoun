package oop;
public class Can {
  public static final int MAX_LIQUID_AMOUNT = 355;
  private int liquidAmount;
  private int flavor;
  
  public int getLiquidAmount() {
    return liquidAmount;
  }
  
  public void setLiquidAmount(int liquidAmount) {
    this.liquidAmount = liquidAmount;
  }
  
  public void setFlavor(int flavor) {
    this.flavor = flavor;
  }
  
  public int getFlavor() {
    return flavor;
  }
  
  //script #1
  public void fill() {
    liquidAmount = MAX_LIQUID_AMOUNT;
  }
  
  //script #2
  public void fill(int amount) {
    liquidAmount = amount;
  }
  
  public void empty() {
    liquidAmount = 0;
  }
  
  public void pour(int amountPoured) {
    if (liquidAmount >= amountPoured){
      liquidAmount -= amountPoured;
    } else {
      //do nothing for now
    }
  }
  
  //edicate method
  public boolean isFull() {
    if (liquidAmount == MAX_LIQUID_AMOUNT) {
      return true;
    } else {
      return false;
    }
  }
  
  public boolean isEmpty() {
    if (liquidAmount == 0) {
      return true;
    } else {
      return false;
    }
  }
  
  public Can(int liquidAmount, int flavor) {
    setLiquidAmount(liquidAmount);
    setFlavor(flavor);
  }
}