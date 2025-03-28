pipeline {
    agent any
    tools{
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
        stage('run jar') {
            steps {
                script {
                    def output = sh(script : 'java -jar target/simple-java-project-1,0-SNAPSHOT.jar', returnStdout:true).trim()

                    echo "Output from jar : ${output}"
                }
            }
        }
    }
}
