pipeline {
    agent any
    
    stages {
        stage("Checkout") {
            steps {
                checkout scm
            }
        }
        
        stage("Build") {
            steps {
                sh "./gradlew clean build -x test"
            }
        }
        
        stage("Unit Test") {
            steps {
                sh "./gradlew test"
            }
            post {
                always {
                    junit 'build/test-results/test/**/*.xml'
                    publishTestResults testResultsPattern: 'build/test-results/test/**/*.xml'
                }
            }
        }
    }
    
    post {
        always {
            cleanWs()
        }
        success {
            echo '빌드와 테스트가 성공적으로 완료되었습니다!'
        }
        failure {
            echo '빌드 또는 테스트가 실패했습니다.'
        }
    }
}

