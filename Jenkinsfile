pipeline {
    agent any
    stages {
        stage('build') {
            steps {
                 withMaven(
                     maven: 'M3'
                 ){
                     bat "mvn clean install"
                 }
            }
        }
    }
}
