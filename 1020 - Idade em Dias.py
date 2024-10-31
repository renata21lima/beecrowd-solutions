def idade(idade_dias):
    ano = idade_dias // 365
    idade_dias %= 365

    mes = idade_dias // 30

    dia = idade_dias % 30
    return ano, mes, dia

idade_dias = int(input())
ano, mes, dia = idade(idade_dias)

print(f'{ano} ano(s)\n{mes} mes(es)\n{dia} dia(s)')