def valor_total(qtd1, valor1, qtd2, valor2):
    valor_total = qtd1 * valor1 + qtd2 * valor2
    return valor_total

cod1, qtd1, valor1 = input().split()   
cod1, qtd1, valor1 = int(cod1), int(qtd1), float(valor1)

cod2, qtd2, valor2 = input().split()
cod2, qtd2, valor2 = int(cod2), int(qtd2), float(valor2)

resultado = valor_total(qtd1, valor1, qtd2, valor2)
print(f'VALOR A PAGAR: R$ {resultado:.2f}')
