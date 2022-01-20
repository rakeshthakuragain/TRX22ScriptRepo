def createUnit()
{
	echo "In createUnit"
}

def buildUnit()
{
	echo "In buildUnit"
	script{
		echo 'Building..'
		sh '''
		hostname
		'''
	}
}

def TestUnit()
{
	echo "In TestUnit"
}

return this
