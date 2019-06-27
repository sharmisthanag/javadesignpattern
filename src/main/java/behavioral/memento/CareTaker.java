package behavioral.memento;

import java.util.Stack;

public class CareTaker {
    private Stack<EmployeeDemoMemento> stack=new Stack<>();

    public void push(EmployeeDemo employee) {
        stack.push(employee.save());
    }

    public void pop(EmployeeDemo employeeDemo) {
        employeeDemo.revertIt(stack.pop());//changing the current employee state to its previous one
    }
}
