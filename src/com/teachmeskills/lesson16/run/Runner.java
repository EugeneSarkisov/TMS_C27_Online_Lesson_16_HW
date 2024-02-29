package com.teachmeskills.lesson16.run;

import com.teachmeskills.lesson16.client.Client;
import com.teachmeskills.lesson16.fabric.ClientFabric;
import com.teachmeskills.lesson16.service.ClientService;

import java.util.Map;

public class Runner {
    public static void main(String[] args) {
        Map<Long, Client> clientList = ClientFabric.createClientsMap();
        ClientService.showClientsInfoWithForEach(clientList);
        ClientService.showClientsInfoWithIterator(clientList);
        ClientService.showClientsKeys(clientList);
        ClientService.showClientsValues(clientList);
    }
}