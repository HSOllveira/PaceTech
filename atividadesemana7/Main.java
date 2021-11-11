/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package higor.atividadesemana7;

import java.util.Scanner;

/**
 *
 * @author Dsrty
 */
public class Main {
    
    public static void main(String[] args) {
        
        Empregado Empregado1 = new Empregado(); //declara empredado 1 sem valores
        Empregado Empregado2 = new Empregado(); //declara empredado 2 sem valores
        
        Scanner Leitor = new Scanner(System.in); //declaração da variavel usada no scanner
        
        System.out.println("Por favor escreva o nome do empregado 1");
        Empregado1.setPrimeironome(Leitor.nextLine()); //pega o primeiro nome digitado e joga na classe empregado1 direto
        System.out.println("Por favor escreva o sobrenome do empregado 1");
        Empregado1.setSobrenome(Leitor.nextLine()); //pega o sobrenome digitado e joga na classe empregado1 direto
        System.out.println("Por favor escreva o salario do empregado 1");
        Empregado1.setSalario(Leitor.nextFloat()); //pega o salario digitado e joga na classe empregado1 direto
        Empregado2.setPrimeironome(Leitor.nextLine());//Gambiarra pra limpar o Scanner, sem isso o programa avança o input do nome do segundo empregado.
        System.out.println("Por favor escreva o nome do empregado 2");
        Empregado2.setPrimeironome(Leitor.nextLine());
        System.out.println("Por favor escreva o sobrenome do empregado 2");
        Empregado2.setSobrenome(Leitor.nextLine());
        System.out.println("Por favor escreva o salario do empregado 2");
        Empregado2.setSalario(Leitor.nextFloat());
        
        //imprime os salarios anuais antigos e novos dos empregados.
        System.out.println(Empregado1.getPrimeironome()+" "+Empregado1.getSobrenome()+" Tem um salario anual de:"+Empregado1.CalcularAnual()+"$.");
        System.out.println(" mas com um aumento de 10%");
        System.out.println(Empregado1.getPrimeironome()+" "+Empregado1.getSobrenome()+" Tem um salario anual de:"+Empregado1.Aumento10()+"$.");
        
        System.out.println(Empregado2.getPrimeironome()+" "+Empregado2.getSobrenome()+" Tem um salario anual de:"+Empregado2.CalcularAnual()+"$.");
        System.out.println(" mas com um aumento de 10%");
        System.out.println(Empregado2.getPrimeironome()+" "+Empregado2.getSobrenome()+" Tem um salario anual de:"+Empregado2.Aumento10()+"$.");
        
    }
    
}
