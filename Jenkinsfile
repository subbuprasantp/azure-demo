podTemplate(containers: [
    containerTemplate(
        name: 'maven', 
        image: 'maven:3.8.1-jdk-8', 
        command: 'sleep', 
        args: '30d'
        ),
    containerTemplate(
        name: 'python', 
        image: 'python:latest', 
        command: 'sleep', 
        args: '30d')
  ]) {

    node(POD_LABEL) {
        stage('Get a Maven project') {
            git 'https://github.com/spring-projects/spring-petclinic.git'
            container('maven') {
                stage('SonarQube Analysis') {
                    checkout scm
                    def mvn = tool 'Default Maven';
                    withSonarQubeEnv() {
                    sh "${mvn}/bin/mvn clean verify sonar:sonar -Dsonar.projectKey=subbuprasantp_azure-demo_AYpjkXP6bHSbxXBsO2oC -Dsonar.projectName='azure-demo'"
                    }
                }
            }
        }

    }
}
