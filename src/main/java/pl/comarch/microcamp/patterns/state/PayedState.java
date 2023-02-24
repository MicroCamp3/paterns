package pl.comarch.microcamp.patterns.state;

import pl.comarch.microcamp.patterns.Bucket;
import pl.comarch.microcamp.patterns.BucketItem;

public class PayedState implements BucketState {
  @Override
  public void addPosition(BucketItem bucketItem) {}

  @Override
  public void pay(String provider, Bucket bucket) {}
}
