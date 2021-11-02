package higor.conversormaven;

package Main;

import java.util.Scanner;

public class Main {

    static int Menu2; //variavel usada no menu de unidades
    static int Menu = 1; //variavel usada no menu de conversões, começa em 1 por causa do loop while para sair do programa
    static float temp, din, cot; //variaveis de float gerais usadas pelo programa
    static boolean FD; // flag booleana usada para saber se usuaário ja fez a conversão

    public static void main(String[] args) { //le main

        Scanner Leitor = new Scanner(System.in); //declaração da variavel usada no scanner
        while (Menu != 0) { //loop do programa que o usário fica enquanto não digita 0 nos menus
            System.out.println("Qual conversão deseja fazer?"); //impressão no console
            System.out.println("1: Temperatura");
            System.out.println("2: Moeda");
            System.out.println("0: Sair");
            Menu = Leitor.nextInt(); //pega o input do usuário para usar no menu de conversões
            
            switch(Menu){ //maquina de estados do menu de conversões
            
                case 1 -> {
                    //caso usuário digitou 1
                    System.out.println("Qual conversão deseja fazer?");
                    System.out.println("1: Celsius para Farenheit");
                    System.out.println("2: Farenheit para Celsius");
                    System.out.println("0: Sair");
                    Menu2 = Leitor.nextInt();
                    switch (Menu2) {
                        //maquina de estados do menu de unidades (usada 2 vezes)
                        
                        case 1 -> {
                            //caso usuário digitopu 1
                            System.out.println("Digite a temperatura em Celsius"); //pergunta temp
                            temp = Leitor.nextFloat(); //lê temp e joga na float temp
                            temp = ConverterCF(temp); //faz a conversão chamando a função ConverterCF, usa temp como argumento e joga o resultado na mesma variavel
                            System.out.println("Isso equivale a:" + temp + "°F."); //imprime resultado
                            FD = true; //seta flag de terminado
                            //fim do case
                        }
                        case 2 -> {
                            System.out.println("Digite a temperatura em Farenheit");
                            temp = Leitor.nextFloat();
                            temp = ConverterFC(temp);
                            System.out.println("Isso equivale a:" + temp + "°C.");
                            FD = true;
                        }
                        default -> // caso usuário tenha digitado algo invalido ou 0 fecha programa
                            Menu = 0;
                    }
                    //maquina de estados do menu de unidades (usada 2 vezes)
                    //fim da maquina de estados da temperatura
                }

                
                case 2 -> {
                    //caso usuário queira converter moedas
                    if (cot == 0) { //caso o programa não tenha uma conversão ainda pergunta ao usuário e salva o resultado (só pergunta uma vez)
                        System.out.println("Por favor, digite a cotação do dolar ex: 4,20");
                        cot = Leitor.nextFloat();
                    }
                    System.out.println("Qual conversão deseja fazer?");//pergunta as unidades a serem convertidas
                    System.out.println("1: Reais para Dolares");
                    System.out.println("2: Dolares para Reais");
                    System.out.println("0: Sair");
                    Menu2 = Leitor.nextInt(); //pega resuktado
                    
                    switch(Menu2){//maquina de estados de unidades

                        case 1 -> {
                            //caso conversão de reais para dolares
                            System.out.println("Digite o valor em Reais a ser convertido");
                            din = Leitor.nextFloat();//pega input e joga na float din
                            din = ConverterRD(din); //chama função para converter usando din e salva o resultado na mesma variavel
                            System.out.println("Isso equvale a:" + din + " Dolare$"); //printa resultado
                            FD = true; //seta flag de terminado
                            //fim desse case
                        }
                        case 2 -> {
                            System.out.println("Digite o valor em Dolares a ser convertido");
                            din = Leitor.nextFloat();
                            din = ConverterDR(din);
                            System.out.println("Isso equvale a:" + din + " Reai$");
                            FD = true;
                        }
                        
                        default -> // caso usuario tenha colocado algum numero invalido ou 0 sai do programma
                            Menu = 0;
                    }
                    //maquina de estados de unidades
                    //fim dessa maquina de estados
                }

            }
            //maquina de estados do menu de conversões

            if (FD) { //caso usuário tenha terminado a sua conversão
                System.out.println("Deseja fazer outra conversão?"); //pergunta se quer repetir
                System.out.println("1: Sim");
                System.out.println("Outro: Não");
                Menu = Leitor.nextInt();
                if (Menu == 1) { //se sim reseta a flag
                    FD = false;
                } else { //se não sai do programa
                    Menu = 0;
                }
            }
        }

    }

    public static float ConverterCF(float temp) { //funçao que converte de celsius para farenheit
        float res = (float) ((temp * 1.8) + 32);
        return res;
    }

    public static float ConverterFC(float temp) { //funçao que converte de farenheit para celsius
        float res = (float) ((temp - 32) * 0.5556);
        return res;
    }

    public static float ConverterRD(float din) { //funçao que converte de reais para dolares
        float res = din / cot;
        return res;
    }

    public static float ConverterDR(float din) { //funçao que converte de dolares para reais
        float res = din * cot;
        return res;
    }
}
