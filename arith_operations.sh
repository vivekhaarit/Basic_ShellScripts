#!/bin/bash

echo -n "Enter three numbers: "
	read num1 num2 num3
echo $(( $num1 + $num2 * $num3 )) 
echo $(( $num1 % $num2 + $num3 )) 
echo $(( $num3 + $num1 / $num2 )) 
echo $(( $num1 * $num2 + $num3 )) 


