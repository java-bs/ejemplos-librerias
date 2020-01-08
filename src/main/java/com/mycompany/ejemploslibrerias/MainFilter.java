package com.mycompany.ejemploslibrerias;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MainFilter {
    
    public static void main(String[] args) {
        
        Persona luis = new Persona("Luis", 38, LocalDate.of(2019, 05, 06));
        Persona pedro = new Persona("Pedro", 26, LocalDate.of(2019, 05, 03));
        Persona marisa = new Persona("Marisa", 54, LocalDate.of(2019, 05, 01));
        Persona axel = new Persona("Axel", 2, LocalDate.of(2019, 05, 22));
        
        Persona[] personas = {luis, pedro, marisa, axel};
        
        List<Persona> listaPersonas = Arrays.asList(personas);
        
        listaPersonas
                .stream()
                .filter(per -> per.getEdad() > 18)
                .map(per -> per.getEdad())
                .forEach(edad -> System.out.println(edad));
    }
    
}
