
  Feature: Crear aforos

    Scenario: Realizar la creación de las abscisa con los datos que compone un aforo
      Given Ingresar a la url de acueducto
      When El usuario ingresa los datos del aforo
      Then Se crea el aforo exito