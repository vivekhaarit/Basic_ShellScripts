echo "Menu:"
echo "1. Convert Celsius temperature into Fahrenheit"
echo "2. Convert Fahrenheit temperatures into Celsius"
echo -n "Select your choice (1-2) : "
read choice
 
if [ $choice -eq 1 ]
then
	echo -n "Enter temperature (C) : "
 	read celcius
 # formula Tf=(9/5)*Tc+32
 	farenhite=$(( $(( $(( 9 / 5)) \* $celcius )) + 32 ))
 	echo "farenhite temp: " $farenhite
elif [ $choice -eq 2 ]
then
	 echo -n "Enter temperature (F) : "
 	read farenhite
 # formula Tc=(5/9)*(Tf-32) 
 	celcius=$(( $(( 5 / 9 )) \* (( $farenhite - 32 )) ))
 	echo "$celcius temp: " $celcius
else
 	echo "Please select 1 or 2 only"
 	exit 1
fi
