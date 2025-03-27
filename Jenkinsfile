pipeline {
    agent any

    tools {
        maven 'maven' // Ensure this matches the Maven tool name configured in Jenkins
    }

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
