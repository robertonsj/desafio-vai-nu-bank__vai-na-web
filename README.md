# Projeto de Sistema Bancário Simples em Java

Este é um projeto Java que implementa um sistema bancário simples com conceitos de abstração, herança e uso de estruturas de dados. Ele inclui classes para contas genéricas (`Conta`), contas correntes (`ContaCorrente`) e contas poupança (`ContaPoupanca`). O banco é representado pela classe `Banco`.

## Estrutura do Projeto

- `Conta`: Classe base que representa uma conta genérica com métodos para depósito, saque, transferência, etc.

- `ContaCorrente`: Subclasse de `Conta` representando uma conta corrente com a adição de um limite de crédito.

- `ContaPoupanca`: Subclasse de `Conta` representando uma conta poupança com a adição de juros aplicados.

- `Banco`: Classe principal que gerencia contas usando um `HashMap` para armazenamento.

## Como Usar

1. **Crie Contas:**
   - Crie instâncias de `ContaCorrente` e `ContaPoupanca` com os detalhes necessários.

2. **Adicione Contas ao Banco:**
   - Use o método `adicionarConta` da classe `Banco` para adicionar contas.

3. **Realize Operações Bancárias:**
   - Deposite, saque e transfira dinheiro entre as contas.

4. **Busque Contas:**
   - Utilize o método `buscarConta` para localizar uma conta pelo número.

5. **Remova Contas (Opcional):**
   - Se necessário, utilize o método `removerConta` para remover uma conta do banco.

