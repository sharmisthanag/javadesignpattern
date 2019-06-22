package structural.composite;

import java.util.ArrayList;
import java.util.List;

public abstract class MenuComponent {
    private String url;
    private String name;
    List<MenuComponent> menuComponents = new ArrayList<>();

    public MenuComponent(String url, String name) {
        this.url = url;
        this.name = name;
    }

    public void add(MenuComponent menuComponent) {
        throw new RuntimeException("Not Supported");
    }

    public void remove(MenuComponent menuComponent) {
        throw new RuntimeException("Not Supported");
    }

    public abstract String toString();

    public String print() {
        StringBuilder stringBuilder = new StringBuilder(name);
        stringBuilder.append(":");
        stringBuilder.append(url);
        stringBuilder.append("\n");
        return stringBuilder.toString();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
