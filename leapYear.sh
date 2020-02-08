#!/bin/bash

echo -e "enter year: \c"
read yr

if [ $yr -ge 1582 ]
then
	if (( $yr%4==0 )) 
	then
	        if (( $yr % 100 == 0 ))
	        then
		        if (( $yr%400==0 ))
        		then
				echo "leap year"
			else
				echo "not a leap year"
		        fi
		else
			echo "leap year"
        	fi
	else
		echo "not a leap year"
	fi
else
	echo "Invalid input."
fi
var=$(( $yr%400 == 0 ))
echo $var
