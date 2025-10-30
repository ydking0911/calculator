pipeline {
    agent any
    stages {
        stage("Compile") {
            steps {
                sh "./gradlew build"
            }
        }
        stage("Build") {
            steps {
                sh "./gradlew build"
            }
        }
        stage("Unit test") {
            steps {
                sh "./gradlew test"
            }
        }
    }
}