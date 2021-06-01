pipeline {
  agent any
  stages {
    stage('Maven Build') {
      steps {
        echo '"begin to clone maven project ${env.env}"'
        sh 'printenv'
      }
    }

  }
  environment {
    env = 'master'
  }
}