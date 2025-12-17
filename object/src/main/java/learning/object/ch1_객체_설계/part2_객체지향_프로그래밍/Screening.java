package learning.object.ch1_객체_설계.part2_객체지향_프로그래밍;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Screening {
  private Movie movie;
  private int sequence;
  private LocalDateTime whenScreened;

  public LocalDateTime getStartTime() {
    return whenScreened;
  }

  public boolean isSequence(int sequence) {
    return this.sequence == sequence;
  }

  public Money getMovieFee() {
    return movie.getFee();
  }

  private Money calculateFee(int audienceCount) {
    return movie.calculateMovieFee(this).times(audienceCount);
  }

}
