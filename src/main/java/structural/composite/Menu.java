package structural.composite;
/*
Composite of Composite pattern
 */
public class Menu extends MenuComponent {
    public Menu(String url, String name) {
        super(url, name);
    }

    @Override
    public void add(MenuComponent menuComponent) {
        super.menuComponents.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        super.menuComponents.remove(menuComponent);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.print());
        super.menuComponents.stream().forEach(menuComponent -> stringBuilder.append(menuComponent.toString()));
        return stringBuilder.toString();
    }
}
