#language: pt
Funcionalidade: DragNDrop
	
	@all
  Cenario: Interagir com menu DragNDrop
    Dado que um usuario acesse o app CT Appium
    Quando acessar menu DragNDrop
    E verificar estado inicial
		E arrastar a tela para cima
		E verificar estado intermediario
		E arrastar a tela para baixo
		Entao verificar estado final
