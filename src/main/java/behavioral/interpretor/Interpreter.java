package behavioral.interpretor;

@FunctionalInterface
public interface Interpreter<T> {
    public boolean interpret(T t);
}
