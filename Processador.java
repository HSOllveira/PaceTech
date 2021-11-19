/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package higor.ui_senana8;

/**
 *
 * @author Dsrty
 */
public class Processador {

    String[] Sin = new String[2]; //array de concatenação
    int Stage = 0; //estagio da operação
    int OP = 0;//1 = SOMA //2=Menos //3-vezes //estados de operação
    String res, Vala, resposta; //strings temporarias
    double Valor1, Valor2, Res; //dobles de calculo para retorno e transformação de volta em string

    public Processador() { //construtor "economico"
    } 

    public void reset() { //função que reseta tudo
        this.Stage = 0;
        Valor1 = 0;
        Valor2 = 0;
        Res = 0;
    }
    
    public void PutNull(){ //função que coloca valores nulos nos arrays de concatenação.
        Sin[0]="";
        Sin[1]="";
    }

    public void resetOP() { //função que zera o estado de operação da calculadora
        this.OP = 0;
    }

    public void setSin(int i, String Sin) { //setter do array de concatenação.
        this.Sin[i] = Sin;
    }

    public void Adicao() { //função de adição
        if (OP != 1) { //caso a operação for diferente de adição
            Vala = Sin[0]; //passa o valor em string para uma variavel temporaria que vai guardar o primeiro numero
            reset(); //reseta a calculadora (para receber o próximo numero).
            OP = 1; //seta o estado de operação para soma(1);
            System.out.println("VALOR A =" + Vala); //debug
        }
    }

    public void Subtracao() { //função de subtração
        if (OP != 2) { //caso a operação for diferente de subtração
            Vala = Sin[0]; //passa o valor em string para uma variavel temporaria que vai guardar o primeiro numero
            reset(); //reseta a calculadora (para receber o próximo numero).
            OP = 2; //seta o estado de operação para subtração(2);
            System.out.println("VALOR A =" + Vala);//debug
        }
    }

    public void Multiplicacao() {
        if (OP != 3) { //caso a operação for diferente de multiplicação
            Vala = Sin[0]; //passa o valor em string para uma variavel temporaria que vai guardar o primeiro numero
            reset(); //reseta a calculadora (para receber o próximo numero).
            OP = 3; //seta o estado de operação para multiplicação
            System.out.println("VALOR A =" + Vala); //debug
        }
    }

    public void Divisao() {
        if (OP != 4) { //caso a operação for diferente de divisão
            Vala = Sin[0]; //passa o valor em string para uma variavel temporaria que vai guardar o primeiro numero
            reset(); //reseta a calculadora (para receber o próximo numero).
            OP = 4; //seta o estado de operação para multiplicação
            System.out.println("VALOR A =" + Vala); //debug
        }
    }

    public String ConcatStrA() { //função que concatena o que tiver no array "Sin" e devolve o valor concatenado
        String res = Sin[0] + Sin[1];
        return res;
    }

    public void Stacker() {
        if (Stage > 0) {  //consulta o estagio caso tiver mais de um numero digitado, concatena o array.
            setSin(0, ConcatStrA());
            reset();
        }
        Stage++; //incrementa o estagio independente se tiver concatenado ou não, isso grante que da proxima vez irá concatenar o array
    }

    public boolean IsNull() { //função pra checar se o array de concatenação possui algum valor valido e retorna true or false (true caso tiver valor nulo ,null)
        if (Sin[0].equals("")) {
            return true;
        } else {
            return false;
        }
    }

    public String igual() { //função que faz a operação e retorna o resultado, esse é o coração da calculadora.

        System.out.println("CHECANDO OPERAÇOES...");//debug
        if (OP == 1) {//caso operação for de adição
            System.out.println("OPERAÇÃO DE ADIÇÃO"); //debug (ja deu pra ver que deu muito bug nesse programa, né?)
            Valor1 = Double.valueOf(Vala); //transforma string de Vala em uma Double e joga em Valor1
            System.out.println("VALOR 1:f" + Valor1); //debug
            Valor2 = Double.valueOf(Sin[0]); //transforma o que tiver no array de concatenação em uma double Valor2
            System.out.println("Valor2:f" + Valor2); //outro debug
            Res = Valor1 + Valor2; //faz a operação de adição das doubles.
            resposta = Double.toString(Res); //transforma a double devolta pra string e retorna valor pro caller da função
        }

        if (OP == 2) { //mesmo da adição
            System.out.println("OPERAÇÃO DE SUBTRAÇAO");
            Valor1 = Double.valueOf(Vala);
            System.out.println("VALOR 1:f" + Valor1);
            Valor2 = Double.valueOf(Sin[0]);
            System.out.println("Valor2:f" + Valor2);
            Res = Valor1 - Valor2;
            resposta = Double.toString(Res);
        }

        if (OP == 3) {//mesmo da subtração
            System.out.println("OPERAÇÃO DE MULTIPLICAÇÃO");
            Valor1 = Double.valueOf(Vala);
            System.out.println("VALOR 1:f" + Valor1);
            Valor2 = Double.valueOf(Sin[0]);
            System.out.println("Valor2:f" + Valor2);
            Res = Valor1 * Valor2;
            resposta = Double.toString(Res);
        }

        if (OP == 4) {//mesmo da multiplicação
            System.out.println("OPERAÇÃO DE DIBISAO");
            Valor1 = Double.valueOf(Vala);
            System.out.println("VALOR 1:f" + Valor1);
            Valor2 = Double.valueOf(Sin[0]);
            System.out.println("Valor2:f" + Valor2);
            Res = Valor1 / Valor2;
            resposta = Double.toString(Res);
        }
        return resposta; //retorno pro caller
    }
}
