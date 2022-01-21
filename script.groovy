def createUnit()
{
	echo "In createUnit"
}

def buildUnit()
{
	script{
		echo 'Building here on machine..'
		sh '''
		chmod +x ./build.sh
		./build.sh ${params.NXRelease} ${params.UnitPath}
		'''
	}
}

def TestUnit()
{
	echo "In TestUnit"
}

return this
