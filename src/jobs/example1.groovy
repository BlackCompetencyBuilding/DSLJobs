
String basePath = 'DSLexample'
String repo = 'https://github.com/BlackCompetencyBuilding/DSLJobs.git'
folder('basePath') {
    description 'This example shows basic folder/job creation.'
}

job("$basePath/DSLExampleBuild") {
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

job("basePath/example-deploy") {
    parameters {
        stringParam 'host'
    }
    steps {
        shell 'scp war file; restart...'
    }
}
