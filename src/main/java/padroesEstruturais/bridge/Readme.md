# Bridge - Structural (Estrutural)

## Intenção

*Bridge é um padrão de projeto estrutural que tem a intenção de desacoplar uma abstração da sua implementação, de modo que as duas possam variar e evoluir independentemente.*---

## Sobre o Bridge

O bridge foca o trabalho em composição, ou seja, ao invés de extender infinitamente minha estrutura de classes para todas as possíveis variantes por herança, posso apenas manter uma referência para uma implementação dentro da minha abstração. Isso me permite encaminhar chamadas de métodos da abstração para a implementação em tempo de execução.
---
## Aplicabilidade

Use o padrão Bridge quando:

- souber que sua estrutura terá abstrações (código de alto nível) e implementações dessa abstração (detalhes) que possam variar de maneira independente
- souber que o Adapter poderia ser aplicado naquela estrutura (você já conhece a estrutura)
- quiser dividir uma classe que possa ter diversas variantes (como em produtos e suas variações de cores: CanetaAzul, CanetaVermelha, CamisetaAzul, CamisetaVermelha, etc...)
- quer trocar as implementações em tempo de execução

## Consequências

O que é bom ou ruim no Bridge:

**Bom:**
- Desacopla o código da abstração do código da implementação (SRP)
- Implementa o OCP ao permitir novas abstrações e/ou implementações para código existente
- Tem as mesmas vantagens do Adapter

**Ruim:**
- Aumenta a complexidade da aplicação quando implementado em locais incorretos