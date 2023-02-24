package pl.comarch.microcamp.patterns.state;

import pl.comarch.microcamp.patterns.Bucket;
import pl.comarch.microcamp.patterns.BucketItem;

public class NewStateBucket implements BucketState {
  private final Bucket bucket;

  public NewStateBucket(Bucket bucket) {

    this.bucket = bucket;
  }

  @Override
  public void addPosition(BucketItem bucketItem) {
    bucket.getPositions().add(bucketItem);
  }

  @Override
  public void pay(String provider, Bucket bucket) {
    System.out.println("Koszyk ma zły status");
  }
}
