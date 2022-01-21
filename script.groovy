def createUnit()
{
	echo "In createUnit"
}

def buildUnit()
{
	script{
		echo "Building here on machine with ${params.NXRelease} and ${params.UnitPath}"
		export Release=params.NXRelease
		export Path=params.UnitPath
		sh '''
		chmod +x ./build.sh
		echo 
		./build.sh ${Release} ${Path}
		'''
	}
}

def TestUnit()
{
	echo "In TestUnit"
}

return this
