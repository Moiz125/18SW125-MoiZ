class Test
{
String str = "a";
void A()
{
try
{
str +="b";
B();
}
catch (Exception e)
{
str += "c";
}
}
void B() throws Exception
{
try
{
str += "d";
C();
}
catch(Exception e)
{
throw new Exception();
}
finally
{
str += "e";
}
str += "f";
}
void C() throws Exception
{
throw new Exception();
}
void display()
{
System.out.println(str);
}
public static void main(String[] args)
{
Test object = new Test();
object.A();
object.display();
}
}
//We have an instance String variable assigned value of "a" and made a number of methods to concat some values to that String variable.

/*We made an object of our class Test in the main body then we called the method A() using object.
When method A() is called  inside its try "b" is concatinated in that String variable and then B() method is called and "d" is added
to That String variable The C() method is called and then the finally method of the B() is executed and in last the try of A() is 
terminated and outside of try "c" is concatinated into that String. We used display() to display the String on Screen */
