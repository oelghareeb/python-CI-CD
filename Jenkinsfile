pipeline{
    agent{
        label "agent1"
    }
    stages{
        stage("Build Docker image"){
            steps{
                sh "echo 'Building the image' "
                sh "docker build -t python:v${BUILD_NUMBER}"
            }
        }
        stage("Push Docker image"){
            steps{
                sh "docker push oelghareeb/python-CI-CD:${BUILD_NUMBER}"
            }
        }
    }
}