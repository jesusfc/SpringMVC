#!/bin/bash

. ./setenv.sh

## Descomentar para limpiar work
#rm -rf $CATALINA_BASE/work

`dirname $0`/../tomcatFisicos/$2/bin/catalina.sh jpda start

## Abrir terminal automaticamente - 2 opciones , gnome con o sin opcion -t

export DIRLOG=$(cd `dirname $0`/../instancias/$1/logs; pwd)
export TITLE=$1;

# descomentar para GNOME ANTIGUO. x ej version 3.6.2
#gnome-terminal -e 'bash -c "echo $$ > $CATALINA_BASE/terminal.pid ;tail -100f $DIRLOG/catalina.out"' -t "$TITLE" --maximize

# gnome sin opcion -t para setear el title. x ej version 3.18.3
# gnome-terminal -e 'bash -c "echo -ne \"\033]0;$TITLE\007\"; echo $$ > $CATALINA_BASE/terminal.pid ;tail -100f $DIRLOG/catalina.out"' --tab --maximize