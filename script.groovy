def createUnit()
{
	echo "Creating unit..."
	script{		
		def unitFullPath="${params.UnitPath}/${params.NXRelease}_TranslatorWorker_${BUILD_TIMESTAMP}"
		sh "chmod +x ./createUnit.sh "
		sh "./createUnit.sh ${params.NXRelease} ${unitFullPath}"		
	}
}

def buildUnit()
{
	echo "Building unit..."
	script{		
		def unitFullPath="${params.UnitPath}/${params.NXRelease}_TranslatorWorker_${BUILD_TIMESTAMP}"
		sh "chmod +x ./buildUnit.sh "
		sh "./buildUnit.sh ${params.NXRelease} ${unitFullPath}"		
	}
}

def TestUnit()
{
	echo "Executing devtests..."
	script{		
		def unitFullPath="${params.UnitPath}/${params.NXRelease}_TranslatorWorker_${BUILD_TIMESTAMP}"
		sh "chmod +x ./executeTest.sh "
		sh "./executeTest.sh ${params.NXRelease} ${unitFullPath}"		
	}
}

return this
