
String repo = 'https://github.com/BlackCompetencyBuilding/DSLJobs.git'

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
