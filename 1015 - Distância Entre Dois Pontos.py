import math
def eixos(x1, y1, x2, y2):
    resultado = math.sqrt((x2 - x1)**2 + (y2 - y1)**2)
    return resultado

x1, y1 = input().split()
x2, y2 = input().split()
x1 = float(x1)
y1 = float(y1)
x2 = float(x2)
y2 = float(y2)

resultado = eixos(x1, y1, x2, y2)
print(f'{resultado:.4f}')