pipeline {
    agent { docker 'maven:3.3.3' }
    stages {
        stage('build') {
            steps {
                 withMaven(
                     maven: 'M3'
                 ){
                     bat "mvn install"
                 }
            }
        }
    }
}
