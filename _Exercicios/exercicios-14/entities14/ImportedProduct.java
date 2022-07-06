package entities14;

public class ImportedProduct extends Product {

    private Double customFee;

    public ImportedProduct() {
        super();
    }

    public ImportedProduct(String name, Double price, Double customFee) {
        super(name, price);
        this.customFee = customFee;
    }

    public Double totalPrice() {
        return price + customFee;
    }

    @Override
    public String priceTag() {
        return name + " R$ " + totalPrice() + " ( Customs fees R$ " + customFee + ")";
    }

}
