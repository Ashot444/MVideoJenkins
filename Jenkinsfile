pipeline {
    agent any

    stages {
       stage('Build') {
                steps {
                    git url: 'https://github.com/naiveskill/devops.git', branch: 'main'
                    sh "mvn clean install -P production"
                }
       }
        stage('Test') {
            steps {

            }
        }
    }
}