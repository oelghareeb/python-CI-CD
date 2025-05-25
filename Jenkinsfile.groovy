node('agent1') {
    def IMAGE_NAME = 'oelghareeb/python-ci-cd-groovy'
    def IMAGE_TAG = "${IMAGE_NAME}:v${env.BUILD_NUMBER}"

    stage('Build Docker image') {
        sh 'ls -la'
        sh "echo 'Building the image'"
        sh "docker build -t ${IMAGE_TAG} ."
    }

    stage('Push Docker image to Dockerhub') {
        sh "docker push ${IMAGE_TAG}"
    }
}
