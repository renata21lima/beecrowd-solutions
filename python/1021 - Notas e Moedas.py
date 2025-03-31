valor = float(input(""))
notas = [100, 50, 20, 10, 5, 2]
moedas = [1, 0.50, 0.25, 0.10, 0.05, 0.01]
valor_centavos = round(valor * 100)

print("NOTAS:")
for nota in notas:
    valor_nota = int(nota * 100)
    qtd_notas = valor_centavos // valor_nota
    print(f"{qtd_notas} nota(s) de R$ {nota:.2f}")
    valor_centavos %= valor_nota

print("MOEDAS:")
for moeda in moedas:
    valor_moeda = int(moeda * 100)
    qtd_moedas = valor_centavos // valor_moeda
    print(f"{qtd_moedas} moeda(s) de R$ {moeda:.2f}")
    valor_centavos %= valor_moeda