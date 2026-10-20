enum Laptop {
    Macbook(2000), Dell(1500), HP(1200), Lenovo;

    private int price;

    private Laptop() {
        this.price = 999;
    }

    private Laptop(int price) {
        this.price = price;
        System.out.println("I am in laptop price attached with object");
    }

    int getPrice() {        
        return price;
    }
}

public class Demo {
    public static void main(String[] args) {
        // Laptop lp = Laptop.Macbook;
        // System.out.println(lp.Macbook.name() + " : " + lp.Macbook.getPrice());

        for (Laptop lp : Laptop.values()) {
            System.out.println(lp.name() + " : " + lp.getPrice());
        }

    }
}
