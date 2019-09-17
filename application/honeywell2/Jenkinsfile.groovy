def workspace;
node
{
    stage('checkout')
    {
        checkout([$class: 'GitSCM',branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extentions: [], submoduleCfg: [], userRemoteConfigs:[[credentialsld: '',url: 'https://github.com/lokesh1989/dell2.git']]])
    
        workspace =pwd()
    }

stage('Static Code Analysis')
{
    echo "Static Code Analysis"
}
stage('build')
{
    echo"build the code"
}
stage('Unit Testing')
{
    echo "unit testing"
}
stage('Delivery')
{
    echo"deliver the code"
}
}
