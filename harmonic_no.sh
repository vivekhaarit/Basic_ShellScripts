echo "takes N and prints the Nth harmonic number"
read -p "N: " N
Hn=1
for (( i=1; i<=$N; i++ ))
do
	Hn=$(($Hn * $((1/$i)) ));
done
echo $Hn
