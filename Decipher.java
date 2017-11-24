public class Decipher{
  String character = "";
 
  public Decipher(String nice){
    character = nice;
    }
 
  public void ThisMilio(){
   for (int x = 0;x<character.length();x++)
   {
    char cam = character.charAt(x);
    int ascii = (int) cam -1;
    String coffee = Character.toString ((char) ascii);
    System.out.print(coffee);
    
    }
  } 
} 