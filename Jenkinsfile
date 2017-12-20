 pipeline {
     agent { docker 'python:3.5.1' }

     options {
       buildDiscarder(logRotator(numToKeepStr: '2' , artifactNumToKeepStr: '1'))
    stages {
        stage('build') {
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

