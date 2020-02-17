#!/bin/bash

os=("ubantu" "aaa" "ggg")
os[4]="hfgjk"
echo "${os[@]}"
echo "${os[1]}"
echo "${!os[@]}"
echo "${#os[@]}"
string=hafgkhaghaghgak
echo "${string[@]}"
echo "${string[0]}"
echo "${#string[@]}"
