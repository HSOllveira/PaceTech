algoritmo "Pega dados de 4 leituras de temperatura e o horário que foram feitas, converte de farenheit para celsius e vice versa e as ordena em ordem crescente."
// Função :   Loga 4 temperaturas e as horas que foram medidas, faz conversão
//            e as ordena em ordem crescente
// Autor : Higor (HSOliveira)
// Data : 25/10/21

funcao conversorcf (temp: real): real //conversor de celsius para farenheit

var
aux: real

inicio

aux <- temp * 1.8 + 32
retorne aux

fimfuncao

funcao conversorfc (temp: real): real //conversor de farenheit para celsius

var
aux: real

inicio

aux <- 5*(temp-32)/9
retorne aux

fimfuncao

//////////////////////////////// INICIO DO PROGRAMA ///////////////////////
var
sair: logico
repetir, numero, menu, i, j: inteiro
trocatc, trocatr, trocah: real
leiturat, leiturah, celsius, farenheit: vetor [1..4] de real
inicio
repita
    numero <- 1 //Reseta a contagem de temp
    escreval("")
    escreval("Escolha a conversão a ser feita")
    escreval("1: Farenheit para Celsius")
    escreval("2: Celsius para Farenheit")
    escreval("0: Sair")
    leia(menu) //Lê o input do usuario e armazena em menu
    se menu = 1 entao //se farenheit para celsius
        para numero de 1 ate 4 faca //pede para o usuário colocar os dados 4x
            escreval("Digite a temperatura nº", numero)
            leia(leiturat[numero])//joga leitura do usuario no array leiturat de mesmo numero do loop
            repita //repita de checagem pra ver se a hora é valida (meio preguiçoso mas funciona)
            repita
                escreval("Digite a hora da leitura nº", numero," 'hh'")
                leia(leiturah[numero])//joga a hora lida no array leiturah de mesmo numero do loop
            ate leiturah[numero] < 24
            ate leiturah[numero] > (-1)
            celsius[numero] <- conversorfc(leiturat[numero])// executa função externa de conversão que joga no array celsius de msm numero do loop
        fimpara
        para i de 1 ate 4 faca //maquininha que usa bublesort para ordenar as temperaturas (usa o pós conversão como base, mas nao faz difereça)
            para j de i + 1 ate 4 faca
                se celsius[i] > celsius [j] entao
                    trocatc <- celsius[i]//troca todos os dados de posição ao mesmo tempo para não tirar do "sincronismo"
                    trocatr <- leiturat[i]
                    trocah <- leiturah[i]
                    celsius[i] <- celsius[j]
                    leiturat[i] <- leiturat[j]
                    leiturah[i] <- leiturah[j]
                    celsius[j] <- trocatc
                    leiturat[j] <- trocatr
                    leiturah[j] <- trocah
                fimse
            fimpara
        fimpara
        escreval("Temperatura",leiturat[1],"ºF ,registrada às: ",leiturah[1],"h corresponde a: ", celsius[1],"ºC")//imprime os resultados ordenados
        escreval("Temperatura",leiturat[2],"ºF ,registrada às: ",leiturah[2],"h corresponde a: ", celsius[2],"ºC")
        escreval("Temperatura",leiturat[3],"ºF ,registrada às: ",leiturah[3],"h corresponde a: ", celsius[3],"ºC")
        escreval("Temperatura",leiturat[4],"ºF ,registrada às: ",leiturah[4],"h corresponde a: ", celsius[4],"ºC")
    fimse
    se menu = 2 entao //mesma coisa do menu 1 porém faz celsius para farenheit
        para numero de 1 ate 4 faca
            escreval("Digite a temperatura nº", numero)
            leia(leiturat[numero])
            repita
            repita
                escreval("Digite a hora da leitura nº", numero," 'hh'")
                leia(leiturah[numero])
            ate leiturah[numero] < 24
            ate leiturah[numero] > (-1)
            farenheit[numero] <- conversorcf(leiturat[numero])
        fimpara
        para i de 1 ate 4 faca
            para j de i + 1 ate 4 faca
                se farenheit[i] > farenheit [j] entao
                    trocatc <- farenheit[i]
                    trocatr <- leiturat[i]
                    trocah <- leiturah[i]
                    farenheit[i] <- farenheit[j]
                    leiturat[i] <- leiturat[j]
                    leiturah[i] <- leiturah[j]
                    farenheit[j] <- trocatc
                    leiturat[j] <- trocatr
                    leiturah[j] <- trocah
                fimse
            fimpara
        fimpara
        escreval("Temperatura",leiturat[1],"ºC ,registrada às: ",leiturah[1],"h corresponde a: ", farenheit[1],"ºF")
        escreval("Temperatura",leiturat[2],"ºC ,registrada às: ",leiturah[2],"h corresponde a: ", farenheit[2],"ºF")
        escreval("Temperatura",leiturat[3],"ºC ,registrada às: ",leiturah[3],"h corresponde a: ", farenheit[3],"ºF")
        escreval("Temperatura",leiturat[4],"ºC ,registrada às: ",leiturah[4],"h corresponde a: ", farenheit[4],"ºF")
    fimse
    se menu = 0 entao // check se o usuário quer sair do programa e seta a booleana sair
        sair <- VERDADEIRO
    fimse
    se sair = FALSO entao
        escreval("")
        escreval("Deseja fazer outra conversão?")
        escreval("0:Sair")
        escreval("Qualquer outro numero para repetir")
        leia (repetir)
        se repetir = 0 entao
            sair <- VERDADEIRO
        fimse //saida do loop com a booleana sair
    fimse
    ate sair = VERDADEIRO
fimalgoritmo

