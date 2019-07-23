package lab08;
class Parent
{
    final public String getName()
    {
        return "Mohammad MoiZ";
    }
}
class Child extends Parent
{
    // This method will gave an Error that final method can't be overriden
        public String getName()
    {
        return "Muhammad Yasir";
    }    
}