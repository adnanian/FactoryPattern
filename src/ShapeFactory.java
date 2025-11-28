/**
 * Container for all the ways to create instances of different shapes and types.
 */
public class ShapeFactory {

    /**
     * Instantiates and returns a new rectangle.
     *
     * @return a rectangle instance.
     */
    public static Rectangle getRectShape() {
        return new Rectangle();
    }

    /**
     * Instantiates and returns a new circle.
     *
     * @return a circle instance.
     */
    public static Circle getCircleShape() {
        return new Circle();
    }

    /**
     * Instantiates and returns a new square.
     *
     * @return a square instance
     */
    public static Square getSquareShape() {
        return new Square();
    }
}
