n = int(input('Insira um número para definir o limite da sequência: '))
n1 = n2 = 1
print(f'{n1} {n2}', end = ' ')
for s in range(0 , n + 1):
    n3 = n1 + n2
    n1 = n2
    n2 = n3
    print(n3, end = ' ')