def call(String imageName){ 
  echo "Deploying the code..."         
  sh "docker stop ${imageName} || true"
  sh "docker rm ${imageName} || true" 
  sh "docker run -d -p 80:80 --name ${imageName} ${imageName}"
  echo "Deployment successful..."
  
}
