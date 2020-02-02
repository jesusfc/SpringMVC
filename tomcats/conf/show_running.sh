#!/bin/bash


ps aux | grep -oEi "[c]atalina\.base(.*)" | awk '{print $1}'
