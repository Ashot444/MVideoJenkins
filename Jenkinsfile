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
                configFileProvider([configFile(fileId: 'my-maven-settings-dot-xml', variable: 'MAVEN_SETTINGS_XML')]) {
                sh 'mvn -U --batch-mode -s $MAVEN_SETTINGS_XML clean install -P foo'
            }
        }
    }
}