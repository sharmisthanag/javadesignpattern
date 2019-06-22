package creational.factory;

public class d_Blog extends c_Website {
    public d_Blog(){
        System.out.println("i am done");
    }
    @Override
    protected void createWebsite() {
        System.out.println("invoked inside d_Blog");
        pages.add(new b_CartPage());
        pages.add(new b_AboutPage());
    }
}
