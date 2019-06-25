package behavioral.visitor;

public class Oil implements AtvPart {
    @Override
    public double accept(AtvVisitor atvVisitor) {
        return atvVisitor.visit(this);
    }
}
