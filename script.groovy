def createUnit()
{
	echo "In createUnit"
}

def buildUnit()
{
	script{
		echo "Building here on machine with ${params.NXRelease} and ${params.UnitPath}"
		
		def unitFullPath="${params.UnitPath}/${params.NXRelease}_TranslatorWorker_${BUILD_TIMESTAMP}"
		sh "chmod +x ./build.sh "
		sh "./build.sh ${params.NXRelease} ${unitFullPath}"
		
	}
}

def TestUnit()
{
	echo "In TestUnit"
}

return this
