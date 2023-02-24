package pl.comarch.microcamp.patterns.strategy;

import java.util.stream.Collectors;
import pl.comarch.microcamp.patterns.Bucket;
import pl.comarch.microcamp.patterns.BucketItem;

public class BlikStrategy implements PaymentStrategy {
  @Override
  public String key() {
    return "BLIK";
  }

  @Override
  public void pay(Bucket bucket) {
    System.out.println(
        "Operacja płatności BLIK "
            + bucket.getPositions().stream()
                .map(BucketItem::getPrice)
                .collect(Collectors.summingDouble(a -> a)));
  }
}
