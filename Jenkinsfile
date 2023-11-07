pipeline {
    agent any
    environment {
        BRANCH_NAME = "master"
    }
    stages {
        stage('Build') {
            steps {
                script {
                    if (env.BRANCH_NAME == 'master') {
                        echo 'Building master branch...'
                        // Acciones de construcción para la rama master
                    } else if (env.BRANCH_NAME == 'develop') {
                        echo 'Building develop branch...'
                        // Acciones de construcción para la rama develop
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
                    } else if (env.BRANCH_NAME == 'develop') {
                        echo 'Running tests for develop branch...'
                        // Acciones de prueba para la rama develop
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

            }
        }
    }
    post {
        always {
            echo 'hi'
        }
    }
}
