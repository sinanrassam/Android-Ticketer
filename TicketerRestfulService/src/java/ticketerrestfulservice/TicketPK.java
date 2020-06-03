/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticketerrestfulservice;

import java.io.Serializable;


public class TicketPK implements Serializable {

    public String username;

    public TicketPK(String username) {
        this.username = username;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof TicketPK)) {
            return false;
        } else {
            boolean isEqual = false;
            TicketPK other = (TicketPK) obj;

            if ((username != null) && (other.username != null)) {
                isEqual = username.equals(other.username);
            }

            return isEqual;
        }
    }

    @Override
    public int hashCode() {
        int hashCode = 0;
        if (username != null) {
            hashCode ^= username.hashCode();
        }
        return hashCode;
    }

}
