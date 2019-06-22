package creational.factory;

import java.util.ArrayList;
import java.util.List;

public abstract class c_Website {

    protected List<a_Page>  pages = new ArrayList<>();
    public c_Website(){
        this.createWebsite();
        System.out.println(this.getClass());
        System.out.println(this.getPages().size());
    }

    protected abstract void createWebsite();

    public List<a_Page> getPages() {
        return pages;
    }
}
