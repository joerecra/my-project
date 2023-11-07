pipeline {
    agent any
    environment {
        BRANCH_NAME = "master"
    }
    stages {
        stage('Checkout') {
            steps {
                script {
                    checkout scm
                }
            }
        }
        stage('Build') {
            steps {
                script {
                    if (env.BRANCH_NAME == 'master') {
                        echo 'Building master branch...'
                        // Acciones de construcción para la rama master
                    } else if (env.BRANCH_NAME == 'staging') {
                        echo 'Building staging branch...'
                        // Acciones de construcción para la rama staging
                    } else {
                        echo "Building feature branch: ${env.BRANCH_NAME}"
                        // Acciones de construcción para otras ramas (feature branches)
                    }
                }
            }
        }
        stage('Test') {
            steps {
                script {
                    if (env.BRANCH_NAME == 'master') {
                        echo 'Running tests for master branch...'
                        // Acciones de prueba para la rama master
                    } else if (env.BRANCH_NAME == 'staging') {
                        echo 'Running tests for staging branch...'
                        // Acciones de prueba para la rama staging
                    } else {
                        echo "Running tests for feature branch: ${env.BRANCH_NAME}"
                        // Acciones de prueba para otras ramas (feature branches)
                    }
                }
            }
        }
        // Agrega más etapas según sea necesario para cada rama
        stage('Deploy'){
            steps {
                echo "Deploy"
            }
        }
    }
    post {
        always {
            echo 'hi'
        }
    }
}