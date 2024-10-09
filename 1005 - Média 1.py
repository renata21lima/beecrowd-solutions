def media (a, b):
    media = (a*3.5 + b*7.5)/11
    return media

a = float(input())
b = float(input())

resultado = media(a, b)

print(f'MEDIA = {resultado:.5f}')