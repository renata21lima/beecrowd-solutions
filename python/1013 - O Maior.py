def maior(a, b):
    return (a + b + abs(a - b)) // 2

a, b, c = input().split()
a, b, c = int(a), int(b), int(c)

maiorAB = maior(a, b)
maiorABC = maior(maiorAB, c)

print(f'{maiorABC} eh o maior')