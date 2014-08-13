import geb.spock.GebReportingSpec
import pages.*

class SESpec extends GebReportingSpec {

    def "Lauching SE Website"() {
     
	 when:
     to GoogleHomePage

     then:
	 println "hi"
	 println "Test"
     assert at(GoogleHomePage)
	 
	    }

}