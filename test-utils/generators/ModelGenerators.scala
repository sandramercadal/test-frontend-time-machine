package generators

import models._
import org.scalacheck.Arbitrary.arbitrary
import org.scalacheck.{Arbitrary, Gen}

trait ModelGenerators {

  implicit lazy val arbitraryParkedTimeMachine: Arbitrary[ParkedTimeMachine] =
    Arbitrary {
      for {
        Where do you park your Time Machine? <- arbitrary[String]
        What is your Postcode? <- arbitrary[String]
      } yield ParkedTimeMachine(Where do you park your Time Machine?, What is your Postcode?)
    }
}
