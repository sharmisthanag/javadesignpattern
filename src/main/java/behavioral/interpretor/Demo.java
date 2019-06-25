package behavioral.interpretor;

import java.util.StringTokenizer;

public class Demo {
    public static void main(String[] args) {
        //terminal expression , "hello" is data
        Interpreter<String> hello=(sentence)->{
            StringTokenizer stringTokenizer=new StringTokenizer(sentence);
            while (stringTokenizer.hasMoreElements()){
                if (stringTokenizer.nextToken().compareTo("hello")==0) return true;
            }
            return false;
        };
        //terminal expression,"are is data"
        Interpreter<String> are=(sentence)->{
            StringTokenizer stringTokenizer=new StringTokenizer(sentence);
            while (stringTokenizer.hasMoreElements()){
                if (stringTokenizer.nextToken().compareTo("are")==0) return true;
            }
            return false;
        };

       AndInterpreter<String> andInterpreter=new AndInterpreter<>(hello,are);
       //client
        System.out.println(andInterpreter.interpret("hello how are,khana khake jana"));
        System.out.println(andInterpreter.interpret("are,khana khake jana"));
    }
}
