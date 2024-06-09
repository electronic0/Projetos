n = float(input('Digite um número para ver sua tabuada: '))
l = int(input('Digite o limite da tabuada: '))
for m in range(1, l + 1):
    print(f'{n} x {m} = {n * m:.2f}')