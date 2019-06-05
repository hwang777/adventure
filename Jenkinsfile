pipeline {
    agent any
    stages {
        stage('build') {
            steps {
                 withMaven(
                     maven: 'M3'
                 ){
                     bat "dir"
                 }
            }
        }
    }
}
