package behavioral.visitor;

public interface AtvVisitor {

    double visit(Fender fender);

    double visit(Oil oil);

    double visit(PartOrder partOrder);

    double visit(Wheel wheel);
}
