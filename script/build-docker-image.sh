#!/usr/bin/env bash
tag=latest
if [ $# -eq 1 ]
 then
   tag=$1
fi
echo $tag
docker build -t spring-boot-microservice:$tag .