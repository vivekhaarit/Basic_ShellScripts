 
echo "takes N and prints the Nth harmonic number"
read -p "N: " N
Hn=1
i=1
while [ $i -le $N ]
do
	Hn=$(( $Hn + 1 / $i ))
	i=$(( $i + 1 ))
done
echo $Hn
