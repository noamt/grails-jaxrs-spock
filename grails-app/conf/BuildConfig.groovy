grails.project.class.dir = "target/classes"
grails.project.test.class.dir = "target/test-classes"
grails.project.test.reports.dir = "target/test-reports"

grails.project.dependency.distribution = {
    remoteRepository(id: 'snapshots-repo', url: 'http://noams.artifactoryonline.com/noams/grails-jaxrs-plugin-snapshots') {
        authentication username: System.getProperty('DEPLOYER_USERNAME'), password: System.getProperty('DEPLOYER_PASSWORD')
    }
    remoteRepository(id: 'rc-repo', url: 'http://noams.artifactoryonline.com/noams/grails-jaxrs-plugin-rc') {
        authentication username: System.getProperty('DEPLOYER_USERNAME'), password: System.getProperty('DEPLOYER_PASSWORD')
    }
}

grails.project.dependency.resolution = {
    // inherit Grails' default dependencies
    inherits("global") {
        // uncomment to disable ehcache
        excludes 'hibernate'
    }
    log "warn" // log level of Ivy resolver, either 'error', 'warn', 'info', 'debug' or 'verbose'
    repositories {
        grailsCentral()
        // uncomment the below to enable remote dependency resolution
        // from public Maven repositories
        //mavenLocal()
        //mavenCentral()
        mavenRepo "http://noams.artifactoryonline.com/noams/grails-jaxrs-plugin-snapshots"
        //mavenRepo "http://snapshots.repository.codehaus.org"
        //mavenRepo "http://repository.codehaus.org"
        //mavenRepo "http://download.java.net/maven/2/"
        //mavenRepo "http://repository.jboss.com/maven2/"
    }
    dependencies {
        // specify dependencies here under either 'build', 'compile', 'runtime', 'test' or 'provided' scopes eg.
        compile("org.spockframework:spock-grails-support:0.7-groovy-2.0") {
            export = false
        }
    }

    plugins {
        build(":release:2.2.1",
                ":rest-client-builder:1.0.3") {
            export = false
        }

        compile(':jaxrs:0.9-SNAPSHOT') {
            export = false
        }
        compile(':spock:0.7') {
            export = false
            exclude "spock-grails-support"
        }
    }
}
