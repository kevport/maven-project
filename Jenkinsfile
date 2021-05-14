pipeline {

    agent any

    tools {
        maven 'localMaven'
    }

    stages {

        stage('Build') {
            steps {
                sh 'mvn clean package'
                sh 'mvn sonar:sonar -Dsonar.host.url=http://192.168.1.41:9000 -Dsonar.login=a3fe96f4ef22396bb66c6a933f72b6d6e22984c6'
                sh "docker build . -t tomcatwebapp:${env.BUILD_ID}"
            }
        }
    }
}