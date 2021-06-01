pipeline {
  agent any
  stages {
    stage('Maven Build') {
      steps {
        sh 'printenv'
        echo "begin to clone maven project ${env.GIT_URL}"
        echo "branch is ${env.branch}"
      }
    }

  }
  environment {
    branch = 'master'
  }
}