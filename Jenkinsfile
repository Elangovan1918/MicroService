pipeline {
  agent any
  stages {
    stage('Clone') {
      steps {
        git(url: 'https://github.com/Elangovan1918/MicroService.git', branch: 'main', changelog: true, poll: true)
      }
    }

  }
}