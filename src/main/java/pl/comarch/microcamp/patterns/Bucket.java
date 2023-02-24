package pl.comarch.microcamp.patterns;

import java.util.ArrayList;
import java.util.List;
import pl.comarch.microcamp.patterns.state.BucketState;
import pl.comarch.microcamp.patterns.state.NewStateBucket;

public class Bucket {

  BucketState state = new NewStateBucket(this);
  List<BucketItem> items = new ArrayList<>();

  public List<BucketItem> getPositions() {
    return items;
  }

  public void setState(BucketState state) {
    this.state = state;
  }

  Bucket addPosition(BucketItem bucketItem) {
    state.addPosition(bucketItem);
    return this;
  }

  public void pay(String provider) {
    state.pay(provider, this);
  }
}
