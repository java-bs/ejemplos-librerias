package com.mycompany.ejemploslibrerias;

import java.util.Locale;
import org.apache.commons.text.RandomStringGenerator;
import org.apache.commons.text.WordUtils;
import org.apache.commons.text.similarity.FuzzyScore;
import org.apache.commons.text.similarity.LevenshteinDistance;

public class MainText {

    public static void main(String[] args) {

        String texto = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin at dolor est.";
        String textoMayus = WordUtils.capitalize(texto);
        System.out.println(textoMayus);

        System.out.println("////////////////////");
        RandomStringGenerator generator = new RandomStringGenerator.Builder().withinRange('a', 'z').build();
        String randomLetters = generator.generate(20);
        System.out.println("Random: " + randomLetters);

        String palabraOriginal = "Programación";
        String palabraParecida = "Programsion";
        
        System.out.println("////////////////////");
        FuzzyScore fuzzyScore = new FuzzyScore(Locale.US);
        Integer puntajeFuzzy = fuzzyScore.fuzzyScore(palabraOriginal, palabraParecida);
        System.out.println(
                String.format("Puntaje de similaritud entre '{}' y '{}': {}", palabraOriginal, palabraParecida, puntajeFuzzy)
        );

        System.out.println("////////////////////");
        Integer puntajeLev = new LevenshteinDistance()
                .apply(palabraOriginal, palabraParecida);
        System.out.println(
                String.format("Distancia entre '{}' y '{}': {}", palabraOriginal, palabraParecida, puntajeLev)
        );

    }

}
