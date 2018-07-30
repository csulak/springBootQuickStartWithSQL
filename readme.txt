EXPLICACION DE COMO SUBIR TU PROYECTO UNA VEZ QUE LO ESTUVISTE AVANZANDO Y QUERES SUBIRLO A GITHUB

(Suponiendo que ya tienen el proyecto hecho en su computadora y se llama "ejemploPruebas")

Van a GitHub > https://github.com/
ponen crear nuevo repositorio
le ponen un Nombre, descripción, y esta ultima opción es muy importante (Initialize this repository with a README) , tienen que dejarla des habilitada.
oprimen el boton CREATE REPOSITORY
En la siguiente pantalla la primer opción es la buena.. (Create a new repository on the command line)

Van a su computadora y abren la linea de comandos, CMD..
se dirigen a la ruta en donde tienen el proyecto, eg:
cd C:\Users\oswaldo\Documents\proyectosAndroid\ejemploPruebas

ya estando dentro de su proyecto ponen los siguientes comandos.
git init
git add .
git commit -m "mi primer commit"
git remote add origin https://github.com/oswaldo89/ejemploPruebas.git
git push -u origin master


==========================================


Para poder usar el proyecto usar el ide STS
yo el proyecto lo hice con la version 
Version: 3.9.5.RELEASE

==========================================

Aprendi spring boot quick start aca:
https://www.youtube.com/watch?v=99Nw2smMTLg&index=3&list=PLmbC-xnvykcghOSOJ1ZF6ja3aOgZAgaMO

su pagina es: https://javabrains.thinkific.com/courses/springboot-quickstart