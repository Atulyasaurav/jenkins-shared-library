def call(String imageName){
  withCredentials([
    usernamePassword(
      credentialsId: "dockerHubCred",
      usernameVariable: "dockerUser",
      passwordVariable: "dockerPass"
      
      )
  ]){
    echo "Pushing the code..."
    sh "docker login -u ${dockerUser} -p ${dockerPass}"
    sh "docker tag ${imageName} ${dockerUser}/${imageName}"
    sh "docker push ${dockerUser}/${imageName}"
    echo "Push successful..."
  }
}
