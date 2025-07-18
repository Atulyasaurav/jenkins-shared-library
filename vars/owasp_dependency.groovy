def call() {
    def folders = ['auth', 'client', 'common', 'expiration', 'nats-test', 'orders', 'payments', 'tickets']
    
    folders.each { folder ->
        echo "Running OWASP Dependency Check in ${folder}"
        dir(folder) {
            dependencyCheck additionalArguments: "--scan .", odcInstallation: 'OWASP'
        }
    }
    dependencyCheckPublisher pattern: '**/dependency-check-report.xml'
}
