pipeline{
    agent any
        stage('Execute'){
            steps{
                bat 'dir'
            }
        }
    }

