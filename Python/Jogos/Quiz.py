perguntas = {
    '1. Em que lugar vivem mais cangurus do que pessoas?': 'c',
    '2. Qual a ciência que estuda a atmosfera da Terra e a climatologia?': 'd',
    '3. Quantos braços tem um polvo?': 'b',
    '4. Quanto tempo o vidro demora para se decompor?': 'e',
    '5. Quantos dias, aproximadamente, a Lua demora para dar uma volta à Terra?': 'c',
    '6. Que povo foi o primeiro a utilizar a bússola?': 'c',
    '7. Qual era o deus romano do amor?': 'd',
    '8. Qual a unidade que mede a intensidade do som?': 'a'
}

opções = [
    ['a) Indonésia', 'b) Nova Zelândia', 'c) Austrália', 'd) Papua-Nova Guiné', 'e) África do Sul'],
    ['a) Astronomia', 'b) Metereologia', 'c) Dispersão atmosférica', 'd) Meteorologia', 'e) Horologia'],
    ['a) Seis', 'b) Oito', 'c) Dez', 'd) Sete', 'e) Três'],
    ['a) 500 anos', 'b) 1000 anos', 'c) 4000 anos', 'd) 1 milhão de anos', 'e) tempo indeterminado'],
    ['a) 365 dias', 'b) 366 dias', 'c) 28 dias', 'd) 31 dias', 'e) 1 dia'],
    ['a) Gregos', 'b) Romanos', 'c) Chineses', 'd) Mesopotâmicos', 'e) Egípcios'],
    ['a) Eros', 'b) Apolo', 'c) Baco', 'd) Cupido', 'e) Júpiter'],
    ['a) Decibel', 'b) Frequência', 'c) Hertz', 'd) Compasso', 'e) Ruído']
]

respostas = []
respostas_certas = 0

questão = 1

for p in perguntas:
    print(p)
    print()
    for o in opções[questão - 1]:
        print(o)
    resposta = str(input('Qual é a sua resposta? (A, B, C, D): ')).lower().strip()
    respostas.append(resposta)
    questão += 1
    if perguntas.get(p) == resposta:
        respostas_certas += 1
    print()
print(f'Você acertou {respostas_certas} de {len(perguntas)} perguntas. Nada mal')
print('Opções corretas: ', end = '')
for r in perguntas:
    print(perguntas.get(r), end = ', ')