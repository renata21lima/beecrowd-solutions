def gasolina(kmH, horas):
    litros = (kmH/12) * horas
    return litros

kmH = int(input())
horas = int(input())

resultado = gasolina(kmH, horas)
print(f'{resultado:.3f}')