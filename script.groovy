def createUnit()
{
	echo "In createUnit"
}

def buildUnit()
{
	echo "In buildUnit"
	script{
		echo 'Building here on machine..'
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
