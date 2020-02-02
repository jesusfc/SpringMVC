
Bajar Eclipse Oxygen customizado para Desarrollo Jumbotours de:

ftp://ftp.jumbotours.com/DESARROLLO
user desarrollo
pass des0905

(funciona directamente metiendo la ruta en Nemo de Mint)

1. Descomprimir eclipse-oxygen-3a-*.zip

2. editar eclipse.ini
	ruta a JDK 8
	eclipse password con ruta a fichero con clave SVN

3. Crear una carpeta a mano donde se quiera crear el workspace, y descomprimir ahi el metadata*.zip

4. Arrancar eclipse apuntando al workspace creado

5. Checkout de rama desarrolloV3

6. Actualizar ruta de life cycle mapping metadata.xml en Window--> Preferences--> Maven --> Lifecycle Mappings (el fichero esta en rama_desarrolloV3/Jumbotours) 

7. Completar los system.properties y configuraciones de los proyectos como de costumbre. La compilacion se hara con Run As Maven Build. Shortcut CTRL + M con el foco en el proyecto que queramos compilar

8. Importar proyecto tomcats, que se explica a continuacion:



*****************************************************************************************************************************************
*** TOMCAT FISICOS E INSTANCIAS
*****************************************************************************************************************************************

Solo hay 2 instalaciones fisicas de tomcat, TOMCAT_6 Y TOMCAT 8.5:

solo contienen BIN y LIB (ejecutables y librerias) y ya viene preparado , no hay que tocar nada

Las configuraciones de cada instancia tambien vienen ya configuradas con el checkout de SVN.

La unica configuracion que hay que editar para que todo funcione es:

***********************************
*********  conf/jumbo_setenv.sh
***********************************

Las configuraciones de JREBEL se cogen de: 

vista JRebel Configuration --> Startup --> Run locally from command line --> 64 bit JVM y Tomcat xxx
 


*****************************************************************************************************************************************
PARA ARRANCAR UN TOMCAT (por ejemplo INTRANET):
*****************************************************************************************************************************************

1. Window --> Show View --> Ant.
2. Arrastrar o importar el fichero: tomcats/build.xml 
3. Doble click en "start-intranet". Esto arranca el tomcat en modo debug.


*****************************************************************************************************************************************
Para hacer TAIL de catalina.out:
*****************************************************************************************************************************************

- Descargar e instalar PAC Manager

	https://sourceforge.net/projects/pacmanager/files/latest/download

- Importar configuraciones:

	Boton derecho en AVAILABLE CONNECTIONS --> Import Connections... --> elegir fichero tomcats/conf/PAC/pac_export_ALL.yml

- Configurar variable global:

	Preferences --> Global Variables --> Añadir --> Variable RAMA_DES --> ruta local hasta <rama_desarrolloV3_0>


Esta configurado para que al abrir el PAC se abran todas las consolas a la vez en pestañas, se puede customizar en local    


*****************************************************************************************************************************************
PARA CONFIGURAR HOT DEPLOY CON JREBEL
*****************************************************************************************************************************************

1. En proyectos web --> Importante poner faceta de Dynamic Web Module, y el deployment Assembly con las rutas correctas a los fuentes (no hace falta apartado de librerias)
2. Help --> JRebel --> Configuration . Asegurarnos que todos los proyectos los tenemos con check en la primera columna. De esta forma se autogenera el rebel.xml en carpeta resources de cada proyecto 
3. CTRL + M para compilar. De esta forma estamos agregando el rebel.xml a los jar's y/o war's a desplegar   
4. En el arranque de tomcat, checkear los directorios que esta monitorizando JRebel 


*****************************************************************************************************************************************
PARA CONFIGURAR EL LANZADO DE DEBUG DE TOMCAT'S AUTOMATICO:
*****************************************************************************************************************************************

1. Instalar plugin para lanzar debug configurations desde ANT (https://github.com/marook/eclipse-remote-control)

	Help --> Install new software :

		https://github.com/marook/eclipse-remote-control/raw/master/workspaces/erc/update_site/site.xml


2. Se han comitado todas las launchConfigurations con los puertos configurados, 

File --> Import --> Launch Configurations --> From Directory "tomcats/conf/launchConfigurations"




*****************************************************************************************************************************************
PARA CREAR UNA NUEVA INSTANCIA DE TOMCAT:
*****************************************************************************************************************************************

1. COPIAR UNA EXISTENTE: si se quiere TOMCAT 8, copiar INTRANET . Para TOMCAT 6, copiar una LIVE ... Y RENOMBRAR 

2. bin/setenv.sh --> configurar un puerto para debug que no se este usando, y las variables de JVM de la maquina 
	PARA LAS RUTAS ABSOLUTAS SE PUEDE USAR $RAMA_DES

3. conf/server.xml --> cambiar los 3 puertos (1 Server port y 2 Connector port) a alguno que no se este usando (el importante a recordar es el Server port)
	y en <ContextPath> cambiar:
	- path="/intranet" (contexto de despliegue) 
	- docBase="jumbo/target/jumbo-0.0.16-SNAPSHOT" (hacemos que despliegue directamente de la compilacion maven)

4. build.xml --> crear target's para arrancar y parar tomcat:
	copiar 1 bloque existente, 
	 - app-name debe ser el nombre de la carpeta del paso 1. 
	 - Si es tomcat 8, se debe pasar 			<param name="tomcat-name" value="TOMCAT_8.5" />   (mirar intranet)

5. crear launch configuration en conf/launchConfigurations con el puerto indicado en el punto 2



*****************************************************************************************************************************************
para entender el flujo de ejecucion:
*****************************************************************************************************************************************

Ant Start --> jumbo_startup.sh --> ./jumbo_setenv.sh --> <tomcatFisico>/bin/catalina.sh --> <instancia>/bin/setenv.sh


*****************************************************************************************************************************************
PARA PERMITIR QUE ECLIPSE LANCE VARIOS ANT A LA VEZ 
*****************************************************************************************************************************************

Run -> External Tools -> External Tools Configurations --> JRE --> Separate JRE
