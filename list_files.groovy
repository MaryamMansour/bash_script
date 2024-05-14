pipeline{
    agent any

    stages{
        stage('Checkout'){
            steps{
                git url:'https://github.com/MaryamMansour/bash_script.git'
            }
        }
        stage('Execute'){
            steps{
                bat 'dir'
            }
        }
    }
}
