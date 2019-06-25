package behavioral.visitor;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PartOrder implements AtvPart {
    List<AtvPart> parts = new ArrayList<>();

    public void addOrder(AtvPart atvPart) {
        parts.add(atvPart);
    }

    @Override
    public double accept(AtvVisitor atvVisitor) {
        return atvVisitor.visit(this);
    }

}
