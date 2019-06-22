package structural.facade;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

public class test {
    public static void main(String[] args) throws MalformedURLException {
        URL url=new URL("https","www.geeksforgeeks.org","/url-class-java-examples");//facade pattern
        try {
            BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(url.openStream()));//decorator pattern
            bufferedReader.lines().forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
