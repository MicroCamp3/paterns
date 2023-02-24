package pl.comarch.microcamp.patterns.state;

import java.util.List;
import pl.comarch.microcamp.patterns.Bucket;
import pl.comarch.microcamp.patterns.BucketItem;
import pl.comarch.microcamp.patterns.StrategyContext;
import pl.comarch.microcamp.patterns.strategy.BlikStrategy;
import pl.comarch.microcamp.patterns.strategy.P24Strategy;

public class AcceptedOrderState implements BucketState {
  @Override
  public void addPosition(BucketItem bucketItem) {}

  @Override
  public void pay(String provider, Bucket bucket) {
    new StrategyContext(List.of(new BlikStrategy(), new P24Strategy()))
        .choseProvider(provider)
        .pay(bucket);
    bucket.setState(new PayedState());
  }
}
