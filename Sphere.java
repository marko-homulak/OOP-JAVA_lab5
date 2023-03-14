import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class Sphere implements Solid {
   
   private final double R;

   private final double volume;

   private final double basisArea;

   private final double fullArea;

   protected String color;

   private double transparency;

   {
      color = "Grey";
      transparency = 100;
   }

   public Sphere(double basisRadius) {
      R = basisRadius;
      volume = (4 / 3.) * PI * pow(R, 3);
      basisArea = PI * pow(R, 2);
      fullArea = 4 * PI * pow(R, 2);
   }

   public Sphere(double basisRadius, String color) {
      this(basisRadius);
      this.color = color;
   }

   @Override
    public double getVolume() {
        return Math.round(volume*100)/100;
    }

    @Override
    public double getBasisArea() {
        return Math.round(basisArea*100)/100;
    }

    @Override
    public double getFullArea() {
        return Math.round(fullArea*100)/100;
    }

   protected void changeTransparency(double transparency){
      if(transparency < 0){
         throw new IllegalArgumentException("Transparency can't be less then 0");
      }
      this.transparency = transparency;
   }

   public String getColor() {
      return color;
   }
   
}
