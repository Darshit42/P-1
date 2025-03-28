pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                git url: 'https://github.com/Darshit42/P392847329487.git', branch: 'main'
            }
        }
        stage('Build') {
            steps {
                sh 'git checkout main'
                echo 'BUILD Started'
            }
        }
        stage('Test') {
            steps {
                sh '''
                    git add .
                    git commit -m "commit 2"
                '''
                echo 'Test Started'
            }
        }
        stage('Deploy') {
            steps {
                sh 'git push origin main'
                echo 'Deployment Started'
            }
        }
    }
}
