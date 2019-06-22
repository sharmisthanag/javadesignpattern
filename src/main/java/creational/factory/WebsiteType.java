package creational.factory;

public enum WebsiteType {
    BLOG(d_Blog.class), SHOPPING(d_ShopWebsite.class);
    Class websiteClass;

    WebsiteType(Class clazz) {
        this.websiteClass = clazz;
    }
}
