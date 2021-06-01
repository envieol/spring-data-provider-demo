pipeline {
  agent any
  stages {
    stage('Maven Build') {
      steps {
        git(url: 'https://github.com/envieol/spring-data-provider-demo.git', branch: 'master', changelog: true)
      }
    }

  }
  environment {
    env = 'master'
  }
}