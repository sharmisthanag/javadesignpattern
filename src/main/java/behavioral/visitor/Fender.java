package behavioral.visitor;

public class Fender implements AtvPart {
    @Override
    public double accept(AtvVisitor atvVisitor) {
        return atvVisitor.visit(this);
    }
}
