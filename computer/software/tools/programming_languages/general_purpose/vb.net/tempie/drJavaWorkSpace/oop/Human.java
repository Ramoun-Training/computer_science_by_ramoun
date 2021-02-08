public class Human {
  //private : only can be accessed inside this class
  private int fingers = 10;
  //static means it can be used by the class or the object
  public static final boolean HAVE_BRAIN = true;
  
  private String hairColor;
  private String eyeColor;
  
  //public : can be accessed insdie and outside the class
  public int getFingers() {
    //good trick : return -> sends a copy of value contained in fingers variable to the caller
    return fingers;
  }
  
  public void setFingers(int fingers) {
    //setting the global variable fingers to the number passed as an argument
    this.fingers = fingers;
  }
  
  public String getHairColor() {
    return hairColor;
  }
  
  public String getEyeColor() {
    return eyeColor;
  }
  
  public void setHairColor(String hairColor) {
    this.hairColor = hairColor;
  }
  
  public Human(String hairColor, String eyeColor) {
    setHairColor(hairColor);
    this.eyeColor = eyeColor;
  }
}