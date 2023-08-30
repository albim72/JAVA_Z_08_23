package marcin.com.visitor;

import marcin.com.shapes.Dot;
import marcin.com.shapes.Circle;
import marcin.com.shapes.Rectangle;
import marcin.com.shapes.CompoundShape;
public interface Visitor {
    String visitDot(Dot dot);
    String visitCircle(Circle circle);
    String visitRectangle(Rectangle rectangle);
    String visitCompoundGraphic(CompoundShape cg);
}
