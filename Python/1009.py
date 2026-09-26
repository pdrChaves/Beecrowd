nome = str(input())
salarioFixo = float(input())
totalVendas = float(input())

novoSalario = salarioFixo + (15/100*totalVendas)

print(f"TOTAL = R$ {novoSalario:.2f}")