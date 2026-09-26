## TERMINAR, preciso aprender como fazer a coleta de dados em uma unica linha ao inves de pegar cada dado individualmente

codPeca1 , qtdPeca1, valorPeca1 = map(float, input().split())
codPeca2, qtdPeca2, valorPeca2 = map(float,input().split())

valorTotal = (qtdPeca1 * valorPeca1) + (qtdPeca2 *valorPeca2)

print(f"VALOR A PAGAR: R$ {valorTotal:.2f}")