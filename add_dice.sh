#!/bin/bash

X=$(( $RANDOM % 6 + 1 ))
echo "Dice 1: " $X
Y=$(( $RANDOM % 6 + 1 ))
echo "Dice 2: " $Y
Z=$(( $X + $Y ))
echo "Dice 1 & 2: "$Z
