#!/bin/bash

ps aux | grep catalina.base | grep -v grep | awk '{print "kill -9 " $2}' | bash -v
