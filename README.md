# Comparação de Performance: Algoritmos Recursivos vs. Iterativos

Este projeto foi desenvolvido como parte da disciplina de **Estrutura de Dados** no final de 2024, durante minha graduação em Sistemas de Informação no IFSULDEMINAS. O objetivo é analisar e comparar o tempo de execução e o comportamento de memória entre soluções recursivas e iterativas em Java.

## 🧠 Sobre o Conceito

A **Recursividade** ocorre quando uma função chama a si mesma para resolver subproblemas menores do mesmo problema original. Embora elegante e muitas vezes mais simples de ler, a recursão pode ser custosa para o sistema devido ao uso da *Stack* (pilha de execução).


### Por que comparar tempos?
Algoritmos recursivos sem a devida otimização (como memoização) podem apresentar uma complexidade de tempo exponencial em casos como a sequência de Fibonacci, enquanto versões iterativas mantêm uma performance linear e consumo de memória constante.

## 🚀 O que o projeto faz

O programa executa cálculos clássicos utilizando as duas abordagens e cronometra o tempo de resposta:
* **Cálculo de Fatorial:** Comparação entre o método recursivo e o laço `for`.
* **Sequência de Fibonacci:** Demonstração do impacto da recursão profunda no tempo de processamento.
* **Medição de Tempo:** Utilização de `System.nanoTime()` ou `System.currentTimeMillis()` para precisão estatística.

## 🛠️ Tecnologias e Ferramentas

* **Linguagem:** Java (Foco principal da minha stack de desenvolvimento).
* **IDE:** NetBeans (Estrutura de projeto Ant).
* **Conceitos:** Complexidade de Algoritmos (Big O Notation), Recursão e Iteração.

## 📂 Estrutura de Pastas

* `src/javarecursaocomparatempos`: Contém as classes principais com os métodos de teste e lógica de comparação.
* `nbproject`: Arquivos de configuração da IDE NetBeans.

## ⚙️ Como executar

1. Clone o repositório:
   
   ```bash
   git clone [https://github.com/samueljunqueiraa/Recursividade-Compara-Tempos.git](https://github.com/samueljunqueiraa/Recursividade-Compara-Tempos.git)
   ```

2. Importe o projeto no NetBeans ou compile via terminal.

3. Execute a classe principal para visualizar os outputs de tempo no console.

### Curiosidade Acadêmica: Este projeto faz parte da minha jornada para me tornar um melhor Desenvolvedor Java e, futuramente, compartilhar esse conhecimento no universo Universitário.
