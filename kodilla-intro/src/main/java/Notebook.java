public class Notebook {
    int weight;
    int price;
    int year;

    public Notebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
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

    public void checkWeight() {
        if (this.weight < 600) {
            System.out.println("This notebook is very light.");
        } else if (this.weight > 1200 && this.weight < 1800) {
            System.out.println("The notebook is average weight");
        } else {
            System.out.println("This notebook is very heavy.");
        }
    }

    public void yearOfProduction() {
        if (this.year < 2022) {
            System.out.println("This notebook is young");
        } else if (this.price < 1500 && this.year < 2010) {
            System.out.println("This notebook is old and expensive.");
        } else {
            System.out.println("There is no hope for cheap and good electronic");
        }
    }
}


