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






==============================================
=============================================


creeamos una instancia de compute engine
creamos una instancia de sql cloud
instalamos google cloud sdk
instalamos dbeaver
https://www.youtube.com/watch?v=GwG6QgDL5yA
el video explica como usar de forma local la instancia de sql creada en sql cloud

ACLARACION: lo advierte en el video. pero cuidado que cuando bajamos y subimos la base en google puede cambiar la ip

===========================================================================================================
===========================================================================================================


instalamos docker
configuramos docker en nuestro proyecto. ver mi proyectito ahi va a estar el dockerfile
y para que se cree y ejecute la imagen docker es:
mvn clean package (obvio parados en nuestro proyecto)
docker build -f Dockerfile -t app .
docker run  -p 8081:8081 -t app


===========================================================================================================
===========================================================================================================
DOCKER AND MORE

PUSH IMAGE
video explicativo: https://www.youtube.com/watch?v=pn0cPqUusRE

generamos una nueva imagen de docker pero con el name que necesitamos que tenga para ser subida (pusheada)
docker tag app gcr.io/my-first-project-on-gcp-lucas/app

ACLARACION: cuando creas la imagen con el docker build bla bla, genera una nueva imagen. con "docker ps" podes ver las imageens creadas y tambien los nombres para saber con que armar el path del renglon de arriba. 
"my-first-project-on-gcp-lucas" es el nombre de mi proyecto creado en GCP

pusheamos la imagen (esto lo lance en la consola de google de la sdk que instale en la compu):
docker push gcr.io/my-first-project-on-gcp-lucas/app

ACLARACION: si el comando de arriba no te dejo completarlo por credenciales o algo parecido
ejecutar: gcloud auth configure-docker
y luego ejecutar el docker push bla bla
y si nuevamente te sigue dando error: docker-credential-gcr configure-docker 
y luego ejecutar el docker push bla bla