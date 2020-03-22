#!/bin/bash

echo "Menu:"
echo "1. Convert Celsius temperature into Fahrenheit"
echo "2. Convert Fahrenheit temperatures into Celsius"
echo -n "Select your choice (1-2) : "
read choice
 
if [ $choice -eq 1 ]
then
	echo -n "Enter temperature (C) : "
 	read celcius
 	farenhite=$(( $(( $(( 9 / 5)) * $celcius )) + 32 ));
 	echo "Farenhite temp: " $farenhite
elif [ $choice -eq 2 ]
then
	echo -n "Enter temperature (F) : "
 	read farenhite
 	celcius=$(( $(( 5 / 9 )) * (( $farenhite - 32 )) ))
 	echo "Celcius temp: " $celcius
else
 	echo "Please select 1 or 2 only"
 	exit 1
fi
