package behavioral.memento;

import java.io.*;

public class MementoEveryDayDemo {
    public static void main(String[] args) {
        Employee  employee=new Employee("shar","bang","123456789");
        serializeEmp(employee);
        System.out.println(deSerializeEmp());
    }

    private static void serializeEmp(Employee employee) {
        try {
            FileOutputStream fileOutputStream=new FileOutputStream("empSer.text");
            ObjectOutputStream outputStream=new ObjectOutputStream(fileOutputStream);
            outputStream.writeObject(employee);
            outputStream.close();
            fileOutputStream.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    private static Employee deSerializeEmp() {
        Employee employee =null;
        try {
            FileInputStream fileInputStream=new FileInputStream("empSer.text");
            ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
             employee = (Employee) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return employee;

    }


}
class Employee implements Serializable {
    String name;
    String address;
    String phoneNumber;

    public Employee(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
