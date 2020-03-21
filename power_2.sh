#!/bin/bash -x

echo "********this will print powers of 2 till N*********"
read -p "N: " N
for (( exp=1; exp<=$N; exp++ ))
do
	exp=$(($exp*2));
	echo $exp
done
