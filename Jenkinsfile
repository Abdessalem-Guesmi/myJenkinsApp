node {

 stage('clone') {
 
   checkout scm


}

 stage('build') {
 
   sh 'mvn package'


}
 stage('end') {
 
   sh 'echo "end test!"'


}
}
