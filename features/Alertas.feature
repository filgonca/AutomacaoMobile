#language: pt
Funcionalidade: Alertas

	Contexto:
    Dado que um usuario acesse o app CT Appium
    Quando acessar menu Alertas
		
  Cenario: Confirmar alerta
    E clicar em alerta confirm
    E verificar os textos do alerta confirm
    E confirmar alerta
    E verificar nova mensagem do alerta confirm
    Entao clicar em sair

  Cenario: Clicar fora do alerta
    E clicar em alerta simples
    E verificar o texto do alerta simples
    Entao clicar fora do alerta simples
