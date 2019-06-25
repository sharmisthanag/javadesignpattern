package behavioral.interpretor;

public class AndInterpreter<T> implements Interpreter<T>{
    Interpreter<T> interpreter;
    Interpreter<T> interpreter1;

    public AndInterpreter(Interpreter<T> interpreter, Interpreter<T> interpreter1) {
        this.interpreter = interpreter;
        this.interpreter1 = interpreter1;
    }

    @Override
    public boolean interpret(T t) {
           return interpreter1.interpret(t) && interpreter.interpret(t);
    }
}
