# Factory Method - Creational (Criação)

## Intenção

_O Factory method fornece uma interface para criar objetos em uma superclasse, mas permite que as subclasses alterem o tipo de objetos que serão criados._

---

## Sobre o Factory Method

- É um padrão de projeto de criação (lida com a criação de objetos)
- Oculta a lógica de instanciação do código cliente. O método fábrica será responsável por instanciar as classes desejadas
- É obtido através de herança. O método fábrica pode ser criado ou sobrescrito por subclasses
- Dá flexibilidade ao código cliente permitindo a criação de novas factories sem a necessidade de alterar código já escrito (OCP)
- Pode usar parâmetros para determinar o tipo dos objetos a serem criados ou os parâmetros a serem enviados aos objetos sendo criados.

---

## Aplicabilidade

- Use o factory method quando não souber com certeza quais os tipos de objetos o seu código vai precisar
- Use o factory method para permitir a extensão de suas factories para criação de novos objetos (isso ajuda a aplicar o Open/Closed Principle)
- Use o factory method para desacoplar o código que cria do código que usa as classes (Single Responsibility Principle)
- Use o factory method para dar um hook (gancho) às subclasses para permitir que elas decidam a lógica de criação de objetos
- Use o factory method para eliminar duplicação de código na criação de objetos

## Consequências

O que é bom ou ruim no Factory Method:

**Bom:**

- Ajuda a aplicar o Open/Closed Principle. Seu código vai estar aberto para extensão
- Ajuda na aplicação do Single Responsibility Principle. Separa o código que cria do código que usa o objeto
- Ajuda no desacoplamento do seu código

**Ruim:**

- Pode causar uma explosão de subclasses