 pipeline {
    agent { docker 'node:6.3' }
    stages {
        stage('build') {
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

