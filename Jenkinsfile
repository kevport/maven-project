pipeline {

    agent any

    tools {
        maven 'localMaven'
    }

    stages {

        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }
        stage('SonarQube Analysis') {
            steps {
                withSonarQubeEnv('SonarQube') {
                    sh 'mvn sonar:sonar -Dsonar.host.url=http://192.168.1.41:9000 -Dsonar.login=d2baa04e18f86d0e08e1a6b947fdd7c03c07d959'
                }
            }
        }
        stage('Dump ENV') {
            steps {
                sh "env"
            }
        }
        stage('Quality Gate') {
            steps {
                waitForQualityGate abortPipeline: true
            }
        }
        stage('Docker') {
            steps {
                sh "docker build . -t tomcatwebapp:${env.BUILD_ID}"
            }
        }
    }
}