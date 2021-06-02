pipeline {
  agent any
  tools {
        maven 'Maven_3.8.1'
        git 'Git_2.27.0'
    }
  stages {
    stage('Example') {
      steps {
        echo "Hello ${params.PERSON}"
        echo "Biography: ${params.BIOGRAPHY}"
        echo "Toggle: ${params.TOGGLE}"
        echo "Choice: ${params.CHOICE}"
        echo "Password: ${params.PASSWORD}"
      }
    }

    stage('Build') {
      steps {
        sh 'printenv'
        echo "begin to clone maven project ${env.GIT_URL}"
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
  parameters {
    string(name: 'PERSON', defaultValue: 'Mr Jenkins', description: 'Who should I say hello to?')
    text(name: 'BIOGRAPHY', defaultValue: '', description: 'Enter some information about the person')
    booleanParam(name: 'TOGGLE', defaultValue: true, description: 'Toggle this value')
    choice(name: 'CHOICE', choices: ['One', 'Two', 'Three'], description: 'Pick something')
    password(name: 'PASSWORD', defaultValue: 'SECRET', description: 'Enter a password')
  }
}
