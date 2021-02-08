import static java.lang.System.*;

public class HumanRunner {
  public static void main(String[] args) {
    Human ramoun = new Human("black", "hazel");
    
    out.println("my Hair color is " + ramoun.getHairColor());
    ramoun.setHairColor("white");
    out.println("Now it is " + ramoun.getHairColor());
    
    out.println("I can't change my eye color so it's always " + ramoun.getEyeColor());
    
    out.println("Ramoun has " + ramoun.getFingers() + " fingers.");
    ramoun.setFingers(16);
    out.println("Now I have " + ramoun.getFingers() + " fingers.");
    
    out.println("Ramoun, do you have a brain?");
    out.println("Look I am Human then -> " + ramoun.HAVE_BRAIN);
    
    //to print the class name
    out.print("The class Name: ");
    String name = ramoun.toString();
    char nameArray [] = name.toCharArray();
    for(int i = 0; nameArray[i] != '@'; i++){
      out.print(nameArray[i]);
    }
    out.println();
    
    //to print the address of an array
    out.print("The class address: ");
    int i = 0;
    for(; nameArray[i] != '@'; i++);
    for(i++; i < nameArray.length; i++){
      out.print(nameArray[i]);
    }
    out.println();
    
  }
}