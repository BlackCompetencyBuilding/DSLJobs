
String repo = 'BlackCompetencyBuilding/DSLJobs'

job("DSLExampleBuild") {
    scm {
        github repo
    }
    triggers {
        scm '* * * * *'
    }
}
