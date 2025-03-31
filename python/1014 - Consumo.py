def consumo(a, b):
    consumo = a/b
    return consumo

distancia_total = int(input())
gasolina = float(input())

resultado = consumo(distancia_total, gasolina)
print(f'{resultado:.3f} km/l')