package com.teachmeskills.lesson16.service;

/**
 * This class contain service clients methods (to show information
 * about client, and his order in different ways).
 */

import com.teachmeskills.lesson16.client.Client;
import java.util.Iterator;
import java.util.Map;

public class ClientService {

    public static void showClientsInfoWithForEach(Map<Long, Client> clientMap) {
        for (Map.Entry<Long, Client> entry : clientMap.entrySet()) {
            System.out.println(entry.getKey() + " - > " + entry.getValue().toString());
        }
    }

    public static void showClientsInfoWithIterator(Map<Long, Client> clientMap) {
        Iterator<Map.Entry<Long, Client>> iterator = clientMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Long, Client> clientEntry = iterator.next();
            Long passNumber = clientEntry.getKey();
            Client client = clientEntry.getValue();
            System.out.println("Key: " + passNumber + ", Client: " + client);
        }

    }

    public static void showClientsKeys(Map<Long, Client> clientMap) {
        System.out.println(clientMap.keySet());
    }

    public static void showClientsValues(Map<Long, Client> clientMap) {
        System.out.println(clientMap.values());
    }
}
