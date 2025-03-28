pipeline {
    agent any
    tools {
        maven 'maven'
    }
    stages {
        stage('Build') {
            steps {
                bat 'mvn clean package'
            }
        }
        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }
        stage('Run JAR') {
            steps {
                script {
                    def output = bat(script: 'java -jar *.jar', returnStdout: true).trim()

                    echo "Output from JAR: ${output}"
                }
            }
        }
    }
}