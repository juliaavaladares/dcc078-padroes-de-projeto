# Singleton - Creational (Criação)

## Intenção

_Garantir que uma classe tenha somente uma instância no programa e fornecer um ponto de acesso global para a mesma._

## Intenção

O padrão Singleton resolve dois problemas de uma só vez, violando o princípio de responsabilidade única:

1. Garantir que uma classe tenha apenas uma única instância. A razão mais comum para isso é para controlar o acesso a algum recurso compartilhado—por exemplo, uma base de dados ou um arquivo;
2. Fornecer um ponto de acesso global para a instância. Embora variáveis globais sejam muito úteis, elas também são muito inseguras uma vez que qualquer código pode potencialmente sobrescrever os conteúdos daquelas variáveis e quebrar a aplicação. Assim como uma variável global, o padrão Singleton permite que você acesse algum objeto de qualquer lugar no programa. Contudo, ele também protege aquela instância de ser sobrescrita por outro código.

## Solução

Todas as implementações do Singleton tem esses dois passos em comum:

1. Fazer o construtor padrão privado, para prevenir que outros objetos usem o operador new com a classe singleton;
2. Criar um método estático de criação que age como um construtor. Esse método chama o construtor privado por debaixo dos panos para criar um objeto e o salva em um campo estático. Todas as chamadas seguintes para esse método retornam o objeto em cache.

## Aplicabilidade no mundo real

O padrão singleton pode ser aplicado dentro de times de futebol. Um time, oficialmente, deve ter apenas um cappitão em campo. Independentemente das identidades pessoais do indivíduo que ocupa essa posição. Além disso, é um ponto de acesso global que identifica quem é a pessoa responsável por representar o grupo.

## Consequências

O que é bom ou ruim no Singleton:

**Bom:**

- Acesso controlado por encapsulamento à instância única;
- É possível permitir um número variável de instâncias (pode soar estranho, mas é possível criar um Singleton que permite n instâncias de uma classe);
- É possível usar thead lock para garantir que duas partes do código não alterem o singleton simultaneamente;
- Usa _lazy instantiation_, ou seja, o Singleton só será instanciado no momento do uso;

**Ruim:**

- É mais difícil de testar;
- Viola o princípio da responsabilidade única;
- Requer tratamento especial em casos de concorrência;
