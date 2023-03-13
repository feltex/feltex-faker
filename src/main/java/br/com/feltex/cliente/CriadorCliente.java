package br.com.feltex.cliente;

import java.util.Locale;

import com.github.javafaker.Faker;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CriadorCliente {

    private static final Faker faker = new Faker(Locale.forLanguageTag("pt-br"));

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            var cliente = new Cliente();
            cliente.setId(faker.random().nextInt(1, 1000));
            cliente.setNome(faker.name().firstName());
            cliente.setSobrenome(faker.name().lastName());
            cliente.setEmail(cliente.getNome() + cliente.getSobrenome() + "@feltex.com.br");
            cliente.setTelefone(faker.numerify("9####-####"));
            cliente.setEndereco(faker.address().fullAddress());
            cliente.setCep(faker.address().zipCode());
            cliente.setCidade(faker.address().city());
            cliente.setEstado(faker.address().state());
            log.info("Cliente: {}", cliente);
        }
    }

}
