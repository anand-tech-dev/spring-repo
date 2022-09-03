pipeline {
  agent any
  tools{
      maven 'Maven 3.3.9'
      jdk 'jdk8'
       }

  stages {
    stage("Build") {
       steps {
          // Just print a Hello, Pipeline to the console
          echo "Hello, Pipeline!"
       }
   }
   // And next stages if you want to define further...
 } // End of stages
} // End of pipeline