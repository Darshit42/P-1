pipeline {
    agent any
    tools {
        maven 'maven'

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/Mahima-Rajput/Test2.git'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }
    }
}
