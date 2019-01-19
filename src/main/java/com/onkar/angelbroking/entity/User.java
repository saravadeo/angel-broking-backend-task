package com.onkar.angelbroking.entity;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

/**
 * Entity to store user data and respective Card user using
 * 
 * @author Onkar Saravade
 *
 */
@Entity
public class User extends AbstractBaseEntity {

  private static final long serialVersionUID = 1605599574951573034L;

  private String username;

  @OneToOne
  private Card card;

  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
      return true;
    if (!super.equals(obj))
      return false;
    if (getClass() != obj.getClass())
      return false;
    final User other = (User) obj;
    if (username == null) {
      if (other.username != null)
        return false;
    } else if (!username.equals(other.username))
      return false;
    return true;
  }

  public Card getCard() {
    return card;
  }

  public String getUsername() {
    return username;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = super.hashCode();
    result = prime * result + ((username == null) ? 0 : username.hashCode());
    return result;
  }

  public void setCard(final Card card) {
    this.card = card;
  }

  public void setUsername(final String username) {
    this.username = username;
  }

}
