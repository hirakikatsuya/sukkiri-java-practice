package rpg;

public class MainHP {
  public static void main(String[] args) {
    Character[] c= new Character[5];
    
    c[0] = new Hero();
    c[0]  = new Hero();
    c[0]  = new Thief();
    c[0]  = new Wizard();
    c[0]  = new Wizard();

    for(Character ch : c){
      ch.hp+=50;
    }
  }
}
