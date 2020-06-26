#language: pt
Funcionalidade: SwipeList

  Cenario: Interagir com SwipeList
    Dado que um usuario acesse o app CT Appium
    Quando clicar no menu swipelist
		E arrastar OpcaoUm para esquerda
		E clicar OpcaoUmMais
		E validar texto OpcaoUmmais
		E arrastar OpcaoQuatro para esquerda
		E clicar OpcaoQuartoMenos
		E validar texto OpcaoQuatroMenos
		E arrastar OpcaoCinco para direita
		Entao validar texto OpcaoCinco
