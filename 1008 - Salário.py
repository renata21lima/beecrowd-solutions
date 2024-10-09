def salario(valor_hora, horas_trabalhadas):
    salario_total = valor_hora * horas_trabalhadas
    return salario_total

number = int(input())           
horas = int(input())           
valor_hora = float(input())    

salario_total = salario(valor_hora, horas)
print(f'NUMBER = {number}\nSALARY = U$ {salario_total:.2f}')