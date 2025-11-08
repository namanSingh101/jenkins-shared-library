def call(String image_name, String tag){
  echo "Building the code"
  sh "docker build -t ${image_name}:${tag} -f Dockerfile ."
}
