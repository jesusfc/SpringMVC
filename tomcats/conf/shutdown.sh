#!/bin/bash

. ./setenv.sh

# matar tomcat
kill -9 `cat $CATALINA_BASE/catalina.pid`

# Stop tomcat normal
#`dirname $0`/../tomcatFisicos/$2/bin/catalina.sh stop


## Kill Terminal Tail
kill -9 `cat $CATALINA_BASE/terminal.pid`
