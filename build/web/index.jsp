<%-- 
    Document   : index
    Created on : 18/10/2021, 11:37:10 AM
    Author     : david
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://necolas.github.io/normalize.css/8.0.1/normalize.css">
        <link href="https://fonts.googleapis.com/css2?family=Roboto:wght@400;700&display=swap" rel="stylesheet">
        <link rel="stylesheet" href="estilos.css">
    </head>
    <body>
       <main style="max-width: 800px; width: 90%; margin: auto; padding: 40px;">

            <h1>¡Bienvenido al juego!</h1>
            <p>Aqui encontrará el numero del caballo y el nombre por el cual desea apostar </p>

            <div id="Ncaballos">
                1: zeus <br>
                2: Bucéfalos <br>
                3: Millonario<br>
                4: Relampago <br>
            </div>


            <form action="servlet" method="post" class="formulario" id="formulario">
                <!-- Grupo: Usuario -->
                <div class="formulario__grupo" id="grupo__usuario">
                    <label for="usuario" class="formulario__label">Jugador 1</label>
                    <div class="formulario__grupo-input">
                        <input type="text" class="formulario__input" name="jugador1" id="usuario">
                        <i class="formulario__validacion-estado fas fa-times-circle"></i>
                    </div>
                    <p>Escriba el nombre del jugador</p>
                </div>

                <!-- Grupo: valor apuesta -->
                <div class="formulario__grupo" id="grupo__nombre">
                    <label for="nombre" class="formulario__label">Dinero a apostar</label>
                    <div class="formulario__grupo-input">
                        <input type="number" class="formulario__input" name="valorAP1" id="nombre" placeholder="5000">
                        <i class="formulario__validacion-estado fas fa-times-circle"></i>
                    </div>
                    <p class="formulario__input-error">El dinero a apostar no puede ser mas de 10.000</p>
                </div>

                <!-- Grupo: apuesta caballo -->
                <div class="formulario__grupo" id="grupo__password">
                    <label for="password" class="formulario__label"># caballo a apostar</label>
                    <div class="formulario__grupo-input">
                        <input type="number" class="formulario__input" name="caballoAP1" id="password">
                        <i class="formulario__validacion-estado fas fa-times-circle"></i>
                    </div>
                    <p class="formulario__input-error">Escriba el numero del caballo por el que va a hacer la apuesta</p>
                </div>

                <!--usuario 2-->

                <!-- Grupo: Usuario -->
                <div class="formulario__grupo" id="grupo__usuario">
                    <label for="usuario" class="formulario__label">Jugador 2</label>
                    <div class="formulario__grupo-input">
                        <input type="text" class="formulario__input" name="jugador2" id="usuario">
                        <i class="formulario__validacion-estado fas fa-times-circle"></i>
                    </div>

                </div>

                <!-- Grupo: valor apuesta -->
                <div class="formulario__grupo" id="grupo__nombre">
                    <label for="nombre" class="formulario__label">Dinero a apostar</label>
                    <div class="formulario__grupo-input">
                        <input type="number" class="formulario__input" name="valorAP2" id="nombre" placeholder="5000">
                        <i class="formulario__validacion-estado fas fa-times-circle"></i>
                    </div>
                </div>

                <!-- Grupo: apuesta caballo -->
                <div class="formulario__grupo" id="grupo__password">
                    <label for="password" class="formulario__label"># caballo a apostar</label>
                    <div class="formulario__grupo-input">
                        <input type="number" class="formulario__input" name="caballoAP2" ">
                        <i class=" formulario__validacion-estado fas fa-times-circle"></i>
                    </div>
                </div>

                <!--usuario 3-->

                <!-- Grupo: Usuario -->
                <div class="formulario__grupo" id="grupo__usuario">
                    <label for="usuario" class="formulario__label">Jugador 3</label>
                    <div class="formulario__grupo-input">
                        <input type="text" class="formulario__input" name="jugador3" id="usuario">
                        <i class="formulario__validacion-estado fas fa-times-circle"></i>
                    </div>

                </div>

                <!-- Grupo: valor apuesta -->
                <div class="formulario__grupo" id="grupo__nombre">
                    <label for="nombre" class="formulario__label">Dinero a apostar</label>
                    <div class="formulario__grupo-input">
                        <input type="number" class="formulario__input" name="valorAP3" id="nombre" placeholder="5000">
                        <i class="formulario__validacion-estado fas fa-times-circle"></i>
                    </div>
                </div>

                <!-- Grupo: apuesta caballo -->
                <div class="formulario__grupo" id="grupo__password">
                    <label for="password" class="formulario__label"># caballo a apostar</label>
                    <div class="formulario__grupo-input">
                        <input type="number" class="formulario__input" name="caballoAP3" ">
                        <i class=" formulario__validacion-estado fas fa-times-circle"></i>
                    </div>
                </div>

                <!--usuario 4-->

                <!-- Grupo: Usuario -->
                <div class="formulario__grupo" id="grupo__usuario">
                    <label for="usuario" class="formulario__label">Jugador 4</label>
                    <div class="formulario__grupo-input">
                        <input type="text" class="formulario__input" name="jugador4" id="usuario">
                        <i class="formulario__validacion-estado fas fa-times-circle"></i>
                    </div>

                </div>

                <!-- Grupo: valor apuesta -->
                <div class="formulario__grupo" id="grupo__nombre">
                    <label for="nombre" class="formulario__label">Dinero a apostar</label>
                    <div class="formulario__grupo-input">
                        <input type="number" class="formulario__input" name="valorAP4" id="nombre" placeholder="5000">
                        <i class="formulario__validacion-estado fas fa-times-circle"></i>
                    </div>
                </div>

                <!-- Grupo: apuesta caballo -->
                <div class="formulario__grupo" id="grupo__password">
                    <label for="password" class="formulario__label"># caballo a apostar</label>
                    <div class="formulario__grupo-input">
                        <input type="number" class="formulario__input" name="caballoAP4" ">
                        <i class=" formulario__validacion-estado fas fa-times-circle"></i>
                    </div>
                </div>

                <!--boton enviar-->

                <div class="formulario__grupo formulario__grupo-btn-enviar">
                    <button type="submit" class="formulario__btn" name="btnEnviar">Enviar</button>
                </div>
            </form>
        </main>
    </body>
</html>
