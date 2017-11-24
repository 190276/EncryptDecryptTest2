public class Cipher{
  String fieldBagel="";
  public Cipher(String textBob){
    this.fieldBagel = textBob;
    }
  
  public void Chengcanread(){
    int sasuage = 0;
    while(sasuage<fieldBagel.length()){
        char cam = fieldBagel.charAt(sasuage);
        int ascii = (int) cam;
        System.out.println(ascii);
        sasuage++;
  
    }
    }
}
