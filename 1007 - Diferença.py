def diferenca(a, b, c, d):
    diferenca =  (a * b - c * d)
    return diferenca

a = int(input())
b = int(input())
c = int(input())
d = int(input())

resultado = diferenca(a, b, c, d)
print(f'DIFERENCA = {resultado}')