pipeline {
    agent any
    tools {
        maven 'maven'
    }
    stages {
        stage('Cleanup') {
            steps {
                deleteDir()
            }
        }
        stage('Build') {
            steps {
                bat 'mvn clean package'
                bat 'dir target'
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
                    def jarFile = bat(script: 'dir /b target\\*.jar', returnStdout: true).trim()
                    echo "Detected JAR file: ${jarFile}"
                    def output = bat(script: "java -jar target\\${jarFile}", returnStdout: true).trim()
                    echo "Output from JAR: ${output}"
                }
            }
        }
    } 
}
pipeline {
    agent any
    tools {
        maven 'maven'
    }
    stages {
        stage('Cleanup') {
            steps {
                deleteDir()
            }
        }
        stage('Build') {
            steps {
                bat 'mvn clean package'
                bat 'dir target' 
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
                    def jarFile = bat(script: 'dir /b target\\*.jar', returnStdout: true).trim()
                    echo "Detected JAR file: ${jarFile}"
                    def output = bat(script: "java -jar target\\${jarFile}", returnStdout: true).trim()
                    echo "Output from JAR: ${output}"
                }
            }
        }
    }
} 
