public class CommandPatternDemo {
    public static void main(String[] args) {
        Stock stock = new Stock();
        Buy buy = new Buy(stock);
        Sell sell = new Sell(stock);

        Invoker invoker = new Invoker();
        invoker.addOrder(buy);
        invoker.addOrder(sell);

        invoker.executeOrder();
    }
}
