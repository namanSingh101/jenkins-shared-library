def call(String credentialsId){
  echo "Login into Docker Hub"
  withCredentials([usernamePassword(credentialsId:credentialsId,usernameVariable:'DOCKERHUB_USR,passwordVariable:'DOCKERHUB_PSW')]){
                sh """
                     echo $DOCKERHUB_PSW | docker login -u $DOCKERHUB_USR --password-stdin
                   """
          }

}
