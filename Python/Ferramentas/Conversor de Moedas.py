import requests
import json
cotacao = requests.get('https://economia.awesomeapi.com.br/last/USD-BRL,EUR-BRL')
cotacao = cotacao.json()
dolar = float(cotacao["USDBRL"]["bid"])
euro = float(cotacao["EURBRL"]["bid"])
while True:
    i = int(input('Qual moeda pretende converter? \n[ 1 ] Real para Dolar \n[ 2 ] Dolar para Real \n[ 3 ] Real para Euro \n[ 4 ] Euro para Real \n[ 5 ] Sair do programa \nOpção: '))
    if i == 1:
        v = float(input('Insira o valor R$'))
        print(f'Convertendo \033[32mR${v:.2f}\033[m em Dolar atualmente ficaria \033[32m${v / dolar:.2f}\033[m')
    elif i == 2:
        v = float(input('Insira o valor $'))
        print(f'Convertendo \033[32m${v:.2f}\033[m em Real atualmente ficaria \033[32mR${v * dolar:.2f}\033[m')
    elif i == 3:
        v = float(input('Insira o valor R$'))
        print(f'Convertendo \033[32mR${v:.2f}\033[m em Euro atualmente ficaria \033[32m€{v / euro:.2f}\033[m')
    elif i == 4:
        v = float(input('Insira o valor €'))
        print(f'Convertendo \033[32m€{v:.2f}\033[m em Real atualmente ficaria \033[32mR${v * euro:.2f}\033[m')
    elif i == 5:
        break
    else:
        print('Valor invalido. Tente novamente')
print('Volte sempre!')