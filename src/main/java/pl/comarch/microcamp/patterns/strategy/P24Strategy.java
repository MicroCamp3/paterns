package pl.comarch.microcamp.patterns.strategy;

import java.util.stream.Collectors;
import pl.comarch.microcamp.patterns.Bucket;
import pl.comarch.microcamp.patterns.BucketItem;

public class P24Strategy implements PaymentStrategy {
  @Override
  public String key() {
    return "P24";
  }

  @Override
  public void pay(Bucket bucket) {
    System.out.println(
        "Operacja płatności P24 "
            + bucket.getPositions().stream()
                .map(BucketItem::getPrice)
                .collect(Collectors.summingDouble(a -> a)));
  }
}
