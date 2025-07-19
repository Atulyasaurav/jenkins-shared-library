// Define function
def call(String ProjectName, String DockerHubUser, String DockerTag){
  sh "docker build -t ${DockerHubUser}/${ProjectName}:${DockerTag} ."
}
