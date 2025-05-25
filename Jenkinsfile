pipeline{
    agent{
        label "agent1"
    }
    environment{
        IMAGE_NAME = 'oelghareeb/python-ci-cd'
    }
    stages{
        stage("Build Docker image"){
            steps{
                sh "echo 'Building the image' "
                sh "docker build -t ${IMAGE_NAME}:v${BUILD_NUMBER} ."
            }
        }
        stage("Push Docker image to Dockerhub"){
            steps{
                sh "docker push ${IMAGE_NAME}:v${BUILD_NUMBER}"
            }
        }
    }
}