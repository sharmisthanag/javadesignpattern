package structural.composite;

public class Test {
    /*
    Menu,MenuItem,MenuComponent
     */
    public static void main(String[] args) {
        Menu mainMenu = new Menu("/main", "main");
        MenuItem safety = new MenuItem("/safety", "safety");
        mainMenu.add(safety);
        Menu claimsSubMenu = new Menu("/claim", "claim");
        MenuItem hospitality = new MenuItem("/hospitality", "hospitality");
        claimsSubMenu.add(hospitality);
        System.out.println(mainMenu);
        mainMenu.add(claimsSubMenu);
        System.out.println("**************");
        System.out.println(mainMenu);

    }
}
