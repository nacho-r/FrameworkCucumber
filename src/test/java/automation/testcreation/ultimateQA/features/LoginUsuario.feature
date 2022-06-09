Feature: Login Usuario
  Como usuario
  quiero registrarme, recuperar contraseña y navegar en la web

  Background: Pagina inicio
    Given que se esta en la url "https://courses.ultimateqa.com/"
    When presiona el boton Sign In

  Scenario: Registro nuevo usuario
    Given que el usuario presiona el boton "Create a new account"
    When el usuario ingresa los datos "Isaac", "Romero", "prueba14@gmail.com", "123456prueba"
    And presiona el boton de aceptar terminos y condiciones
    Then al presionar el boton Sign Up mostrara "Isaac R" en Inicio.


  Scenario: Login exitoso
    Given el usuario está registrado, se inicia sesion con las credenciales correctas se debe mostrar el texto "Welcome Back!"
    When el usuario ingresa el "prueba@gmail.com" y la "123456prueba" correspondiente
    Then al presionar el boton Sign In mostrara "Isaac R" en Inicio.

    Scenario: Login fallido
      Given el usuario se inicia sesion con las credeciales incorrectas se debe mostrar el texto "Welcome Back!"
      When el usuario ingresa el "prueba@gmail.com" y la "123456pruebaf"
      Then al presionar el boton Sign In mostrara mensaje de "Invalid email or password."

  Scenario: Recuperacion credenciales
    Given que el usuario tuvo un login fallido, se presiona el boton Forgot Password?
    When el usuario ingresa "prueba@gmail.com" y presiona el boton Submit
    Then se muestra un mensaje "Help is on the way!"

    Scenario: Ingreso curso Modern React and NodeJS Development
      Given el usuario está registrado, se inicia sesion con las credenciales correctas se debe mostrar el texto "Welcome Back!"
      When el usuario ingresa el "prueba@gmail.com" y la "123456prueba" correspondiente
      And en la seccion de cursos presiona el curso "Modern React and NodeJS Development"
      Then presiona el boton para iniciar video
