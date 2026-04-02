import java.util.List;

public class CheckoutService {

    public int totalInPence(List<String> items) {
        int total = 0;

        for (String item : items) {
            if ("Apple".equalsIgnoreCase(item)) {
                total += 60;
            } else if ("Orange".equalsIgnoreCase(item)) {
                total += 25;
            } else {
                throw new IllegalArgumentException("Unknown item: " + item);
            }
        }

        return total;
    }
}