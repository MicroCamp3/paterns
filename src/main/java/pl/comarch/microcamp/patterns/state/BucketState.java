package pl.comarch.microcamp.patterns.state;

import pl.comarch.microcamp.patterns.Bucket;
import pl.comarch.microcamp.patterns.BucketItem;

public interface BucketState {
  void addPosition(BucketItem bucketItem);

  void pay(String provider, Bucket bucket);
}
