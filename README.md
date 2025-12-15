 JAVA

 two basic programs

interface Resizable
{
 void resizeWidth(int width);
 void resizeHeight(int height);
}
class Rectangle implements Resizable {
 private int width,height;
 public Rectangle(int width, int height)
 { this.width = width; this.height = height; }
 @Override
 public void resizeWidth(int width)
 { this.width = width; }
 @Override
 public void resizeHeight(int height)
 { this.height = height; }
 public void displayDimensions() {
 System.out.println("Rectangle dimensions: Width = "
 +width+", Height = "+height);
 }
}
public class Main {
 public static void main(String[] args) {
 Rectangle rect = new Rectangle(100, 50);
 System.out.println("Original dimensions:");
 rect.displayDimensions();
 rect.resizeWidth(150); 
 rect.resizeHeight(75);
 System.out.println("After resizing:");
 rect.displayDimensions();
 