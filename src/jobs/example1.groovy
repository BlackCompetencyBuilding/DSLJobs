
String repo = 'BlackCompetencyBuilding/DSLJobs'

job("ExampleBuild") {
    scm {
        github repo
    }
    triggers {
        scm '* * * * *'
    }
}
