#language: pt
Funcionalidade: WebView

  Cenario: Interagir com WebView
    Dado que um usuario acesse o app CT Appium
    Quando acessar menu Seu Barriga Hibrido
		E preencher campo Email
		E preencher campo Senha
		E clicar no botao entrar
		Entao validar texto de boas vindas
