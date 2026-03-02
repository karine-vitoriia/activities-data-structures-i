# Parte 1 — Refatoração e Tipos Abstratos de Dados (TAD)

## 📌 Descrição da Atividade
Esta etapa teve como objetivo refatorar os algoritmos desenvolvidos anteriormente, organizando o código em funções reutilizáveis seguindo os princípios de Tipos Abstratos de Dados (TAD). O programa principal (`main`) passou a atuar apenas como coordenador das execuções, enquanto cada funcionalidade foi isolada em métodos específicos.

Foram refatoradas as seguintes atividades:

1. Caixa Eletrônico (cálculo de notas)
2. Validação de senha
3. Operações com notas de alunos
4. Verificação de elementos únicos em vetor
5. Conversão de tempo (segundos → horas, minutos e segundos)

---

## 🎯 Objetivos
- Aplicar refatoração de código
- Separar responsabilidades em funções
- Evitar uso de variáveis globais
- Utilizar passagem de parâmetros e retorno de valores
- Melhorar organização e reutilização do código

---

## 🛠️ Recursos Utilizados
- Linguagem Java
- IDE (IntelliJ / Eclipse / VS Code)
- Estruturas de repetição (`for`, `while`)
- Vetores (arrays)
- Métodos estáticos
- Classe `Scanner` para entrada de dados

---

## 📂 Estrutura do Projeto
├── CaixaEletronico.java
├── CriteriosSenhas.java
└── OperacoesNotas.java
├── FuncaoElementos.java
└── Tempo.java


---

## ▶️ Instruções de Execução

1. Abrir o projeto em uma IDE Java.
2. Compilar os arquivos `.java`.
3. Executar a classe desejada contendo o método `main`.
4. Inserir os dados solicitados no terminal quando necessário.

Exemplo:

```bash
javac CaixaEletronico.java
java CaixaEletronico
