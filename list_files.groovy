node {
    stage('List Files') {
        // Execute the 'ls' command
        bat 'dir'
    }
}
