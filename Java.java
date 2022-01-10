//PACOTES / IMPORT---------------
package br.com.nomedaempresa.nomedopacote;

import br.com.nomedaempresa.nomedopacote.Classe;
import java.util.*; 


//ESTRUTURA BÁSICA--------------
class MeuPrograma {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}


//VARIÁVEIS----------------------
int idade = 15;
double pi = 3.14;
boolean verdade = true;
char letra = 'a';

String nome = "João"; //não é uma variável primitiva

byte b = 100;
short s = 10000;
long l = 100000;
float f = 5.99f;

//Casting
int i = (int) 3.14 //3


//IF / ELSE----------------------
if (idade < 18) {
    System.out.println("Não pode entrar");
} else {
    System.out.println("Pode entrar");
}


//WHILE / FOR--------------------
while (idade < 18) {
    System.out.println(idade);    
    idade++;
}

for (int i = 0; i < 10; i = i + 1) {
    System.out.println("olá!");
}


//ORIENTAÇÃO A OBJETOS-----------

/**
 * Documentação da classe em formato de comentário (javadoc)
 */
public class Conta {
    //atributos
    private String titular;
    private double saldo;

    //construtor
    Conta() {
        //...
    }

    //método
    public void saca(double valor){
        //...
    }

    //getter & setter (quando necessário)
    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}

//instanciando o objeto
Conta conta = new Conta();

//herança
public class Gerente extends Funcionario {
    //...
}

//classe abstrata
public abstract class Funcionario {
        public abstract double getBonificacao(); //método abstrato

        // outros atributos e métodos
    }
}


//INTERFACES---------------------
public interface Autenticavel {
    boolean autentica(int senha);
}

public class Gerente implements Autenticavel {
    //...

    public boolean autentica(int senha) {
        //....
    }
}


//EXCEÇÕES-----------------------

//tratando exceção
try {
    //...
} catch (NullPointerException e) {
   System.out.println("erro: " + e);
} finally {
    //...
}

//lançando exceção
public void saca(double valor) {
    if (this.saldo < valor) {
        throw new RuntimeException();
    } else {
        this.saldo-=valor;        
    }        
}

//criando exceção
public class SaldoInsuficienteException extends RuntimeException {    
    public SaldoInsuficienteException(String message) {
        super(message);
    }
}


//ARRAY--------------------------
double [] saldosDasContas;
saldosDasContas = new double[10];

saldosDasContas[5] = 1500.37;

//enhanced-for
for (int saldo : saldosDasContas) {
    System.out.println(saldo);
}