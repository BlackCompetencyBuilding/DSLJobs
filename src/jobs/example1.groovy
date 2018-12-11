
String repo = 'BlackCompetencyBuilding/DSLJobs'

job("DSLExampleBuild") {
    scm {
        github repo
    }
    triggers {
        scm '* * * * *'
    }
 steps {
        gradle 'assemble'
    }
}

job("example-deploy") {
    parameters {
        stringParam 'host'
    }
    steps {
        shell 'scp war file; restart...'
    }
}
