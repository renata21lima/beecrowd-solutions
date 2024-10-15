def volume(r):
    pi = 3.14159
    volume = (4/3) * pi * r**3
    return volume

r = int(input())

resultado = volume(r)
print(f'VOLUME = {resultado:.3f}')