package br.com.meubuscadordecep.cliente;

import br.com.meubuscadordecep.dominio.Endereco;
import br.com.meubuscadordecep.viacep.ServicoDeCep;

import java.util.Scanner;

public class Cep {
    public static void main(String[] args) throws Exception {
        System.out.print("Informe seu CEP: ");
        String cep = new Scanner(System.in).nextLine();
        Endereco endereco = ServicoDeCep.buscaEnderecoPelo(cep);

        System.out.println("logradouro: " + endereco.getLogradouro());
        System.out.println("bairro: " + endereco.getbairro());
        System.out.println("localidade: " + endereco.getlocalidade());
    }

}