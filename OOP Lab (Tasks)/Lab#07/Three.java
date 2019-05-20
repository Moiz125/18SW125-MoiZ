class Shape
{
    private String color="red";
    private boolean filled=true;
    public Shape(){}
    public Shape(String color,boolean filled)
    {
        this.color=color;
        this.filled=filled;
    }
    public void setColor(String color)
    {
        this.color=color;
    }
    public String getColor()
    {
        return color;
    }
    public void setFilled(boolean filled)
    {
        this.filled=filled;
    }
    public boolean isFilled()
    {
        return filled;
    }
    public String toString()
    {
        return ("[Color="+getColor()+",filled="+isFilled()+"]");
    }
}
class Circle extends Shape
{
    private double radius=1.0;
    public Circle(){}
    public Circle(double radius)
    {
        this.radius=radius;
    }
    public Circle(double radius,String color,boolean filled)
    {
        super(color, filled);
        this.radius=radius;
    }
    public void setRadius(double radius)
    {
        this.radius=radius;
    }
    public double getRadius()
    {
        return radius;
    }
    public double getArea()
    {
        return (3.14*radius*radius);
    }
    public double getPerimeter()
    {
        return (2*3.14*radius);
    }
    public String toString()
    {
        return ("[Color="+getColor()+",filled="+isFilled()+",Radius="+getRadius()+",Area="+getArea()+",Perimeter="+getPerimeter()+"]");
    }
}
class Rectangle extends Shape
{
    private double width=1.0;
    private double length=1.0;
    public Rectangle(){}
    public Rectangle(double width,double length)
    {
        this.width=width;
        this.length=length;
    }
    public Rectangle(double width,double length,String color,boolean filled)
    {
        super(color, filled);
        this.width=width;
        this.length=length;
    }
    public void setWidth(double width)
    {
        this.width=width;
    }
    public double getWidth()
    {
        return width;
    }
    public void setLength(double length)
    {
        this.length=length;
    }
    public double getLength()
    {
        return length;
    }
    public double getArea()
    {
        return (width*length);
    }
    public double getPerimeter()
    {
        return (2*(width+length));
    }
    public String toString()
    {
        return ("[Color="+getColor()+",filled="+isFilled()+",Width="+getWidth()+",Length="+getLength()+",Area="+getArea()+",Perimeter="+getPerimeter()+"]");
    }
}
class Square extends Rectangle
{
    public Square(){}
    public Square(double side)
    {
        setLength(side);
    }
    public Square(double side,String color,boolean filled)
    {
        setLength(side);
        setColor(color);
        setFilled(filled);
    }
    public void setSide(double side)
    {
        setLength(side);
    }
    public double getSide()
    {
        return getLength();
    }
    public void setWidth(double side)
    {
        setWidth(side);
    }
    public void setLength1(double side)
    {
       setLength(side); 
    }
    public String toString()
    {
        return ("[Color="+getColor()+",filled="+isFilled()+",Side="+getLength()+"]");
    }
}
class Three
{
    public static void main(String[]nah)
    {
        Shape shape=new Shape("Red",true);
        Circle circle=new Circle(8.60,"Green",true);
        Rectangle rectangle=new Rectangle(12.3,5,"Yellow",true);
        Square square=new Square(4.0,"Black",true);
        System.out.println(shape.toString());
        System.out.println(circle.toString());
        System.out.println(rectangle.toString());
       System.out.println(square.toString());
    }
}