
/**
 * @author Scott Dykstra
 */
public class Circle 
{
  private double radius;
  private final double PI = 3.14159;
    

public Circle(double cricRad)
{
    radius = cricRad;
}
 public void setRadius(double cirRad)
 {
     radius= cirRad;
     
 }
 public double getRadius()
 {
     return radius;
 }
 
 public double getArea()
 {
     double area;
    return area = PI*(radius*radius);
 }
 
 public double getDiameter()
 {
     double diameter;
     return diameter = radius*2;
 }
 
 public double getCircumference()
 {
     double circumference;
     return circumference = 2*PI*radius;
     
 }
}
