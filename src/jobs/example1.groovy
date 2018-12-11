
String basePath = 'DSLexample'
String repo = 'https://github.com/BlackCompetencyBuilding/DSLJobs.git'
folder(basePath) {
    description 'This example shows basic folder/job creation.'
}

job("DSLExampleBuild") {
    scm {
        github repo
    }
    triggers {
        scm '* * * * *'
    }
    
}
