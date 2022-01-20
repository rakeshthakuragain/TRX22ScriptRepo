pipeline {
    agent none

    stages {
        stage('Build') {
            agent { label 'di2inpun0050lv0​' }
            steps {
                echo 'Building..'
                sh '''
				hostname
                '''
            }
        }
    }

    post {
        success {
            echo 'This will run only if successful'
        }
    }
}
