def call(String imageName){
  echo "Building the code..."
  sh "docker build -t ${imageName} ."
  echo "Build successful..."
}
