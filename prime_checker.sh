echo "enter a prime no to check no is prime or not"
read -p "num: " num
for(( i=2; i<$num; i++ ))
do
	if [ $num%$i -eq 0 ]
	then
		echo "not prime"
		;;
	fi
done

if [ $i -eq $num ]
then
	echo "prime"
fi
