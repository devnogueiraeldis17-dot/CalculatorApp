# CalculatorApp

Uma calculadora simples em Java para operações básicas (+, -, *, /) com validação de entrada e tratamento de erros.  
Este projeto é voltado para iniciantes em Java que querem aprender sobre loops, métodos, exceções e interação com o usuário.

---

## 📝 Funcionalidades

- Soma (`+`), subtração (`-`), multiplicação (`*`) e divisão (`/`)  
- Validação de números para evitar erros de entrada  
- Tratamento de divisão por zero  
- Loop para realizar múltiplas operações até o usuário decidir parar  
- Interface de texto simples e amigável  

---

## 💻 Requisitos

- Java 8 ou superior  
- Terminal ou IDE para executar programas Java (IntelliJ, Eclipse, VS Code etc.)  

---

## 🚀 Como executar

1. Clone este repositório:

git clone https://github.com/SEU-USUARIO/CalculatorApp.git
Acesse a pasta do projeto:

cd CalculatorApp
Compile o código:

javac CalculatorApp.java
Execute o programa:


java CalculatorApp
🎯 Uso
O programa solicitará o primeiro número:

Insira um número:
Depois solicitará o segundo número:

Insira um número:
Em seguida, solicitará a operação (+ - * /):


Copiar código
Insira a operação (+ - * /):
O resultado será exibido no formato:

Copiar código
Resultado: 15.0
O programa perguntará se deseja realizar outra operação:

Copiar código
Deseja realizar outra operação? S / N
Digite S para continuar ou N para encerrar.

⚠️ Observações
Digitar letras ou símbolos no lugar de números exibirá uma mensagem de erro e solicitará novamente.

Divisão por zero é bloqueada, o usuário será informado com a mensagem:


Não é possível dividir por Zero!
📂 Estrutura do projeto

CalculatorApp/
│
├─ CalculatorApp.java    # Código principal da calculadora
└─ README.md             # Este arquivo
