package pl.comarch.microcamp.patterns;

import pl.comarch.microcamp.patterns.state.AcceptedOrderState;

public class ShopBucketApplication {

  public static void main(String[] args) {

    Bucket bucket = new Bucket();

    String provider = "BLIK";

    bucket
        .addPosition(new BucketItem(1, "Pozycja 1", 1, 0.1d))
        .addPosition(new BucketItem(1, "Pozycja 2", 1, 0.2d));

    bucket.setState(new AcceptedOrderState());

    bucket.addPosition(new BucketItem(1, "Pozycja 3", 1, 0.2d));

    bucket.pay(provider);
    bucket.pay(provider); // płatność nie wykona się ponownie, bo zmieniony został stan
  }
}
