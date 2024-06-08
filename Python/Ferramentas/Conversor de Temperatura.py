t = float(input('Insira o valor da temperatura: '))
while True:
    i = int(input('Qual temperatura pretente converter? \n[ 1 ] Celsius para Fahrenheit \n[ 2 ] Celsius para Kelvin \n[ 3 ] Fahrenheit para Celsius \n[ 4 ] Fahrenheit para Kelvin \n[ 5 ] Kelvin para Celsius \n[ 6 ] Kelvin para Fahrenheit \n[ 7 ] Trocar de valor \n[ 8 ] Sair do programa \nValor: '))
    if i == 1:
        print(f'Convertendo a temperatura {t}°C para Fahrenheit fica {(t * 9 / 5) + 32:.2f}°F')
    elif i == 2:
        print(f'Convertendo a temperatura {t}°C para Kelvin fica {t + 273.15:.2f}K')
    elif i == 3:
        print(f'Convertendo a temperatura {t}°F para Celsius fica {(t - 32) * 5 / 9:.2f}°C')
    elif i == 4:
        print(f'Convertendo a temperatura {t}°F para Kelvin fica {(t - 32) * 5 / 9 + 273.15:.2f}K')
    elif i == 5:
        print(f'Convertendo a temperatura {t}K para Celsius fica {t - 273.15:.2f}°C')
    elif i == 6:
        print(f'Convertendo a temperatura {t}K para Fahrenheit fica {(t - 273.15) * 9 / 5 + 32:.2f}K')
    elif i == 7:
        t = float(input('Insira o valor da temperatura: '))
    elif i == 8:
        break
    else:
        print('Valor invalido')
print('Volte sempre!')