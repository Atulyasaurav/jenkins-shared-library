def call(String imageName, String dockerTag){
  withCredentials([
    usernamePassword(
      credentialsId: "dockerHubCred",
      usernameVariable: "dockerUser",
      passwordVariable: "dockerPass"
      
      )
  ]){
    echo "Pushing the code..."
    sh "docker login -u ${dockerUser} -p ${dockerPass}"
    sh "docker push ${dockerUser}/${imageName}:v${dockerTag}"
    echo "Push successful..."
  }
}
