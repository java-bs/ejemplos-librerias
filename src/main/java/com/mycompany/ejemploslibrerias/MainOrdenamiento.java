package com.mycompany.ejemploslibrerias;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MainOrdenamiento {

    public static void main(String[] args) {

        LocalDate fecha1 = LocalDate.of(1981, 5, 6);
        Persona luis = new Persona("Luis", 38, LocalDate.of(1981, 5, 6));
        Persona pedro = new Persona("Pedro", 26, LocalDate.of(1993, 5, 3));
        Persona marisa = new Persona("Marisa", 54, LocalDate.of(1965, 9, 1));
        Persona axel = new Persona("Axel", 2, LocalDate.of(2017, 2, 22));

//        Una manera de crear listas a partir de vectores

//        Persona[] personasArray = {luis, pedro, marisa, axel};
//        List<Persona> personas
//                = Arrays.asList(personasArray);


//      Otra manera, es crear la lista vacía y agregarle elementos
        ArrayList<Persona> arrayList = new ArrayList();
        arrayList.add(luis);
        arrayList.add(pedro);
        arrayList.add(marisa);

        System.out.println(arrayList.size());
        arrayList.add(axel);
        System.out.println(arrayList.size());

        Comparator<Persona> comparadorEdad = Comparator.comparing(Persona::getEdad);
        arrayList.sort(comparadorEdad);
        
        //Una forma de customizar la comparacion entre elementos
//        arrayList.sort((Persona p1, Persona p2) -> {
//            if (p1.getEdad() < p2.getEdad()) {
//                return -1;
//            } else if (p1.getEdad() > p2.getEdad()) {
//                return 1;
//            } else {
//                return 0;
//            }
//        });
        
        System.out.println(arrayList);

    }

}
