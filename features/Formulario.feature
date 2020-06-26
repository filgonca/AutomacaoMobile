#language: pt

Funcionalidade: Formulario
	
	Contexto:
    Dado que um usuario acesse o app CT Appium
    Quando acessar menu Formulario
		
  Cenario: Preencher Campo
    E preencher campo texto
		Entao verificar campo preenchido
	
	Cenario: Interagir com Combobox
    E selecionar item do combobox
		Entao verificar valor do combobox
	
	Cenario: Interagir com Checkbox
    E selecionar checkbox
		Entao verificar checkbox selecionado
	
	Cenario: Interagir com Switchbox
    E selecionar switchbox
		Entao verificar switchbox selecionado

	Cenario: Preencher cadastro
    E preencher cadastro
		Entao verificar dados preenchidos
	
	Cenario: Alterar data
    E alterar a data
    Entao verificar valor da data alterada
    
  Cenario: Alterar hora
    E alterar a hora
    Entao verificar valor da hora alterada
