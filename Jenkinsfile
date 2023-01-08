pipeline {
    agent any
    stages {
        stage('Build stage') {
            steps {
                withMaven(maven: 'maven'){
                    sh 'mvn clean compile'
                }
            }
        }
        stage('Test stage') {
            steps {
                withMaven(maven: 'maven'){
                  sh 'mvn clean compile'
                }
            }
        }
        stage('Deploy stage') {
            steps {
               withMaven(maven: 'maven'){
              sh 'mvn clean compile'
                }
            }
        }
    }
}