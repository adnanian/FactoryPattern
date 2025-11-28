//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Shape rect = ShapeFactory.getRectShape();
    rect.draw();

    Shape circle = ShapeFactory.getCircleShape();
    circle.draw();

    Shape square = ShapeFactory.getSquareShape();
    square.draw();
}
