import org.scalatest._
import org.scalatestplus.play._
import cucumber.api.scala.{ScalaDsl, EN}
import org.scalatest.Matchers
import scala.collection.mutable.{Map => MutableMap}

class DisposicionEfectivo extends ScalaDsl with EN with Matchers {

  Given("""^que el balance de la cuenta es S/\. (\d+)$"""){ (value:Int) =>
    
  }
  And("""^la cuenta es válida$"""){
    
  }
  And("""^el cajero tiene suficiente dinero$"""){
    
  }
  When("""^el titular de la cuenta solicita S/\. (\d+)$"""){ (value:String) =>
    
  }
  Then("""^el cajero debe otorgar S/. (\d+)$"""){ (value:Int) =>
    
  }
  And("""^el balance de la cuenta debe ser S/\. (\d+)$"""){ (value:Int) =>
    
  }
  And("""^la tarjeta debe ser devuelta$"""){

  }
}