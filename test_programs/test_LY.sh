echo -e "Enter Year:\c"
read year

if [ $(( $year%4 )) -eq 0 ]
then
    echo "$year is Leap Year!"
else
    echo "$year is not a Leap Year!"
fi
