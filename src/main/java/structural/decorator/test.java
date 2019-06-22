package structural.decorator;

import java.io.*;

public class test {
    public static void main(String[] args) throws IOException {
        File f = new File("./output.text");
        f.createNewFile();
        OutputStream outputStream = new FileOutputStream(f);

        try (DataOutputStream dataOutputStream = new DataOutputStream(outputStream)) {
            dataOutputStream.writeChars("hello");
        }
        outputStream.close();

        Sandwich sandwich = new DressingDecorator(new MeatDecorator(new SimpleSandwich()));
        System.out.println(sandwich.make());

    }
}
