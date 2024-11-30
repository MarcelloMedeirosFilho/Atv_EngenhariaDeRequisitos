Aluno: Marcello José Menezes de Medeiros Filho - 01345111

1. Quais desafios você encontrou ao testar os métodos?

Inicialmente, a maior dificuldade foi entender o passo a passo de como configurar o ambiente, baixar as dependências e estruturar o projeto corretamente. Como eu tinha pouca familiaridade com o processo, precisei de orientação para configurar o Maven, adicionar as dependências do JUnit e configurar as variáveis de ambiente. Além disso, houve pequenos ajustes nos métodos e testes para tratar casos específicos, como entradas nulas, listas vazias e validação de exceções.
2. Houve alguma funcionalidade que precisou ser ajustada após criar os testes? Por quê?

Sim, algumas funcionalidades precisaram ser ajustadas durante o desenvolvimento dos testes:

    Cálculo do preço total: Foi necessário incluir validações para listas nulas e garantir que o desconto fosse tratado corretamente para valores inválidos (ex.: desconto negativo).
    Filtragem de produtos em estoque: Adicionei validações para lidar com listas nulas e vazias, para evitar que o método lançasse exceções inesperadas.
    Validação de cupom: Ajustei a validação para lançar a exceção correta quando o cupom era inválido, garantindo que os testes cobrissem todos os cenários possíveis.

Esses ajustes foram identificados durante a criação dos testes unitários, o que evidenciou a importância de testar cada funcionalidade em diferentes condições.
3. Como os testes ajudam a garantir a qualidade do software em cenários reais?

Os testes unitários garantem que cada funcionalidade do sistema funcione como esperado, mesmo em situações de entrada inesperada. Eles ajudam a:

    Evitar erros futuros: Qualquer alteração no código será rapidamente detectada pelos testes, reduzindo o risco de regressões.
    Cobrir diferentes cenários: Os testes validam não apenas os casos de sucesso, mas também os cenários de falha, como entradas inválidas, listas vazias ou nulas.
    Documentação de comportamento: Os testes servem como uma documentação viva, descrevendo exatamente como o sistema deve se comportar em diversas situações.
    Confiança no código: Ao rodar os testes e verificar que tudo funciona, há uma maior confiança de que o software está pronto para uso.
