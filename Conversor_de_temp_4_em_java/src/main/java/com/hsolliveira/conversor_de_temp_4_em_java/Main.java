/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hsolliveira.conversor_de_temp_4_em_java;

import java.io.*; //Imports de io para dados no console

/**
 *
 * @author higor.oliveira
 */
public class Main {

    static float[] tempr = new float[5]; //array de dados float de temperatura que o usuário colocou
    static float[] tempc = new float[5]; //array de dados float de temperatura convertidas pelo programa
    static int[] hora = new int[5]; //array de dados int que armazena as horas das medições
    static int Menu = 0; //estágio do menu

    public static void main(String[] args) //le main
            throws IOException {

        System.out.println("Qual conversão fazer?");//Escreve dados no console
        System.out.println("1: Celsius para Farenheit");
        System.out.println("2: Farenheit para Celsius");
        System.out.println("0: Sair");
        Menu = Integer.parseInt(Leitor()); //pega dado que o usuário digitou em string, converte para int e armazena em "menu"
        if (Menu != 0) { // se usuário quer converter...
            PegaDados(); // chama method que pega os dados e converte as temps
            Ordenador(); // chama method que ordena os dados em ordem crescente via bublesort
            if (Menu == 1) { //se usuário conveteu de Celsius para Farenheit...
                for (int x = 1; x <= 4; x++) { //printa os dados na tela sequencialmente dos arrays (4x)
                    System.out.println("Temperatura: " + tempr[x] + "ºC, registrada ás: " + hora[x] + "h  corresponde a: " + tempc[x] + "ºF.");
                }
            }
            else { //se usuário conveteu de Farenheit para Celsius...
                for (int x = 1; x <= 4; x++) { //printa os dados na tela sequencialmente dos arrays (4x)
                    System.out.println("Temperatura: " + tempr[x] + "ºF, registrada ás: " + hora[x] + "h  corresponde a: " + tempc[x] + "ºC.");
                }
            }
        }
        else { //se usuárioo colocou 0 no menu...
            System.exit(0); //Fecha tudo
    }
} //fim do main

public static void Ordenador() //method que ordena os dados dentro dos arrays via bublesort
            throws IOException {
        float trocaa, trocab;
        int trocah;

        for (int i = 1; i <= 4; i++) {
            for (int j = i + 1; j <= 4; j++) {
                if (tempr[i] > tempr[j]) {
                    trocaa = tempr[i];
                    trocab = tempc[i];
                    trocah = hora[i];
                    tempr[i] = tempr[j];
                    tempc[i] = tempc[j];
                    hora[i] = hora[j];
                    tempr[j] = trocaa;
                    tempc[j] = trocab;
                    hora[j] = trocah;
                }
            }
        }
    }

    public static void PegaDados() //method que pergunta os dados para o usuário e armazena nos arrays
            throws IOException {
        for (int i = 1; i < 5; i++) {
            System.out.println("Digite a temperatura " + i + ": ");
            tempr[i] = Integer.parseInt(Leitor());
            System.out.println("Digite a hora que a temperatura foi lida: ");
            hora[i] = Integer.parseInt(Leitor());
            if (Menu == 1) {
                tempc[i] = ConverterCF(tempr[i]);
            } else {
                tempc[i] = ConverterFC(tempr[i]);
            }
        }
    }

    public static String Leitor() //função sem argumento que lê os dados que o usuário colocou no console (parecido com leia do visualg)
            throws IOException {
        String dados;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        dados = reader.readLine();
        return dados;
    }

    public static float ConverterCF(float temp) { //funçao que converte de celsius para farenheit
        float res = (float) ((temp * 1.8) + 32);
        return res;
    }

    public static float ConverterFC(float temp) { //funçao que converte de celsius para farenheit
        float res = (float) ((temp - 32) * 0.5556);
        return res;
    }
}
