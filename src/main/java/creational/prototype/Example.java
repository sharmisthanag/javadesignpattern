package creational.prototype;

public class Example implements Cloneable {
    private String name;
    private int id;

    public Example(String name, int id) {
        this.name = name;
        this.id = id;
    }

   /* protected Example clone()  {
        try {
            return (Example) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
*/
    public static void main(String[] args) throws CloneNotSupportedException {
        Example example = new Example("shar",1);
        System.out.println(example+"|"+example.name);
        System.out.println(example.clone()+"|"+example.name);
        System.out.println(example.clone().equals(example));
    }
}
