package br.com.pubproject.domain;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "command")
public class Command implements Serializable {

    private static final long serialVersionUID = -06042017001L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_command")
    private Long idCommand;

    private Calendar date;

    private double totalAmountToPay;

    @OneToOne
    @JoinColumn(name = "id_customer", nullable = false)
    private Customer customer;

    @OneToMany(mappedBy = "command")
    private Set<Items> items;

    public Long getIdCommand() {
        return idCommand;
    }

    public void setIdCommand(Long idCommand) {
        this.idCommand = idCommand;
    }

    public Calendar getDate() {
        return date;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }

    public double getTotalAmountToPay() {
        return totalAmountToPay;
    }

    public void setTotalAmountToPay(double totalAmountToPay) {
        this.totalAmountToPay = totalAmountToPay;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Set<Items> getItems() {
        return items;
    }

    public void setItems(Set<Items> items) {
        this.items = items;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((customer == null) ? 0 : customer.hashCode());
        result = prime * result + ((date == null) ? 0 : date.hashCode());
        result = prime * result + ((idCommand == null) ? 0 : idCommand.hashCode());
        result = prime * result + ((items == null) ? 0 : items.hashCode());
        long temp;
        temp = Double.doubleToLongBits(totalAmountToPay);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Command other = (Command) obj;
        if (customer == null) {
            if (other.customer != null)
                return false;
        } else if (!customer.equals(other.customer))
            return false;
        if (date == null) {
            if (other.date != null)
                return false;
        } else if (!date.equals(other.date))
            return false;
        if (idCommand == null) {
            if (other.idCommand != null)
                return false;
        } else if (!idCommand.equals(other.idCommand))
            return false;
        if (items == null) {
            if (other.items != null)
                return false;
        } else if (!items.equals(other.items))
            return false;
        if (Double.doubleToLongBits(totalAmountToPay) != Double.doubleToLongBits(other.totalAmountToPay))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Command [idCommand=" + idCommand + ", date=" + date + ", totalAmountToPay=" + totalAmountToPay
                + ", customer=" + customer + ", items=" + items + "]";
    }
}
