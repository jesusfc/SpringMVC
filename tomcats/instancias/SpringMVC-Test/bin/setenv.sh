
# PROPIEDADES JVM

export JPDA_ADDRESS=7008

export CATALINA_OPTS="$CATALINA_OPTS 

-Dlog4j.configuration=file:$RAMA_DES/SpringMVC-Test/src/main/resources/properties/log4j.properties
-Dproperties.path=file:$RAMA_DES/SpringMVC-Test/src/main/resources/properties/system.properties

"
