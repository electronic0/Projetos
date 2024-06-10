from random import choice
n = int(input('Insira o valor de senhas a ser gerado: '))
q = int(input('Insira o valor da quantidade de caracteres a ser gerado: '))
caracteres = 'ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^*+=-?'
for s in range(1, n + 1):
    senha = ''
    for c in range(1, q + 1):
        senha += choice(caracteres)
    print(f'Senha {s}: {senha} ')