# Abstract Factory (Fábrica Abstrata) - Creational (Criação)

## Intenção

O Abstract Factory é um padrão de projeto criacional que permite que você produza famílias de objetos relacionados sem ter que especificar suas classes concretas.

## Aplicabilidade

O padrão Abstract Factory quando:

- um sistema deve ser independente de como seus produtos são criados, compostos ou representados;
- um sistema deve ser configurado como um produto de família de múltiplos produtos;
- uma família de objetos for projetada para ser usada em conjunto e você necessita garantir essa restrição
  você quer fornecer uma biblioteca de classes de produtos e quer revelar somente suas interfaces, não suas implementações.

## Consequências

O que é bom ou ruim no Abstract Factory:

Bom:

- Os produtos sempre serão compatíveis entre si;
- Aplicação clara do Open/Closed Principle, é fácil adicionar novas fábricas e produtos;
- Aplicação clara do Single Responsibility Principle, o código que cria está separado do código que usa os objetos.

Ruim:

- Muitas classes e maior complexidade será introduzida no código.
