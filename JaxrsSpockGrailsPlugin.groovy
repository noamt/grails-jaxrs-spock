class JaxrsSpockGrailsPlugin {
    def version = "0.0.1-grails2.0"

    def grailsVersion = "2.0 > *"

    def dependsOn = [:]

    def pluginExcludes = [
            "grails-app/views/error.gsp"
    ]

    def title = "JAX-RS Spock Plugin"
    def author = "Noam Y. Tenne"
    def authorEmail = "noam@10ne.org"
    def description = '''\
Provides Spock specification support for the Grails JAX-RS plugin
'''

    def documentation = "http://grails.org/plugin/jaxrs-spock"

    def license = "APACHE"

    def organization = [name: '10ne.org', url: 'http://www.10ne.org/']

    def issueManagement = [system: "github", url: "https://github.com/noamt/grails-jaxrs-spock/issues"]

    def scm = [url: "https://github.com/noamt/grails-jaxrs-spock.git"]

    def doWithWebDescriptor = { xml ->
        // TODO Implement additions to web.xml (optional), this event occurs before
    }

    def doWithSpring = {
        // TODO Implement runtime spring config (optional)
    }

    def doWithDynamicMethods = { ctx ->
        // TODO Implement registering dynamic methods to classes (optional)
    }

    def doWithApplicationContext = { applicationContext ->
        // TODO Implement post initialization spring config (optional)
    }

    def onChange = { event ->
        // TODO Implement code that is executed when any artefact that this plugin is
        // watching is modified and reloaded. The event contains: event.source,
        // event.application, event.manager, event.ctx, and event.plugin.
    }

    def onConfigChange = { event ->
        // TODO Implement code that is executed when the project configuration changes.
        // The event is the same as for 'onChange'.
    }

    def onShutdown = { event ->
        // TODO Implement code that is executed when the application shuts down (optional)
    }
}
