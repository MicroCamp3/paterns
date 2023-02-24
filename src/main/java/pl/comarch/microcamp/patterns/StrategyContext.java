package pl.comarch.microcamp.patterns;

import java.util.List;
import pl.comarch.microcamp.patterns.strategy.PaymentStrategy;

public class StrategyContext {

  public StrategyContext(List<PaymentStrategy> paymentStrategies) {
    this.paymentStrategies = paymentStrategies;
  }

  List<PaymentStrategy> paymentStrategies;

  public PaymentStrategy choseProvider(String provider) {
    return paymentStrategies.stream()
        .filter(strategy -> provider.equals(strategy.key()))
        .findFirst()
        .orElseThrow(() -> new NotImplementException());
  }
}
