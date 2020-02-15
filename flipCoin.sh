#!/bin/bash

read -p "how many times you want to flip the coin: " n
i=1
headcount=0
tailcount=0
while [ $i -le $n ]
do
	r=$(( $RANDOM % 10 ))
	if [ $r -le 4 ]
	then headcount=$(expr $headcount + 1)
	else tailcount=$(expr $tailcount + 1)
	fi
	i=$(expr $i + 1)
done
headpercent=`echo - | awk '{print '$headcount' / '$n'}'`
echo "head %: "$headpercent
tailpercent=`echo - | awk '{print '$tailcount' / '$n'}'`
echo "tail %: "$tailpercent
