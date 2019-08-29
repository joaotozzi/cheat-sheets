#VARIAVEIS---------------------------------------

a = "texto"
b = 10
c = 2.5
d = True


#LEITURA E ESCRITA-------------------------------

print("Hello World")

x = input("Digite seu nome:")
y = int(input("digite um número:"))


#STRINGS-----------------------------------------

x = a.title() 
x = a.upper()
x = a.lower()

a = "texto " + str(b) + " outro_texto"

x = a.rstrip()
x = a.lstrip()
x = a.strip()


#OPERADORES--------------------------------------

y = 2 + 3   #5
y = 3 - 2   #1
y = 2 * 3   #6
y = 3 / 2   #1.5
y = 3 ** 2  #9


#LISTAS------------------------------------------

lista = ['batata', 'shoyo', 'macarrao']

lista[0] = 'batata frita'
x = lista[-1] #'macarrao'
nova_lista = lista[1:2] #['shoyo']

nova_lista = []

lista.append('pimenta')
lista.insert(0, 'batata frita')

del lista[0]

lista.pop()
lista.remove('batata frita')

lista.sort()
lista.reverse()

sorted(lista)
len(lista)

digitos = list(range(1,6))

min(digitos)
max(digitos)
sum(digitos)


#FOR---------------------------------------------

for item in lista:
    #...

for valor in range(1,5):
    #...

quadrados = [valor**2 for valor in range(10)]


#TUPLAS------------------------------------------

tupla = (200, 50)
tupla[0] #200


#IF / ELSE---------------------------------------

if a == 'texto' and b > 20 or c != 1.5:
    #...


if 'batata' in lista:
    #...


if 'paprica' not in lista:
    #...


if lista:
    #...


if y > 18:
    #...
elif y = 18:
    #...
else:
    #...


#DICIONARIO--------------------------------------

dicionario = {}

dicionario = {
    'cor': 'azul', 
    'tamanho': 10,
    }

dicionario['cor'] = 'verde'

dicionario['nova chave'] = 250

del dicionario['tamanho']


for chave, valor in dicionario.items():
    #...

for chave in sorted(dicionario.keys()):
    #...

for valor in set(dicionario.values()):
    #...

