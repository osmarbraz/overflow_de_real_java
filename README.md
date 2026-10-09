# Demonstração de Overflow em Números Reais em Java

## Descrição

Este programa demonstra o fenômeno conhecido como **overflow de ponto flutuante (*floating-point overflow*)**, utilizando os tipos `float` e `double` da linguagem Java.

O objetivo é mostrar o que acontece quando uma operação aritmética ultrapassa o maior valor finito que uma variável de ponto flutuante consegue representar.

## Objetivos

- Conhecer os limites de representação dos tipos `float` e `double` em Java.
- Compreender o conceito de overflow de ponto flutuante.
- Observar o comportamento de uma variável ao ultrapassar o maior valor finito representável.
- Relacionar os resultados ao padrão IEEE 754.
- Comparar o overflow de ponto flutuante com o overflow de números inteiros.

## Limites dos tipos de ponto flutuante

Em Java, os tipos `float` e `double` seguem o padrão IEEE 754 e possuem diferentes capacidades de representação.

| Tipo | Tamanho | Maior valor finito positivo |
|---|---:|---:|
| `float` | 32 bits | Aproximadamente `3,4028235 × 10³⁸` |
| `double` | 64 bits | Aproximadamente `1,7976931348623157 × 10³⁰⁸` |

O tipo `double` possui uma faixa de valores muito maior que a do tipo `float`.

## Funcionamento do programa

O programa realiza quatro etapas:

1. **Exibe o maior valor finito de `float`:** utiliza `Float.MAX_VALUE` para obter o maior valor positivo finito representável pelo tipo.
2. **Provoca overflow em `float`:** multiplica o valor por `2`. Como o resultado ultrapassa a faixa finita, o Java retorna `Infinity`.
3. **Exibe o maior valor finito de `double`:** utiliza `Double.MAX_VALUE` para obter o maior valor positivo finito representável pelo tipo.
4. **Provoca overflow em `double`:** multiplica o valor por `2`, produzindo também `Infinity`.

## Código-fonte

O arquivo `Principal.java` contém a implementação do programa.

## Como executar

É necessário ter o Java Development Kit (JDK) instalado.

**1. Compile o programa:**

```bash
javac Principal.java
```

**2. Execute o programa:**

```bash
java Principal
```

## Saída esperada

```text
---------------------------
Maior float=3.4028235E38
---------------------------
float * 2=Infinity
---------------------------
Maior double=1.7976931348623157E308
---------------------------
double * 2=Infinity
---------------------------
```

A notação científica utilizada na saída representa números muito grandes. Por exemplo, `3.4028235E38` corresponde aproximadamente a `3,4028235 × 10³⁸`.

## Conceito fundamental: overflow de ponto flutuante

O overflow ocorre quando o resultado de uma operação ultrapassa a faixa de valores finitos representáveis pelo tipo numérico utilizado.

No Java, os tipos `float` e `double` seguem o padrão IEEE 754. Quando uma operação produz um resultado positivo cuja magnitude ultrapassa o maior valor finito representável, o resultado pode ser `Infinity`. Para um resultado negativo de magnitude excessiva, pode ocorrer `-Infinity`.

Diferentemente do overflow de `int`, que pode fazer o valor passar do limite positivo para o limite negativo, o overflow de ponto flutuante pode produzir um valor infinito.

Esse comportamento não gera automaticamente uma exceção em operações comuns de ponto flutuante.

## Comparação com o overflow de int

| Característica | `int` | `float` e `double` |
|---|---|---|
|