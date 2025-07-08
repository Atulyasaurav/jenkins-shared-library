def call(String imageName){
  echo "Building the code..."
  sh "docker build -t  ."
  echo "Build successful..."
}
