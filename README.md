Aluno: Marcello José Menezes de Medeiros Filho - 01345111

# Reflexão e Discusão

## 1. Quais desafios você encontrou ao testar os métodos?

Inicialmente, a maior dificuldade foi entender o passo a passo para configurar o ambiente, baixar as dependências e estruturar o projeto corretamente. Como eu tinha pouca familiaridade com o processo, precisei de orientação para configurar o Maven, adicionar as dependências do JUnit e ajustar as variáveis de ambiente. Além disso, foi necessário fazer pequenos ajustes nos métodos e testes para tratar casos específicos, como entradas nulas, listas vazias e validação de exceções.

## 2. Houve alguma funcionalidade que precisou ser ajustada após criar os testes? Por quê?

Sim, algumas funcionalidades precisaram ser ajustadas durante o desenvolvimento dos testes:

  ● Cálculo do preço total: Foi necessário incluir validações para listas nulas e garantir que o desconto fosse tratado corretamente em casos de valores inválidos (ex.: desconto negativo).
  
  ● Filtragem de produtos em estoque: Adicionei validações para lidar com listas nulas e vazias, evitando que o método lançasse exceções inesperadas.
   
  ● Validação de cupom: Ajustei a validação para lançar a exceção correta quando o cupom era inválido, garantindo que os testes cobrissem todos os cenários possíveis.

Esses ajustes foram identificados durante a criação dos testes unitários, o que evidenciou a importância de testar cada funcionalidade em diferentes condições.

## 3. Como os testes ajudam a garantir a qualidade do software em cenários reais?

Os testes unitários desempenham um papel fundamental na garantia de qualidade do software. Eles oferecem benefícios como:

  ● Evitar erros futuros: Qualquer alteração no código será rapidamente detectada pelos testes, reduzindo o risco de introdução de regressões.
  
  ● Cobrir diferentes cenários: Os testes validam tanto os casos de sucesso quanto os cenários de falha, como entradas inválidas, listas vazias ou nulas.
   
  ● Documentação de comportamento: Servem como uma documentação viva, descrevendo exatamente como o sistema deve se comportar em diversas situações.
  
  ● Confiança no código: Ao rodar os testes e verificar que tudo está funcionando corretamente, há maior confiança de que o software está pronto para uso em produção.
