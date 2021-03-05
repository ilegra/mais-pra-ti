package com.fhfelipefh;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Candidatos> candidatos = new ArrayList<>();
        candidatos.add(new Federal(1,"felipe"));
        candidatos.add(new Federal(2,"Java"));
        candidatos.add(new Estadual(3,"IDE"));
        candidatos.add(new Estadual(4,"Lore"));
        candidatos.add(new Estadual(5,"ipsum h"));
        candidatos.add(new Federal(5,"Lore ipsum"));

        int opcao;
        System.out.println("SISTEMA ELEITORAL 2021 || VOTAÇÃO PARA DEPUTADO");
        System.out.println("Buscar Candidato = ");
        opcao = scanner.nextInt();

        for(int i = 0; i < candidatos.size(); i++) {
                candidatos.get(i).verificar(opcao);
                scanner.close();
        }


        System.out.println("FIM");



        }
    }

