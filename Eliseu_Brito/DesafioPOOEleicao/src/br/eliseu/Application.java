package br.eliseu;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        System.out.println("Digite o numero do Candidato: ");
        Scanner sc = new Scanner(System.in);
        Integer numeroCandidato = sc.nextInt();
        Eleicao eleicao = new Eleicao(numeroCandidato);
        if(eleicao.numeroCandidato>=1000 && eleicao.numeroCandidato<=9999) {
            Deputado federal = new Federal(eleicao);
            federal.tipoDeputado();
        } else if (eleicao.numeroCandidato>=10000 && eleicao.numeroCandidato<=99999) {
            Deputado estadual = new Estadual(eleicao);
            estadual.tipoDeputado();
        } else {
            System.out.println("Número inválido. Numeração de Deputado Federal deve ter quatro digitos e Deputado Estadual cinco digitos");
        }
    }

}
