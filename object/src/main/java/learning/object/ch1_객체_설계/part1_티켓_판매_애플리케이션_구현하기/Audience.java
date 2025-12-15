package learning.object.ch1_객체_설계.part1_티켓_판매_애플리케이션_구현하기;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Audience {

  private Bag bag;

  public Long buy(Ticket ticket) {
    if (bag.hasInvitation()) {
      bag.setTicket(ticket);
      return 0L;
    }

    bag.setTicket(ticket);
    bag.minusAmount(ticket.getFee());

    return ticket.getFee();

  }
}
