package br.com.feltex.cliente;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Cliente {

    private int id;
    private String nome;
    private String sobrenome;
    private String endereco;
    private String email;
    private String telefone;
    private String cep;
    private String cidade;
    private String estado;

}
