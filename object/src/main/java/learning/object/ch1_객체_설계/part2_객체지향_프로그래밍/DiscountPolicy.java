package learning.object.ch1_객체_설계.part2_객체지향_프로그래밍;

import java.util.ArrayList;
import java.util.List;

public abstract class DiscountPolicy {
  private List<DiscountCondition> conditions = new ArrayList<>();

  public DiscountPolicy(DiscountCondition ...conditions) {
    this.conditions = List.of(conditions);
  }

  public Money calculateDiscountAmount(Screening screening) {
    for(DiscountCondition each: conditions) {
      if(each.isSatisfiedBy(screening)) {
        return getDiscountAmount(screening);
      }
    }

    return Money.zero;
  }

  abstract protected Money getDiscountAmount(Screening screening);

}
