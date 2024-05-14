pipeline{
    agent any
    stages{
        stage('Execute'){
            steps{
                bat 'dir'
            }
        }
    }
}

