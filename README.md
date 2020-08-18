# AREP_LAB2
Se realizó la implementación de un programa el cual busca calcular la media y la desviación estándar de un conjunto de n números, estos números son almacenados en una Linked List la cual fue implementada desde cero, además se registran datos y se muestran los resultados por medio de un servicio web implementado con el framework Spark y con despliegue en Heroku.

## Pre-requisitos
* [MAVEN](https://maven.apache.org/) - Administrador de dependencias.
* [GIT](https://git-scm.com/) - Control de versiones.
Para estar seguro de las versiónes que posee de maven, git y de java ejecute los siguientes comandos:
```
mvn -version  
git --version  
java -version  
```
## Instalación 
Para descargar el proyecto desde GitHub ejecute la siguiente linea:
```
git clone https://github.com/Camu10/AREP_LAB2.git
```

## Ejecutar
Dentro del directorio AREP_LAB2, desde la consola de comandos para compilar ejecutamos la siguiente linea:
```
mvn package
```
Para ejecutar el proyecto de manera local desde la consola de comandos ejecutamos la siguiente linea y desde un navegador buscamos `localhost:4567/` :
```
mvn exec:java
```

## Ejecutando las pruebas
Para correr las pruebas ejecutamos la siguiente linea:
```
mvn test
```
## Despliegue en Heroku
Para ingresar a la aplicación web desde cualquier navegador puede hacerlo dando click [aqui](https://arcane-plateau-03916.herokuapp.com/)

## Construido con
* [MAVEN](https://maven.apache.org/) - Administrador de dependencias.
* [GIT](https://git-scm.com/) - Control de versiones.
* [JUNIT](https://junit.org/junit5/) - Framework para realizar y automatizar pruebas.
* [SPARK](http://sparkjava.com/) - Framework para el desarrollo de aplicaciones web.
* [HEROKU](https://www.heroku.com/) - Plataforma para el despliegue.
* JAVA - Lenguaje de programación.

## Autor
* **Carlos Murillo** - [Camu10](https://github.com/Camu10)

## Licencia
Este proyecto está bajo la Licencia GNU(General Public License) - mira el archivo [LICENSE](LICENSE) para detalles.
