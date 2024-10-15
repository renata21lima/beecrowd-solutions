def bonus (salario, vendas):
    porcentagem_vendas = vendas * 0.15
    total = salario + porcentagem_vendas
    return total

nome = input()
salario = float(input())
vendas = float(input())

salario_total = bonus(salario,vendas)

print(f'TOTAL = R$ {salario_total:.2f}')
