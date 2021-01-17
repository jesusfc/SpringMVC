#!/bin/bash


################  CUSTOMIZAR ######################################## 

#export IP_LOCAL=192.168.8.161

export JAVA_HOME=/home/jesus/MisProgramas/JDKs/jdk1.8.0_241


# copiar de: vista JRebel Configuration --> Startup --> Run locally from command line --> 64 bit JVM y Tomcat xxx

#export REBEL_BASE=/home/pmiinf61/.jrebel
#export REBEL_HOME=
#export REBEL_HOME=/home/pmiinf61/MisProgramas/Eclipses/EclipsePhotonWSpace/plugins/org.zeroturnaround.eclipse.embedder_2019.1.2.RELEASE/jrebel

################  CUSTOMIZAR ########################################


export APP_NAME=$1

export TOMCAT=$2

export RAMA_DES=$(cd ../..; pwd)

export CATALINA_HOME=$RAMA_DES/tomcats/tomcatFisicos/$2

export CATALINA_BASE=$RAMA_DES/tomcats/instancias/$1

export CATALINA_PID=$CATALINA_BASE/catalina.pid


###### ARGUMENTOS JAVA COMUNES A TODOS LOS TOMCATS  #######

#export JAVA_OPTS="

#-noverify
#-server

#-Ddesarrollo=true
#-Dtest=true

#-Djava.rmi.server.RMIClassLoaderSpi=com.jumbotours.utils.tomcat.rmi.RMIClassLoaderSpiImpl

#-Dhttp.proxyHost=proxy.services.gjt
#-Dhttp.proxyPort=3128
#-Dhttp.nonProxyHosts='jip.easytravelsystem.com|89.140.150.*|localhost|192.168.8.*|as400.jumbotours.com'

#-XX:+UnlockCommercialFeatures
#-XX:+FlightRecorder
 
#$JAVA_OPTS

#"
#