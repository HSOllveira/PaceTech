/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package higor.atividadesemana7;

/**
 *
 * @author Dsrty
 */
public class Empregado { 

    public String primeironome; //variaveis da classe
    public String sobrenome;
    public float salario;
    public float salarioano;

    public Empregado(String primeironome, String sobrenome, float salario) { //construtor da classe
        this.primeironome = primeironome;
        this.sobrenome = sobrenome;
        this.salario = salario;
    }

    public Empregado() { //pra liberar declarar a instancia sem declarar nada no construtor
    }

    public String getPrimeironome() { //getter do nome
        return primeironome;
    }

    public String getSobrenome() { //getter do sobrenome
        return sobrenome;
    }

    public float getSalario() { //getter do salario
        return salario;
    }

    public void setPrimeironome(String primeironome) { //setter do nome
        this.primeironome = primeironome;
    }

    public void setSobrenome(String sobrenome) { //setter do sobrenome
        this.sobrenome = sobrenome;
    }

    public void setSalario(float salario) { //setter do salario
        
        if(salario < 0){ //se o salario for negativo coloca 0
            this.salario = 0;
        }
        else{ //senão coloca salario
            this.salario = salario;
        }
    }
    
    public float CalcularAnual(){//função que retorna o salario anual (float)
        return(salario*12);
    }
    
    public float Aumento10(){ //função que retorna o salario anual com aumento de 10%
        return((CalcularAnual()*1.1f));
    }

}
