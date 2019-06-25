package behavioral.visitor;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.stream.Collectors;

public class AtvVisitorConcrete implements AtvVisitor {
    @Override
    public double visit(Fender fender) {
        return 2;
    }

    @Override
    public double visit(Oil oil) {
        return 9;
    }

    @Override
    public double visit(PartOrder partOrder) {
        return partOrder.parts.stream().map(part ->{
            try {
                Method method=this.getClass().getMethod("visit",part.getClass());
                try {
                    return (double)method.invoke(this,part);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                }
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            }
            return (double)0;
        }).collect(Collectors.summingDouble(Double::doubleValue));
    }

    @Override
    public double visit(Wheel wheel) {
        return 12;
    }
}
