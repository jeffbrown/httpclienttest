package httpclienttest

import io.micronaut.test.annotation.MicronautTest
import spock.lang.Shared
import spock.lang.Specification

import javax.inject.Inject

@MicronautTest
class DeclarativeClientWithTestingFrameworkSpec extends Specification {

    @Inject @Shared
    GreetingClient client

    void 'test greeting'() {
        expect:
        client.greet('Jake') == 'Hello Jake'
    }
}
