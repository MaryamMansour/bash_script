pipeline {
    agent any
    
    stages {
        stage('List Files') {
            steps {
                // Checkout the repository
                git 'https://github.com/MaryamMansour/bash_script.git'
                
                // List all files and directories
                sh 'ls -R'
            }
        }
    }
}
