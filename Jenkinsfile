 pipeline {
    agent { docker 'node:6.3' }
    stages {
        stage('test') {
            steps {
                sh 'npm --version'
            }
        }
    }
 
 post {
   always {
     archiveArtifacts artifacts: 'test.java' , fingerprint:true
     }
   }
 }

