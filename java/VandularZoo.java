package zoo;
import org.animals.*;
public class VandularZoo{
public static void main(String args[]){
Lion l=new Lion();
System.out.println("Lion Characteristics");
System.out.println(l.isVegetarian());
System.out.println(l.canClimb());
l.getSound();
l.displayinfo();
}
}