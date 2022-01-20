def createUnit()
{
	echo "In createUnit"
}

def buildUnit()
{
	script{
		echo 'Building here on machine..'
		sh '''
		source ./build.sh
		'''
	}
}

def TestUnit()
{
	echo "In TestUnit"
}

return this
