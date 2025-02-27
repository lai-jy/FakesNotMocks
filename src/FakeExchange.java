public class FakeExchange implements Exchange {
    @Override
    public float rate(String origin, String target) {
        if (origin.equals("USD") && target.equals("Euro")) {
            return 0.85f; // 1 USD = 0.85 Euro
        }
        // if (origin.equals("USD") && target.equals("JPY")) {
        //     return 110.0f; // 1 USD = 110 JPY
        // }
        return 1.0f; 
    }
}
