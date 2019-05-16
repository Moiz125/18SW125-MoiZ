class Circle
{
    private double radius;
    private String colour;
    Circle(){}
    public Circle(double radius)
    {
        this.radius=radius;
    }
    public Circle(double radius,String colour)
    {
        this.radius=radius;
        this.colour=colour;
    }
    public void setRadius(double radius)
    {
        this.radius=radius;
    }
    public void setColour(String colour)
    {
        this.colour=colour;
    }
    public double getRadius()
    {
        return radius;
    }
    public String getColour()
    {
        return colour;
    }
    public double getArea()
    {
        return 3.14*radius*radius;
    }
    public String toString()
    {
        return ("Circle[radius="+getRadius()+",colour="+getColour()+"]");
    }

}
class Cylinder extends Circle
{
    private double height=1.0;
    public Cylinder(){}
    public Cylinder(double radius,double height)
    {
        setRadius(radius);
        this.height=height;
    }
    public Cylinder(double radius,double height,String colour)
    {
        setRadius(radius);
        this.height=height;
        setColour(colour);
    }
    public void setHeight(double height)
    {
        this.height=height;
    }
    public double getHeight()
    {
        return height;
    }
    public double getVolume()
    {
        return getRadius()*height;
    }
}
class One
{
    public static void main(String[]nah)
    {
        Circle circle=new Circle(14.4, "Navy Blue");
        Cylinder cylinder=new Cylinder(4.2, 11.4,"Red");
        System.out.println(circle.getArea());
        System.out.println(cylinder.getVolume());
    }
}