 pipeline {
     agent { docker 'python:3.5.1' }

     stages {
        stage('test') {
            steps {
                sh 'python --version'
            }
        }
    }

 post {
   always {
     archiveArtifacts artifacts: 'test.java' , fingerprint:true
     }
   }
 }

