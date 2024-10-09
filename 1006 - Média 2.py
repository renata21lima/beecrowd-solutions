def media (a, b, c):
    media = (a*2 + b*3 + c*5)/10 
    return media

a = float(input())
b = float(input())
c = float(input())

resultado = media(a, b, c)
print(f'MEDIA = {resultado:.1f}')
