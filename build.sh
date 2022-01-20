#!/bin/bash

echo "Here in build.sh script on host "
echo "Release = $1"
echo "Path = $2"
/usr/site/devop_tools/bin/unit add -b -p @${NXRelease} -t DEV -w SUB ${UnitPath}/${NXRelease}_TranslatorWorker_1 -R y -O y -DO_LINK_OPT y