 pipeline {
     agent { docker 'python:3.5.1' }
    stages {
        stage('build') {
            steps {
                sh 'python --version'
            }
        }
    }

 post {
   always {
     archiveartifacts artifacts: 'test.java' fingerprint: true
     }
   }
 }

