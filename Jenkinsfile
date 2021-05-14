pipeline {

    agent any

    tools {
        maven 'localMaven'
    }

    stages {

        stage('Build') {
            steps {
                sh 'mvn clean package'
                sh 'mvn sonar:sonar -Dsonar.host.url=http://192.168.1.41:9000 -Dsonar.login=4b7661cf45bc38e953b9bb3c4a7f963b28d7d3e8'
                sh "docker build . -t tomcatwebapp:${env.BUILD_ID}"
            }
        }
    }
}