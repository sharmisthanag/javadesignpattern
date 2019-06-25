package behavioral.visitor;

public class Wheel implements AtvPart {
    @Override
    public double accept(AtvVisitor atvVisitor) {
        return atvVisitor.visit(this);
    }
}
