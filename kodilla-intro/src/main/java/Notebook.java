public class Notebook {
    int weight;
    int price;

    public Notebook(int weight, int price) {
        this.weight = weight;
        this.price = price;
    }

    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is very cheap.");
        } else if (this.price > 600 && this.price < 1000) {
                System.out.println("The price is good");
        } else {
            System.out.println("This notebook is expensive.");
        }
    }
}



