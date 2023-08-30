package marcin.com;

import marcin.com.shapes.*;
import marcin.com.visitor.XMLExportVisitor;
public class Main {
    public static void main(String[] args) {

        Dot dot = new Dot(1,10,55);
        Circle circle = new Circle(2,13,15,10);
        Rectangle rectangle = new Rectangle(3,10,17,20,40);

        CompoundShape compoundShape = new CompoundShape(4);
        compoundShape.add(dot);
        compoundShape.add(circle);
        compoundShape.add(rectangle);

        CompoundShape c = new CompoundShape(5);
        c.add(dot);
        compoundShape.add(c);

        export(circle,compoundShape);

    }
    private static void export(Shape... shapes){
        XMLExportVisitor exportVisitor = new XMLExportVisitor();
        System.out.println(exportVisitor.export(shapes));

    }
}
