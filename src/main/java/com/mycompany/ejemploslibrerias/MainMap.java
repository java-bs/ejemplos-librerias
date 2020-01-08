package com.mycompany.ejemploslibrerias;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MainMap {

    public static void main(String[] args) {

        Pedido pedido1 = new Pedido(
                LocalDateTime.of(2019, 05, 22, 12, 00),
                LocalDateTime.of(2019, 05, 22, 12, 43));
        Pedido pedido2 = new Pedido(
                LocalDateTime.of(2019, 05, 22, 12, 02),
                LocalDateTime.of(2019, 05, 22, 12, 16));
        Pedido pedido3 = new Pedido(
                LocalDateTime.of(2019, 05, 22, 13, 05),
                LocalDateTime.of(2019, 05, 22, 13, 9));

        Map<String, Pedido> direccionesPedidos = new HashMap<String, Pedido>();

        direccionesPedidos.put("Suipacha 72", pedido1);
        direccionesPedidos.put("Mayo 435", pedido2);
        direccionesPedidos.put("Rivadavia 4857", pedido3);

        Pedido pedidoObtenido = direccionesPedidos.get("Suipacha 72");

        System.out.println(pedidoObtenido);

        Set<String> claves = direccionesPedidos.keySet();

        for (String clave : claves) {
            System.out.println(clave);
        }

        direccionesPedidos.forEach((dir, ped) -> System.out.println(dir + ":::: " + ped));
    }

}
