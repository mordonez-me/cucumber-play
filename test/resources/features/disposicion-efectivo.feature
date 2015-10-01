Feature: La cuenta no tiene fondos suficientes 
  Como titular de la cuenta
  Quiero disponer de efectivo desde un cajero
  Para obtener dinero cuando el banco está cerrado

  Scenario: La cuenta no tiene fondos suficientes
    Given que el balance de la cuenta es S/. 100
    And la cuenta es válida
	And el cajero tiene suficiente dinero
	When el titular de la cuenta solicita S/. 20
	Then el cajero debe otorgar S/. 20
	And el balance de la cuenta debe ser S/. 80
	And la tarjeta debe ser devuelta