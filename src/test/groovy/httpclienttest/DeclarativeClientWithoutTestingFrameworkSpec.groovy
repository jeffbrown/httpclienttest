package httpclienttest

import io.micronaut.context.ApplicationContext
import io.micronaut.runtime.server.EmbeddedServer
import spock.lang.AutoCleanup
import spock.lang.Shared
import spock.lang.Specification

class DeclarativeClientWithoutTestingFrameworkSpec extends Specification {

    @Shared
    @AutoCleanup
    EmbeddedServer embeddedServer = ApplicationContext.run(EmbeddedServer)

    @Shared
    GreetingClient client = embeddedServer.applicationContext.getBean(GreetingClient)

    void 'test greeting'() {
        expect:
        client.greet('Zack') == 'Hello Zack'
    }
}
