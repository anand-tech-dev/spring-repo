pipeline {
  agent any
  tools{
      maven 'maven3_8_6'
   }

  stages {
    stage("Build") {
       steps {
          // Just print a Hello, Pipeline to the console
          echo "Hello, Pipeline!"
          bat 'mvn clean install'
       }
   }
   // And next stages if you want to define further...
 } // End of stages
} // End of pipeline