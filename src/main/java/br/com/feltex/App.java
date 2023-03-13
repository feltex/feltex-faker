package br.com.feltex;

import java.util.Locale;

import com.github.javafaker.Book;
import com.github.javafaker.Faker;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class App {

    private static final Faker faker = new Faker(Locale.forLanguageTag("pt-br"));

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            log.info(faker.name().fullName());
        }

        for (int i = 0; i < 100; i++) {
            log.info("Numeros aletorios de 0 a 100: {}", faker.random().nextInt(0, 100));
        }

        Book livro = faker.book();

        log.info("Informacao do Livro {} {} {}", livro.author(), livro.title(), livro.publisher());

        for (int i = 0; i < 10; i++) {
            var starTrack = faker.starTrek();
            log.info("Personagem {}, localizacao {}, especie {}, vilão {}", starTrack.character(), starTrack.location(), starTrack.specie(), starTrack.villain());

        }

    }

}
