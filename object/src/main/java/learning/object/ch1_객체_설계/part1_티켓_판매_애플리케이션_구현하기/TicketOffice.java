package learning.object.ch1_객체_설계.part1_티켓_판매_애플리케이션_구현하기;

import java.util.ArrayList;
import java.util.List;

public class TicketOffice {
  private Long amount;
  private List<Ticket> tickets = new ArrayList<>();

  public TicketOffice(Long amount, Ticket ...tickets) {
    this.amount = amount;
    this.tickets.addAll(List.of(tickets));
  }

  public Ticket getTicket() {
    return tickets.remove(0);
  }

  public void plusAmount(Long amount) {
    this.amount += amount;
  }

}
