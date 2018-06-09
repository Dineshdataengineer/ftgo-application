package net.chrisrichardson.ftgo.restaurantorderservice.api;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class CreateTicketReply {
  private long ticketId;

  private CreateTicketReply() {
  }

  public CreateTicketReply(long ticketId) {

    this.ticketId = ticketId;
  }

  @Override
  public String toString() {
    return ToStringBuilder.reflectionToString(this);
  }

  @Override
  public boolean equals(Object o) {
    return EqualsBuilder.reflectionEquals(this, o);
  }

  public void setTicketId(long ticketId) {
    this.ticketId = ticketId;
  }

  public long getTicketId() {
    return ticketId;
  }
}
