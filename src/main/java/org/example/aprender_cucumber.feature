# language: pt
Funcionalidade: Aprender Cucumber
  Como um aluno
  Eu quero aprender a utilizar cucumber
  Para que eu possa automatizar critérios de aceitação

Cenário: Deve executar especificação
  Dado que criei o arquivo corretamente
  Quando Quando executá-lo
  Então Então a especificação deve finalizar com sucesso

Cenário: Deve incrementar contador
  Dado que o valor do contador é 15
  Quando eu incrementar em 3
  Então o valor do contador será 18
