Feature: Como usuario, quiero interactuar con la aplicacion

  @FichapDemo

  Scenario Outline: El usuario inicia la aplicación e ingresa su nombre de usuario y contraseña para acceder
    Given la aplicación es cargada correctamente
    When ingreso nombre de usuario <userEmail> y contraseña <password>
    And tomo foto del usuario
    Then la aplicación redirige a la pantalla de ingreso a cuenta de la aplicación

    Examples:
      | userEmail              | password       |
      | andresuli994@gmail.com | fichapAndres88 |

  @FichapModProfile

  Scenario Outline: El usuario cambia los datos del perfil
    Given que el usuario se encuentra en la home view de la aplicación
    When presiona el menú hamburguesa y posteriormente la opcion Perfil
    And ingresa el nuevo correo <email> y ingresa el nuevo domicilio <address>
    And presiona el botón Guardar
    And presiona Ok del Aviso
    Then la aplicación guarda el nuevo email <email> y el nuevo domicilio <address>

    Examples:
      | email                  | address         |
      | andresuli994@gmail.com | Av. Dorrego 321 |

