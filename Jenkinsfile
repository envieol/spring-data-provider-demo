pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        sh 'printenv'
        echo "begin to clone maven project ${env.GIT_URL}"
        echo "branch is ${env.branch}"
      }
    }

    stage('Test') {
      steps {
        sh 'printenv'
        echo 'so far, will do nothing'
      }
    }

    stage('Deploy') {
      steps {
        sh 'printenv'
        echo 'so far, will do nothing'
      }
    }

  }
  environment {
    branch = 'master'
  }
}