package learning.object.ch1_객체_설계.part1_티켓_판매_애플리케이션_구현하기;

import lombok.Getter;

@Getter
public class TicketSeller {

  private TicketOffice ticketOffice;

  public TicketSeller(TicketOffice ticketOffice) {
    this.ticketOffice = ticketOffice;
  }

  public void sellTo(Audience audience) {
    ticketOffice.plusAmount(audience.buy(ticketOffice.getTicket()));
  }
}