def call(String branch,String url){
   echo "This is cloning code ..."
    git branch: branch,url: url 
  echo "Cloning success ...
}
