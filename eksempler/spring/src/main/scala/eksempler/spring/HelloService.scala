package eksempler.spring

import org.springframework.stereotype.Service

trait HelloService {
  def hello(name:String): String
}

@Service
class HelloServiceImpl extends HelloService {
  def hello(name:String) = "Hello, " + name
}