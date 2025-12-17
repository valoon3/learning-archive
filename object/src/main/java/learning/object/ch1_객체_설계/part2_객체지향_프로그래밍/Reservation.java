package learning.object.ch1_객체_설계.part2_객체지향_프로그래밍;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Reservation {
  private Customer customer;
  private Screening screening;
  private Money fee;
  private int audienceCount;

}
