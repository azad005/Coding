package org.animals;
public class Lion{
String color;
int age;
double weight;
public Lion(){
color="Golden";
age=25;
weight=190;
}
public boolean isVegetarian(){
return false;
}
public boolean canClimb(){
return false;
}
public void getSound(){
System.out.println("roar roar!!");
}
public void displayinfo(){
System.out.println("Lion Color is "+color);
System.out.println("Lion age is "+age);
System.out.println("Lion Weight is"+weight);

}
}