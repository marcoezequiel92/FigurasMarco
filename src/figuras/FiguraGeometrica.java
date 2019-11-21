
package figuras;
import java.awt.Graphics;

public  abstract class FiguraGeometrica {
    private static float area;
    private static float perimetro;

    /**
     * @return the area
     */
    public static float getArea() {
        return area;
    }

    /**
     * @param aArea the area to set
     */
    public static void setArea(float aArea) {
        area = aArea;
    }

    /**
     * @return the perimetro
     */
    public static float getPerimetro() {
        return perimetro;
    }

    /**
     * @param aPerimetro the perimetro to set
     */
    public static void setPerimetro(float aPerimetro) {
        perimetro = aPerimetro;
    }
    public abstract void drawFigure(Graphics g);
    public abstract float Area();
    public abstract float Perimetro();
}
