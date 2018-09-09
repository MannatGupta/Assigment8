abstract class animal
{
 String name,breed,color;
abstract void eat();
void speak()
{
System.out.println("hakuna matata");
}
}
class dog extends animal
{
void eat()
{
System.out.println("dogs eat flesh");
}
}
class mainclass
{
public static void main(String[ ] args)
{
dog d=new dog();
d.eat();
d.speak();
}
}