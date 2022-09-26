pipeline {
    agent any

    stages {
        stage('Hello') {
            steps {
        
       git branch:'main', credentialsId: 'd7859368-d24d-4a1f-976e-16397c238f97', url: 'https://github.com/oumab26/pidevproject-4SAE5-GRP6.git'   
            }
        }
     
      stage('Test') { 
            steps {
             echo 'test'    
            }
        }
        stage('Deploy') { 
            steps {
                echo 'deploy'    
            }
        }
     
     
    }
}
