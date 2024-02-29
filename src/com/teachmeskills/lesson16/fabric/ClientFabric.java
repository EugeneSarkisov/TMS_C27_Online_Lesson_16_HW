package com.teachmeskills.lesson16.fabric;

/**
 * This class contain fabric for creating Clients list (in other
 * words - simulate database work).
 */

import com.teachmeskills.lesson16.client.Client;
import java.util.HashMap;
import java.util.Map;

public class ClientFabric {
    public static Map<Long, Client> createClientsMap(){
        Client cl1 = new Client(2023, 1111_1111, "Name1", "Surname1",
                25, OrderFabric.genFirstOrder());
        Client cl2 = new Client(2023, 1212_2121, "Name2", "Surname2",
                26, OrderFabric.genSecondOrder());
        Client cl3 = new Client(2024, 1313_3131, "Name3", "Surname3",
                27, OrderFabric.genThirdOrder());
        Map<Long, Client> clients = new HashMap<>();
        clients.put(cl1.getClientPassportNumber(), cl1);
        clients.put(cl2.getClientPassportNumber(), cl2);
        clients.put(cl3.getClientPassportNumber(), cl3);
        return clients;
    }
}
