package learning.object.ch1_객체_설계.part2_객체지향_프로그래밍;

import java.math.BigDecimal;

public class Money {
  public static final Money zero = Money.wons(0);

  private final BigDecimal amount;

  public Money(BigDecimal amount) {
    this.amount = amount;
  }

  public static Money wons(long amount) {
    return new Money(BigDecimal.valueOf(amount));
  }

  public static Money wons(double amount) {
    return new Money(BigDecimal.valueOf(amount));
  }

  public Money plus(Money amount) {
    return new Money(this.amount.add(amount.amount));
  }

  public Money minus(Money amount) {
    return new Money(this.amount.subtract(amount.amount));
  }

  public Money times(double percent) {
    return new Money(this.amount.multiply(BigDecimal.valueOf(percent)));
  }

  public boolean isLessThan(Money amount) {
    return this.amount.compareTo(amount.amount) < 0;
  }

  public boolean isGreaterThanOrEqual(Money other) {
    return amount.compareTo(other.amount) >= 0;
  }

}
