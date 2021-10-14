algoritmo "Calaculadora de reajuste de salário"
// Função :   Calcula o salario novo baseado no salario antigo mais 30%
// Autor : Higor
// Data : 13/10/21
var
Salario , Salarioreaj  : real
inicio
escreva("Coloque o salario a ser reajustado: ")
leia(Salario)
Salarioreaj <- 1.3*(Salario)
escreval("O Salario reajustado é: ", Salarioreaj,"$")
se(Salarioreaj >= 10000) entao
   escreval("Passa um PIX meu chapa? $$$$$$$$$$")
fimse
fimalgoritmo

