package eksempler.spring

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class HelloClient @Autowired()(helloService: HelloService) {
  def hello = helloService.hello("Client")
}