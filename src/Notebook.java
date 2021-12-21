public class Notebook {

    public Integer price;
    public Integer RAM;
    public Manufacturer manufacturer;
    public  Notebook(){};

    public Notebook(Integer price, Integer RAM, Manufacturer manufacturer) {
        this.price = price;
        this.RAM = RAM;
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "price=" + price +
                ", RAM=" + RAM +
                ", manufacturer=" + manufacturer +
                '}';
    }

    public String toString(int number) {
        return "notebooks[" + number + "] = new Notebook(" + price + "," + RAM + ",Manufacturer." + manufacturer + ");";
    }


}
