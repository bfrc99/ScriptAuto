# language: es

Característica: Realizar compra de prendas de vestir
  Como cliente de la tienda virtual
  Quiero ingresar a la página http://automationpractice.com/index.php
  Para realizar la compra de prendas de vestir

  @EscenarioSinEjemplos
  Escenario: Agregar articulos al carrito de compras
    Dado que un cliente ya registrado desea comprar prendas de vestir
    Cuando el ingrese a la tienda y adicione la cantidad de 1 Blouse al carrito de compras
    Entonces el vera la lista de prendas seleccionadas en el carrito de compras
  @EscenarioConEjemplos
  Esquema del escenario: Agregar articulos al carrito de compras
    Dado que un nuevo cliente ingresa a la tienda virtual
      | <nPrenda> | <cSeleccionada> |
    Cuando él agrega prendas de vestir al carro
    Entonces él ve la lista de prendas de vestir seleccionadas

    Ejemplos:
     | nPrenda | cSeleccionada |
     | Blouse | 1             |