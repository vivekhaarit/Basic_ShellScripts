#!/bin/bash 

echo "********this will print powers of 2 till N*********"
read -p "N: " N
i=1
exp=1
while [ $i -le $N ]
do
	exp=$(( $exp * 2 ));
	echo $exp
	i=$(( $i + 1 ))
done
