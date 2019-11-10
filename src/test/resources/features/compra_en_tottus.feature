#Author: andres.cam17@gmail.com


Feature: Como usuario quiero ingresar a la pagina web TOTTUS y comprar un producto

  @AgregarProducto
  Scenario: Agregar un producto al carrito de compras
    Given que Andres ingresa a la pagina TOTTUS
    When agrega un microondas de refencia HMM20PEB
    Then Valida carrito de compras