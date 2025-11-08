def call(String image_name, String tag){
  echo "Pushing docker image"
  sh """
      docker push $image_name:$tag
      """
}
