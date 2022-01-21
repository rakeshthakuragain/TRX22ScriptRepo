def createUnit()
{
	echo "Creating unit..."
	script{		
		def unitFullPath="${params.UnitPath}/${params.NXRelease}_TranslatorWorker_${BUILD_TIMESTAMP}"
		sh "chmod +x ./createUnit.sh "
		sh "./createTranslatorWorkerUnit.sh ${params.NXRelease} ${unitFullPath}"		
	}
}

def buildUnit()
{
	echo "Building unit..."
	script{		
		def unitFullPath="${params.UnitPath}/${params.NXRelease}_TranslatorWorker_${BUILD_TIMESTAMP}"
		sh "chmod +x ./buildUnit.sh "
		sh "./buildTranslatorWorkerUnit.sh ${unitFullPath}"		
	}
}

def TestUnit()
{
	echo "Executing devtests..."
	script{		
		def unitFullPath="${params.UnitPath}/${params.NXRelease}_TranslatorWorker_${BUILD_TIMESTAMP}"
		sh "chmod +x ./executeTest.sh "
		sh "./executeTranslatorWorkerTest.sh ${unitFullPath}"		
	}
}

return this
