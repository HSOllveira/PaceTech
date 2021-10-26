/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hsolliveira.conversor_de_temp_4_em_java;

import java.io.*;

/**
 *
 * @author higor.oliveira
 */
public class Main {

    static float[] tempr = new float[5];
    static float[] tempc = new float[5];
    static int[] hora = new int[5];
    static int Menu = 0;

    public static void main(String[] args)
            throws IOException {

        System.out.println("Qual conversão fazer?");
        System.out.println("1: Celsius para Farenheit");
        System.out.println("2: Farenheit para Celsius");
        System.out.println("0: Sair");
        Menu = Integer.parseInt(Leitor());
        if (Menu != 0) {
            PegaDados();
            Ordenador();
            if (Menu == 1) {
                for (int x = 1; x <= 4; x++) {
                    System.out.println("Temperatura: " + tempr[x] + "ºC, registrada ás: " + hora[x] + "h  corresponde a: " + tempc[x] + "ºF.");
                }
            }
            else {
                for (int x = 1; x <= 4; x++) {
                    System.out.println("Temperatura: " + tempr[x] + "ºF, registrada ás: " + hora[x] + "h  corresponde a: " + tempc[x] + "ºC.");
                }
            }
        }
        else {
            System.exit(0);
    }
}

public static void Ordenador()
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

    public static void PegaDados()
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

    public static String Leitor()
            throws IOException {
        String dados;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        dados = reader.readLine();
        return dados;
    }

    public static float ConverterCF(float temp) {
        float res = (float) ((temp * 1.8) + 32);
        return res;
    }

    public static float ConverterFC(float temp) {
        float res = (float) ((temp - 32) * 0.5556);
        return res;
    }
}
