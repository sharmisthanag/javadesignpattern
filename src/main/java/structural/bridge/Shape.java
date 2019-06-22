package structural.bridge;

public abstract class Shape {
    private Color color;
    public Color getColor() {
        return color;
    }

    public Shape(Color color){
        this.color = color;
    }
    public abstract void applyColorOnMe();
}
