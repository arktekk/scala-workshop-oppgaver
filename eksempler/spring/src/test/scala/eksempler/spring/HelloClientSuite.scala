package eksempler.spring

import org.scalatest.FunSuite
import org.springframework.context.support.ClassPathXmlApplicationContext
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class HelloClientSuite extends FunSuite {

  val context = new ClassPathXmlApplicationContext("applicationContext.xml")

  test("client") {
    val client = context.getBean(classOf[HelloClient])
    assert(client.hello == "Hello, Client")
  }
}