package pl.comarch.microcamp.patterns;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import org.junit.jupiter.api.Test;
import pl.comarch.microcamp.patterns.strategy.BlikStrategy;
import pl.comarch.microcamp.patterns.strategy.P24Strategy;
import pl.comarch.microcamp.patterns.strategy.PaymentStrategy;

class StrategyContextTest {
  @Test
  void shouldUseCorrectStrategyWhenProviderIsP24() {
    PaymentStrategy strategy =
        new StrategyContext(List.of(new BlikStrategy(),
                new P24Strategy())).choseProvider("P24");
    assertThat(strategy).isInstanceOf(P24Strategy.class);
  }
}
