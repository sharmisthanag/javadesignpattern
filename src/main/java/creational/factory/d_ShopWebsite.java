package creational.factory;

public class d_ShopWebsite extends c_Website {
    @Override
    protected void createWebsite() {
        System.out.println("invoked inside d_ShopWebsite");
        pages.add(new b_CartPage());
        pages.add(new b_AboutPage());
        pages.add(new b_ItemPage());
        pages.add(new b_SearchPage());
    }
}
