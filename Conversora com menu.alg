algoritmo "Conversora de Dinheiro e temperatura com menu"
// Fun��o :   Converte dolares para reais e vice versa, tambem converte
//            celsius para farenheit e vice versa.
// Autor : Higor
// Data : 20/10/21
var
celsius ,farenheit, menu, cotacao, dol, reais  : real
sair : logico
repetir : inteiro
inicio
repita
    escreval("")
    escreval("Escolha a convers�o a ser feita")
    escreval("1: Farenheit para Celsius")
    escreval("2: Celsius para Farenheit")
    escreval("3: D�lar para Real")
    escreval("4: Real para Dolar")
    escreval("0: Sair")
    leia(menu)
    se menu = 1 entao
        escreval("Coloque a temperatura em fahrenheit: ")
        leia(farenheit)
        celsius <- 5*(farenheit-32)/9
        escreval("Temperatura em C�:", celsius)
    fimse
    se menu = 2 entao
        escreval("Coloque a temperatura em celsius: ")
        leia (celsius)
        farenheit <- celsius * 1.8 + 32
        escreval("Temperatura em F�:", farenheit)
    fimse
    se ((menu = 3) ou (menu = 4)) entao
        se cotacao = 0 entao
            escreval("Por favor digite a cota��o do dolar hoje ex: 5.32")
            leia (cotacao)
        fimse
        se menu = 3 entao
            escreval("Digite o valor a ser convertido em D�lares")
            leia (dol)
            reais <- dol * cotacao
            escreval(dol,"$ equivalem �:",reais,"R$")
        senao
            escreval("Digite o valor a ser convertido em Reais")
            leia (reais)
            dol <- reais / cotacao
            escreval(reais,"R$ equivalem �:",dol,"$")
        fimse
    fimse
    se menu = 0 entao
        sair <- VERDADEIRO
    fimse
    escreval("")
    escreval("Deseja fazer outra convers�o?")
    escreval("0:Sair")
    escreval("Qualquer outro numero para repetir")
    leia (repetir)
    se repetir = 0 entao
        sair <- VERDADEIRO
    fimse
    ate sair = VERDADEIRO
fimalgoritmo

