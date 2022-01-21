def createUnit()
{
	echo "In createUnit"
}

def buildUnit()
{
	script{
		echo "Building here on machine with ${params.NXRelease} and ${params.UnitPath}"
		sh "chmod +x ./build.sh "
		sh "./build.sh ${params.NXRelease} ${params.UnitPath}"
		
	}
}

def TestUnit()
{
	echo "In TestUnit"
}

return this
