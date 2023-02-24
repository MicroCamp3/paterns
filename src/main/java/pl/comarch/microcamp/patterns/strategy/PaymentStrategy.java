package pl.comarch.microcamp.patterns.strategy;

import pl.comarch.microcamp.patterns.Bucket;

public interface PaymentStrategy {
  String key();

  void pay(Bucket bucket);
}
