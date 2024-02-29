package com.teachmeskills.lesson16.client;

/**
 * This class contain pattern for client objects.
 */

import com.teachmeskills.lesson16.product.Product;
import java.util.List;

public class Client {
    private int clientYearOfRegistration;
    private long clientPassportNumber;
    private String clientName;
    private String clientSurname;
    private int clientAge;
    private List<Product> clientOrder;

    public Client(int clientYearOfRegistration, long clientPassportNumber, String clientName, String clientSurname, int clientAge, List<Product> clientOrder) {
        this.clientYearOfRegistration = clientYearOfRegistration;
        this.clientPassportNumber = clientPassportNumber;
        this.clientName = clientName;
        this.clientSurname = clientSurname;
        this.clientAge = clientAge;
        this.clientOrder = clientOrder;
    }

    public int getClientYearOfRegistration() {
        return clientYearOfRegistration;
    }

    public void setClientYearOfRegistration(int clientYearOfRegistration) {
        this.clientYearOfRegistration = clientYearOfRegistration;
    }

    public long getClientPassportNumber() {
        return clientPassportNumber;
    }

    public void setClientPassportNumber(long clientPassportNumber) {
        this.clientPassportNumber = clientPassportNumber;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getClientSurname() {
        return clientSurname;
    }

    public void setClientSurname(String clientSurname) {
        this.clientSurname = clientSurname;
    }

    public int getClientAge() {
        return clientAge;
    }

    public void setClientAge(int clientAge) {
        this.clientAge = clientAge;
    }

    public List<Product> getClientOrder() {
        return clientOrder;
    }

    public void setClientOrder(List<Product> clientOrder) {
        this.clientOrder = clientOrder;
    }

    @Override
    public String toString() {
        return "Client{" +
                 + clientYearOfRegistration +
                ", " + clientPassportNumber +
                ", " + clientName +
                ", " + clientSurname +
                ", " + clientAge +
                ", " + clientOrder +
                '}';
    }
}

