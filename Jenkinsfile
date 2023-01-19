pipeline {
    agent any

    stages {
       stage('Build') {
                steps {
                    git url: 'https://github.com/naiveskill/devops.git', branch: 'main'
                }
       }

        stage('Test') {
            steps {
                sh "mvn clean install -P production"
            }
        }
    }
}