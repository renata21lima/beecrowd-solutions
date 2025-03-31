def area (raio):
    pi = 3.14159
    area = pi * raio**2
    return area

raio = float(input())
resultado = area(raio)
print(f'A={resultado:.4f}')