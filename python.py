#MÓDULOS-----------------------------------------

import nome_modulo

from nome_modulo import nome_funcao, NomeClasse

import nome_modulo as alias

from nome_modulo import * #todas as funções


#VARIAVEIS---------------------------------------

a = "texto"
b = 10
c = 2.5
d = True


#LEITURA E ESCRITA-------------------------------

print("Hello World")

x = input("Digite seu nome:")
y = int(input("Digite um número:"))


#STRINGS-----------------------------------------

x = a.title() 
x = a.upper()
x = a.lower()

a = "texto " + str(b) + " outro texto"

x = a.rstrip()
x = a.lstrip()
x = a.strip()


#OPERADORES--------------------------------------

y = 2 + 3   #5
y = 3 - 2   #1
y = 2 * 3   #6
y = 3 / 2   #1.5
y = 3 ** 2  #9 (potência)
y = 4 % 3   #1 (resto)


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


#WHILE-------------------------------------------

while i <= 5:
    #...


#FUNÇÕES-----------------------------------------

def nome_funcao():
    #...
    return True


def descreve_pet(nome, tipo_animal='cachorro'):
    #...


def montar_pizza(*recheios): #tupla
    #...


def criar_perfil(**info_usuario): #dicionário
    #...


#CLASSES-----------------------------------------

class Cachorro():
    """Descrição da classe"""

    def __init__(self, nome): #construtor
        self.nome = nome

    def senta(self):
        #...


meu_cachorro = Cachorro('laika')
meu_cachorro.senta()


class Carro():
    #...

class CarroEletrico(Carro):
    """Descrição"""

    def __init__(self, marca, modelo, ano):
        super().__init__(marca, modelo, ano)
        self.bateria = 80
    
    #...


#ARQUIVOS----------------------------------------

#Leitura

with open('arquivo.txt') as obj_arquivo:
    conteudo = obj_arquivo.read()


with open('arquivo.txt') as obj_arquivo:
    linhas = obj_arquivo.readlines()


with open('arquivo.txt') as obj_arquivo:
    for linha in obj_arquivo:
        #...


#Escrita

with open('arquivo.txt', 'w') as obj_arquivo:
    obj_arquivo.write("Hello World!")

# w = escrita, a = concatenação, r = leitura (padrão)