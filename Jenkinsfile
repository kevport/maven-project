pipeline {
    agent any

    tools {
        maven 'localMaven'
    }

    stages{
        stage('build'){
            steps {
                sh 'mvn clean package'
            }
            post {
                success {
                    echo 'Now Archiving....'
                    archiveArtifacts artifacts: '**/target/*.war'
                }
            }
        }
    }
}