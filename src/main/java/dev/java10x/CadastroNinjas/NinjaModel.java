package dev.java10x.CadastroNinjas;
import jakarta.persistence.*;

// JPA - Java persistence API
@Entity // transforma uma classe em uma entidade de bd
@Table(name = "tb_cadastro")

public class NinjaModel {

    @Id //id é responsável por criar uma sequencia de dados, 1,2,3, cada um tem um id unico
            @GeneratedValue(strategy = GenerationType.IDENTITY) // gerado automatico com numeros sequencias
    Long id;
    String nome;
    String email;
    int idade;

    public NinjaModel() {
    }

    public NinjaModel(int idade, String email, String nome) {
        this.idade = idade;
        this.email = email;
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

