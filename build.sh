#!/bin/bash

echo "Here in build.sh script on host "
echo "Release = $1"
echo "Path = $2"

Release=$1
Path=$2
/usr/site/devop_tools/bin/unit add -b -p @${Release} -t DEV -w SUB ${Path} -R y -O y -DO_LINK_OPT y