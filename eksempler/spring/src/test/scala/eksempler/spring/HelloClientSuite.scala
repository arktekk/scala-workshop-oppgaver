package eksempler.spring

import org.scalatest.FunSuite
import org.springframework.context.support.ClassPathXmlApplicationContext

class HelloClientSuite extends FunSuite {

  val context = new ClassPathXmlApplicationContext("applicationContext.xml")

  test("client") {
    val client = context.getBean(classOf[HelloClient])
    assert(client.hello == "Hello, Client")
  }
}