interface animal
{
void speak();
void eat();
}
class cat implements animal
{
public void speak()
{
System.out.print("cats meow");
System.out.println();
}
public void eat()
{
System.out.println("cats are omnivorous");
}
}
class dog implements animal
{
public void speak()
{
System.out.println("dogs bark");
}
public void eat()
{
System.out.println("dogs are omnivorous");
}
}
class mainclass
{
public static void main(String[ ] args)
{
animal a1=new cat();
a1.speak();
a1.eat();
a1=new dog();
a1.speak();
a1.eat();
}
}