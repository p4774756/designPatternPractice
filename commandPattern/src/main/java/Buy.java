public class Buy implements Order{
    Stock stock;
    public Buy(Stock stock) {
        this.stock = stock;
    }
    @Override
    public void execute() {
        stock.buy();
    }
}
