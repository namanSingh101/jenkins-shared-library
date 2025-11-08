def call(String username, String password){
  echo "Login into Docker Hub"
  sh "echo ${password} | docker login -u ${username} --password-stdin'
}
