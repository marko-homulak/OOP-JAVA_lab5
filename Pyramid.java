import java.util.Objects;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Pyramid implements Solid, Comparable<Pyramid> {
   
    private final double A;

    private final double H;

    private final double volume;

    private final double basisArea;

    private final double fullArea;

    protected String color;

    private double transparency;

    public static final int NUMBER_OF_BASIS_SIDES = 4;

    {
        color = "Grey";
        transparency = 100;
    }

    public Pyramid(double basisSideLength, double height) {
        validate(basisSideLength, height);
        A = basisSideLength;
        H = height;
        volume = (1 / 3.) * pow(A, 2) * H;
        basisArea = pow(A, 2);
        fullArea = pow(A, 2) + 2 * A * sqrt(pow(A / 2., 2) + pow(H, 2));
    }

    private void validate(double basisSideLength, double height) {
        if (basisSideLength <= 0) {
            throw new IllegalArgumentException("Basis side length can't be lesser or equals to 0");
        }
        if (height <= 0) {
            throw new IllegalArgumentException("Height can't be lesser or equals to 0");
        }
    }

    public Pyramid(double basisSideLength, double height, String color) {
        this(basisSideLength, height);
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

    protected void changeTransparency(double transparency) {
        if (transparency < 0) {
            throw new IllegalArgumentException("Transparency can't be less then 0");
        }
        this.transparency = transparency;
    }

    public String getColor() {
        return color;
    }

    @Override
    public int compareTo(Pyramid o) {
        return Double.compare(this.H, o.H);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pyramid that = (Pyramid) o;
        return Double.compare(that.A, A) == 0 &&
                Double.compare(that.H, H) == 0 &&
                Double.compare(that.transparency, transparency) == 0 &&
                Objects.equals(color, that.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(A, H, color, transparency);
    }
    
}
